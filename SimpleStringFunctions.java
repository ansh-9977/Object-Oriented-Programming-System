public class SimpleStringFunctions {
    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "HELLO WORLD";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring (first 5 characters): " + str.substring(0, 5));
        System.out.println("Contains 'world'? " + str.contains("world"));
        System.out.println("Starts with 'hello'? " + str.startsWith("hello"));
        System.out.println("Ends with 'world'? " + str.endsWith("world"));
        System.out.println("First index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Replace 'l' with '*': " + str.replace('l', '*'));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Equals (case-sensitive): " + str.equals(str2));
        System.out.println("Equals (ignore case): " + str.equalsIgnoreCase(str2));

        String strWithSpaces = "   hello world   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");
        String[] parts = str.split(" ");
        System.out.println("Split into words:");
        for (String word : parts) {
            System.out.println("- " + word);
        }

        System.out.println("Concatenated: " + str + "!!!");
        System.out.println("Is Empty? " + str.isEmpty());
        System.out.println("Matches pattern '.*world'? " + str.matches(".*world"));
        System.out.println("Formatted: " + String.format("Welcome to %s", str));
        System.out.println("Interned: " + str.intern());
        System.out.println("Repeated 2 times: " + str.repeat(2));
    }
}
