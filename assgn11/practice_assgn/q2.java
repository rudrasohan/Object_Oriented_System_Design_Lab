import java.io.*;

class rdr
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = in.readLine();
        String temp = "ram"; 
        int num=0,sq=0;
        try {
            num = Integer.parseInt(input);
            for (int i=0;i<num;i++) 
            {
                sq += num; 
            }
            temp = sq+"";
        }
        finally
        {
            System.out.println(temp);
        }
    }
}