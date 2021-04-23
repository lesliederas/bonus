import java.util.Scanner;
public class Challenge {
	public static void Slow(int nth)
	{
		int FinalPostion, FinalPrime = 2, CurrentPosition = 1, Number=2, x;
		boolean IsPrime = false;
		double elapsed;

		
		FinalPostion = nth;
		PrimeBenchmark.start();
		while (CurrentPosition <= FinalPostion)
		{
			IsPrime = true;
			for (x=2; x <= Number - 1;x++)
			{
				if (Number % x == 0)
				{
					IsPrime = false;
				}
			}
			
			if (IsPrime)
			{
				FinalPrime = Number;
				CurrentPosition++;
			}
			Number++;
		}
		
		elapsed = PrimeBenchmark.elapsedTime();
		System.out.println("\n\nSlow Prime\nThe " + FinalPostion + "th prime number is " + FinalPrime);
		System.out.println("Elasped time = "+ elapsed);
	}
	
	
	public static void MyPrime(int nth)
	{
		int FinalPrime = 2;
		double elapsed;
		PrimeBenchmark.start();
		//=====================================================================

		
		
		
		//=======================================================
		elapsed = PrimeBenchmark.elapsedTime();
		System.out.println("\n\nSlow Prime\nThe " + nth + "th prime number is " + FinalPrime);
		System.out.println("Elasped time = "+ elapsed);
	}
	
	public static void main(String[] args) {
		int nth;
		String response;
		Scanner keyboard = new Scanner (System.in);
		do
		{
			System.out.print("Enter nth position you want ");
			response = keyboard.next(); 
		}
		while(!PrimeBenchmark.IntOK(response));
		nth = Integer.parseInt(response);
		
		//Runs all 4 speeds
		PrimeBenchmark.CLevel(nth);
		PrimeBenchmark.BLevel(nth);
		PrimeBenchmark.ALevel(nth);
		PrimeBenchmark.CantTouchThis(nth);
		MyPrime(nth);

	}

}


