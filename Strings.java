public class Strings{
    public static void main(String args[])
    {
        String str1="I";
        String str2="eat";
        String str3="mangoes.";
        System.out.println(str1+" "+str2+" "+str3);
        if(str1=="I")
        {
            System.out.println("str1 is same as I");
        }

        if(str1.compareTo(str3)==0)
        {
                System.out.println("str1 is same as str3");
        }
         int length=str1.length();
    System.out.println("The length of str1 is:-"+length);
    }
   
}