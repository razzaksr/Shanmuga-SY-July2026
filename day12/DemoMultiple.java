	package day12;
	// Hybrid>> combining multi level with Multiple
	public class DemoMultiple extends DemoFace implements Ride {
		public double eta(double distance) {return distance/avgSpeed*60/60;}
		public String carType(double distance)
			{return (distance>15)?"Dzire":"Wagon R";}
		public static void main(String[] arr){	
			DemoMultiple demo = new DemoMultiple();
			demo.fareCalculate(45);
			System.out.println(demo.carType(32));
			System.out.println(demo.eta(92));
		}
	}