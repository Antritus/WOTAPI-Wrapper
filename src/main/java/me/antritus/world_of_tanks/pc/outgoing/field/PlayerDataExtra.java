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

package me.antritus.world_of_tanks.pc.outgoing.field;

/**
 * The fields which the api request should ask for.
 * This class was mostly done by a script.
 * @since 1.0-snapshot
 * @author Antritus
 */
public enum PlayerDataExtra {
	/**
	 * No information from wargaming developer website
	 * Note that this will only work in <a href="me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayerDataPrivate"></a>
	 * @since 1.0-snapshot
	 */
	PRIVATE_BOOSTERS("private.boosters"),
	/**
	 * No information from wargaming developer website
	 * Note that this will only work in <a href="me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayerDataPrivate"></a>
	 * @since 1.0-snapshot
	 */
	PRIVATE_GARAGE("private.garage"),
	/**
	 * No information from wargaming developer website
	 * Note that this will only work in <a href="me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayerDataPrivate"></a>
	 * @since 1.0-snapshot
	 */
	PRIVATE_GROUPED_CONTACTS("private.grouped_contacts"),
	/**
	 * No information from wargaming developer website
	 * Note that this will only work in <a href="me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayerDataPrivate"></a>
	 * @since 1.0-snapshot
	 */
	PRIVATE_PERSONAL_MISSIONS("private.personal_missions"),
	/**
	 * No information from wargaming developer website
	 * Note that this will only work in <a href="me.antritus.world_of_tanks.pc.outgoing.PCPacketOutPlayerDataPrivate"></a>
	 * @since 1.0-snapshot
	 */
	PRIVATE_RENTED("private.rented"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC("statistics.epic"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT("statistics.fallout"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE("statistics.globalmap_absolute"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION("statistics.globalmap_champion"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE("statistics.globalmap_middle"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM("statistics.random"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10("statistics.ranked_10x10"),
	/**
	 * No information from wargaming developer website
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15("statistics.ranked_15x15"),
	/**
	 * No information from wargaming developer website
	 * @author Antritus
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES("statistics.ranked_battles"),
	/**
	 * No information from wargaming developer website
	 * @author Antritus
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT("statistics.ranked_battles_current"),
	/**
	 * No information from wargaming developer website
	 * @author Antritus
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS("statistics.ranked_battles_previous"),
	/**
	 * No information from wargaming developer website
	 * @author Antritus
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1("statistics.ranked_season_1"),
	/**
	 * No information from wargaming developer website
	 * @author Antritus
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2("statistics.ranked_season_2"),
	/**
	 * No information from wargaming developer website
	 * @author Antritus
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3("statistics.ranked_season_3"),
	;
	private final String packetForm;

	PlayerDataExtra(String packetForm){
		this.packetForm = packetForm;
	}
	public String getPacketForm(){
		return packetForm;
	}
}