package prj1;

import java.io.PrintStream;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    	    Scanner cin = new Scanner(System.in); //штука для чтения из консоли
    	    PrintStream cout = System.out;    	  //штука для вывода в консоль  
    	   
    	    //Чтение входных параметров 		
 		
 		int iX1 = cin.nextInt();
    		int iY1 = cin.nextInt();
    		int iZ1 = cin.nextInt();
    		double iW1 = cin.nextDouble();

	 	int iX0 = cin.nextInt();
	 	int iY0 = cin.nextInt();
	 	int iZ0 = cin.nextInt();
	 	double iW0 = cin.nextDouble();
    		
    		// Вычисление
    		int iXc = iX0/iX1;
    		int iYc = iY0/iY1;
    		int iZc = iZ0/iZ1;
    		int maxC = maxC(iX0, iY0, iZ0, iW0,iX1, iY1, iZ1, iW1) ;
    		double maxV = maxV(iX0, iY0, iZ0, iW0,iX1, iY1, iZ1, iW1) ;
    		double maxW = maxW(iX0, iY0, iZ0, iW0,iX1, iY1, iZ1, iW1) ;
    		
    		// Вывод результата на экран
    		cout.printf("%1$d %2$.2f %3$.8f", maxC, maxW, maxV);
    	    cin.close();
    	    
    	    // Если ввести данные 50 150 250 0,5 1200 800 1400 750
    	    // Результат должен быть 600 300 0,84
    }
    
    public static int maxC(int X0,int Y0, int Z0, double W0, int X1, int Y1,int Z1, double W1)
    {

        if (X0 < 0) throw new IllegalArgumentException();
        if (Y0 < 0) throw new IllegalArgumentException();
        if (Z0 < 0) throw new IllegalArgumentException();
        if (W0 < 0) throw new IllegalArgumentException();
        if (X1 < 0) throw new IllegalArgumentException();
        if (Y1 < 0) throw new IllegalArgumentException();
        if (Z1 < 0) throw new IllegalArgumentException();
        if (W1 < 0) throw new IllegalArgumentException();
        
    	// Вычисление
		int iXc = X0/X1;
		int iYc = Y0/Y1;
		int iZc = Z0/Z1;
		return iXc*iYc*iZc;
    }

    public static double maxW(int X0,int Y0, int Z0, double W0, int X1, int Y1,int Z1, double W1)
    {
        if (X0 < 0) throw new IllegalArgumentException();
        if (Y0 < 0) throw new IllegalArgumentException();
        if (Z0 < 0) throw new IllegalArgumentException();
        if (W0 < 0) throw new IllegalArgumentException();
        if (X1 < 0) throw new IllegalArgumentException();
        if (Y1 < 0) throw new IllegalArgumentException();
        if (Z1 < 0) throw new IllegalArgumentException();
        if (W1 < 0) throw new IllegalArgumentException();
        
    	// Вычисление
		int iXc = X0/X1;
		int iYc = Y0/Y1;
		int iZc = Z0/Z1;
		int maxC = iXc*iYc*iZc;
		return maxC*W1;
    }

    public static double maxV(int X0,int Y0, int Z0, double W0, int X1, int Y1,int Z1, double W1)
    {
        if (X0 < 0) throw new IllegalArgumentException();
        if (Y0 < 0) throw new IllegalArgumentException();
        if (Z0 < 0) throw new IllegalArgumentException();
        if (W0 < 0) throw new IllegalArgumentException();
        if (X1 < 0) throw new IllegalArgumentException();
        if (Y1 < 0) throw new IllegalArgumentException();
        if (Z1 < 0) throw new IllegalArgumentException();
        if (W1 < 0) throw new IllegalArgumentException();
        
    	// Вычисление
		int iXc = X0/X1;
		int iYc = Y0/Y1;
		int iZc = Z0/Z1;
		int maxC = iXc*iYc*iZc;
		return (double)(maxC*X1*Y1*Z1)/(double)(X0*Y0*Z0);
    }
}