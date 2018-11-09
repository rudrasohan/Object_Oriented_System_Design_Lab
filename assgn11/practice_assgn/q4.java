import java.io.*;

class rdr
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = in.readLine(); 
        String temp="toy";
        int num=0;
        try {
            num = Integer.parseInt(input);
            num = num*2;
            System.out.println(num);
            num = num/2;
            System.out.println(num);
            temp = num*num + "";
        }
        finally
        {
            System.out.println(temp);
        }
    }
}