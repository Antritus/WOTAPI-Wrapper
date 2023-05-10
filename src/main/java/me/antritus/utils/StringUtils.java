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

package me.antritus.utils;

public class StringUtils {
	public String betterFieldName(String name){
		if (name == null || name.isEmpty()){
			return "";
		}
		if (name.contains("."))
			name = name.replace(".", "_");
		String[] split = name.split("_");
		StringBuilder builder = new StringBuilder(split[0].toLowerCase());
		if (split.length > 1){
			for (int i = 1; i < split.length; i++){
				builder.append(betterFormat(split[i]));
			}
		}
		return builder.toString();
	}
	public String betterGetterName(String name){
		return betterGetterName(name, false);
	}
		public String betterGetterName(String name, boolean isBoolean){
		if (name == null || name.isEmpty()){
			return "";
		}
		if (name.contains("."))
			name = name.replace(".", "_");
		String[] split = name.split("_");
		StringBuilder builder = new StringBuilder("get");
		if (isBoolean){
			builder = new StringBuilder("is");
		}
		if (split.length > 1){
			for (int i = 0; i < split.length; i++){
				builder.append(betterFormat(split[i]));
			}
		}
		return builder.toString();
	}
	public String betterFormat(String string){
		String first = string.split("")[0];
		string = string.toLowerCase();
		return string.replaceFirst(first.toLowerCase(), first.toUpperCase());
	}

	public static void main(String[] strings){
		StringUtils stringUtils = new StringUtils();
		System.out.println(stringUtils.betterFieldName("STATISTICS_STRONGHOLD_SKIRMISH_STUN_ASSISTED_DAMAGE"));
		System.out.println(stringUtils.betterGetterName("STATISTICS_STRONGHOLD_SKIRMISH_STUN_ASSISTED_DAMAGE"));
	}
}
