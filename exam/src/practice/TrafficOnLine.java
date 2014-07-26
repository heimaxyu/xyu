package practice;

public class TrafficOnLine {
	public static void main(String[] args)
	{
		String[] roads=new String[]{"S2N","N2S","E22","W2E",
				"S2W","E2S","N2E","W2N",
				"S2E","E2N","N2W","W2S"};
		for(int i=0;i<roads.length;i++)
		{
			new Road(roads[i]);
		}
		new Control();
	}

}
