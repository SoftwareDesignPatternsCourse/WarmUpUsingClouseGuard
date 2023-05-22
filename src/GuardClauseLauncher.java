
public class GuardClauseLauncher {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Invalid number of arguments");
		} else if (args[0].equalsIgnoreCase("name")) {
			System.out.println("Hello: " + args[1]);
		} else if (args[0].equalsIgnoreCase("age")) {
			System.out.println("Your age is: " + args[1]);
		}

	}

}
