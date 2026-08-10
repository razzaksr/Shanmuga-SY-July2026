	package day11;
	import java.util.Arrays;
	abstract class Transaction{
		int[] statement = {12500,2500,1750,8500,30,9500,3200,5600};
		// non abstract method
		public void viewStatement()
		{System.out.println(Arrays.toString(statement));}
		// abstract method
		public abstract void fraudDetection();
	}
	public class AbstractionViaClass extends Transaction{
		public void fraudDetection(){
			Arrays.stream(statement).filter(each->each%500!=0)
				.forEach(System.out::println);
		}
		public static void main(String[] arr){
			// can't create object for abstract class
			// Transaction tran = new Transaction();
			AbstractionViaClass tran = new AbstractionViaClass();
			tran.viewStatement();
			tran.fraudDetection();
		}
	}