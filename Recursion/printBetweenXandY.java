import java.io.*;
import java.util.*;

class printBetweenXandY
{
	public static void printXY(int x,int y){
        if(x>y) return ;
		System.out.print(x+" ");
		printXY(x+1,y);
    }
    public static void main(String args[])throws IOException
    {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        printXY(x,y);
        
        
    }
}
