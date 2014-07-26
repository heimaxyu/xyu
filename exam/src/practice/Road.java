package practice;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Road {

	/**
	 * @param args
	 */
	private List<String> car=new ArrayList<String>();
	private String name;
	public Road(String name)
	{
		this.name=name;
		ExecutorService pool=Executors.newSingleThreadExecutor();
		pool.execute(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					try {
						Thread.sleep((new Random().nextInt(10)+1)*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					car.add(Road.this.name+"_"+i);
				}
			}
			
			
		});
	ScheduledExecutorService clock=Executors.newScheduledThreadPool(1);
	clock.scheduleAtFixedRate(new Runnable()
	{
		public void run()
		{
			if (car.size()>0)
			{
				boolean light=Lamp.valueOf(Road.this.name).isLight();
			if(light)
				System.out.println(car.remove(0)+"is pass");
			}
		}
		
		
	}, 1, 
	1,
	TimeUnit.SECONDS);
	

	}
}
