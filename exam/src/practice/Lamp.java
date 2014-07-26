package practice;

public enum Lamp {

	S2N(false,"N2S","S2W"),N2S(false,null,null),E2W(false,"W2E","W2N"),W2E(false,null,null),
	S2W(false,"N2E","E2W"),E2S(false,"W2N","S2N"),N2E(false,null,null),W2N(false,null,null),
	S2E(true,null,null),E2N(true,null,null),N2W(true,null,null),W2S(true,null,null);	
	private String next;
	boolean light=true;
	private String oppostive;
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public boolean isLight() {
		return light;
	}
	public void setLight(boolean light) {
		this.light = light;
	}

	public String getOppostive() {
		return oppostive;
	}
	public void setOppostive(String oppostive) {
		this.oppostive = oppostive;
	}

	
	
	
	private Lamp(boolean light,String oppostive,String next)
	{
		this.light=light;
		this.oppostive=oppostive;
		this.next=next;
	}
	public void lighted()
	{
		this.light=true;

		if(oppostive!=null)
			Lamp.valueOf(oppostive).lighted();
		System.out.println(name()+"的灯亮了");
		
	}
	public Lamp blacked()
	{
		this.light=false;
		if(oppostive!=null)
			Lamp.valueOf(oppostive).blacked();
		Lamp nextLamp=null;
		if(this.next!=null)
		{
			nextLamp=Lamp.valueOf(next);
			nextLamp.lighted();
			System.out.println("绿灯从"+name()+"切换为"+next.toString());
		}
		return nextLamp;
		
	}
	
}
