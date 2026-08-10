	package day10;
	import java.util.Arrays;
	public class Retrieve{
		Loan[] hdfc = new Loan[5];
		public Retrieve(){
			hdfc[0] = new Loan(987654567876L,267000,19.5f);
			hdfc[1] = new Loan(9876567654L,561900,12.4f);
			hdfc[2] = new Loan(456787654674L,845533,15.4f);
			hdfc[3] = new Loan(87656787645L,120000,11.2f);
			hdfc[4] = new Loan(8765456789L,3450000,8.7f);
		}
		public void read(float user){
			System.out.println(user+" roi matched records");
			Arrays.stream(hdfc).filter(each->each.getRoi()>=user).forEach(obj->	System.out.println(obj));
		}
		public void read(long number){
			System.out.println(number+" loan records");
			Arrays.stream(hdfc).filter(each->	each.getLoanNo()==number).forEach(obj->System.out.println(obj));
		}
		public void read(int amount){
			System.out.println("loan records less than "+amount);
			Arrays.stream(hdfc).filter(each->each.getPrinciple()	<=amount).forEach(obj->System.out.println(obj));
		}
		public static void main(String[] arr){
			Retrieve ret = new Retrieve();
			ret.read(15.0f);
			ret.read(8765456789L);
			ret.read(400000);
		}
	}