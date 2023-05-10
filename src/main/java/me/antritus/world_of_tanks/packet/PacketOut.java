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
import me.antritus.world_of_tanks.Application;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class PacketOut<T extends PacketIn> extends Packet{
	/**
	 * Super class of Packets
	 * @param type The type of packet
	 */
	public PacketOut(@NotNull PacketType type) {
		super(InternalPacketType.OUTGOING, type);
	}
	public abstract @Nullable PacketWrap send(Application application);
	public abstract @NotNull T receive(JsonObject gson);

	public String join(String... info){
		StringBuilder builder = new StringBuilder();
		if (info.length == 1){
			return info[0];
		}
		for (String line : info){
			if (builder.length() > 0){
				builder.append("%2C+");
			}
			builder.append(line);
		}
		return builder.toString();
	}
	public String join(List<String> info){
		StringBuilder builder = new StringBuilder();
		if (info.size() == 1){
			return info.get(0);
		}
		for (String line : info){
			if (builder.length() > 0){
				builder.append("%2C+");
			}
			builder.append(line);
		}
		return builder.toString();
	}
}

// https://api.worldoftanks.eu/wot/account/list/?application_id=e47c1cb2f7fc8e469150ac5ee4c0ce75&search=gnrl_klonkku