

public class Main {
    public static void main(String[] args) {
        //System.out.println("This is my 1st main class");}
        //System.out.println("This is my 2st main class");}

        PrintClass myPrint = new PrintClass();
        myPrint.print();

        String newMethod2 = String.format("\"~~~<%d>~~~\"%n", myPrint.toPrintInt);

        System.out.println(newMethod2);


    }
}