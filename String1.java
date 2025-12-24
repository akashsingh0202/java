public class String1 {
    public static void main(String[] args) {
        String txt="hello World";
        System.out.println(txt);
        System.out.println(txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        String txt1="my self akash";
        String txt2="i am from rewa";
        String txt3="hello World";
        System.out.println(txt1.indexOf("self"));
        System.out.println(txt1.charAt(6));
        System.out.println(txt);
        System.out.println(txt.equals(txt3));
        System.out.println(txt1.equals(txt2));
        String txt5 = "   Hello World   ";
        System.out.println("Before: [" + txt5 + "]");
        System.out.println("After:  [" + txt5.trim() + "]");

    }
    
}
