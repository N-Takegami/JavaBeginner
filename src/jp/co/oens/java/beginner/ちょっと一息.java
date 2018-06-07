package jp.co.oens.java.beginner;

/**
 * Javaトピックス１
 * 実はJavaプログラムはマルチバイト文字でコーディングが可能です。
 * @date 2018/06/08
 * @author Naoki Takegami
 */
public class ちょっと一息 {
	public static void main(String[] args) {
		String あいさつ文 = "こんにちは Java";
		int 商品価格 = 1000;
		double 消費税 = 0.08;
		Integer 販売価格 = (int)(商品価格 + (商品価格 * 消費税));

		System.out.println(あいさつ文);
		System.out.println(String.format("販売価格は %d 円", 販売価格) );
	}
}
