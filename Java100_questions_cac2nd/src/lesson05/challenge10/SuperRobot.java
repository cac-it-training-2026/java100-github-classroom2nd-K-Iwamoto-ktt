package lesson05.challenge10;

public class SuperRobot {

	/**
	 * @param pasta パスタの量
	 * @param garlic ニンニクの量
	 * @param tomato トマトの量
	 * @param bell_pepper ピーマンの量
	 */

	void cook(int pasta, int garlic, int tomato, int bell_pepper) {
		if (100 <= pasta) {
			if (10 <= garlic) {
				String cooked_pasta = (20 <= tomato) ? "アラビアータ" : "ペペロンチーノ";
				System.out.println(cooked_pasta + "を作りました。");
			} else if (20 <= tomato) {
				String cooked_pasta = (10 <= bell_pepper) ? "ナポリタン" : "アラビアータ";
				System.out.println(cooked_pasta + "を作りました。");
			} else {
				System.out.println("素パスタを作りました。");
			}
		} else if ((30 <= tomato) && (10 <= garlic) && (10 <= bell_pepper)) {
			System.out.println("野菜スープを作りました。");
		} else if (20 <= tomato) {
			System.out.println("トマトジュースを作りました。");
		} else {
			System.out.println("何も作れませんでした。");
		}

	}
}
