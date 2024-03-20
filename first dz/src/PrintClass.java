public class PrintClass {
    public int toPrintInt = 25;

    public String print() {
        String newMethod = String.format("\"---<%d>---\"%n", toPrintInt);
        System.out.println(newMethod);
        {
            //{System.out.println("This is my 1st main class");}
            return newMethod;
        }
    }
}
