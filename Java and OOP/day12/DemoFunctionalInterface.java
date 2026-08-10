	package day12;
	import java.util.Arrays;
	public class DemoFunctionalInterface{
		public static void main(String[] arr){
			Drive rapido = (distance)->{System.out.println(30.5+(distance*10));};
			Drive ola = (distance)->{System.out.println(20+(distance*5));};
			rapido.fareCalculate(25);
			ola.fareCalculate(25);
			
			double[] bmis = {19.4,12.8,31.9,24.6,18.1,30.5,35.2};
			HealthCare obese = ()->{
				System.out.println("Obese Patients");
				Arrays.stream(bmis).filter(each->
					each>25).forEach(System.out::println);
			};
			obese.review();
			HealthCare underweight = ()->{
				System.out.println("UnderWeight Patients");
				Arrays.stream(bmis).filter(each->
					each<18.5).forEach(System.out::println);
			};
			underweight.review();
		}
	}