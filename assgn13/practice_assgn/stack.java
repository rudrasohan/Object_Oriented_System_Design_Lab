import java.io.*;

class Stack
{
    int top;
    int size;
    int st[];
    Stack(int s)
    {
        size = s;
        st = new int[size];
        top = -1;
    }
    public bool is_empty()
    {
        if (top == -1) {
            return true;
        }
        return false;
    }
    public bool is_full()
    {
        if (top == size) {
            return true;
        }
        return false;
        
}