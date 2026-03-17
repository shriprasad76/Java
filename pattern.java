class Pattern{
    public static void main(String[] args){
        // pattern 1:-
        System.err.println("pattern 1:-");
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.err.print("* ");
            }
            System.err.println("");
        }
        System.err.println("");
        System.err.println("pattern 2:-");

        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
               if(i==0||j==0||i==4||j==4)
               {
                System.err.print("* ");
               }else{
                System.err.print("  ");
               }
            }
            System.err.println("");
        }
        System.err.println("");
        System.err.println("pattern 3:-");

        for(i=0;i<5;i++)
        {
            for(j=0;j<i;j++)
            {

            
            System.err.print("* ");
            }
            System.err.println("");
        }

        System.err.println("");
        System.err.println("pattern 3:-");

        for(i=5;i>0;i--)
        {
            for(j=0;j<i;j++)
            {

            
            System.err.print("* ");
            }
            System.err.println("");
        }

    }

    }
    
