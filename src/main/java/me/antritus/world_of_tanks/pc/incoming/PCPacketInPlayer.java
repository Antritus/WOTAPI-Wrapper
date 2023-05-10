package me.antritus.world_of_tanks.pc.incoming;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import me.antritus.world_of_tanks.exceptions.RequestException;
import me.antritus.world_of_tanks.packet.PacketIn;
import me.antritus.world_of_tanks.packet.PacketType;
import me.antritus.world_of_tanks.pc.player.IncomingPlayer;

import java.util.ArrayList;
import java.util.List;

public class PCPacketInPlayer extends PacketIn {
	private final List<IncomingPlayer> playerList = new ArrayList<>();
	private final JsonObject object;
	/**
	 * Incoming packet from world of tanks api.
	 * Packet Class for player
	 *  * nickname
	 *  * account_id
	 * @param json The received json from api request.
	 */
	public PCPacketInPlayer(final JsonObject json) throws RequestException {
		super(PacketType.PLAYER, json);
		this.object = json;
		convertData();
	}
	public void convertData(){
		JsonArray array = object.get("data").getAsJsonArray();
		for (JsonElement element : array.asList()){
			playerList.add(new Gson().fromJson(element, IncomingPlayer.class));
		}
	}

	public List<IncomingPlayer> getPlayers() {
		return playerList;
	}
}
