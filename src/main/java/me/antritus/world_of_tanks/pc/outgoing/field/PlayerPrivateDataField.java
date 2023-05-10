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
public enum PlayerPrivateDataField {
	/**
	 * Account ban details
	 * @type String
	 * @since 1.0-snapshot
	 */
	PRIVATE_BAN_INFO("private.ban_info"),

	/**
	 * End time of account ban
	 * @type long
	 * @since 1.0-snapshot
	 */
	PRIVATE_BAN_TIME("private.ban_time"),

	/**
	 * Overall battle life time in seconds
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_BATTLE_LIFE_TIME("private.battle_life_time"),

	/**
	 * Bonds
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_BONDS("private.bonds"),

	/**
	 * Credits
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_CREDITS("private.credits"),

	/**
	 * Free Experience
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_FREE_XP("private.free_xp"),

	/**
	 * Vehicles in the Garage.
	 * @type List<Integer>
	 * @since 1.0-snapshot
	 */
	PRIVATE_GARAGE("private.garage"),

	/**
	 * Gold
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_GOLD("private.gold"),

	/**
	 * Indicates if mobile phone number was added to the account
	 * @type boolean
	 * @since 1.0-snapshot
	 */
	PRIVATE_IS_BOUND_TO_PHONE("private.is_bound_to_phone"),

	/**
	 * Indicates if the account is Premium Account
	 * @type boolean
	 * @since 1.0-snapshot
	 */
	PRIVATE_IS_PREMIUM("private.is_premium"),

	/**
	 * Personal Missions Progress. The key is a task id, the value is a status.
	 * Possible statuses:
	 * NONE - a mission is unavailable
	 * UNLOCKED - a mission is available
	 * NEED_GET_MAIN_REWARD - the main reward has not been received
	 * MAIN_REWARD_GOTTEN - the main reward has been received
	 * NEED_GET_ADD_REWARD - additional reward has not been received
	 * NEED_GET_ALL_REWARDS - no rewards have been received
	 * ALL_REWARDS_GOTTEN - all rewards have been received .
	 * An extra field.
	 * @type Own class type
	 * @since 1.0-snapshot
	 */
	PRIVATE_PERSONAL_MISSIONS("private.personal_missions"),

	/**
	 * Premium Account expiration time
	 * @type long
	 * @since 1.0-snapshot
	 */
	PRIVATE_PREMIUM_EXPIRES_AT("private.premium_expires_at"),

	/**
	 * Amount of Personal Reserves
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_BOOSTERS_COUNT("private.boosters.count"),

	/**
	 * Expiration time
	 * @type long
	 * @since 1.0-snapshot
	 */
	PRIVATE_BOOSTERS_EXPIRATION_TIME("private.boosters.expiration_time"),

	/**
	 * Status of Personal Reserves. Valid values:
	 * ACTIVE - Active
	 * INACTIVE - Inactive
	 * USED - Used
	 * @type String
	 * @since 1.0-snapshot
	 */
	PRIVATE_BOOSTERS_STATE("private.boosters.state"),

	/**
	 * The contact was added to the blacklist. Note that the blocked contact still belongs to contact groups or to the ungrouped list of contacts.
	 * @type List<Integer>
	 * @since 1.0-snapshot
	 */
	PRIVATE_GROUPED_CONTACTS_BLOCKED("private.grouped_contacts.blocked"),

	/**
	 * Groups
	 * @type Own class type
	 * @since 1.0-snapshot
	 */
	PRIVATE_GROUPED_CONTACTS_GROUPS("private.grouped_contacts.groups"),

	/**
	 * Ignored
	 * @type List<Integer>
	 * @since 1.0-snapshot
	 */
	PRIVATE_GROUPED_CONTACTS_IGNORED("private.grouped_contacts.ignored"),

	/**
	 * Muted
	 * @type List<Integer>
	 * @since 1.0-snapshot
	 */
	PRIVATE_GROUPED_CONTACTS_MUTED("private.grouped_contacts.muted"),

	/**
	 * Not grouped
	 * @type List<Integer>
	 * @since 1.0-snapshot
	 */
	PRIVATE_GROUPED_CONTACTS_UNGROUPED("private.grouped_contacts.ungrouped"),

	/**
	 * Rental compensation in credits
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_RENTED_COMPENSATION_CREDITS("private.rented.compensation_credits"),

	/**
	 * Rental compensation in gold
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_RENTED_COMPENSATION_GOLD("private.rented.compensation_gold"),

	/**
	 * Vehicle Rental expiration time
	 * @type long
	 * @since 1.0-snapshot
	 */
	PRIVATE_RENTED_EXPIRATION_TIME("private.rented.expiration_time"),

	/**
	 * Rented vehicle ID
	 * @type int
	 * @since 1.0-snapshot
	 */
	PRIVATE_RENTED_TANK_ID("private.rented.tank_id"),

	/**
	 * End time of chat ban
	 * @type long
	 * @since 1.0-snapshot
	 */
	PRIVATE_RESTRICTIONS_CHAT_BAN_TIME("private.restrictions.chat_ban_time"),

	;
	private final String packetForm;

	PlayerPrivateDataField(String packetForm){
		this.packetForm = packetForm;
	}
	public String getPacketForm(){
		return packetForm;
	}
}