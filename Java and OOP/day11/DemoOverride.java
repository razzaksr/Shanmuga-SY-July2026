	package day11;
	import java.util.Arrays;
	import java.util.Comparator;
	class Insurance{long id; double amount; String insurer;}
	class Store{
		Insurance[] policies=new Insurance[4];
		public Store(){
			policies[0] = new Insurance();policies[0].id=765456787L;
			policies[0].amount = 769500.4;policies[0].insurer = "Razak";
			policies[1] = new Insurance();policies[1].id=6567876773L;
			policies[1].amount = 425362.9;policies[1].insurer = "Aishwarya";
			policies[2] = new Insurance();policies[2].id=87654567844L;
			policies[2].amount = 8873444.3;policies[2].insurer = "Anudeep";
			policies[3] = new Insurance();policies[3].id=45678765678L;
			policies[3].amount = 1500000;policies[3].insurer = "Karthick";
		}
		public void ordering(){
			Arrays.stream(policies)
				.sorted(Comparator.comparing(each->each.id))
					.forEach(obj->System.out.println(
						obj.id+"\t"+obj.insurer+"\t"+obj.amount));
		}
	}
	class IdfcStore extends Store{
		public void ordering(){
			Arrays.stream(policies)
				.sorted(Comparator.comparing(each->each.insurer))
					.forEach(obj->System.out.println(
						obj.id+"\t"+obj.insurer+"\t"+obj.amount));
		}
	}
	public class DemoOverride{
		public static void main(String[] arr){
			IdfcStore idfc = new IdfcStore();
			idfc.ordering();
		}
	}