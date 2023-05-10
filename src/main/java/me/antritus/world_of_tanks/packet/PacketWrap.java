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

import me.antritus.world_of_tanks.Application;
import me.antritus.world_of_tanks.Realm;

import java.util.HashMap;

public class PacketWrap {
	// Required
	private final Realm realm;
	// Required
	private final PacketType type;
	// Required ( App ID )
	private final Application application;
	// Not required
	private final HashMap<String, String> info;
	public PacketWrap(Packet packet, Application application){
		this.type = packet.getPacketType();
		this.realm = application.getRealm();
		this.application = application;
		this.info = new HashMap<>();
	}
	public PacketWrap(Packet packet, Application application, HashMap<String, String> info){
		this.type = packet.getPacketType();
		this.realm = application.getRealm();
		this.application = application;
		this.info = info;
	}
	public PacketWrap(Packet packet, Realm realm, Application application){
		this.realm = realm;
		this.type =packet.getPacketType();
		this.application = application;
		this.info = new HashMap<>();
	}
	public PacketWrap(Realm realm, PacketType type, Application application, HashMap<String, String> info) {
		this.realm = realm;
		this.type = type;
		this.application = application;
		this.info = info;
	}

	public Realm getRealm() {
		return realm;
	}

	public PacketType getType() {
		return type;
	}

	public Application getApplication() {
		return application;
	}

	public HashMap<String, String> getInfo() {
		return info;
	}

	public String asAPIRequest() throws IllegalArgumentException {
		if (realm == null){
			throw new IllegalArgumentException("Incorrect Realm! Cannot send packets to https://api.worldoftanks.null !");
		}
		return "https://api.worldoftanks."+realm.getDomainEnd()+"/wot/"+type.getRequestForm()+"/?application_id="+application.getId()+toAPIForm(info);
	}
	private String toAPIForm(HashMap<String, String> info){
		if (info.isEmpty()){
			return "";
		}
		StringBuilder builder = new StringBuilder();
		info.forEach((key, keyData) -> {
			if (builder.length() > 0){
				builder.append("&");
			}
			builder.append(key).append("=").append(keyData);
		});
		return builder.toString();
	}
}
