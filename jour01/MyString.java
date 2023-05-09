public class MyString {
    
    public static void main(String[] args) {
        String a = "Au revoir";
        String b =  new String("Bonjour le monde !") ;
        String c = b + a;
        String d = b.substring(8);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
