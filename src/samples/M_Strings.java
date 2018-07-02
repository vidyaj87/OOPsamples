package samples;

public class M_Strings {

	public static void main(String[] args) {

		String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		showName(name);
		countCharacters(name);
		replaceABC(name);
		addTailName(name);

	}

	public static void showName(String name) {
		System.out.println(name);
	}

	public static void countCharacters(String name) {
		int number = name.length();
		System.out.println(number);
	}

	public static void replaceABC(String name) {
		String newName = name.replaceAll("ABC", "AAA");
		System.out.println(newName);
	}

	public static void addTailName(String name) {
		String newName = name.concat("tail");
		System.out.println(newName);
	}

}
