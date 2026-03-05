class Main {
   
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        String name = "kArak";
        String lowerFormate = name.toLowerCase();
        char [] storeChar = lowerFormate.toCharArray();
        String reverse = "";
        boolean found = false;
        for (int i=storeChar.length-1; i>=0; i--)
        {
            reverse +=storeChar[i];
             
             if (reverse.equals(lowerFormate))
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