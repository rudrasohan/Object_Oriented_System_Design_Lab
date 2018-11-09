import java.io.*;

class rdr
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = in.readLine();
        String nums[] = input.split(" ");
        String temp="";
        int num=Integer.parseInt(nums[0]);
        num = num*num;
        temp = Integer.toString(num);
        try {
            num=Integer.parseInt(nums[1]);
            num = num*num;
            temp = temp.concat(" ");
            temp = temp.concat(Integer.toString(num));
            try{
                num=Integer.parseInt(nums[2]);
                num = num*num;
                temp = temp.concat(" ");
                temp = temp.concat(Integer.toString(num));
            }
            finally
            {}
        }
        finally
        {
           System.out.println(temp);
        }
    }
}