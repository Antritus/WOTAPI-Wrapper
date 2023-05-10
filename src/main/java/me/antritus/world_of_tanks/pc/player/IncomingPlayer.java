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

package me.antritus.world_of_tanks.pc.player;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class IncomingPlayer {
	@SerializedName("account_id")
	private int id;
	@SerializedName("nickname")
	private String nickname;
	public IncomingPlayer(){
	}

	public int getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	@NotNull
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder("IncomingPlayer(");
		builder.append(nickname != null ? nickname : "");
		if (builder.length() > "IncomingPlayer(".length()) {
			builder.append(", ");
		}
		builder.append(id > 0 ? id : "");
		builder.append(")");
		return builder.toString();
	}
}
