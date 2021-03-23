
public class Check {
	public static void main(String[] args) {
		int score = 49;
		boolean isHandSome = true;
		if (score >= 80 || isHandSome == true) {
			System.out.println("Good");
		} else if (score >= 50) {
			System.out.println("normal");
		} else if (score <= 50) {
			System.out.println("fail");
		}
	}
}
