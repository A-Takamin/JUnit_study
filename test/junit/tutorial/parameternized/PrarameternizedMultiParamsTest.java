package junit.tutorial.parameternized;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PrarameternizedMultiParamsTest {
	@DataPoint
	public static int INT_PARAM1 = 3;
	@DataPoint
	public static int INT_PARAM_2 = 4;
	@DataPoint
	public static String STRING_PARAM_1 = "Hello";
	@DataPoint
	public static String STRING_PARAM_2 = "World";
	
	// このような場合は、「3, 4」×「Hello, World」の組み合わせ処理（4通り）が実行
	@Theory
	public void テスト(int i, String str) throws Exception {
		System.out.println(i + "," + str);
	}
	
}
