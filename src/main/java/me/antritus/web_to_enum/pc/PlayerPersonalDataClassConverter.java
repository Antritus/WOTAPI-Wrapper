/*
 * Copyright 2023
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Antritus
 */

package me.antritus.web_to_enum.pc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static me.antritus.web_to_enum.Global.convertWebsiteTypes;
import static me.antritus.web_to_enum.Global.version;

public class PlayerPersonalDataClassConverter {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(PlayerPersonalDataConverter.class.getResourceAsStream("/player_personal_data.txt")));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[0]));
		String enumField;
		List<String> list = new ArrayList<>(bufferedReader.lines().toList());
		bufferedReader.close();
		bufferedWriter.write("\t/**\n" +
				"\t * Class used for handling players personal data.\n" +
				"\t * This class was mostly done by a script.\n" +
				"\t * @since "+version+"\n" +
				"\t * @author Antritus\n" +
				"\t */\n" +
				"\tpublic class IncomingDataPlayer {\n");
		List<String> methods = new ArrayList<>();
		for (int x = 0; x < list.size();){
			if (list.get(x).contains("private")){
				x++;
				continue;
			}
			if (!list.get(x).equalsIgnoreCase("")){
				int i = x;
				String type;
				String javaType;
				String 	serializedName;
				try {
					enumField = list.get(x).split("\t")[0].replace(".", "_").toUpperCase()+"(\""+list.get(x).split("\t")[0]+"\")";
					serializedName = list.get(x).split("\t")[0];
					type =  list.get(x).split("\t")[1];
					javaType = convertWebsiteTypes(type);
				} catch (ArrayIndexOutOfBoundsException e){
					x++;
					continue;
				}
				StringBuilder builder = new StringBuilder();
				builder.append("/**").append("\n");
				x++;
				try {
					while (!list.get(x).isEmpty()) {
						builder.append(" * ").append(list.get(x)).append("\n");
						x++;
					}
				} catch (IndexOutOfBoundsException ignore){
				}
				builder.append(" * @type ").append(type).append("\n");
				builder.append(" * @since ").append(version).append("\n");
				builder.append("*/").append("\n");
				builder.append("@SerializedName.\"").append(serializedName).append("\")");
				builder.append(enumField).append(",").append("\n");
				bufferedWriter.write(builder.toString());
				bufferedWriter.newLine();
				bufferedWriter.flush();
				builder = new StringBuilder();
				if (javaType.equalsIgnoreCase("boolean")){
					bufferedWriter.append("public ").append(javaType).append(" is").append(enumField);
				} else {
					bufferedWriter.append("public ").append(javaType).append(" get").append(enumField);
				}
			} else {
				x++;
			}
		}
		bufferedWriter.write(";");
		bufferedWriter.newLine();
		bufferedWriter.write("private final String packetForm;");
		bufferedWriter.newLine();
		bufferedWriter.newLine();
		bufferedWriter.write("PlayerDataField(String packetForm){");
		bufferedWriter.newLine();
		bufferedWriter.write("this.packetForm = packetForm;");
		bufferedWriter.newLine();
		bufferedWriter.write("}");
		bufferedWriter.newLine();
		bufferedWriter.write("public String getPacketForm(){");
		bufferedWriter.newLine();
		bufferedWriter.write("return packetForm;");
		bufferedWriter.newLine();
		bufferedWriter.write("}");
		bufferedWriter.newLine();
		bufferedWriter.write("}");
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
