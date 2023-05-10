package me.antritus.world_of_tanks;

public enum Language {
	ENGLISH("en"),
	RUSSIAN("ru"),
	POLISH("pl"),
	DEUTSCH("de"),
	FRENCH("fr"),
	SPANISH("es"),
	CHINESE("zh-cn"),
	TAIWANESE("zh-tw"),
	TURKISH("tr"),
	CZECH("cs"),
	THAI("th"),
	VIETNAMESE("vi"),
	KOREAN("ko")
	;

	private final String requestForm;

	/**
	 * What language should the packet request use
	 * @param requestForm lang
	 */
	Language(String requestForm){
		this.requestForm = requestForm;
	}

	/**
	 * @return Packet form of language
	 */
	public String getRequestForm() {
		return requestForm;
	}
}
