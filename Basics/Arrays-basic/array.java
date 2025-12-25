class aarray{
    public static void main(String[] args) {
        String s="abba";
        String s1="Shivani";
        System.out.println(isPalindrom(s));
        System.out.println(revString(s1));

    }  

    public static int isPalindrom(String s){
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1))
            return 0;
            }
            return 1;
    }

    static String revString(String s){
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
        rev = rev + s.charAt(i);
        return rev;
        
    }
    
    
}
