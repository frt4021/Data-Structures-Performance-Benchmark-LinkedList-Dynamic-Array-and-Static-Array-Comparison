import java.io.BufferedReader;
import java.io.FileReader;
//HASAN USLU 19050111003
//FIRAT BİLGEN 22050151020
//MUSTAFA Yılmaz 20050111010
//BATUHAN TUNCER 20050111040
public class StaticArray {

    int[] array; // Array to store data.

    int arraySize; // Variable to hold the size of the array.

    // Constructor, initializes the class and creates an array of the specified size.
    StaticArray(int arraySize) {
        this.arraySize = arraySize;
        array = new int[arraySize];
    }

    // Method for build the array with data from a txt file.
    public void buildArray(int size) {
        this.arraySize = size;
        int name = size / 1000000;
        String filePath = name + "Mint.txt"; //  file path.

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));//read to data from txt file with buffer reader
            //for loop for Adds integer values ​​read line by line from txt file to the arrat
            for (int i = 0; i < size; i++) {
                String line = bufferedReader.readLine();
                array[i] = Integer.parseInt(line); // convert string to integer after Add data from the txt file to the array.
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e); // Handle errors and print error messages.
        }
    }

    // Method for inserting data at the beginning of the array.
    public void insertFirst(int data) {
        int[] newArray = new int[arraySize + 1]; // Create a new array.
        newArray[0] = data; // Add new data to the array.
        System.arraycopy(array, 0, newArray, 1, arraySize); // Copy the old array to the new array.
        array = newArray; // Update the old array.
    }

    // Method for replacing the last data in the array.
    public void replaceLast(int data) {
        array[array.length - 1] = data; // Change the data at the end of the array.
    }

    // Method for reading data at a specified index.
    public int readFrom(int index) {
        return array[index]; // Return the data corresponding to the index.
    }
