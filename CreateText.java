import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
//HASAN USLU 19050111003
//FIRAT BİLGEN 22050151020
//MUSTAFA Yılmaz 20050111010
//BATUHAN TUNCER 20050111040

public class CreateText {
    int textSize; // Variable that holds the size of the text file.

    CreateText(int textSize) {
        this.textSize = textSize;
    }

    public void createText(int textSize) {

        int size = textSize; //Copies the size to a local variable.
        int name = size / 1000000; // Divide the size by 1 million to determine the name of the file.
        int i;

        // Try-catch block for writing to the file. It creates a .txt file, generates random numbers, and writes those numbers to the file.
        try {
            // Creates a new file using BufferedWriter and prepares it for writing.
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name + "Mint.txt"));
            for (i = 0; i < size; i++) {
                // Generates a random integer (between 0 and 500,000,000).
                Random random = new Random();
                int number = random.nextInt(500000000);
                // When writing these random numbers to the file, it writes each one on a separate line.
                bufferedWriter.write(Integer.toString(number));
                bufferedWriter.newLine();
            }
            bufferedWriter.close(); // Closes BufferedWriter when the file writing process is finished.

        } catch (Exception e) {
            // This block runs when any exception occurs.
            // This is a security measure in case an error occurs during the file reading process.
            System.out.println(e);
        }
    }
}
