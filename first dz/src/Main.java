

public class Main {
    public static void main(String[] args) {
        //System.out.println("This is my 5th main class");}


        PrintClass myPrint = new PrintClass();
        myPrint.print();

        String newMethod2 = String.format("\"~~~%dvv~~~\"%n", myPrint.toPrintInt);

        System.out.println(newMethod2);


    }
}