package kadai_014;

public class Car_Chapter14 {
	
		private int gear = 1; 
		private int speed = 10;  
		private int previousGear;
	
     public void gearChange(int afterGear) {
	// フィールド（内部データ）
    	 this.previousGear = this.gear;
    	this.gear = afterGear;
    	this.speed = switch(this.gear) {
 			case 1 -> 10;
 			case 2 -> 20;
 			case 3 -> 30;
 			case 4 -> 40;
 			case 5 -> 50;
 			default ->10;
 		};
 		
    	System.out.println("ギア"+this.previousGear+"から"+this.gear+"に切り替えました"); 
 		}

	
	
	public void run() {
		System.out.println("速度は時速"+this.speed+"kmです"); 
		    
		     
	}
		
}