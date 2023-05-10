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

package me.antritus.web_to_enum;

public class Global {
	public static final String version = "1.0-snapshot";

	public static String convertWebsiteTypes(String type) {
		if (type.equalsIgnoreCase("string")){
			return "String";
		}
		if (type.equalsIgnoreCase("timestamp")){
			return "long";
		}
		if (type.equalsIgnoreCase("integer")){
			return "int";
		}
		if (type.equalsIgnoreCase("list of integers")){
			return "List<Integer>";
		}
		if (type.equalsIgnoreCase("list of strings")){
			return "List<String>";
		}
		if (type.equalsIgnoreCase("numeric")){
			return "int";
		}
		if (type.equalsIgnoreCase("float") || type.equalsIgnoreCase("boolean")){
			return type;
		}
		if (type.equalsIgnoreCase("associative array")){
			return "Own class type";
		}
		return "UnknownTypeException";
	}
}
