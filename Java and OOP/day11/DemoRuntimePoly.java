	package day11;
	import java.util.Arrays;
	class Sale{
		int[] items={1200,999,8999,599,499,399,199,12999};
		public void discount(){
			System.out.println("5% discount");
			Arrays.stream(items).map(each->each-=(each*0.050))
				.forEach(System.out::println);
		}
	}
	class BigBillionDay extends Sale{
		public void discount(){
			System.out.println("Flat 30% discount");
			Arrays.stream(items).map(each->each-=(each*0.300))
				.forEach(System.out::println);
		}
	}
	public class DemoRuntimePoly{
		public static void main(String[] arr){
			BigBillionDay big = new BigBillionDay();
			big.discount();
		}
	}