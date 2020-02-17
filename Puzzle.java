package ua.lviv.iot.first.lab;

/* Поля з таблички:
	- опис пазлу
	- кількість елементів пазлу
	- ширина коробки
	- висота коробки
*/
public class Puzzle {

	private static String difficulty;

	/* Поля з таблички */
	private String description;
	private int quanitity;
	private int widthofbox;
	private int heightofbox;

	/* 2 додаткових приватних поля */
	private String sex;
	private String theme;

	/* 1 статичне числового типу */
	public static int price = 9;

	/* 2 захищених поля */
	protected String vendor;
	protected int guarantee;

	
	/* Пустий конструктор */
	public Puzzle() {
	
	}
	/* Конструктор */
	public Puzzle(String description, int quanitity, int widthofbox, int heightofbox, String sex, String theme,
			String vendor, int guarantee) {
		this.description = description;
		this.quanitity = quanitity;
		this.widthofbox = widthofbox;
		this.heightofbox = heightofbox;
		this.sex = sex;
		this.theme = theme;
		this.vendor = vendor;
		this.guarantee = guarantee;
	}
	
	/* Конструктор з першими 5 полями */
	public Puzzle(String description, int quanitity, int widthofbox, int heightofbox, String sex) {
		this(description, quanitity, widthofbox, heightofbox, sex, null, null, 0);
	}	
	
	/* Конструктор з першими 4 полями */
	public Puzzle(String description, int quanitity, int widthofbox, int heightofbox) {
		this(description, quanitity, widthofbox, heightofbox, null, null, null, 0);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuanitity() {
		return quanitity;
	}

	public void setQuanitity(int quanitity) {
		this.quanitity = quanitity;
	}

	public int getWidthofbox() {
		return widthofbox;
	}

	public void setWidthofbox(int widthofbox) {
		this.widthofbox = widthofbox;
	}

	public int getHeightofbox() {
		return heightofbox;
	}

	public void setHeightofbox(int heightofbox) {
		this.heightofbox = heightofbox;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Puzzle.price = price;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}
	public static void setDifficulty(String difficulty) {
		Puzzle.difficulty = difficulty;
	}

	@Override
	public String toString() {
		return "Puzzle [description=" + description + ", quanitity=" + quanitity + ", widthofbox=" + widthofbox
				+ ", heightofbox=" + heightofbox + ", sex=" + sex + ", theme=" + theme + ", vendor=" + vendor
				+ ", guarantee=" + guarantee + ", difficulty=" + Puzzle.difficulty + "]";
	}

}
