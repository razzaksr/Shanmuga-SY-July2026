	package day12;
	interface HealthCare{
		double[] bmis = {19.4,22.8,31.9,24.6,18.6,30.5,35.2};
		int[] ages = {25,50,49,15,32,20,35};
		public void review();
	}
	class BodyAge implements HealthCare{
		public void review(){
			for(int ind=0;ind<ages.length;ind++){
				System.out.println("Body age "+
				((bmis[ind]<18.5)?ages[ind]+2:(bmis[ind]>25)?ages[ind]+							5:ages[ind])+" actual age is "+ages[ind]);
			}
		}
	}
	class FatRate implements HealthCare{
		public void review(){
			for(int ind=0;ind<ages.length;ind++){
				System.out.println("Fat rate "+
						((1.20*bmis[ind])+(0.23*ages[ind])-16.2));
			}
		}
	}
	public class Factory{
		public static void main(String[] arr){
			/* BodyAge demo = new BodyAge();demo.review();
			FatRate fatDemo  = new FatRate();fatDemo.review();*/
			// Upcasting/ Factory Pattern
			HealthCare care = new BodyAge(); care.review();
			care = new FatRate(); care.review();
		}
	}