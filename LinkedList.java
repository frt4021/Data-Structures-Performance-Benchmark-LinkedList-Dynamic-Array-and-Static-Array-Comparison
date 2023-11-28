import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//HASAN USLU 19050111003
//FIRAT BİLGEN 22050151020
//MUSTAFA Yılmaz 20050111010
//BATUHAN TUNCER 20050111040

//We create a node class that stores int data
class Node {
    int data;  // Data stored in the node
    Node next;  // Reference to the next node in the linked list

    // Constructor to initialize a new Node with the provided data
    public Node(int data) {
        this.data = data;  // Set the data field to the provided data
        next = null;       // Initialize the next reference to null
    }
}

public class LinkedList {
    Node head;    // Reference to the first node in the linked list
    Node tail;    // Reference to the last node in the linked list
    int size;     // The number of nodes in the linked list


    public LinkedList(){
        head = null;    // Initialize head and tail to null, and size to 0, as the list is empty at the beginning.
        tail = null;
        size=0;
    }


  // Builds the linked list by reading data from a file
    public void buildLinkedList(int size) {
        int name=size / 1000000;
        String filePath = name+ "Mint.txt";  // Construct the file path
        try {
            
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            
            // Read data from the file and insert it at the tail of the linked list
            while ((line = bufferedReader.readLine()) != null) {
                int data = Integer.parseInt(line);
                insertTail(data);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    // Inserts a new node with data at the beginning of the linked list
        public void insertHead(int data){
        Node node = new Node(data);
        if (head == null) {
            // If the list is empty, set the head and tail to the new node
            head = node;
            // Set the next of last node to null
            head.next = null;
            tail= head;
        } else {
            // Otherwise, update the next reference of the new node to the current head
            node.next = head;
            // Update the head to the new node
            head = node;
        }
        size++;   // Increase the size of the linked list
    }

     // Inserts a new node with data at the end of the linked list
    public void insertTail(int data){
        Node node = new Node(data);
        if (head == null) {
            // If the list is empty, set the head and tail to the new node
            head = node;
            // Set the next of last node to null
            head.next = null;
            tail= head;
        } else {
           // Otherwise, update the next reference of the current tail to the new node
            tail.next =node;
            // Set the next of last node to null
            node.next = null;
            // Update the tail to the new node
            tail = node;
        }
        size++;  // Increase the size of the linked list
    } 

     // Inserts a new node with data at the specified index
    public void insertFrom(int data, int index) {
        Node node = new Node(data);

        if (size == 0 || index > size ) {
            // If the list is empty or the index is out of bounds, insert the new node at the tail
            insertTail(data);
            size++;  // Increase the size of the linked list
        }

        else {
            try {
                Node cache;
                cache = head;
                int i;
                for (i = 0; i < index - 1; i++) {
                     // Traverse the list to the node before the desired index
                    cache = cache.next;
                }
                // Update references to insert the new node at the specified index
                node.next = cache.next;
                cache.next = node;
                size++;    // Increase the size of the linked list
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    // Reads and returns the data from the node at the specified index
    public int readFrom(int index) {
        if (index >= size)
            index = size-1;

        Node cache;
        cache = head;
        int i;
        for (i = 0; i < index; i++) {
            // Traverse the list to the desired index
            cache = cache.next;
        }
        // Return data that expected 
        return cache.data;

}
}
