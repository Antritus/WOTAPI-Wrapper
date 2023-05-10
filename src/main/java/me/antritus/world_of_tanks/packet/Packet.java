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

import org.jetbrains.annotations.NotNull;

public abstract class Packet {
	private final PacketType type;
	private final InternalPacketType internalType;
	/**
	 * Super class of Packets
	 * @param type The type of packet
	 */
	public Packet(@NotNull InternalPacketType internalType, @NotNull PacketType type){
		this.type = type;
		this.internalType = internalType;
	}
	public PacketType getPacketType(){
		return type;
	}

	public InternalPacketType getInternalType() {
		return internalType;
	}

	public enum InternalPacketType {
		INCOMING,
		OUTGOING,
		STATUS,
		;
	}
}
