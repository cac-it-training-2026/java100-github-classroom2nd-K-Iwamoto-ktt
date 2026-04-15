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
		double num_sitron = Double.parseDouble(sitron);

		System.out.println("ショコラ      >");
		String chocolate = reader.readLine();
		double num_chocolate = Double.parseDouble(chocolate);

		System.out.println("ピスターシュ  >");
		String pistach = reader.readLine();
		double num_pistach = Double.parseDouble(pistach);

		double sum_num = num_sitron + num_chocolate + num_pistach;
		int price_sitron = (int) (num_sitron * 250);
		int price_chocolate = (int) (num_chocolate * 280);
		int price_pistach = (int) (num_pistach * 320);

		int sum_price = price_sitron + price_chocolate + price_pistach;

		System.out.println("\nシトロン     " + num_sitron + "個");
		System.out.println("ショコラ     " + num_chocolate + "個");
		System.out.println("ピスターシュ " + num_pistach + "個\n");
		System.out.println("合計個数    " + sum_num + "個");
		System.out.println("合計金額  " + sum_price + "円");
		System.out.println("をお買い上げですね。\n承りました。");

		num_sitron_rest = (int) (num_sitron_rest - num_sitron);
		num_chocolate_rest = (int) (num_chocolate_rest - num_chocolate);
		num_pistach_rest = (int) (num_pistach_rest - num_pistach);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・ 残り" + num_sitron_rest + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + num_chocolate_rest + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + num_pistach_rest + "個");

		System.out.println("閉店時刻となりました。");
		System.out.println("またのお越しをお待ちしております。");

		int ratio_sitron = (int) (((double) price_sitron / sum_price) * 100);
		int ratio_chocolate = (int) (((double) price_chocolate / sum_price) * 100);
		int ratio_pistach = (int) (((double) price_pistach / sum_price) * 100);

		System.out.println("\n売り上げの割合");
		System.out.println("売上合計      \\" + sum_price);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + price_sitron + "・・・ " + ratio_sitron + "%");
		System.out.println("ショコラ      \\" + price_chocolate + "・・・ " + ratio_chocolate + "%");
		System.out.println("ピスターシュ  \\" + price_pistach + "・・・ " + ratio_pistach + "%");
		//テスト
	}
}
