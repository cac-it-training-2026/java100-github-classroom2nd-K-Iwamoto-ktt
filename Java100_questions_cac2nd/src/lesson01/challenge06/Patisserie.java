/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int sum_num = num_citron + num_chocolate + num_pistach;
		int sum_price = num_citron * 250 + num_chocolate * 280 + num_pistach * 320;

		System.out.println("\nシトロン     " + num_citron + "個");
		System.out.println("ショコラ     " + num_chocolate + "個");
		System.out.println("ピスターシュ " + num_pistach + "個\n");
		System.out.println("合計個数    " + sum_num + "個");
		System.out.println("合計金額  " + sum_price + "円");
		System.out.println("\nをお買い上げですね。\n承りました。");

		stock_citron = stock_citron - num_citron;
		stock_chocolate = stock_chocolate - num_chocolate;
		stock_pistach = stock_pistach - num_pistach;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・ 残り" + stock_citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + stock_chocolate + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + stock_pistach + "個");
	}

}