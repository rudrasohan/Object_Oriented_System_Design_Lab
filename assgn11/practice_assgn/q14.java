import java.io.*;

class rdr
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = in.readLine();

        int num=0;
        try {
            int l = input.length();
            num = 1/Math.max((l-5),0);
            input.charAt(l);
        } 
        
        catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.print("A"); 
        }
        finally
        {
            System.out.print("B");    
        }
        System.out.print("C\n");
    }
}