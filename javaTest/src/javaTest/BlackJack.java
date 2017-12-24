package javaTest;

public class BlackJack {

	public static void main(String[] args) {
		String message;
		int[] cards = {10, 2,10};
		message = BlackJackCheck(cards);
		System.out.println(message);
	}
		public static String BlackJackCheck(int[] cards){
			int value = 0;
			String result = null;
			for (int i = 0; i < cards.length; i++){
				value += cards[i];
			}
			if (value == 21){
				result = "BlackJack!!";
			}else if(value > 21){
				result = "Pig!!";
			}else if(value >= 16){
				result = "STAND!!";
			}else {
				result = "HIT";
			}
			return result;
	}
}
