	package day11;
	import java.util.Arrays;
	import java.util.Comparator;
	public class DemoMultiLevel{
		public static void main(String[] arr){
			Executive ex = new Executive();
			ex.viewGoods();
			ex.alter();
			ex.lenSort();
		}
	}
	class Executive extends Modify{
		public void lenSort(){
			System.out.println("\n\nSort by No of chars");
			Arrays.stream(goods).sorted(Comparator.comparing(String::length))
				.forEach(System.out::println);
		}
	}