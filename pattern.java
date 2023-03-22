 public class main{
    public static void main(String[] args){
    int num=3;
    int num2=4;
        for (int i =num; i > 0; i--)
        {
            for(int j = num2; j >0; j--)
            {
                if(i % 2 == 0)
                {
                    if(j % 2 == 0){
                        System.out.print("_");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if(j % 2 == 0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("_");
                    }
                }
            }
            System.out.print("\n");
        }

    }
}

