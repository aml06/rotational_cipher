//a solution for https://exercism.org/tracks/java/exercises/rotational-cipher
public class rotational_cipher {
    public static char rotateCharacter(char c, int rotation) {
        if (Character.isUpperCase(c)) {
            //the 'A' here is unicode so c - 'A' is the math operation representing their seperation in the alphabet, we then shift it the appropriate number of values and mod the length of the alphabet
            return (char) (((c - 'A' + rotation) % 26) + 'A');
        } else if (Character.isLowerCase(c)) {
            //Do the same thing but handle if it is lowercase
            return (char) (((c - 'a' + rotation) % 26) + 'a');
        } else {
            //or just return non-alphabet characters
            return c;
        }
    }

    public static void main(String args[]) {
        //could query user for string message and rotation value but just going to hard code it
        String message = "I am the very model of a modern major general!";
        int rotation = 15;

        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            //construct the encrypted message
            encryptedMessage.append(rotateCharacter(c, rotation));
        }
        System.out.println();
        System.out.println("Starting message: " + message);
        System.out.println("------");
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println();
    }
}
