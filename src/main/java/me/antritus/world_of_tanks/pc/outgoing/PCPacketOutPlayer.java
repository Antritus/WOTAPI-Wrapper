

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

package me.antritus.world_of_tanks.pc.outgoing;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import me.antritus.world_of_tanks.Application;
import me.antritus.world_of_tanks.Language;
import me.antritus.world_of_tanks.packet.PacketIn;
import me.antritus.world_of_tanks.packet.PacketOut;
import me.antritus.world_of_tanks.packet.PacketType;
import me.antritus.world_of_tanks.packet.PacketWrap;
import me.antritus.world_of_tanks.pc.incoming.PCPacketInPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PCPacketOutPlayer extends PacketOut<PCPacketInPlayer> {
	private final String search;
	private final RequestField[] fields;
	private final int limit;
	private Language language;
	private RequestType type = null;

	public PCPacketOutPlayer(String search, Language language, RequestType type, int limit, RequestField... fields){
		super(PacketType.PLAYER);
		this.fields = fields;
		this.search = search;
		this.type = type;
		this.language = language;
		this.limit = limit;
	}

	public PCPacketOutPlayer(String search, Language language, int limit, RequestField... fields){
		super(PacketType.PLAYER);
		this.fields =fields;
		this.search =search;
		this.language= language;
		this.limit = limit;
	}
	public PCPacketOutPlayer(String search, int limit, RequestField... fields){
		super(PacketType.PLAYER);
		this.fields = fields;
		this.search = search;
		this.language = Language.ENGLISH;
		this.limit = limit;
	}
	public PCPacketOutPlayer(String search, RequestType type, int limit, RequestField... fields){
		super(PacketType.PLAYER);
		this.fields = fields;
		this.search = search;
		this.type = type;
		this.limit = limit;
	}
	public PCPacketOutPlayer(String search, RequestField... fields){
		super(PacketType.PLAYER);
		this.fields = fields;
		this.search = search;
		this.limit = 100;
	}
	//https://api.worldoftanks.asia/wot/account/list/?application_id=e47c1cb2f7fc8e469150ac5ee4c0ce75&search=GNRL_STEEL
	// &fields=nickname%2C+account_id%2C+test&language=eu&limit=4&type=startswith


	@Override
	public @Nullable PacketWrap send(Application application) {
		HashMap<String, String> convertedValues = new HashMap<>();
		if (fields.length > 1){
			List<String> field =new ArrayList<>();
			for (RequestField requestField : fields){
				field.add(requestField.packetForm);
			}
			convertedValues.put("fields", join(field));
		} else if (fields.length == 1){
			convertedValues.put("fields", join(fields[0].packetForm));
		}
		if (language != null){
			convertedValues.put("language", language.getRequestForm());
		}
		convertedValues.put("limit", String.valueOf(limit));
		if (this.type != null){
			convertedValues.put("type", type.packetForm);
		}
		convertedValues.put("search", search);
		return new PacketWrap(this, application, convertedValues);
	}

	@Override
	public @NotNull PCPacketInPlayer receive(JsonObject gson) {
		return new PCPacketInPlayer(gson);
	}

	public enum RequestField {
		ACCOUNT_ID("account_id"),
		NICKNAME("nickname"),
		;
		private final String packetForm;
		RequestField(String packetForm){
			this.packetForm = packetForm;
		}

		/**
		 * @return The packet form of the enum field
		 */
		public String getPacketForm() {
			return packetForm;
		}
	}
	public enum RequestType {
		STARTS_WITH("startswith"),
		EXACT("exact"),
		;
		private final String packetForm;

		RequestType(String packetForm) {
			this.packetForm = packetForm;
		}

		/**
		 * @return The packet form of the enum field
		 */
		public String getPacketForm() {
			return packetForm;
		}
	}
}
