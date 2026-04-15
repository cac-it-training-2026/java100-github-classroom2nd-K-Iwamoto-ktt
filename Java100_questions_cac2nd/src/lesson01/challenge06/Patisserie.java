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

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250");
		System.out.println("ショコラ      \\280");
		System.out.println("ピスターシュ  \\320");

		int num_sitron_rest = 30;
		int num_chocolate_rest = 30;
		int num_pistach_rest = 30;

		System.out.println("\nそれぞれ何個ずつ買いますか？ (最大30個まで)\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン      >");
		String sitron = reader.readLine();
		int num_sitron = Integer.parseInt(sitron);

		System.out.println("ショコラ      >");
		String chocolate = reader.readLine();
		int num_chocolate = Integer.parseInt(chocolate);

		System.out.println("ピスターシュ  >");
		String pistach = reader.readLine();
		int num_pistach = Integer.parseInt(pistach);

		int sum_num = num_sitron + num_chocolate + num_pistach;
		int sum_price = num_sitron * 250 + num_chocolate * 280 + num_pistach * 320;

		System.out.println("\nシトロン     " + num_sitron + "個");
		System.out.println("ショコラ     " + num_chocolate + "個");
		System.out.println("ピスターシュ " + num_pistach + "個\n");
		System.out.println("合計個数    " + sum_num + "個");
		System.out.println("合計金額  " + sum_price + "円");
		System.out.println("をお買い上げですね。\n承りました。");

		num_sitron_rest = num_sitron_rest - num_sitron;
		num_chocolate_rest = num_chocolate_rest - num_chocolate;
		num_pistach_rest = num_pistach_rest - num_pistach;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・ 残り" + num_sitron_rest + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + num_chocolate_rest + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + num_pistach_rest + "個");
	}

}