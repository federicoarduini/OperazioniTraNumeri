
public class Sottrazione implements Operazione
{
	private int operando1;
	private int operando2;
	
	public Sottrazione (int operando1, int operando2)
	{
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	@Override
	public int getOperando1()
	{
		return this.operando1;
	}

	@Override
	public int getOperando2()
	{
		return this.operando2;
	}

	@Override
	public int operazione()
	{
		return this.operando1 - this.operando2;
	}

}
