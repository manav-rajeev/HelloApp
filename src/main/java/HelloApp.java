public class HelloApp {

    public static void main(String[] args) {

        // Default value
        String name = "World";

        // If user provides input
        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }

}