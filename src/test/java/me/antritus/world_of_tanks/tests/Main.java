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

package me.antritus.world_of_tanks.tests;

import me.antritus.world_of_tanks.Application;
import me.antritus.world_of_tanks.Realm;
import me.antritus.world_of_tanks.packet.PacketIn;
import me.antritus.world_of_tanks.pc.incoming.PCPacketInPlayer;
import me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayer;
import me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayerData;
import me.antritus.world_of_tanks.pc.outgoing.field.PlayerDataField;

public class Main {
	public static void main(String[] args){
		Application application = new Application("e47c1cb2f7fc8e469150ac5ee4c0ce75&", Realm.EU);
		PCPacketOutPlayer packet = new PCPacketOutPlayer("gnrl_klonkku", 1, PCPacketOutPlayer.RequestField.ACCOUNT_ID, PCPacketOutPlayer.RequestField.NICKNAME);
		PacketIn packetIn = application.request(packet);
		PCPacketOutPlayerData playerData = new PCPacketOutPlayerData(PCPacketOutPlayerData.single(((PCPacketInPlayer)packetIn).getPlayers().get(0)),
				PlayerDataField.values()[10]);
		PacketIn inData = application.request(playerData);
	}
}
