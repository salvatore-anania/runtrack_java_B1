public class SwapString {
    
    public static void main(String[] args) {
        String str1="Bonjour",str2="Hello";
        System.out.println("Strings avant échange : " + str1 + " " + str2);

        str1 = str1 + str2;    
        //Extract str2 from updated str1    
        str2 = str1.substring(0, (str1.length() - str2.length()));    
        //Extract str1 from updated str1    
        str1 = str1.substring(str2.length());    
            
        System.out.println("Strings aprés échange : " + str1 + " " + str2);
    }
}

