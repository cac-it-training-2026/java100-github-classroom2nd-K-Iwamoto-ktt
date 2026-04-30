/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double num_citron = Double.parseDouble(citron);

		System.out.println("ショコラ      >");
		String chocolate = reader.readLine();
		double num_chocolate = Double.parseDouble(chocolate);

		System.out.println("ピスターシュ  >");
		String pistach = reader.readLine();
		double num_pistach = Double.parseDouble(pistach);

		double sum_num = num_citron + num_chocolate + num_pistach;
		int sum_price = (int) (num_citron * 250 + num_chocolate * 280 + num_pistach * 320);

		System.out.println("\nシトロン     " + num_citron + "個");
		System.out.println("ショコラ     " + num_chocolate + "個");
		System.out.println("ピスターシュ " + num_pistach + "個\n");
		System.out.println("合計個数    " + sum_num + "個");
		System.out.println("合計金額  " + sum_price + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

		stock_citron = (int) (stock_citron - num_citron);
		stock_chocolate = (int) (stock_chocolate - num_chocolate);
		stock_pistach = (int) (stock_pistach - num_pistach);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・ 残り" + stock_citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + stock_chocolate + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + stock_pistach + "個");
	}

}
