package junit.tutorial;

public class Member {
	/**
	 * 25歳以下 かつ 女性 ならtrueを返す
	 * @param age 年齢
	 * @param gender 性別（この文脈だとgenderではなくsexでは。。）
	 * @return 25歳以下 かつ 女性 ならtrueを返す
	 */
	public static boolean canEntry(int age, Gender gender) {
		if(age > 25) return false;
		if(gender == Gender.MALE) return false;
		return true;
	}
}
