package Day1;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All combinations of the string \"" + input + "\":");
        generatePermutations(input, "");
    }

    // Recursive method to generate permutations
    public static void generatePermutations(String str, String permutation) {
        // Base case: if the string is empty, print the permutation
        if (str.isEmpty()) {
            System.out.println(permutation);
            return;
        }

        // Recursive case: loop through each character
        for (int i = 0; i < str.length(); i++) {
            // Extract the character at the current position
            char currentChar = str.charAt(i);

            // Form the remaining string without the current character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recurse with the remaining string and the current permutation
            generatePermutations(remaining, permutation + currentChar);
        }
    }
}
