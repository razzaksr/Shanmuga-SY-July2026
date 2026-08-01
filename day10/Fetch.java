	package day10;
	import java.util.Arrays;
	public class Fetch{
		//has a relationship>> Loan/ array of Loan object is member of Fetch class
		Loan[] hdfc = new Loan[5];
		public Fetch(){
			hdfc[0] = new Loan(987654567876L,267000,19.5f);
			hdfc[1] = new Loan(9876567654L,561900,12.4f);
			hdfc[2] = new Loan(456787654674L,845533,15.4f);
			hdfc[3] = new Loan(87656787645L,120000,11.2f);
			hdfc[4] = new Loan(8765456789L,3450000,8.7f);
		}
		public static void main(String[] arr){
			Fetch call = new Fetch();
			// call.sort();
			// call.sort(true);
			call.sort(false);
			System.out.println(Arrays.toString(call.hdfc));
		}
		public void sort(boolean order){
			int size = hdfc.length;
			for(int select=0;select<size-1;select++){
				for(int comp=select+1;comp<size;comp++){
					if(order){
						if(hdfc[select].getRoi()>hdfc[comp].getRoi()){
							Loan temp = hdfc[select];
							hdfc[select] = hdfc[comp];
							hdfc[comp] = temp;
						}	
					}
					else{
						if(hdfc[select].getRoi()<hdfc[comp].getRoi()){
							Loan temp = hdfc[select];
							hdfc[select] = hdfc[comp];
							hdfc[comp] = temp;
						}
					}
				}
			}
		}
		public void sort(){
			int size = hdfc.length;
			for(int select=0;select<size-1;select++){
				for(int comp=select+1;comp<size;comp++){
					if(hdfc[select].getLoanNo()<hdfc[comp].getLoanNo()){
						Loan temp = hdfc[select];
						hdfc[select] = hdfc[comp];
						hdfc[comp] = temp;
					}
				}
			}
		}
	}