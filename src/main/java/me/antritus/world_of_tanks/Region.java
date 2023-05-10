package me.antritus.world_of_tanks;

public enum Region {
	CIS("ru"),
	EUROPE("eu"),
	NORTH_AMERICA("us"),
	ASIA("sg"),

	;

	private final String region;

	/**
	 * @param region The ending of the region in request format.
	 */
	Region(String region){
		this.region = region;
	}
	/**
	 * @return The ending of the region in request format.
	 */
	public String getRegionEnd(){
		return region;
	}
}
