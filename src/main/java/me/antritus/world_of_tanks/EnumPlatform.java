package me.antritus.world_of_tanks;

import org.jetbrains.annotations.NotNull;

public enum EnumPlatform {
	PC("pc", "laptop") {
	},
	CONSOLE("ps", "xbox") {
	},
	BLITZ("pc", "mobile") {
	}
	,


	;
	private final String[] platforms;
	EnumPlatform(String... platforms) {
		this.platforms = platforms;
	}

	/**
	 * Gets the devices which can play in the supported game platform.
	 * @return Devices which can play in platform.
	 */
	public String[] getPlatforms() {
		return platforms;
	}

	/**
	 * Parses platform given. Throws IllegalArgumentException if platform is invalid.
	 * @param platform Platform string to parse
	 * @return Platform type
	 * @throws IllegalArgumentException Thrown if platform is unknown.
	 */
	@NotNull
	public static EnumPlatform parse(String platform) throws IllegalArgumentException{
		if (platform.equalsIgnoreCase("pc") || platform.equalsIgnoreCase("laptop")){
			return PC;
		}
		if (platform.equalsIgnoreCase("mobile") || platform.equalsIgnoreCase("blitz")){
			return BLITZ;
		}
		if (platform.equalsIgnoreCase("ps") || platform.equalsIgnoreCase("console") || platform.equalsIgnoreCase("xbox")){
			return CONSOLE;
		}
		throw new IllegalArgumentException();
	}
}
