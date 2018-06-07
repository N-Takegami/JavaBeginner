package jp.co.oens.java.beginner;

/**
 * 変数を理解するためのプログラム。
 * Javaにはプリミティブ型とオブジェクト型が存在します。
 * ここではプリミティブ型についてコーディングします。
 * @date 2018/06/07
 * @author Naoki Takegami
 */
public class MainJavaBeginnerLesson2 {

	public static void main(String[] args) {
		// 1bit 真偽値
		boolean _boolean = true; // or false
		// 8bit 符号あり整数値
		byte _byte = 127; // ～ -128
		// 16bit 符号なし整数値
		char _char = 255; // ～ 0
		// 16bit 符号あり整数値
		short _short = 32767; // ～ -32768
		// 32bit 符号あり整数値
		int _int = 2147483647; // ～ -2147483648
		// 64bit 符号あり整数値
		long _long = 9223372036854775807L; // ～ -9223372036854775807L
		// 32bit 浮動小数値
		float _float = (float) 3.4028235E38; // ～ 1.4E-45
		// 64bit 浮動小数値
		double _doble = (double) 1.7976931348623157E308; // ～ 4.9E-324

		// float/doubleの中にあるEは指数表記といって10のN乗になります。
		// E-45の場合はEの-45乗です。
		// E38の場合はEの38乗です。

		System.out.println("booleanは主に分岐などの判定で利用：" + _boolean);
		System.out.println("byteは主に外部ファイルデータを保持するのに利用：" + _byte);
		System.out.println("charは主に1文字を扱うのに利用：" + _char);
		System.out.println("shortは主にint より小さい数字を使う際に利用：" + _short);
		System.out.println("intは主に整数値を利用するのに利用：" + _int);
		System.out.println("longは主に巨大な数値を扱うのに利用：" + _long);
		System.out.println("floatは主に細かい値を扱うのに利用：" + _float);
		System.out.println("dobleは主により細かい値を扱うのに利用：" + _doble);

	}
}
