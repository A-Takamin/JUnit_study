package junit.tutorial.parameternized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.RunWith;

import junit.tutorial.Gender;
import junit.tutorial.Member;
@RunWith(Theories.class)
public class AssumeThatFiltering {

	@DataPoints
	public static int[] AGES = {15, 20, 25, 30};
	@DataPoints
	public static Gender[] GENDERS = Gender.values();
	// 列挙型をしれっと使わせていることに驚き↑
	
	@Theory
	public void canEntryは25歳以下の女性の場合にtrueを返す(int age, Gender gender) throws Exception {
		assumeTrue(age <= 25 && gender == Gender.FEMALE);
		// ↑assumeTrueの条件でtrueにならないパラメータの組み合わせを弾いている。
		// そのため、コメントアウトすると弾けないのでテストには失敗する。
		// ※なお、見えないが本当はAssumptionViolatedExceptionが発生している。
		assertThat(Member.canEntry(age, gender), is(true));
	}
	@Theory
	public void canEntryは25歳以下の女性ではない場合にfalseを返す(int age, Gender gender) throws Exception {
		assumeTrue(age > 25 && gender != Gender.FEMALE);
		assertThat(Member.canEntry(age, gender), is(false));
	}
}
