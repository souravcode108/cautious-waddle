import java.util.Scanner;
class Areaofcircle{
	public static void main(String args[])
	{   
	     Scanner sc = new Scanner(System.in) ;
	     
        System.out.println("enter the radius ");
        
        double r= sc.nextDouble();
        double a  = (22*r*r)/7;
        System.out.println("area of circle is : "+a);

	}
}

/* import java.util.Scanner;
class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= s.nextDouble();
         double  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area);      
   }
}
*/