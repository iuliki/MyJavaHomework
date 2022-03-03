import java.nio.file.FileSystem;
import java.util.Scanner;


public class Pb10 {

	public static boolean esteNrPrim(int nr)
	{
	    boolean flag= true;
	    if(nr%2==0)
	    	return false;
	    
	    for(int div=3;div<=Math.sqrt(nr);div++) 
	    {
	    	if(nr%div==0)
	    	{
	    		flag=false;
	    	break;
	    	}
	    	div++;
	    }
	    return flag;
	}
	public static void Pb1()
	{ 
		 Scanner input= new Scanner (System.in);
		 System.out.println("Scrie numarul DE LA PB 1  : ");
		 int  n =input.nextInt();
		 if(n<1 || n>10)
			 System.out.println("Invalid");
		 else
		 { if(n<5)
				 System.out.println("Respins");
			 else 
				 System.out.println("Admis");
		 }
	}
	public static void Pb2()
	{   Scanner input= new Scanner (System.in); 
		System.out.println("Scrie numarul DE LA PB 2: ");
	     int  n =input.nextInt();
		
		
		switch(n) {
		  case 1:
			  System.out.println("UNU");
		    break;
		  case 2:
			  System.out.println("DOI");
		    break;
		  case 3:
			  System.out.println("TREI");
		    break;
		  case 4:
			  System.out.println("PATRU");
		    break;
		  case 5:
			  System.out.println("CINCI");
		    break;
		  default:
			  System.out.println("INVALID");
		}
	}
	public static void Pb3()
	{  
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  a =input.nextInt();
		 System.out.println("Scrie numarul b  : ");
		 int  b =input.nextInt();
		 
		if(a%2==0 && b%2==0)
			 System.out.println("media aritmetica este" + Math.floor((a*b)/2));
		else
		{
			if((a%2==0 && b%2!=0) || (a%2!=0 && b%2==0) )
				 System.out.println("suma numerelor  este" + Math.floor(a+b));
			else
				System.out.println("produsul lor este " + a*b);
				
		}
			  
			
	}
	
	public static void Pb4()
	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  a =input.nextInt();
		System.out.println("Scrie numarul b  : ");
		int  b =input.nextInt();
		System.out.println("Scrie numarul c  : ");
		int  c =input.nextInt();
		int max,max1;
		
		if(a>b)	
			max1=a;
		else
			max1=b;
		
		if(c>max1)
			max=c;
		else
			max=max1;
		
		System.out.println("Maximul dintre cele 3 este : " +max );
		
	}
	public static void Pb5()


	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  n =input.nextInt();
		int suma=0;
		int par =2;
		
		for(int i=0;i<n;i++)
		{
			
			suma=suma+par;
			par=par+2;
		}
		
		System.out.println("suma primelor " + n +  "numere este : "+ suma);
	}
	public static void Pb6()
	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  n =input.nextInt();
		int suma=0;
		int impar =1;
		
		for(int i=0;i<n;i++)
		{
			
			suma=suma+impar;
			impar=impar+2;
		}
		
		System.out.println("suma primelor " + n +  "numere este : "+ suma);
	}
	public static void Pb7()
	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul n  : ");
		int  n =input.nextInt();
		int suma=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Scrie numarul " + i );
			int  a =input.nextInt();
			suma=suma+a;
		}
		
		System.out.println(Math.floor(suma/n));
	}
	public static void Pb8()
	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul n  : ");
		int  n =input.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial de " +n+ " este "+ fact);
	}
	public static void Pb9() 
	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul n  : ");
		int  n =input.nextInt();
	    boolean flag= true;
	    if(n%2==0)
	    	flag= false;
	    
	    for(int div=3;div<=Math.sqrt(n);div++) 
	    {
	    	if(n%div==0)
	    	{
	    		flag=false;
	    	break;
	    	}
	    	div++;
	    }
	   if(flag)
	       System.out.println("este prim: ");
	   else 
		   System.out.println("nu este prim: ");
		   
	}
	
	public static void Pb111()
	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul n  : ");
		int  n =input.nextInt();	
		for(int i=1;i<=n;i++) 
	    {
	    	if(n%i==0)
	    	 System.out.println(i);
	    }
	}
    public static void Pb12()
    {
    	Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul n  : ");
		int  n =input.nextInt();	
		for(int i=1;i<=n;i++) 
	    {
	    	if(n%i==0)
	    	{  
	    		int aux=0;
	    		for(int div=2;div<=Math.sqrt(i);div++) 
	    	    {
	    	    	if(i%div==0)
	    	    	{
	    	    		aux++;
	    	    	}
	    	    	
	    	     }
	    		if(aux==0)
	    	      System.out.println(i);
	    	 }
	    		
	    }
		
    }
    
    public static void Pb13()
    {
    	int a=17;
    	int b=19;
    	int aux=1;
    	while((a+b)<1001)
    	{
    		if(a%17==0 && b%19==0)
    			{
    			System.out.println(a + "+" +b);
    			}
    		
    		a++;
    	    b++;
    		
    	}
    }
    public static void Pb14()
    {
    	int a=13;
    	int b=7;
    	int aux=1;
    	while((a+b)<1001)
    	{
    		if((a%17==0 || a%13==0)  && (b%19==0 || b%7==0))
    			{
    			System.out.println(a + "+" +b);
    			}
    		
    		a++;
    	    b++;
    	}
    }
    public static void Pb15()
    {
    	int a=0;
    	int b=0;
    	for(int i=0;i<=9;i++)
    	{
    		for(int j=0;j<=9;j++)
    		{
    			int nr=(3*1000) + (i*100)+ (2*10) + j;
    	    	
        		if(nr%9==0)
        			System.out.println(nr);
        		
        	
        			
    		}
    		
    	}
    	
    }
	public static void Pb16()
	{
		Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  a =input.nextInt();
		int aux=0;
		while(a>0)
		{
			 aux=aux*10+ a%10;
			 a=a/10;
		}
		while(aux>0)
		{
			 System.out.println(aux%10);
			 aux=aux/10;
		}
		
	}
   public static void Pb17()
   {
	   Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  a =input.nextInt();
		int aux=0;
		int maxi=0;
	   while(a>0)
		{
			 aux= a%10;
			 if(maxi<aux)
				 maxi=aux;
			 a=a/10;
		}
	   System.out.println(maxi);
	   
   }
   public static void Pb18()
   {
	   Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  a =input.nextInt();
		int aux=0;
		int mini=99999999;
	   while(a>0)
		{
			 aux= a%10;
			 if(mini>aux)
				 mini=aux;
			 a=a/10;
		}
	   System.out.println(mini);
   }
   public static void Pb19()
   {
	   Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  a =input.nextInt();
		int aux=0;
		while(a>0)
		{
			 aux=aux*10+ a%10;
			 a=a/10;
		}
		System.out.println(aux);
   }
   public static void Pb20()
   {
	   Scanner input= new Scanner (System.in);
		System.out.println("Scrie numarul a  : ");
		int  a =input.nextInt();
		int aux=a;
		int inv=0;
		while(aux>0)
		{
			 inv=inv*10+ aux%10;
			 aux=aux/10;
		}
		if(a==inv)
			System.out.println("Numarul este palindrom");
		else
			System.out.println("Numarul nu este palindrom ");
		
		
   }
   public static void main(String[] args)
	
	{ 
		
		
		//problema1
		 
		// Pb1();
				 
		//problema2
		
		
		// Pb2();
		 
		//problema3
		 
		// Pb3();
		 
		//problema4
		// Pb4();
		
		//problema5
		//Pb5();
		
		//problema6
	    // Pb6();
	    
		//problema7
	    //Pb7();
		
		//problema8
	    //Pb8();
		
		//problema9
		//Pb9();
		
		//problema 10 
		int numar=1001;
		while(true)
		{
			if(esteNrPrim(numar))
			{
				System.out.println("Numarul este : "+ numar);
			break;

				
			}
			else
			numar++;
		}
	    
	        //problema11
			//Pb111();
	
	 //problema12
	//Pb12();
	
	 //problema13
	//Pb13();
	
	 //problema14
	//Pb14();
	
	 //problema15
	  //Pb15();
		
		//problema16
		 // Pb16();
		
		//problema17
		 //Pb17();
		
		//problema18
		  //Pb18();
		
		//problema19
		 // Pb19();
		
		//problema20
		  Pb20();


	}
}
