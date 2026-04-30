/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] MQArrayC = new int[5];
		int[] MQArrayD = new int[5];
		int[] MQArrayE = new int[5];

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10) % 4;

			if (randomNum == 0) {
				MQArrayC[i] = 0;
			} else {
				MQArrayC[i] = (int) (Math.random() * 10) % 10 + 1;
			}
		}

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10) % 4;

			if (randomNum == 0) {
				MQArrayD[i] = 0;
			} else {
				MQArrayD[i] = (int) (Math.random() * 10) % 10 + 1;
			}
		}

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10) % 4;

			if (randomNum == 0) {
				MQArrayE[i] = 0;
			} else {
				MQArrayE[i] = (int) (Math.random() * 10) % 10 + 1;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		for (int i = 0; i < 5; i++) {
			System.out.print(MQArrayC[i]);
			if (i != (MQArrayC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		for (int i = 0; i < 5; i++) {
			System.out.print(MQArrayD[i]);
			if (i != (MQArrayD.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		for (int i = 0; i < 5; i++) {
			System.out.print(MQArrayE[i]);
			if (i != (MQArrayE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		int[][] MQArrayAll = { MQArrayC, MQArrayD, MQArrayE };

		int[] notZero = new int[15];
		for (int i = 0; i < notZero.length; i++) {
			notZero[i] = 0;
		}

		int count = 0;
		boolean loopFlag = false;

		for (int i = 0; i < MQArrayAll.length; i++) {
			for (int j = 0; j < MQArrayC.length; j++) {
				if (MQArrayAll[i][j] != 0) {
					notZero[count] = MQArrayAll[i][j];
					count++;
				}
			}
		}

		int k = 0;

		for (int i = 0; i < MQArrayAll.length; i++) {
			for (int j = 0; j < MQArrayC.length; j++) {
				MQArrayAll[i][j] = notZero[k];
				k++;
				if (notZero[k] == 0) {
					loopFlag = true;
					break;
				}

				if (loopFlag) {
					break;
				}
			}
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		for (int i = 0; i < 5; i++) {
			System.out.print(MQArrayC[i]);
			if (i != (MQArrayC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		for (int i = 0; i < 5; i++) {
			System.out.print(MQArrayD[i]);
			if (i != (MQArrayD.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		for (int i = 0; i < 5; i++) {
			System.out.print(MQArrayE[i]);
			if (i != (MQArrayE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
