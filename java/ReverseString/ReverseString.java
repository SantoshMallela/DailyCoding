import java.util.*;

class ReverseString{
	public static void main(String ... args)
	{
	  Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          String [] ar = new String [n];
          for(int i=0;i<n;i++)
          {
           
            ar[i]=scan.next();
            
          }
 	  ReverseString RS = new ReverseString();
	  RS.(n,ar);
  	  }
	  static void ReverseString(int n ,String ar[]){
          for(int k=0 ; k<n ; k++)
          {
            char [] c = (ar[k]).toCharArray();
            for(int j= c.length-1 ; j>=0 ; j--)
            {
                System.out.print(c[j]);
            }
            System.out.println();
            
            // StringBuilder sb =new StringBuilder(ar[k]);
            
            // System.out.println(sb.reverse());
       	     }
       	   }
	}
