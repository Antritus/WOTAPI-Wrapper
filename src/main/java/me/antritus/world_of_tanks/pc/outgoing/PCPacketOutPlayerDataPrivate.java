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
import me.antritus.world_of_tanks.pc.incoming.PCPacketInPlayerDataPrivate;
import me.antritus.world_of_tanks.pc.outgoing.field.PlayerDataExtra;
import me.antritus.world_of_tanks.pc.outgoing.field.PlayerDataField;
import me.antritus.world_of_tanks.pc.outgoing.field.PlayerPrivateDataField;
import me.antritus.world_of_tanks.pc.player.IncomingPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * PC packet used to get players public and private data.
 * This is created so public data fields don't get mixed and don't break due to not having access to the account.
 * This only allows 1 player to be requested at time.
 */
public class PCPacketOutPlayerDataPrivate extends PacketOut<PCPacketInPlayerDataPrivate> {
	private IncomingPlayer accountPacket = null;
	private int account_id = -1;
	private PlayerDataExtra[] extra;
	private PlayerDataField[] fields;
	private PlayerPrivateDataField[] privateFields;
	private Language language = Language.ENGLISH;

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param player  Player whose data should be got
	 * @param language Language which the data should use
	 * @param info     Extras that the api request should ask for
	 * @param privateFields   Fields that the api requests for
	 * @param fields   Fields that the api requests for
	 */
	public PCPacketOutPlayerDataPrivate(IncomingPlayer player, Language language, PlayerDataExtra[] info, PlayerPrivateDataField[] privateFields, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.accountPacket = player;
		this.language = language;
		this.extra = info;
		this.privateFields = privateFields;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param player  Player whose data should be got
	 * @param info     Extras that the api request should ask for
	 * @param privateFields   Fields that the api requests for
	 * @param fields   Fields that the api requests for
	 */
	public PCPacketOutPlayerDataPrivate(IncomingPlayer player, PlayerDataExtra[] info, PlayerPrivateDataField[] privateFields, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.accountPacket = player;
		this.extra = info;
		this.privateFields = privateFields;
		this.fields = fields;
	}
	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param players  Player whose data should be got
	 * @param fields   Fields that the api requests for
	 * @param privateFields   Fields that the api requests for
	 */
	public PCPacketOutPlayerDataPrivate(IncomingPlayer players, PlayerPrivateDataField privateFields[], PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.accountPacket = players;
		this.privateFields = privateFields;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param player  Player whose data should be got
	 * @param language Language which the data should use
	 * @param info     Extras that the api request should ask for
	 * @param privateFields   Fields that the api requests for
	 * @param fields   Fields that the api requests for
	 */
	public PCPacketOutPlayerDataPrivate(int player, Language language, PlayerDataExtra[] info, PlayerPrivateDataField[] privateFields, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.account_id = player;
		this.language = language;
		this.extra = info;
		this.privateFields = privateFields;
		this.fields = fields;
	}

	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param player  Player whose data should be got
	 * @param info     Extras that the api request should ask for
	 * @param privateFields   Fields that the api requests for
	 * @param fields   Fields that the api requests for
	 */
	public PCPacketOutPlayerDataPrivate(int player, PlayerDataExtra[] info, PlayerPrivateDataField[] privateFields, PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.account_id = player;
		this.extra = info;
		this.privateFields = privateFields;
		this.fields = fields;
	}
	/**
	 * Packet to get data from player like clan_id, client_language, account_id, created_at etc
	 * For statistics see <a href"me.antritus.world_of_tanks.pc.outgoing."></a>
	 *
	 * @param player  Player whose data should be got
	 * @param fields   Fields that the api requests for
	 * @param privateFields   Fields that the api requests for
	 */
	public PCPacketOutPlayerDataPrivate(int player, PlayerPrivateDataField privateFields[], PlayerDataField... fields) {
		super(PacketType.PLAYER_PERSONAL_DATA);
		this.account_id = player;
		this.privateFields = privateFields;
		this.fields = fields;
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
			info.add(String.valueOf(accountPacket.getId()));
			extraValues.put("account_id", join(info));
		}
		if (account_id > -1) {
			info.add(String.valueOf(account_id));
			extraValues.put("account_id", join(info));
		}
		return new PacketWrap(this, application, extraValues);
	}

	@Override
	public @NotNull PCPacketInPlayerDataPrivate receive(JsonObject json) {
		return new PCPacketInPlayerDataPrivate(json);
	}
}
