/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		double price_citron = num_citron * 250;
		double price_chocolate = num_chocolate * 280;
		double price_pistach = num_pistach * 320;
		int sum_price = (int) (price_citron + price_chocolate + price_pistach);

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

		System.out.println("閉店時刻となりました。");
		System.out.println("またのお越しをお待ちしております。");

		int ratio_citron = (int) ((price_citron / sum_price) * 100);
		int ratio_chocolate = (int) ((price_chocolate / sum_price) * 100);
		int ratio_pistach = (int) ((price_pistach / sum_price) * 100);

		System.out.println("\n売り上げの割合");
		System.out.println("売上合計      \\" + sum_price);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) price_citron + "・・・ " + ratio_citron + "%");
		System.out.println("ショコラ      \\" + (int) price_chocolate + "・・・ " + ratio_chocolate + "%");
		System.out.println("ピスターシュ  \\" + (int) price_pistach + "・・・ " + ratio_pistach + "%");
	}
}
