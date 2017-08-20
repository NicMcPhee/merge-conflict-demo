/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();

		builder.append("Hello, folks!\n");
		builder.append(nic_says_hello());

		System.out.println(builder.toString());
	}

	public static String nic_says_hello() {
		return "Nic says 'Howdy!'\n";
	}

}
