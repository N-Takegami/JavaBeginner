package jp.co.oens.java.beginner.deep;


/**
 * 変数を理解するためのプログラム。
 * Javaにはプリミティブ型とオブジェクト型が存在します。
 * ここではオブジェクト型のラッパークラスと呼ばれるオブジェクト型および文字列型についてコーディングします。
 * @date 2018/06/07
 * @author Naoki Takegami
 */
public class MainJavaBeginnerLesson3 {

	public static void main(String[] args) {
		// boolean型をラップしたオブジェクト型
		Boolean _boolean = true; // or false
		// byte 型をラップしたオブジェクト型
		Byte _byte = 127; // ～ -128
		// char 型をラップしたオブジェクト型
		Character _char = 255; // ～ 0
		// short 型をラップしたオブジェクト型
		Short _short = 32767; // ～ -32768
		// int 型をラップしたオブジェクト型
		Integer _int = 2147483647; // ～ -2147483648
		// long 型をラップしたオブジェクト型
		Long _long = 9223372036854775807L; // ～ -9223372036854775807L
		// float 型をラップしたオブジェクト型
		Float _float = (float) 3.4028235E38; // ～ 1.4E-45
		// double 型をラップしたオブジェクト型
		Double _doble = (double) 1.7976931348623157E308; // ～ 4.9E-324
		// 文字列方
		String str = new String("String型は文字列を扱うのに利用：Hello java");

		System.out.println("Booleanはbooleanをラップしたオブジェクト型：" + _boolean);
		System.out.println("Byteはbyteをラップしたオブジェクト型：" + _byte);
		System.out.println("Characterはcharをラップしたオブジェクト型：" + _char);
		System.out.println("Shortはshortをラップしたオブジェクト型：" + _short);
		System.out.println("Integerはintをラップしたオブジェクト型：" + _int);
		System.out.println("Longはlongをラップしたオブジェクト型：" + _long);
		System.out.println("Floatはfloatをラップしたオブジェクト型：" + _float);
		System.out.println("Doubleはdoubleをラップしたオブジェクト型：" + _doble);
		System.out.println(str);

		// 各ラッパークラスは色々な機能を持っています。
		// 詳細はOracle Javaが公開している情報を参照するか
		// 知ってそうな人へ聞いてください。

		// 例）文字列などを各型へ設定。テキストファイルやDBから取得し変換するときなどに便利。
		System.out.println("数値文字列 を 数値へ変換：" + new Integer("255"));
		System.out.println("文字列 を boolean値へ変換：" + new Boolean("True"));
		System.out.println("文字列 を boolean値へ変換：" + new Boolean("true"));
		System.out.println("文字列 を boolean値へ変換：" + new Boolean("TRue"));
		System.out.println("文字列 を boolean値へ変換：" + new Boolean("TRUe"));
		System.out.println("文字列 を boolean値へ変換：" + new Boolean("yes"));
		System.out.println("文字列 を boolean値へ変換：" + new Boolean("false"));
	}
}
