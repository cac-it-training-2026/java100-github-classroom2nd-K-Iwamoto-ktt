/**
 * 第7章 武士のお仕事
 *
 * 問題11 instanceof演算子
 *
 * instanceof演算子を利用する。
 *
 * 侍クラスの配列に（藩士、浪人）をランダムに入れ、
 * それぞれの人数を表示してください。
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれの人数を表示してみます。
 *
 * 藩士：3人
 *
 * 浪人：2人
 *
 */

package lesson07.challenge11;

abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();
}

class Retainer extends Samurai {

	protected String domain;

	public Retainer() {

	}

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は" + this.domain + "藩士、" + this.name + "ともうす。";
	}

	public boolean equals(Retainer retainer) {
		if (this.domain.equals(retainer.domain)) {
			return true;
		} else {
			return false;
		}
	}
}

class Ronin extends Samurai {

	public Ronin() {

	}

	public Ronin(String name) {
		this.name = name;
	}

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	void work() {
		System.out.println("傘張るよ～。");
	}

	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		Samurai[] samuraiArray = new Samurai[5];

		for (int i = 0; i < 5; i++) {
			int flag = (int) (Math.random() * 10) % 2;
			if (flag == 0) {
				Retainer retainer = new Retainer();
				samuraiArray[i] = retainer;
			} else {
				Ronin ronin = new Ronin();
				samuraiArray[i] = ronin;
			}
		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれの人数を表示してみます。\n");

		int retainerCount = 0;
		int roninCount = 0;

		for (Samurai samurai : samuraiArray) {
			if (samurai instanceof Retainer) {
				retainerCount++;
			} else {
				roninCount++;
			}
		}

		System.out.println("藩士：" + retainerCount + "人");
		System.out.println("\n浪人：" + roninCount + "人");
	}
}
