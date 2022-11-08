public class Main{
	
	
	
	public static void main(String args[]){
		
		
		MonitorInfo monitorObj = new MonitorInfo("LG",24,1080) ; 
 		CpuInfo cpuObj = new CpuInfo("intel",16,512) ; 
	KeyboardInfo keyboardObj = new KeyboardInfo("Zebronics",57,"mechanical") ;
		MouseInfo mouseObj = new MouseInfo("HP","Wifi") ;
		
		
 		
		System.out.println("		 ---------COMPUTER INFORMATION---------");
			System.out.println("---------");
			System.out.println("MONITOR");
			System.out.println("---------");
				System.out.println("Brand :"+monitorObj.brand);
				System.out.println("Display Size :"+monitorObj.displaySize+"inch");
				System.out.println("Resolution :"+monitorObj.resolution+"px");
			System.out.println("---------" );
			System.out.println("CPU");
			System.out.println("---------");
				System.out.println("Brand :"+cpuObj.brand);
				System.out.println("RAM :"+cpuObj.ram+"gb");
				System.out.println("Hard Disk :"+cpuObj.hardDisk+"GB");
			System.out.println("---------");
			System.out.println("KEYBOARD");
			System.out.println("---------");
				System.out.println("Brand :"+keyboardObj.brand);
				System.out.println("Num of Keys :"+keyboardObj.keys);
				System.out.println("Type :"+keyboardObj.keyboardType);
			System.out.println("---------");
			System.out.println("MOUSE");
			System.out.println("---------");
				System.out.println("Brand :"+mouseObj.brand);
				System.out.println("Mouser type :"+mouseObj.mouseType);
			
	
	
	
	
	
	
	}
	
}