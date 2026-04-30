/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		double ratio_citron = price_citron / sum_price;
		double ratio_chocolate = price_chocolate / sum_price;
		double ratio_pistach = price_pistach / sum_price;

		int percent_citron = (int) (ratio_citron * 100);
		int percent_chocolate = (int) (ratio_chocolate * 100);
		int percent_pistach = (int) (ratio_pistach * 100);

		System.out.println("\n売り上げの割合");
		System.out.println("売上合計      \\" + sum_price);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) price_citron + "・・・ " + percent_citron + "%");
		System.out.println("ショコラ      \\" + (int) price_chocolate + "・・・ " + percent_chocolate + "%");
		System.out.println("ピスターシュ  \\" + (int) price_pistach + "・・・ " + percent_pistach + "%");

		int price_three_color = ((int) ((sum_price / sum_num) / 10)) * 10;

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味    ・・・ " + percent_citron + "%");
		System.out.println("ショコラの味    ・・・ " + percent_chocolate + "%");
		System.out.println("ピスターシュの味・・・ " + percent_pistach + "%");
		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + price_three_color + "です。\n");
	}
}
