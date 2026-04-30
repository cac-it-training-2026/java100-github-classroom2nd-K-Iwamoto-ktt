/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int stock_citron = 30;
		int stock_chocolate = 30;
		int stock_pistach = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + stock_citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + stock_chocolate + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + stock_pistach + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？ (最大30個まで)\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン      >");
		String citron = reader.readLine();
		int num_citron = Integer.parseInt(citron);

		System.out.println("ショコラ      >");
		String chocolate = reader.readLine();
		int num_chocolate = Integer.parseInt(chocolate);

		System.out.println("ピスターシュ  >");
		String pistach = reader.readLine();
		int num_pistach = Integer.parseInt(pistach);

		System.out.println("\nシトロン     " + num_citron + "個");
		System.out.println("ショコラ     " + num_chocolate + "個");
		System.out.println("ピスターシュ " + num_pistach + "個\n");
		System.out.println("\nをお買い上げですね。\n承りました。");
	}

}