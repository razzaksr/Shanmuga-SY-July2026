	package day11;
	import java.util.Arrays;
	// DemoSingle and Warehouse are connected via "is a relationship"
	public class DemoSingle extends Warehouse{
		public void illustrateReference(){
			Integer[] arr = {34,98,34,18,20};
			Arrays.stream(arr).map(Math::sqrt).forEach(System.out::println);
		}
		public static void main(String[] arr){
			// Warehouse house = new Warehouse(); house.viewGoods();
			DemoSingle single = new DemoSingle(); single.illustrateReference(); single.viewGoods();
		}
	}
	class Warehouse{
		String[] goods = {"Korean Pants", "Slimfit Shirts", "Polo Trousers", "Polo T-Shirts", "Rebok Shoes"};
		public void viewGoods(){
			// Arrays.stream(goods).forEach(each->System.out.println(each));
			Arrays.stream(goods).forEach(System.out::println); // method reference>> jdk 8 feature
		}
	}