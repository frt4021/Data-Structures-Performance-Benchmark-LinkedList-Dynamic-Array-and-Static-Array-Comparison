import java.io.BufferedReader;
import java.io.FileReader;
//HASAN USLU 19050111003
//FIRAT BİLGEN 22050151020
//MUSTAFA Yılmaz 20050111010
//BATUHAN TUNCER 20050111040

public class DynamicArray {

    int[] array;
    int size;

    int txtSize;  // A variable that holds the file size

    DynamicArray() {
        array = new int[1];  // An array is created that initially contains a single element.
        size = 0;
    }

    public void buildArray(int txtSize) {
        if (txtSize == 1000000) {
            try {
                // We create a BufferedReader to read the text file named "1Mint.txt".
                // This allows us to read data from the file.
                BufferedReader bufferedReader = new BufferedReader(new FileReader("1Mint.txt"));

                String line;
                // We create a loop to read each line of the file sequentially.
                while ((line = bufferedReader.readLine()) != null) {
                    int data = Integer.parseInt(line); // After reading each line as a text, we convert this text to an integer.
                    insertLast(data); //  We add each data in the loop to the end of the dynamic array.
                }
            } catch (Exception e) {
                // This block runs when any exception occurs.
                // This is a security measure in case an error occurs during the file reading process.
                System.out.println(e);
            }
        } else if (txtSize == 50000000) {
            try {
                // We create a BufferedReader to read the text file named "50Mint.txt".
                // This allows us to read data from the file.
                BufferedReader bufferedReader = new BufferedReader(new FileReader("50Mint.txt"));

                String line;
                // We create a loop to read each line of the file sequentially.
                while ((line = bufferedReader.readLine()) != null) {
                    int data = Integer.parseInt(line); // After reading each line as a text, we convert this text to an integer.
                    insertLast(data); //  We add each data in the loop to the end of the dynamic array.
                }
            } catch (Exception e) {
                // This block runs when any exception occurs.
                // This is a security measure in case an error occurs during the file reading process.
                System.out.println(e);
            }
        }
    }

    private void increaseCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = array.length * 2; // Takes twice the length of the old array
            int[] newArray = new int[newCapacity]; // Creates a new array with twice the current capacity.
            System.arraycopy(array, 0, newArray, 0, size); // Copies data from the old array to the new array.
            array = newArray; // Updates the old array with the new array.
        }
    }

    public void insertFirst(int data) {
        increaseCapacity(size + 1);
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1]; // Shifts all elements to the right.
        }
        array[0] = data; // Appends the data to the beginning of the array.
        size++; // Increases the number of items.
    }

    public void insertLast(int data) {
        increaseCapacity(size + 1);
        array[size] = data; // Appends the data to the end of the array.
        size++; // Increases the number of items.
    }

    public int readFrom(int index) {
        return array[index]; // Reads and returns the element at a given index.
    }
}
