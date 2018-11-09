import java.io.*;

class rdr
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = in.readLine(); 
        int num=10;
        try {
            num = Integer.parseInt(input);
           
        }
        finally
        {
            num = num*num;
            System.out.println(num);
        }
    }
}