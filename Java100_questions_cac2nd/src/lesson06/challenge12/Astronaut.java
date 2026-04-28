/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Omegalian {
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		int lastIndex = item.length() - 1;
		char lastChar = item.charAt(lastIndex);
		String changedLaseChar = this.changeLastChar(lastChar);

		if (changedLaseChar == null) {
			this.item = item;
		} else {
			StringBuilder sb = new StringBuilder(item);
			sb.append(changedLaseChar);
			sb.deleteCharAt(lastIndex);
			this.item = sb.toString();
		}
	}

	private String changeLastChar(char ch) {
		String lastNumString;
		switch (ch) {
		case '0':
			lastNumString = "zero";
			break;
		case '1':
			lastNumString = "one";
			break;
		case '2':
			lastNumString = "two";
			break;
		case '3':
			lastNumString = "three";
			break;
		case '4':
			lastNumString = "four";
			break;
		case '5':
			lastNumString = "five";
			break;
		case '6':
			lastNumString = "six";
			break;
		case '7':
			lastNumString = "seven";
			break;
		case '8':
			lastNumString = "eight";
			break;
		case '9':
			lastNumString = "nine";
			break;
		default:
			lastNumString = null;
		}
		return lastNumString;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
