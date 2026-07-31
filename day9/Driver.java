	package day9;
	import java.util.Arrays;
	public class Driver{
		double[] metric = {12.6,9.2,7.8,21.6,2.2};
		public void performBinary(){
			Determine mine = new Determine();
			Arrays.sort(mine.directors);
			int position = Arrays.binarySearch(mine.directors,"Durga");
			System.out.println(position);
		}
		public static void main(String[] ar){
			// Classname objectName = new Constructor()
			Driver drive = new Driver();
			System.out.println(Arrays.toString(drive.metric));
			Determine deter = new Determine();
			System.out.println(Arrays.toString(deter.directors));
			deter.vowels();
			drive.performBinary();
		}
	}

	class Determine{
		String[] directors = {"Karthick","Hemanth","Sindrella","Jeshwanth","Kiran","Udhay","Manoj","Aishwarya","Ram","Vaishani","Subbaiya","Durga"};
		public void vowels(){
			Arrays.stream(directors).filter(each->each.endsWith("a")||each.endsWith("e")||each.endsWith("i")||each.endsWith("o")||each.endsWith("u")).forEach(name->System.out.println(name));
		}
	}