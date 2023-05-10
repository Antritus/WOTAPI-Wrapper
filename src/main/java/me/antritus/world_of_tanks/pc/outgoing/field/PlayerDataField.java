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
public enum PlayerDataField {
/**
 * Player account ID
 * @type numeric
 * @since 1.0-snapshot
 */
ACCOUNT_ID("account_id"),

	/**
	 * Clan ID
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	CLAN_ID("clan_id"),

	/**
	 * Language selected in the game client
	 * @deprecated Warning. The field will be disabled.
	 * @type string
	 * @since 1.0-snapshot
	 */
	@Deprecated
	CLIENT_LANGUAGE("client_language"),

	/**
	 * Date when player's account was created
	 * @type timestamp
	 * @since 1.0-snapshot
	 */
	CREATED_AT("created_at"),

	/**
	 * Personal rating
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	GLOBAL_RATING("global_rating"),

	/**
	 * Last battle time
	 * @type timestamp
	 * @since 1.0-snapshot
	 */
	LAST_BATTLE_TIME("last_battle_time"),

	/**
	 * End time of last game session
	 * @type timestamp
	 * @since 1.0-snapshot
	 */
	LOGOUT_AT("logout_at"),

	/**
	 * Player name
	 * @type string
	 * @since 1.0-snapshot
	 */
	NICKNAME("nickname"),

	/**
	 * Date when player details were updated
	 * @type timestamp
	 * @since 1.0-snapshot
	 */
	UPDATED_AT("updated_at"),

	/**
	 * Number and models of vehicles destroyed by a player. Player's private data.
	 * @type associative array
	 * @since 1.0-snapshot
	 */
	STATISTICS_FRAGS("statistics.frags"),

	/**
	 * Trees knocked down
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TREES_CUT("statistics.trees_cut"),

	/**
	 * Average damage caused with your assistance. Value is calculated starting from version 8.8.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_AVG_DAMAGE_ASSISTED("statistics.all.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting. Value is calculated starting from version 8.8.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_AVG_DAMAGE_ASSISTED_RADIO("statistics.all.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track. Value is calculated starting from version 8.8.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_AVG_DAMAGE_ASSISTED_TRACK("statistics.all.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_AVG_DAMAGE_BLOCKED("statistics.all.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_BATTLE_AVG_XP("statistics.all.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_BATTLES("statistics.all.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_BATTLES_ON_STUNNING_VEHICLES("statistics.all.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_CAPTURE_POINTS("statistics.all.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_DAMAGE_DEALT("statistics.all.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_DAMAGE_RECEIVED("statistics.all.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_DIRECT_HITS_RECEIVED("statistics.all.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_DRAWS("statistics.all.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_DROPPED_CAPTURE_POINTS("statistics.all.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_EXPLOSION_HITS("statistics.all.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_EXPLOSION_HITS_RECEIVED("statistics.all.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_FRAGS("statistics.all.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_HITS("statistics.all.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_HITS_PERCENTS("statistics.all.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_LOSSES("statistics.all.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_MAX_DAMAGE("statistics.all.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_MAX_DAMAGE_TANK_ID("statistics.all.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_MAX_FRAGS("statistics.all.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_MAX_FRAGS_TANK_ID("statistics.all.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_MAX_XP("statistics.all.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_MAX_XP_TANK_ID("statistics.all.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.all.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_PIERCINGS("statistics.all.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_PIERCINGS_RECEIVED("statistics.all.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_SHOTS("statistics.all.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_SPOTTED("statistics.all.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_STUN_ASSISTED_DAMAGE("statistics.all.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_STUN_NUMBER("statistics.all.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_SURVIVED_BATTLES("statistics.all.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_TANKING_FACTOR("statistics.all.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_WINS("statistics.all.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_ALL_XP("statistics.all.xp"),

	/**
	 * Average damage caused with your assistance. Value is calculated starting from version 8.9.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_AVG_DAMAGE_ASSISTED("statistics.clan.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting. Value is calculated starting from version 8.9.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_AVG_DAMAGE_ASSISTED_RADIO("statistics.clan.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track. Value is calculated starting from version 8.9.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_AVG_DAMAGE_ASSISTED_TRACK("statistics.clan.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_AVG_DAMAGE_BLOCKED("statistics.clan.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_BATTLE_AVG_XP("statistics.clan.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_BATTLES("statistics.clan.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_BATTLES_ON_STUNNING_VEHICLES("statistics.clan.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_CAPTURE_POINTS("statistics.clan.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_DAMAGE_DEALT("statistics.clan.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_DAMAGE_RECEIVED("statistics.clan.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_DIRECT_HITS_RECEIVED("statistics.clan.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_DRAWS("statistics.clan.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_DROPPED_CAPTURE_POINTS("statistics.clan.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_EXPLOSION_HITS("statistics.clan.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_EXPLOSION_HITS_RECEIVED("statistics.clan.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_FRAGS("statistics.clan.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_HITS("statistics.clan.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_HITS_PERCENTS("statistics.clan.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_LOSSES("statistics.clan.losses"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.clan.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_PIERCINGS("statistics.clan.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_PIERCINGS_RECEIVED("statistics.clan.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_SHOTS("statistics.clan.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_SPOTTED("statistics.clan.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_STUN_ASSISTED_DAMAGE("statistics.clan.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_STUN_NUMBER("statistics.clan.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_SURVIVED_BATTLES("statistics.clan.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_TANKING_FACTOR("statistics.clan.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_WINS("statistics.clan.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_CLAN_XP("statistics.clan.xp"),

	/**
	 * Average damage caused with your assistance. Value is calculated starting from version 8.9.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_AVG_DAMAGE_ASSISTED("statistics.company.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting. Value is calculated starting from version 8.9.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_AVG_DAMAGE_ASSISTED_RADIO("statistics.company.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track. Value is calculated starting from version 8.9.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_AVG_DAMAGE_ASSISTED_TRACK("statistics.company.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_AVG_DAMAGE_BLOCKED("statistics.company.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_BATTLE_AVG_XP("statistics.company.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_BATTLES("statistics.company.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_BATTLES_ON_STUNNING_VEHICLES("statistics.company.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_CAPTURE_POINTS("statistics.company.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_DAMAGE_DEALT("statistics.company.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_DAMAGE_RECEIVED("statistics.company.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_DIRECT_HITS_RECEIVED("statistics.company.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_DRAWS("statistics.company.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_DROPPED_CAPTURE_POINTS("statistics.company.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_EXPLOSION_HITS("statistics.company.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_EXPLOSION_HITS_RECEIVED("statistics.company.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_FRAGS("statistics.company.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_HITS("statistics.company.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_HITS_PERCENTS("statistics.company.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_LOSSES("statistics.company.losses"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.company.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_PIERCINGS("statistics.company.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_PIERCINGS_RECEIVED("statistics.company.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_SHOTS("statistics.company.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_SPOTTED("statistics.company.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_STUN_ASSISTED_DAMAGE("statistics.company.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_STUN_NUMBER("statistics.company.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_SURVIVED_BATTLES("statistics.company.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_TANKING_FACTOR("statistics.company.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_WINS("statistics.company.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_COMPANY_XP("statistics.company.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_AVG_DAMAGE_ASSISTED("statistics.epic.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_AVG_DAMAGE_ASSISTED_RADIO("statistics.epic.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_AVG_DAMAGE_ASSISTED_TRACK("statistics.epic.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_AVG_DAMAGE_BLOCKED("statistics.epic.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_BATTLE_AVG_XP("statistics.epic.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_BATTLES("statistics.epic.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_BATTLES_ON_STUNNING_VEHICLES("statistics.epic.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_CAPTURE_POINTS("statistics.epic.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_DAMAGE_DEALT("statistics.epic.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_DAMAGE_RECEIVED("statistics.epic.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_DIRECT_HITS_RECEIVED("statistics.epic.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_DRAWS("statistics.epic.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_DROPPED_CAPTURE_POINTS("statistics.epic.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_EXPLOSION_HITS("statistics.epic.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_EXPLOSION_HITS_RECEIVED("statistics.epic.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_FRAGS("statistics.epic.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_HITS("statistics.epic.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_HITS_PERCENTS("statistics.epic.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_LOSSES("statistics.epic.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_MAX_DAMAGE("statistics.epic.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_MAX_DAMAGE_TANK_ID("statistics.epic.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_MAX_FRAGS("statistics.epic.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_MAX_FRAGS_TANK_ID("statistics.epic.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_MAX_XP("statistics.epic.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_MAX_XP_TANK_ID("statistics.epic.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.epic.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_PIERCINGS("statistics.epic.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_PIERCINGS_RECEIVED("statistics.epic.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_SHOTS("statistics.epic.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_SPOTTED("statistics.epic.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_STUN_ASSISTED_DAMAGE("statistics.epic.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_STUN_NUMBER("statistics.epic.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_SURVIVED_BATTLES("statistics.epic.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_TANKING_FACTOR("statistics.epic.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_WINS("statistics.epic.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_EPIC_XP("statistics.epic.xp"),

	/**
	 * Damage caused by Combat Reserves
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_AVATAR_DAMAGE_DEALT("statistics.fallout.avatar_damage_dealt"),

	/**
	 * Destroyed by Combat Reserves
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_AVATAR_FRAGS("statistics.fallout.avatar_frags"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_AVG_DAMAGE_ASSISTED("statistics.fallout.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_AVG_DAMAGE_ASSISTED_RADIO("statistics.fallout.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_AVG_DAMAGE_ASSISTED_TRACK("statistics.fallout.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_AVG_DAMAGE_BLOCKED("statistics.fallout.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_BATTLE_AVG_XP("statistics.fallout.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_BATTLES("statistics.fallout.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_BATTLES_ON_STUNNING_VEHICLES("statistics.fallout.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_CAPTURE_POINTS("statistics.fallout.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_DAMAGE_DEALT("statistics.fallout.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_DAMAGE_RECEIVED("statistics.fallout.damage_received"),

	/**
	 * Deaths
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_DEATH_COUNT("statistics.fallout.death_count"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_DIRECT_HITS_RECEIVED("statistics.fallout.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_DRAWS("statistics.fallout.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_DROPPED_CAPTURE_POINTS("statistics.fallout.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_EXPLOSION_HITS("statistics.fallout.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_EXPLOSION_HITS_RECEIVED("statistics.fallout.explosion_hits_received"),

	/**
	 * Flags captured in platoon
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_FLAG_CAPTURE("statistics.fallout.flag_capture"),

	/**
	 * Flags captured as solo player
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_FLAG_CAPTURE_SOLO("statistics.fallout.flag_capture_solo"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_FRAGS("statistics.fallout.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_HITS("statistics.fallout.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_HITS_PERCENTS("statistics.fallout.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_LOSSES("statistics.fallout.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_DAMAGE("statistics.fallout.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_DAMAGE_TANK_ID("statistics.fallout.max_damage_tank_id"),

	/**
	 * Maximum damage caused in one battle including damage from avatar
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_DAMAGE_WITH_AVATAR("statistics.fallout.max_damage_with_avatar"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_FRAGS("statistics.fallout.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_FRAGS_TANK_ID("statistics.fallout.max_frags_tank_id"),

	/**
	 * Maximum destroyed in one battle including vehicles destroyed by avatar
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_FRAGS_WITH_AVATAR("statistics.fallout.max_frags_with_avatar"),

	/**
	 * Maximum Victory Points earned in Fallout
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_WIN_POINTS("statistics.fallout.max_win_points"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_XP("statistics.fallout.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_MAX_XP_TANK_ID("statistics.fallout.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.fallout.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_PIERCINGS("statistics.fallout.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_PIERCINGS_RECEIVED("statistics.fallout.piercings_received"),

	/**
	 * Resources captured at resource points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_RESOURCE_ABSORBED("statistics.fallout.resource_absorbed"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_SHOTS("statistics.fallout.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_SPOTTED("statistics.fallout.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_STUN_ASSISTED_DAMAGE("statistics.fallout.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_STUN_NUMBER("statistics.fallout.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_SURVIVED_BATTLES("statistics.fallout.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_TANKING_FACTOR("statistics.fallout.tanking_factor"),

	/**
	 * Victory Points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_WIN_POINTS("statistics.fallout.win_points"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_WINS("statistics.fallout.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_FALLOUT_XP("statistics.fallout.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_AVG_DAMAGE_ASSISTED("statistics.globalmap_absolute.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_AVG_DAMAGE_ASSISTED_RADIO("statistics.globalmap_absolute.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_AVG_DAMAGE_ASSISTED_TRACK("statistics.globalmap_absolute.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_AVG_DAMAGE_BLOCKED("statistics.globalmap_absolute.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_BATTLE_AVG_XP("statistics.globalmap_absolute.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_BATTLES("statistics.globalmap_absolute.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_BATTLES_ON_STUNNING_VEHICLES("statistics.globalmap_absolute.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_CAPTURE_POINTS("statistics.globalmap_absolute.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_DAMAGE_DEALT("statistics.globalmap_absolute.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_DAMAGE_RECEIVED("statistics.globalmap_absolute.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_DIRECT_HITS_RECEIVED("statistics.globalmap_absolute.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_DRAWS("statistics.globalmap_absolute.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_DROPPED_CAPTURE_POINTS("statistics.globalmap_absolute.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_EXPLOSION_HITS("statistics.globalmap_absolute.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_EXPLOSION_HITS_RECEIVED("statistics.globalmap_absolute.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_FRAGS("statistics.globalmap_absolute.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_HITS("statistics.globalmap_absolute.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_HITS_PERCENTS("statistics.globalmap_absolute.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_LOSSES("statistics.globalmap_absolute.losses"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.globalmap_absolute.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_PIERCINGS("statistics.globalmap_absolute.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_PIERCINGS_RECEIVED("statistics.globalmap_absolute.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_SHOTS("statistics.globalmap_absolute.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_SPOTTED("statistics.globalmap_absolute.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_STUN_ASSISTED_DAMAGE("statistics.globalmap_absolute.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_STUN_NUMBER("statistics.globalmap_absolute.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_SURVIVED_BATTLES("statistics.globalmap_absolute.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_TANKING_FACTOR("statistics.globalmap_absolute.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_WINS("statistics.globalmap_absolute.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_ABSOLUTE_XP("statistics.globalmap_absolute.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_AVG_DAMAGE_ASSISTED("statistics.globalmap_champion.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_AVG_DAMAGE_ASSISTED_RADIO("statistics.globalmap_champion.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_AVG_DAMAGE_ASSISTED_TRACK("statistics.globalmap_champion.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_AVG_DAMAGE_BLOCKED("statistics.globalmap_champion.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_BATTLE_AVG_XP("statistics.globalmap_champion.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_BATTLES("statistics.globalmap_champion.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_BATTLES_ON_STUNNING_VEHICLES("statistics.globalmap_champion.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_CAPTURE_POINTS("statistics.globalmap_champion.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_DAMAGE_DEALT("statistics.globalmap_champion.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_DAMAGE_RECEIVED("statistics.globalmap_champion.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_DIRECT_HITS_RECEIVED("statistics.globalmap_champion.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_DRAWS("statistics.globalmap_champion.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_DROPPED_CAPTURE_POINTS("statistics.globalmap_champion.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_EXPLOSION_HITS("statistics.globalmap_champion.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_EXPLOSION_HITS_RECEIVED("statistics.globalmap_champion.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_FRAGS("statistics.globalmap_champion.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_HITS("statistics.globalmap_champion.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_HITS_PERCENTS("statistics.globalmap_champion.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_LOSSES("statistics.globalmap_champion.losses"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.globalmap_champion.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_PIERCINGS("statistics.globalmap_champion.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_PIERCINGS_RECEIVED("statistics.globalmap_champion.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_SHOTS("statistics.globalmap_champion.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_SPOTTED("statistics.globalmap_champion.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_STUN_ASSISTED_DAMAGE("statistics.globalmap_champion.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_STUN_NUMBER("statistics.globalmap_champion.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_SURVIVED_BATTLES("statistics.globalmap_champion.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_TANKING_FACTOR("statistics.globalmap_champion.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_WINS("statistics.globalmap_champion.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_CHAMPION_XP("statistics.globalmap_champion.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_AVG_DAMAGE_ASSISTED("statistics.globalmap_middle.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_AVG_DAMAGE_ASSISTED_RADIO("statistics.globalmap_middle.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_AVG_DAMAGE_ASSISTED_TRACK("statistics.globalmap_middle.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_AVG_DAMAGE_BLOCKED("statistics.globalmap_middle.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_BATTLE_AVG_XP("statistics.globalmap_middle.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_BATTLES("statistics.globalmap_middle.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_BATTLES_ON_STUNNING_VEHICLES("statistics.globalmap_middle.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_CAPTURE_POINTS("statistics.globalmap_middle.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_DAMAGE_DEALT("statistics.globalmap_middle.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_DAMAGE_RECEIVED("statistics.globalmap_middle.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_DIRECT_HITS_RECEIVED("statistics.globalmap_middle.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_DRAWS("statistics.globalmap_middle.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_DROPPED_CAPTURE_POINTS("statistics.globalmap_middle.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_EXPLOSION_HITS("statistics.globalmap_middle.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_EXPLOSION_HITS_RECEIVED("statistics.globalmap_middle.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_FRAGS("statistics.globalmap_middle.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_HITS("statistics.globalmap_middle.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_HITS_PERCENTS("statistics.globalmap_middle.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_LOSSES("statistics.globalmap_middle.losses"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.globalmap_middle.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_PIERCINGS("statistics.globalmap_middle.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_PIERCINGS_RECEIVED("statistics.globalmap_middle.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_SHOTS("statistics.globalmap_middle.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_SPOTTED("statistics.globalmap_middle.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_STUN_ASSISTED_DAMAGE("statistics.globalmap_middle.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_STUN_NUMBER("statistics.globalmap_middle.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_SURVIVED_BATTLES("statistics.globalmap_middle.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_TANKING_FACTOR("statistics.globalmap_middle.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_WINS("statistics.globalmap_middle.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_GLOBALMAP_MIDDLE_XP("statistics.globalmap_middle.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_AVG_DAMAGE_ASSISTED("statistics.historical.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_AVG_DAMAGE_ASSISTED_RADIO("statistics.historical.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_AVG_DAMAGE_ASSISTED_TRACK("statistics.historical.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_AVG_DAMAGE_BLOCKED("statistics.historical.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_BATTLE_AVG_XP("statistics.historical.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_BATTLES("statistics.historical.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_BATTLES_ON_STUNNING_VEHICLES("statistics.historical.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_CAPTURE_POINTS("statistics.historical.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_DAMAGE_DEALT("statistics.historical.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_DAMAGE_RECEIVED("statistics.historical.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_DIRECT_HITS_RECEIVED("statistics.historical.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_DRAWS("statistics.historical.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_DROPPED_CAPTURE_POINTS("statistics.historical.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_EXPLOSION_HITS("statistics.historical.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_EXPLOSION_HITS_RECEIVED("statistics.historical.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_FRAGS("statistics.historical.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_HITS("statistics.historical.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_HITS_PERCENTS("statistics.historical.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_LOSSES("statistics.historical.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_MAX_DAMAGE("statistics.historical.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_MAX_DAMAGE_TANK_ID("statistics.historical.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_MAX_FRAGS("statistics.historical.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_MAX_FRAGS_TANK_ID("statistics.historical.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_MAX_XP("statistics.historical.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_MAX_XP_TANK_ID("statistics.historical.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.historical.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_PIERCINGS("statistics.historical.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_PIERCINGS_RECEIVED("statistics.historical.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_SHOTS("statistics.historical.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_SPOTTED("statistics.historical.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_STUN_ASSISTED_DAMAGE("statistics.historical.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_STUN_NUMBER("statistics.historical.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_SURVIVED_BATTLES("statistics.historical.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_TANKING_FACTOR("statistics.historical.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_WINS("statistics.historical.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_HISTORICAL_XP("statistics.historical.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_AVG_DAMAGE_ASSISTED("statistics.random.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_AVG_DAMAGE_ASSISTED_RADIO("statistics.random.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_AVG_DAMAGE_ASSISTED_TRACK("statistics.random.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_AVG_DAMAGE_BLOCKED("statistics.random.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_BATTLE_AVG_XP("statistics.random.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_BATTLES("statistics.random.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_BATTLES_ON_STUNNING_VEHICLES("statistics.random.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_CAPTURE_POINTS("statistics.random.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_DAMAGE_DEALT("statistics.random.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_DAMAGE_RECEIVED("statistics.random.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_DIRECT_HITS_RECEIVED("statistics.random.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_DRAWS("statistics.random.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_DROPPED_CAPTURE_POINTS("statistics.random.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_EXPLOSION_HITS("statistics.random.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_EXPLOSION_HITS_RECEIVED("statistics.random.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_FRAGS("statistics.random.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_HITS("statistics.random.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_HITS_PERCENTS("statistics.random.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_LOSSES("statistics.random.losses"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.random.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_PIERCINGS("statistics.random.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_PIERCINGS_RECEIVED("statistics.random.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_SHOTS("statistics.random.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_SPOTTED("statistics.random.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_STUN_ASSISTED_DAMAGE("statistics.random.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_STUN_NUMBER("statistics.random.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_SURVIVED_BATTLES("statistics.random.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_TANKING_FACTOR("statistics.random.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_WINS("statistics.random.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANDOM_XP("statistics.random.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_AVG_DAMAGE_ASSISTED("statistics.ranked_10x10.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_10x10.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_10x10.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_AVG_DAMAGE_BLOCKED("statistics.ranked_10x10.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_BATTLE_AVG_XP("statistics.ranked_10x10.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_BATTLES("statistics.ranked_10x10.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_10x10.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_CAPTURE_POINTS("statistics.ranked_10x10.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_DAMAGE_DEALT("statistics.ranked_10x10.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_DAMAGE_RECEIVED("statistics.ranked_10x10.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_DIRECT_HITS_RECEIVED("statistics.ranked_10x10.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_DRAWS("statistics.ranked_10x10.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_DROPPED_CAPTURE_POINTS("statistics.ranked_10x10.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_EXPLOSION_HITS("statistics.ranked_10x10.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_EXPLOSION_HITS_RECEIVED("statistics.ranked_10x10.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_FRAGS("statistics.ranked_10x10.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_HITS("statistics.ranked_10x10.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_HITS_PERCENTS("statistics.ranked_10x10.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_LOSSES("statistics.ranked_10x10.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_MAX_DAMAGE("statistics.ranked_10x10.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_MAX_DAMAGE_TANK_ID("statistics.ranked_10x10.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_MAX_FRAGS("statistics.ranked_10x10.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_MAX_FRAGS_TANK_ID("statistics.ranked_10x10.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_MAX_XP("statistics.ranked_10x10.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_MAX_XP_TANK_ID("statistics.ranked_10x10.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_10x10.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_PIERCINGS("statistics.ranked_10x10.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_PIERCINGS_RECEIVED("statistics.ranked_10x10.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_SHOTS("statistics.ranked_10x10.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_SPOTTED("statistics.ranked_10x10.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_STUN_ASSISTED_DAMAGE("statistics.ranked_10x10.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_STUN_NUMBER("statistics.ranked_10x10.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_SURVIVED_BATTLES("statistics.ranked_10x10.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_TANKING_FACTOR("statistics.ranked_10x10.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_WINS("statistics.ranked_10x10.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_10X10_XP("statistics.ranked_10x10.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_AVG_DAMAGE_ASSISTED("statistics.ranked_15x15.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_15x15.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_15x15.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_AVG_DAMAGE_BLOCKED("statistics.ranked_15x15.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_BATTLE_AVG_XP("statistics.ranked_15x15.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_BATTLES("statistics.ranked_15x15.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_15x15.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_CAPTURE_POINTS("statistics.ranked_15x15.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_DAMAGE_DEALT("statistics.ranked_15x15.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_DAMAGE_RECEIVED("statistics.ranked_15x15.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_DIRECT_HITS_RECEIVED("statistics.ranked_15x15.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_DRAWS("statistics.ranked_15x15.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_DROPPED_CAPTURE_POINTS("statistics.ranked_15x15.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_EXPLOSION_HITS("statistics.ranked_15x15.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_EXPLOSION_HITS_RECEIVED("statistics.ranked_15x15.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_FRAGS("statistics.ranked_15x15.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_HITS("statistics.ranked_15x15.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_HITS_PERCENTS("statistics.ranked_15x15.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_LOSSES("statistics.ranked_15x15.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_MAX_DAMAGE("statistics.ranked_15x15.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_MAX_DAMAGE_TANK_ID("statistics.ranked_15x15.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_MAX_FRAGS("statistics.ranked_15x15.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_MAX_FRAGS_TANK_ID("statistics.ranked_15x15.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_MAX_XP("statistics.ranked_15x15.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_MAX_XP_TANK_ID("statistics.ranked_15x15.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_15x15.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_PIERCINGS("statistics.ranked_15x15.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_PIERCINGS_RECEIVED("statistics.ranked_15x15.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_SHOTS("statistics.ranked_15x15.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_SPOTTED("statistics.ranked_15x15.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_STUN_ASSISTED_DAMAGE("statistics.ranked_15x15.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_STUN_NUMBER("statistics.ranked_15x15.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_SURVIVED_BATTLES("statistics.ranked_15x15.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_TANKING_FACTOR("statistics.ranked_15x15.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_WINS("statistics.ranked_15x15.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_15X15_XP("statistics.ranked_15x15.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_AVG_DAMAGE_ASSISTED("statistics.ranked_battles.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_battles.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_battles.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_AVG_DAMAGE_BLOCKED("statistics.ranked_battles.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_BATTLE_AVG_XP("statistics.ranked_battles.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_BATTLES("statistics.ranked_battles.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_battles.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CAPTURE_POINTS("statistics.ranked_battles.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_DAMAGE_DEALT("statistics.ranked_battles.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_DAMAGE_RECEIVED("statistics.ranked_battles.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_DIRECT_HITS_RECEIVED("statistics.ranked_battles.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_DRAWS("statistics.ranked_battles.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_DROPPED_CAPTURE_POINTS("statistics.ranked_battles.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_EXPLOSION_HITS("statistics.ranked_battles.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_EXPLOSION_HITS_RECEIVED("statistics.ranked_battles.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_FRAGS("statistics.ranked_battles.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_HITS("statistics.ranked_battles.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_HITS_PERCENTS("statistics.ranked_battles.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_LOSSES("statistics.ranked_battles.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_MAX_DAMAGE("statistics.ranked_battles.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_MAX_DAMAGE_TANK_ID("statistics.ranked_battles.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_MAX_FRAGS("statistics.ranked_battles.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_MAX_FRAGS_TANK_ID("statistics.ranked_battles.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_MAX_XP("statistics.ranked_battles.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_MAX_XP_TANK_ID("statistics.ranked_battles.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_battles.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PIERCINGS("statistics.ranked_battles.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PIERCINGS_RECEIVED("statistics.ranked_battles.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_SHOTS("statistics.ranked_battles.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_SPOTTED("statistics.ranked_battles.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_STUN_ASSISTED_DAMAGE("statistics.ranked_battles.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_STUN_NUMBER("statistics.ranked_battles.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_SURVIVED_BATTLES("statistics.ranked_battles.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_TANKING_FACTOR("statistics.ranked_battles.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_WINS("statistics.ranked_battles.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_XP("statistics.ranked_battles.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_AVG_DAMAGE_ASSISTED("statistics.ranked_battles_current.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_battles_current.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_battles_current.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_AVG_DAMAGE_BLOCKED("statistics.ranked_battles_current.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_BATTLE_AVG_XP("statistics.ranked_battles_current.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_BATTLES("statistics.ranked_battles_current.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_battles_current.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_CAPTURE_POINTS("statistics.ranked_battles_current.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_DAMAGE_DEALT("statistics.ranked_battles_current.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_DAMAGE_RECEIVED("statistics.ranked_battles_current.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_DIRECT_HITS_RECEIVED("statistics.ranked_battles_current.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_DRAWS("statistics.ranked_battles_current.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_DROPPED_CAPTURE_POINTS("statistics.ranked_battles_current.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_EXPLOSION_HITS("statistics.ranked_battles_current.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_EXPLOSION_HITS_RECEIVED("statistics.ranked_battles_current.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_FRAGS("statistics.ranked_battles_current.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_HITS("statistics.ranked_battles_current.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_HITS_PERCENTS("statistics.ranked_battles_current.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_LOSSES("statistics.ranked_battles_current.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_MAX_DAMAGE("statistics.ranked_battles_current.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_MAX_DAMAGE_TANK_ID("statistics.ranked_battles_current.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_MAX_FRAGS("statistics.ranked_battles_current.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_MAX_FRAGS_TANK_ID("statistics.ranked_battles_current.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_MAX_XP("statistics.ranked_battles_current.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_MAX_XP_TANK_ID("statistics.ranked_battles_current.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_battles_current.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_PIERCINGS("statistics.ranked_battles_current.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_PIERCINGS_RECEIVED("statistics.ranked_battles_current.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_SHOTS("statistics.ranked_battles_current.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_SPOTTED("statistics.ranked_battles_current.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_STUN_ASSISTED_DAMAGE("statistics.ranked_battles_current.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_STUN_NUMBER("statistics.ranked_battles_current.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_SURVIVED_BATTLES("statistics.ranked_battles_current.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_TANKING_FACTOR("statistics.ranked_battles_current.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_WINS("statistics.ranked_battles_current.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_CURRENT_XP("statistics.ranked_battles_current.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_AVG_DAMAGE_ASSISTED("statistics.ranked_battles_previous.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_battles_previous.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_battles_previous.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_AVG_DAMAGE_BLOCKED("statistics.ranked_battles_previous.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_BATTLE_AVG_XP("statistics.ranked_battles_previous.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_BATTLES("statistics.ranked_battles_previous.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_battles_previous.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_CAPTURE_POINTS("statistics.ranked_battles_previous.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_DAMAGE_DEALT("statistics.ranked_battles_previous.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_DAMAGE_RECEIVED("statistics.ranked_battles_previous.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_DIRECT_HITS_RECEIVED("statistics.ranked_battles_previous.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_DRAWS("statistics.ranked_battles_previous.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_DROPPED_CAPTURE_POINTS("statistics.ranked_battles_previous.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_EXPLOSION_HITS("statistics.ranked_battles_previous.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_EXPLOSION_HITS_RECEIVED("statistics.ranked_battles_previous.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_FRAGS("statistics.ranked_battles_previous.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_HITS("statistics.ranked_battles_previous.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_HITS_PERCENTS("statistics.ranked_battles_previous.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_LOSSES("statistics.ranked_battles_previous.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_MAX_DAMAGE("statistics.ranked_battles_previous.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_MAX_DAMAGE_TANK_ID("statistics.ranked_battles_previous.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_MAX_FRAGS("statistics.ranked_battles_previous.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_MAX_FRAGS_TANK_ID("statistics.ranked_battles_previous.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_MAX_XP("statistics.ranked_battles_previous.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_MAX_XP_TANK_ID("statistics.ranked_battles_previous.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_battles_previous.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_PIERCINGS("statistics.ranked_battles_previous.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_PIERCINGS_RECEIVED("statistics.ranked_battles_previous.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_SHOTS("statistics.ranked_battles_previous.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_SPOTTED("statistics.ranked_battles_previous.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_STUN_ASSISTED_DAMAGE("statistics.ranked_battles_previous.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_STUN_NUMBER("statistics.ranked_battles_previous.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_SURVIVED_BATTLES("statistics.ranked_battles_previous.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_TANKING_FACTOR("statistics.ranked_battles_previous.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_WINS("statistics.ranked_battles_previous.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_BATTLES_PREVIOUS_XP("statistics.ranked_battles_previous.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_AVG_DAMAGE_ASSISTED("statistics.ranked_season_1.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_season_1.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_season_1.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_AVG_DAMAGE_BLOCKED("statistics.ranked_season_1.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_BATTLE_AVG_XP("statistics.ranked_season_1.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_BATTLES("statistics.ranked_season_1.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_season_1.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_CAPTURE_POINTS("statistics.ranked_season_1.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_DAMAGE_DEALT("statistics.ranked_season_1.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_DAMAGE_RECEIVED("statistics.ranked_season_1.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_DIRECT_HITS_RECEIVED("statistics.ranked_season_1.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_DRAWS("statistics.ranked_season_1.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_DROPPED_CAPTURE_POINTS("statistics.ranked_season_1.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_EXPLOSION_HITS("statistics.ranked_season_1.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_EXPLOSION_HITS_RECEIVED("statistics.ranked_season_1.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_FRAGS("statistics.ranked_season_1.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_HITS("statistics.ranked_season_1.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_HITS_PERCENTS("statistics.ranked_season_1.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_LOSSES("statistics.ranked_season_1.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_MAX_DAMAGE("statistics.ranked_season_1.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_MAX_DAMAGE_TANK_ID("statistics.ranked_season_1.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_MAX_FRAGS("statistics.ranked_season_1.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_MAX_FRAGS_TANK_ID("statistics.ranked_season_1.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_MAX_XP("statistics.ranked_season_1.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_MAX_XP_TANK_ID("statistics.ranked_season_1.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_season_1.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_PIERCINGS("statistics.ranked_season_1.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_PIERCINGS_RECEIVED("statistics.ranked_season_1.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_SHOTS("statistics.ranked_season_1.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_SPOTTED("statistics.ranked_season_1.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_STUN_ASSISTED_DAMAGE("statistics.ranked_season_1.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_STUN_NUMBER("statistics.ranked_season_1.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_SURVIVED_BATTLES("statistics.ranked_season_1.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_TANKING_FACTOR("statistics.ranked_season_1.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_WINS("statistics.ranked_season_1.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_1_XP("statistics.ranked_season_1.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_AVG_DAMAGE_ASSISTED("statistics.ranked_season_2.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_season_2.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_season_2.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_AVG_DAMAGE_BLOCKED("statistics.ranked_season_2.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_BATTLE_AVG_XP("statistics.ranked_season_2.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_BATTLES("statistics.ranked_season_2.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_season_2.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_CAPTURE_POINTS("statistics.ranked_season_2.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_DAMAGE_DEALT("statistics.ranked_season_2.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_DAMAGE_RECEIVED("statistics.ranked_season_2.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_DIRECT_HITS_RECEIVED("statistics.ranked_season_2.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_DRAWS("statistics.ranked_season_2.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_DROPPED_CAPTURE_POINTS("statistics.ranked_season_2.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_EXPLOSION_HITS("statistics.ranked_season_2.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_EXPLOSION_HITS_RECEIVED("statistics.ranked_season_2.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_FRAGS("statistics.ranked_season_2.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_HITS("statistics.ranked_season_2.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_HITS_PERCENTS("statistics.ranked_season_2.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_LOSSES("statistics.ranked_season_2.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_MAX_DAMAGE("statistics.ranked_season_2.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_MAX_DAMAGE_TANK_ID("statistics.ranked_season_2.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_MAX_FRAGS("statistics.ranked_season_2.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_MAX_FRAGS_TANK_ID("statistics.ranked_season_2.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_MAX_XP("statistics.ranked_season_2.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_MAX_XP_TANK_ID("statistics.ranked_season_2.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_season_2.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_PIERCINGS("statistics.ranked_season_2.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_PIERCINGS_RECEIVED("statistics.ranked_season_2.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_SHOTS("statistics.ranked_season_2.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_SPOTTED("statistics.ranked_season_2.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_STUN_ASSISTED_DAMAGE("statistics.ranked_season_2.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_STUN_NUMBER("statistics.ranked_season_2.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_SURVIVED_BATTLES("statistics.ranked_season_2.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_TANKING_FACTOR("statistics.ranked_season_2.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_WINS("statistics.ranked_season_2.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_2_XP("statistics.ranked_season_2.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_AVG_DAMAGE_ASSISTED("statistics.ranked_season_3.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_AVG_DAMAGE_ASSISTED_RADIO("statistics.ranked_season_3.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_AVG_DAMAGE_ASSISTED_TRACK("statistics.ranked_season_3.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_AVG_DAMAGE_BLOCKED("statistics.ranked_season_3.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_BATTLE_AVG_XP("statistics.ranked_season_3.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_BATTLES("statistics.ranked_season_3.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_BATTLES_ON_STUNNING_VEHICLES("statistics.ranked_season_3.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_CAPTURE_POINTS("statistics.ranked_season_3.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_DAMAGE_DEALT("statistics.ranked_season_3.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_DAMAGE_RECEIVED("statistics.ranked_season_3.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_DIRECT_HITS_RECEIVED("statistics.ranked_season_3.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_DRAWS("statistics.ranked_season_3.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_DROPPED_CAPTURE_POINTS("statistics.ranked_season_3.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_EXPLOSION_HITS("statistics.ranked_season_3.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_EXPLOSION_HITS_RECEIVED("statistics.ranked_season_3.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_FRAGS("statistics.ranked_season_3.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_HITS("statistics.ranked_season_3.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_HITS_PERCENTS("statistics.ranked_season_3.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_LOSSES("statistics.ranked_season_3.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_MAX_DAMAGE("statistics.ranked_season_3.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_MAX_DAMAGE_TANK_ID("statistics.ranked_season_3.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_MAX_FRAGS("statistics.ranked_season_3.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_MAX_FRAGS_TANK_ID("statistics.ranked_season_3.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_MAX_XP("statistics.ranked_season_3.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_MAX_XP_TANK_ID("statistics.ranked_season_3.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.ranked_season_3.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_PIERCINGS("statistics.ranked_season_3.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_PIERCINGS_RECEIVED("statistics.ranked_season_3.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_SHOTS("statistics.ranked_season_3.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_SPOTTED("statistics.ranked_season_3.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_STUN_ASSISTED_DAMAGE("statistics.ranked_season_3.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_STUN_NUMBER("statistics.ranked_season_3.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_SURVIVED_BATTLES("statistics.ranked_season_3.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_TANKING_FACTOR("statistics.ranked_season_3.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_WINS("statistics.ranked_season_3.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_RANKED_SEASON_3_XP("statistics.ranked_season_3.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_AVG_DAMAGE_ASSISTED("statistics.regular_team.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_AVG_DAMAGE_ASSISTED_RADIO("statistics.regular_team.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_AVG_DAMAGE_ASSISTED_TRACK("statistics.regular_team.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_AVG_DAMAGE_BLOCKED("statistics.regular_team.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_BATTLE_AVG_XP("statistics.regular_team.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_BATTLES("statistics.regular_team.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_BATTLES_ON_STUNNING_VEHICLES("statistics.regular_team.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_CAPTURE_POINTS("statistics.regular_team.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_DAMAGE_DEALT("statistics.regular_team.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_DAMAGE_RECEIVED("statistics.regular_team.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_DIRECT_HITS_RECEIVED("statistics.regular_team.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_DRAWS("statistics.regular_team.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_DROPPED_CAPTURE_POINTS("statistics.regular_team.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_EXPLOSION_HITS("statistics.regular_team.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_EXPLOSION_HITS_RECEIVED("statistics.regular_team.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_FRAGS("statistics.regular_team.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_HITS("statistics.regular_team.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_HITS_PERCENTS("statistics.regular_team.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_LOSSES("statistics.regular_team.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_MAX_DAMAGE("statistics.regular_team.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_MAX_DAMAGE_TANK_ID("statistics.regular_team.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_MAX_FRAGS("statistics.regular_team.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_MAX_FRAGS_TANK_ID("statistics.regular_team.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_MAX_XP("statistics.regular_team.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_MAX_XP_TANK_ID("statistics.regular_team.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.regular_team.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_PIERCINGS("statistics.regular_team.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_PIERCINGS_RECEIVED("statistics.regular_team.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_SHOTS("statistics.regular_team.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_SPOTTED("statistics.regular_team.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_STUN_ASSISTED_DAMAGE("statistics.regular_team.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_STUN_NUMBER("statistics.regular_team.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_SURVIVED_BATTLES("statistics.regular_team.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_TANKING_FACTOR("statistics.regular_team.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_WINS("statistics.regular_team.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_REGULAR_TEAM_XP("statistics.regular_team.xp"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_BATTLE_AVG_XP("statistics.stronghold_defense.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_BATTLES("statistics.stronghold_defense.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_BATTLES_ON_STUNNING_VEHICLES("statistics.stronghold_defense.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_CAPTURE_POINTS("statistics.stronghold_defense.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_DAMAGE_DEALT("statistics.stronghold_defense.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_DAMAGE_RECEIVED("statistics.stronghold_defense.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_DIRECT_HITS_RECEIVED("statistics.stronghold_defense.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_DRAWS("statistics.stronghold_defense.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_DROPPED_CAPTURE_POINTS("statistics.stronghold_defense.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_EXPLOSION_HITS("statistics.stronghold_defense.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_EXPLOSION_HITS_RECEIVED("statistics.stronghold_defense.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_FRAGS("statistics.stronghold_defense.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_HITS("statistics.stronghold_defense.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_HITS_PERCENTS("statistics.stronghold_defense.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_LOSSES("statistics.stronghold_defense.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_MAX_DAMAGE("statistics.stronghold_defense.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_MAX_DAMAGE_TANK_ID("statistics.stronghold_defense.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_MAX_FRAGS("statistics.stronghold_defense.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_MAX_FRAGS_TANK_ID("statistics.stronghold_defense.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_MAX_XP("statistics.stronghold_defense.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_MAX_XP_TANK_ID("statistics.stronghold_defense.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.stronghold_defense.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_PIERCINGS("statistics.stronghold_defense.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_PIERCINGS_RECEIVED("statistics.stronghold_defense.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_SHOTS("statistics.stronghold_defense.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_SPOTTED("statistics.stronghold_defense.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_STUN_ASSISTED_DAMAGE("statistics.stronghold_defense.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_STUN_NUMBER("statistics.stronghold_defense.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_SURVIVED_BATTLES("statistics.stronghold_defense.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_TANKING_FACTOR("statistics.stronghold_defense.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_WINS("statistics.stronghold_defense.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_DEFENSE_XP("statistics.stronghold_defense.xp"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_BATTLE_AVG_XP("statistics.stronghold_skirmish.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_BATTLES("statistics.stronghold_skirmish.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_BATTLES_ON_STUNNING_VEHICLES("statistics.stronghold_skirmish.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_CAPTURE_POINTS("statistics.stronghold_skirmish.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_DAMAGE_DEALT("statistics.stronghold_skirmish.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_DAMAGE_RECEIVED("statistics.stronghold_skirmish.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_DIRECT_HITS_RECEIVED("statistics.stronghold_skirmish.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_DRAWS("statistics.stronghold_skirmish.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_DROPPED_CAPTURE_POINTS("statistics.stronghold_skirmish.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_EXPLOSION_HITS("statistics.stronghold_skirmish.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_EXPLOSION_HITS_RECEIVED("statistics.stronghold_skirmish.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_FRAGS("statistics.stronghold_skirmish.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_HITS("statistics.stronghold_skirmish.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_HITS_PERCENTS("statistics.stronghold_skirmish.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_LOSSES("statistics.stronghold_skirmish.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_MAX_DAMAGE("statistics.stronghold_skirmish.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_MAX_DAMAGE_TANK_ID("statistics.stronghold_skirmish.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_MAX_FRAGS("statistics.stronghold_skirmish.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_MAX_FRAGS_TANK_ID("statistics.stronghold_skirmish.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_MAX_XP("statistics.stronghold_skirmish.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_MAX_XP_TANK_ID("statistics.stronghold_skirmish.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.stronghold_skirmish.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_PIERCINGS("statistics.stronghold_skirmish.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_PIERCINGS_RECEIVED("statistics.stronghold_skirmish.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_SHOTS("statistics.stronghold_skirmish.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_SPOTTED("statistics.stronghold_skirmish.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_STUN_ASSISTED_DAMAGE("statistics.stronghold_skirmish.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_STUN_NUMBER("statistics.stronghold_skirmish.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_SURVIVED_BATTLES("statistics.stronghold_skirmish.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_TANKING_FACTOR("statistics.stronghold_skirmish.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_WINS("statistics.stronghold_skirmish.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_STRONGHOLD_SKIRMISH_XP("statistics.stronghold_skirmish.xp"),

	/**
	 * Average damage caused with your assistance
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_AVG_DAMAGE_ASSISTED("statistics.team.avg_damage_assisted"),

	/**
	 * Average damage upon your spotting
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_AVG_DAMAGE_ASSISTED_RADIO("statistics.team.avg_damage_assisted_radio"),

	/**
	 * Average damage upon your shooting the track
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_AVG_DAMAGE_ASSISTED_TRACK("statistics.team.avg_damage_assisted_track"),

	/**
	 * Average damage blocked by armor per battle. Damage blocked by armor is damage received from shells (AP, HEAT and APCR) that hit a vehicle but caused no damage. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_AVG_DAMAGE_BLOCKED("statistics.team.avg_damage_blocked"),

	/**
	 * Average experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_BATTLE_AVG_XP("statistics.team.battle_avg_xp"),

	/**
	 * Battles fought
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_BATTLES("statistics.team.battles"),

	/**
	 * Number of battles on vehicles that cause the stun effect
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_BATTLES_ON_STUNNING_VEHICLES("statistics.team.battles_on_stunning_vehicles"),

	/**
	 * Base capture points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_CAPTURE_POINTS("statistics.team.capture_points"),

	/**
	 * Damage caused
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_DAMAGE_DEALT("statistics.team.damage_dealt"),

	/**
	 * Damage received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_DAMAGE_RECEIVED("statistics.team.damage_received"),

	/**
	 * Direct hits received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_DIRECT_HITS_RECEIVED("statistics.team.direct_hits_received"),

	/**
	 * Draws
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_DRAWS("statistics.team.draws"),

	/**
	 * Base defense points
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_DROPPED_CAPTURE_POINTS("statistics.team.dropped_capture_points"),

	/**
	 * Hits on enemy as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_EXPLOSION_HITS("statistics.team.explosion_hits"),

	/**
	 * Hits received as a result of splash damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_EXPLOSION_HITS_RECEIVED("statistics.team.explosion_hits_received"),

	/**
	 * Vehicles destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_FRAGS("statistics.team.frags"),

	/**
	 * Hits
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_HITS("statistics.team.hits"),

	/**
	 * Hit ratio
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_HITS_PERCENTS("statistics.team.hits_percents"),

	/**
	 * Defeats
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_LOSSES("statistics.team.losses"),

	/**
	 * Maximum damage caused in a battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_MAX_DAMAGE("statistics.team.max_damage"),

	/**
	 * Vehicle used to cause maximum damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_MAX_DAMAGE_TANK_ID("statistics.team.max_damage_tank_id"),

	/**
	 * Maximum destroyed in battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_MAX_FRAGS("statistics.team.max_frags"),

	/**
	 * Vehicle, in which maximum number of enemy vehicles was destroyed
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_MAX_FRAGS_TANK_ID("statistics.team.max_frags_tank_id"),

	/**
	 * Maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_MAX_XP("statistics.team.max_xp"),

	/**
	 * Vehicle used to gain maximum experience per battle
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_MAX_XP_TANK_ID("statistics.team.max_xp_tank_id"),

	/**
	 * Direct hits received that caused no damage
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_NO_DAMAGE_DIRECT_HITS_RECEIVED("statistics.team.no_damage_direct_hits_received"),

	/**
	 * Penetrations
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_PIERCINGS("statistics.team.piercings"),

	/**
	 * Penetrations received
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_PIERCINGS_RECEIVED("statistics.team.piercings_received"),

	/**
	 * Shots fired
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_SHOTS("statistics.team.shots"),

	/**
	 * Enemies spotted
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_SPOTTED("statistics.team.spotted"),

	/**
	 * Damage to enemy vehicles stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_STUN_ASSISTED_DAMAGE("statistics.team.stun_assisted_damage"),

	/**
	 * Number of times an enemy was stunned by you
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_STUN_NUMBER("statistics.team.stun_number"),

	/**
	 * Battles survived
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_SURVIVED_BATTLES("statistics.team.survived_battles"),

	/**
	 * Ratio of damage blocked by armor from AP, HEAT, and APCR shells to damage received from these types of shells. Value is calculated starting from version 9.0.
	 * @type float
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_TANKING_FACTOR("statistics.team.tanking_factor"),

	/**
	 * Victories
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_WINS("statistics.team.wins"),

	/**
	 * Total experience
	 * @type numeric
	 * @since 1.0-snapshot
	 */
	STATISTICS_TEAM_XP("statistics.team.xp"),

	;
	private final String packetForm;

	PlayerDataField(String packetForm){
		this.packetForm = packetForm;
	}
	public String getPacketForm(){
		return packetForm;
	}
}