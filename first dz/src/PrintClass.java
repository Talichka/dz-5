public class PrintClass {
    public int toPrintInt = 25;
public String print(){
    String newMethod = String.format("\"---<%d>---\"%n", toPrintInt);
System.out.println(newMethod);
return newMethod;
}
}
