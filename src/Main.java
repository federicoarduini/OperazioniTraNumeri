import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int n1, n2;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire primo numero: ");
		n1 = in.nextInt();
		System.out.print("Inserire secondo numero: ");
		n2 = in.nextInt();
		
		Addizione a = new Addizione(n1, n2);
		Sottrazione s = new Sottrazione(n1, n2);
		Moltiplicazione m = new Moltiplicazione(n1, n2);
		Divisione d = new Divisione(n1, n2);
		
		System.out.println(a.getOperando1() + " + " + a.getOperando2() + " = " + a.operazione());
		System.out.println(s.getOperando1() + " - " + s.getOperando2() + " = " + s.operazione());
		System.out.println(m.getOperando1() + " * " + m.getOperando2() + " = " + m.operazione());
		
		try
		{
			System.out.println(d.getOperando1() + " / " + d.getOperando2() + " = " + d.operazione());
		}
		catch (ArithmeticException e)
		{
			System.err.println("Errore: impossibile dividere il numero per zero.");			
		}
	}

}
