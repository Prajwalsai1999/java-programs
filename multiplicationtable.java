import java.util.Scanner; 
  
class multitable
{ 
    public static void main(String args[]) 
    { 
        
        Scanner in = new Scanner(System.in); 
  
        System.out.println("Enter the math table you need: "); 
  
        int a = in.nextInt();

        for(int i=1;i<=10;i++){
            int num = a*i;   
            System.out.println(a+ " x " + i + " = " + num);  
            }  
    } 
} 