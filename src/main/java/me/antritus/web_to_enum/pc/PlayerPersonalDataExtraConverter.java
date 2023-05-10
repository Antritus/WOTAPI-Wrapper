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
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static me.antritus.web_to_enum.Global.version;

public class PlayerPersonalDataExtraConverter {
	public static void main(String[] args) throws IOException, URISyntaxException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(PlayerPersonalDataExtraConverter.class.getResourceAsStream("/player_personal_data_extras.txt")));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[0]));
		String enumField;
		List<String> list = new ArrayList<>(bufferedReader.lines().toList());
		bufferedReader.close();
		bufferedWriter.write("\t/**\n" +
				"\t * The fields which the api request should ask for.\n" +
				"\t * This class was mostly done by a script.\n" +
				"\t * @since "+version+"\n" +
				"\t * @author Antritus\n" +
				"\t */\n" +
				"\tpublic enum PlayerDataExtra {\n");
		for (int x = 0; x < list.size();){
			StringBuilder builder = new StringBuilder();
			enumField = list.get(x).replace("\"", "");
			builder.append("/**").append("\n");
			builder.append(" * No information from wargaming developer website").append("\n");
			if (list.get(x).contains("private")){
				builder.append(" * Note that this will only work in <a href=\"me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayerDataPrivate\"></a>").append("\n");
			}
			boolean warning= false;
			if (list.get(x).contains("Warning.")){
				warning = true;
				builder.append(" * @deprecated The method is warned to be removed by wargaming");
			}
			builder.append(" * @since " + version).append("\n");
			builder.append("*/").append("\n");
			if (warning){
				builder.append("@deprecated");
			}
			enumField = enumField.toUpperCase().replace(".", "_")+"(\""+enumField+"\")";
			builder.append(enumField).append(",").append("\n");
			bufferedWriter.write(builder.toString());
			bufferedWriter.flush();
			x++;
		}
		bufferedWriter.write(";");
		bufferedWriter.newLine();
		bufferedWriter.write("private final String packetForm;");
		bufferedWriter.newLine();
		bufferedWriter.newLine();
		bufferedWriter.write("PlayerDataExtra(String packetForm){");
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
