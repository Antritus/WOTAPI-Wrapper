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

package me.antritus.world_of_tanks.packet;

import com.google.gson.JsonObject;

import java.util.Map;

public class PacketStatus  {
	private boolean ok = true;
	private Map<String, Object> statusInfo;
	private RequestInfo info;
 	/**
	 * Manages received packet and searches for errors.
	 */
	public PacketStatus(JsonObject object) {
		if (object.get("status").getAsString().equalsIgnoreCase("error")) {
			ok = false;
			info = new PacketStatus.Error(object.getAsJsonObject("error"));
		} else {
			info =  new PacketStatus.Meta(object.getAsJsonObject("meta"));
		}
	}

	public boolean isError(){
		return !ok;
	}
	public boolean isOk() {
		return ok;
	}
	public RequestInfo getInfo(){
		return info;
	}
	private static class RequestInfo{};
	public static class Meta extends RequestInfo{
		private final int count;

		/**
		 * @param json The json meta object
		 */
		public Meta(JsonObject json) {
			super();
			count = json.get("count").getAsInt();
		}

		public int getCount() {
			return count;
		}
	}
	public static class Error extends RequestInfo {
		private String errorName;
		private int errorCode;
		private String fieldCausing;
		private String valueCausing;
		/**
		 * @param json The json error object
		 */
		public Error(JsonObject json){
			super();
			errorName = json.get("message").getAsString();
			errorCode = json.get("code").getAsInt();
			fieldCausing = json.get("field").getAsString();
			valueCausing = json.get("value").getAsString();
		}

		public String getErrorName() {
			return errorName;
		}

		public int getErrorCode() {
			return errorCode;
		}

		public String getFieldCausing() {
			return fieldCausing;
		}

		public String getValueCausing() {
			return valueCausing;
		}
	}
}
