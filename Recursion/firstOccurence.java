import java.util.Scanner;


class Main {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		return A;
	}
	
	public static void main(String[] args) {
		int[] A = takeInput();
		int T = s.nextInt();
		System.out.println(firstIndex(A, T, 0));
	}

	static int firstIndex(int A[],int T,int startIndex)
	{
		/*startIndex=-1;
		for(int i=0;i<A.length;i++)
			{
				if(A[i]==T)
				{
					startIndex=i;
					break;
				}
			}
       return startIndex;*/
		if(startIndex==A.length) return -1;
		if(A[startIndex]==T) 
		{
			return startIndex;
		}
		else
		{
			return firstIndex(A,T,startIndex+1);
		}
		
	}
}

