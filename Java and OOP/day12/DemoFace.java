	package day12;
	interface Drive{
		double basic=30.5;
		// non abstract method not allowed
		// public int getRandom(){return Math.random();}
		// abstract method
		public void fareCalculate(double distance);
	}
	public class DemoFace implements Drive{
		public void fareCalculate(double distance)
			{System.out.println(basic+(distance*10));}
		public static void main(String[] arr){
			DemoFace face = new DemoFace();
			// face.basic=12.8; // can't modify since its final by default
			System.out.println(face.basic);
			face.fareCalculate(0.300);
			face.fareCalculate(5.0);
			face.fareCalculate(12.0);
			face.fareCalculate(13.5);
		}
	}