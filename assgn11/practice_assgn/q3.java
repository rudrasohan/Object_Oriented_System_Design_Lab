import java.io.*;

class rdr
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = in.readLine(); 
        int num=0,sq=0;
        try {
            num = Integer.parseInt(input);
            System.out.println(num*2);
            input = Integer.toString(num);
        }
        finally
        {
            System.out.println(input);
        }
        System.out.println(num*num);
    }
}