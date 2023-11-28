//HASAN USLU 19050111003
//FIRAT BİLGEN 22050151020
//MUSTAFA Yılmaz 20050111010
//BATUHAN TUNCER 20050111040
public class Main {

    public static void main(String[] args) {

       CreateText createText = new CreateText(0);
       createText.createText(1000000);
       StaticArray my_sarray=new StaticArray(1000000);
       LinkedList my_linkedlist=new LinkedList();
        DynamicArray my_dynamicArray=new DynamicArray();

        double startTime=System.currentTimeMillis();
       my_sarray.buildArray(1000000);
        double estimatedTime = System.currentTimeMillis() - startTime;
       System.out.println( "The integer array structure is built in"+" "+estimatedTime+" milliseconds.");
        double startTime2=System.currentTimeMillis();
        my_sarray.insertFirst(20);
        double estimatedTime2 = System.currentTimeMillis() - startTime2;

        System.out.println("An integer is inserted into the first index of the integer array in " +estimatedTime2 +" milliseconds.");
        double startTime3=System.currentTimeMillis();
        my_sarray.replaceLast(55);
        double estimatedTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("An integer is ireplaced into the last index of the integer array in " +estimatedTime3 +" milliseconds.");
        double startTime4=System.currentTimeMillis();
        my_sarray.readFrom(900000);
        double estimatedTime4 = System.currentTimeMillis() - startTime4;
        System.out.println("An integer, which is "+ my_sarray.readFrom(900000)+" is read from the index 900,000 of the integer array in "+estimatedTime4+ " milliseconds." );
        double startTime5=System.currentTimeMillis();
        my_sarray.readFrom(9);
        double estimatedTime5 = System.currentTimeMillis() - startTime5;
        System.out.println("An integer, which is "+ my_sarray.readFrom(9)+" is read from the index 9 of the integer array in "+estimatedTime5+ " milliseconds." );
        double startTime6=System.currentTimeMillis();
        my_linkedlist.buildLinkedList(1000000);
        double estimatedTime6 = System.currentTimeMillis() - startTime6;
        System.out.println( "The integer linkedlist structure is built in"+" "+estimatedTime6+" milliseconds.");
        double startTime7=System.currentTimeMillis();
        my_linkedlist.insertHead(45);
        double estimatedTime7= System.currentTimeMillis() - startTime7;
        System.out.println("An integer is inserted into the first index of the linkedlist  in " +estimatedTime7 +" milliseconds.");
        double startTime8=System.currentTimeMillis();
        my_linkedlist.insertTail(47);
        double estimatedTime8= System.currentTimeMillis() - startTime7;
        System.out.println("An integer is inserted into the first index of the linkedlist  in " +estimatedTime8 +" milliseconds.");
        double startTime9=System.currentTimeMillis();
        my_linkedlist.readFrom(900000);
        double estimatedTime9 = System.currentTimeMillis() - startTime9;
        System.out.println("An integer, which is "+  my_linkedlist.readFrom(900000)+" is read from the index 900,000 of the linkedlist in "+estimatedTime9+ " milliseconds." );
        double startTime10=System.currentTimeMillis();
        my_linkedlist.readFrom(9);
        double estimatedTime10 = System.currentTimeMillis() - startTime10;
        System.out.println("An integer, which is "+  my_linkedlist.readFrom(9)+" is read from the index 9 of the linkedlist in "+estimatedTime10+ " milliseconds." );

        double startTime11=System.currentTimeMillis();
        my_dynamicArray.buildArray(1000000);
        double estimatedTime11 = System.currentTimeMillis() - startTime11;
        System.out.println( "The integer dynamic array structure is built in"+" "+estimatedTime11+" milliseconds.");
        double startTime12=System.currentTimeMillis();
        my_dynamicArray.insertFirst(23);
        double estimatedTime12= System.currentTimeMillis() - startTime12;
        System.out.println("An integer is inserted into the first index of the dynamic array in " +estimatedTime12 +" milliseconds.");
        double startTime13=System.currentTimeMillis();
        my_dynamicArray.insertLast(2023);
        double estimatedTime13= System.currentTimeMillis() - startTime13;
        System.out.println("An integer is inserted into the first index of the dynamicarray in " +estimatedTime13 +" milliseconds.");
        double startTime14=System.currentTimeMillis();
         my_dynamicArray.readFrom(900000);
        double estimatedTime14 = System.currentTimeMillis() - startTime14;
        System.out.println("An integer, which is "+     my_dynamicArray.readFrom(900000)+" is read from the index 900,000 of the integer array in "+estimatedTime14+ " milliseconds." );
        double startTime15=System.currentTimeMillis();
        my_dynamicArray.readFrom(9);
        double estimatedTime15 = System.currentTimeMillis() - startTime15;
        System.out.println("An integer, which is "+   my_dynamicArray.readFrom(9)+" is read from the index 9 of the integer array in "+estimatedTime15+ " milliseconds." );

      System.out.println("*********************************************************************************************************");

        CreateText createText2 = new CreateText(0);
        createText2.createText(50000000);
        StaticArray my_sarray50=new StaticArray(50000000);
        LinkedList my_linkedlist50=new LinkedList();
        DynamicArray my_dynamicArray50=new DynamicArray();

        double startTime16=System.currentTimeMillis();
        my_sarray50.buildArray(50000000);
        double estimatedTime16 = System.currentTimeMillis() - startTime16;
        System.out.println( "The integer array structure is built in"+" "+estimatedTime16+" milliseconds.");
        double startTime17=System.currentTimeMillis();
        my_sarray50.insertFirst(235);
        double estimatedTime17 = System.currentTimeMillis() - startTime17;

        System.out.println("An integer is inserted into the first index of the integer array in " +estimatedTime17 +" milliseconds.");
        double startTime18=System.currentTimeMillis();
        my_sarray50.replaceLast(550);
        double estimatedTime18 = System.currentTimeMillis() - startTime18;
        System.out.println("An integer is replaced into the last index of the integer array in " +estimatedTime18 +" milliseconds.");
        double startTime19=System.currentTimeMillis();
        my_sarray50.readFrom(45000000);
        double estimatedTime19 = System.currentTimeMillis() - startTime19;
        System.out.println("An integer, which is "+ my_sarray50.readFrom(45000000)+" is read from the index 45,000,000 of the integer dynamic array in "+estimatedTime19+ " milliseconds." );
        double startTime20=System.currentTimeMillis();
        my_sarray50.readFrom(9);
        double estimatedTime20 = System.currentTimeMillis() - startTime20;
        System.out.println("An integer, which is "+ my_sarray50.readFrom(9)+" is read from the index 9 of the integer dynamic array in "+estimatedTime20+ " milliseconds." );
        double startTime21=System.currentTimeMillis();
        my_linkedlist50.buildLinkedList(50000000);
        double estimatedTime21= System.currentTimeMillis() - startTime21;
        System.out.println( "The integer linkedlist structure is built in"+" "+estimatedTime21+" milliseconds.");
        double startTime22=System.currentTimeMillis();
        my_linkedlist50.insertHead(454);
        double estimatedTime22= System.currentTimeMillis() - startTime22;
        System.out.println("An integer is inserted into the first index of the linkedlist  in " +estimatedTime22 +" milliseconds.");
        double startTime23=System.currentTimeMillis();
        my_linkedlist50.insertTail(477);
        double estimatedTime23= System.currentTimeMillis() - startTime23;
        System.out.println("An integer is inserted into the first index of the linkedlist  in " +estimatedTime23 +" milliseconds.");
        double startTime24=System.currentTimeMillis();
        my_linkedlist50.readFrom(45000000);
        double estimatedTime24 = System.currentTimeMillis() - startTime24;
        System.out.println("An integer, which is "+   my_linkedlist50.readFrom(45000000)+" is read from the index 45,000,000 of the linkedlist in "+estimatedTime24+ " milliseconds." );
        double startTime25=System.currentTimeMillis();
        my_linkedlist50.readFrom(9);
        double estimatedTime25 = System.currentTimeMillis() - startTime25;
        System.out.println("An integer, which is "+  my_linkedlist50.readFrom(25)+" is read from the index 9 of the linkedlist in "+estimatedTime25+ " milliseconds." );

        double startTime26=System.currentTimeMillis();
        my_dynamicArray50.buildArray(50000000);
        double estimatedTime26 = System.currentTimeMillis() - startTime26;
        System.out.println( "The integer dynamic array structure is built in"+" "+estimatedTime26+" milliseconds.");
        double startTime27=System.currentTimeMillis();
        my_dynamicArray50.insertFirst(234);
        double estimatedTime27= System.currentTimeMillis() - startTime27;
        System.out.println("An integer is inserted into the first index of the dynamic array in " +estimatedTime27 +" milliseconds.");
        double startTime28=System.currentTimeMillis();
        my_dynamicArray50.insertLast(24242);
        double estimatedTime28= System.currentTimeMillis() - startTime13;
        System.out.println("An integer is inserted into the first index of the dynamicarray in " +estimatedTime28 +" milliseconds.");
        double startTime29=System.currentTimeMillis();
        my_dynamicArray50.readFrom(45000000);
        double estimatedTime29 = System.currentTimeMillis() - startTime29;
        System.out.println("An integer, which is "+     my_dynamicArray50.readFrom(45000000)+" is read from the index 45,000,000 of the integer dynamic array in "+estimatedTime29+"milliseconds." );
        double startTime30=System.currentTimeMillis();
        my_dynamicArray50.readFrom(9);
        double estimatedTime30 = System.currentTimeMillis() - startTime30;
        System.out.println("An integer, which is "+   my_dynamicArray50.readFrom(9)+" is read from the index 9 of the integer dynamic array in "+estimatedTime30+ " milliseconds." );




























    }


}
