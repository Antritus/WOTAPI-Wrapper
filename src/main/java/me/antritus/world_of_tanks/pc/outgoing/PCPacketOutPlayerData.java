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

import com.google.gson.JsonObject;
import me.antritus.world_of_tanks.Application;
import me.antritus.world_of_tanks.Language;
import me.antritus.world_of_tanks.packet.PacketOut;
import me.antritus.world_of_tanks.packet.PacketType;
import me.antritus.world_of_tanks.packet.PacketWrap;
import me.antritus.world_of_tanks.pc.incoming.PCPacketInPlayerData;
import me.antritus.world_of_tanks.pc.outgoing.field.PlayerDataExtra;
import me.antritus.world_of_tanks.pc.outgoing.field.PlayerDataField;
import me.antritus.world_of_tanks.pc.player.IncomingPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PCPacketOutPlayerData extends PacketOut<PCPacketInPlayerData> {
	/**
	 * Returns array format of IncomingPlayer for the packets
	 *
	 * @param player player who to use
	 * @return array format of IncomingPlayer
	 */
	public static IncomingPlayer[] single(IncomingPlayer player) {
		return new IncomingPlayer[]{player};
	}

	/**
	 * Returns array format of account_id for the packets
	 *
	 * @param account_id player who to use
	 * @return array format of account_id
	 */
	public static int[] single(int account_id) {
		return new int[]{account_id};
	}

	private IncomingPlayer[] accountPacket = null;
	private int[] account_ids = null;
	private PlayerDataExtra[] extra;
	private PlayerDataField[] fields;
	private Language language = Language.ENGLISH;

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param players  Players whose data should be got
	 * @param language Language which the data should use
	 * @param info     Extras that the api request should ask for
	 * @param fields   Fields that the api requests for
	 */
	public PCPacketOutPlayerData(IncomingPlayer[] players, Language language, PlayerDataExtra[] info, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.accountPacket = players;
		this.language = language;
		this.extra = info;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param players Players whose data should be got
	 * @param info    Extras that the api request should ask for
	 * @param fields  Fields that the api requests for
	 */
	public PCPacketOutPlayerData(IncomingPlayer[] players, PlayerDataExtra[] info, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.accountPacket = players;
		this.extra = info;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param players Players whose data should be got
	 * @param fields  Fields that the api requests for
	 */
	public PCPacketOutPlayerData(IncomingPlayer[] players, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.accountPacket = players;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param players Players whose data should be got
	 * @param extra   Extras that the api request should ask for
	 */
	public PCPacketOutPlayerData(IncomingPlayer[] players, PlayerDataExtra... extra) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.accountPacket = players;
		this.extra = extra;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param playerIds Players whose data should be got
	 * @param language  Language which the data should use
	 * @param info      Extras that the api request should ask for
	 * @param fields    Fields that the api requests for
	 */
	public PCPacketOutPlayerData(int[] playerIds, Language language, PlayerDataExtra[] info, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.account_ids = playerIds;
		this.language = language;
		this.extra = info;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param playerIds Players whose data should be got
	 * @param info      Extras that the api request should ask for
	 * @param fields    Fields that the api requests for
	 */
	public PCPacketOutPlayerData(int[] playerIds, PlayerDataExtra[] info, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.account_ids = playerIds;
		this.extra = info;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param playerIds Players whose data should be got
	 * @param fields    Fields that the api requests for
	 */
	public PCPacketOutPlayerData(int[] playerIds, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.account_ids = playerIds;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param playerIds Players whose data should be got
	 * @param info      Extras that the api request should ask for
	 */
	public PCPacketOutPlayerData(int[] playerIds, PlayerDataExtra... info) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.account_ids = playerIds;
		this.extra = info;
	}

	@Override
	public @Nullable PacketWrap send(Application application) {
		HashMap<String, String> extraValues = new HashMap<>();
		List<String> info = new ArrayList<>();
		if (extra != null) {
			for (PlayerDataExtra extra : extra) {
				info.add(extra.getPacketForm());
			}
			extraValues.put("extra", join(info));
			info = new ArrayList<>();
		}
		if (fields != null) {
			for (PlayerDataField extra : fields) {
				info.add(extra.getPacketForm());
			}

			extraValues.put("fields", join(info));
			info = new ArrayList<>();
		}
		if (accountPacket != null) {
			for (IncomingPlayer player : accountPacket) {
				info.add(String.valueOf(player.getId()));
			}
			extraValues.put("account_id", join(info));
		}
		if (account_ids != null) {
			for (int player : account_ids) {
				info.add(String.valueOf(player));
			}
			extraValues.put("account_id", join(info));
		}
		return new PacketWrap(this, application, extraValues);
	}

	@Override
	public @NotNull PCPacketInPlayerData receive(JsonObject json) {
		return new PCPacketInPlayerData(json);
	}
}
