package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    \n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] stations = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿",
				"品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };

		boolean flag = false;

		int answeredNum = 0;

		do {
			String station = reader.readLine();

			for (int i = 0; i < stations.length; i++) {
				if (station.equals(stations[i])) {
					stations[i] = null;
					flag = true;
					answeredNum++;
					break;
				}
			}

			if (!flag) {
				break;
			}

			boolean loopFlag = false;

			do {
				int cpuanswerIndex = (int) (Math.random() * 100) % 30;
				if (stations[cpuanswerIndex] == null) {
					continue;
				} else {
					System.out.println(stations[cpuanswerIndex]);
					stations[cpuanswerIndex] = null;
					answeredNum++;
					loopFlag = true;
				}
			} while (!loopFlag);

			if (answeredNum == stations.length) {
				flag = true;
			} else {
				flag = false;
			}

		} while (!flag);

		if (answeredNum == stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
