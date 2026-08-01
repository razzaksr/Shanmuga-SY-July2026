	package day10;
	class CreditCard{
		long cardNo;
		int cvv;
		String cardHolder;
		int cardPin;
		int cardLimit;
		public 
	}
	public class Prime{
		public static void main(String[] arr){
			CreditCard card1 = new CreditCard();
			card1.cardNo=876545678765456L;
			card1.cvv = 334;card1.cardHolder="Razak Mohamed";card1.cardPin=1234;
			card1.cardLimit = 100000;
			System.out.printf("%s\t%d",card1.cardHolder,card1.cardLimit);
		}
	}