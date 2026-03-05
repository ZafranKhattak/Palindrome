class Main {
   
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        String name = "kArak";
        String result = name.toLowerCase();
        char [] pali = result.toCharArray();
        String final1 = "";
        boolean found = false;
        for (int i=pali.length-1; i>=0; i--)
        {
            final1 +=pali[i];
             
             if (final1.equals(result))
             {
                 found= true;
             }
        }
        if(found)
        {
            System.out.println(" a palindrome");
        }
        else
        {
            System.out.println("not a Palindrome");
        }
    }
}