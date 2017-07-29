package substitutealgorithm;

import java.util.Arrays;
import java.util.List;

/**《重构》 P139 ：替换算法
 * 将函数本体替换成另外一个更清晰的算法。
 * @author Vincent
 *
 */
public class FindPerson {

	public String foundPerson(String[] person) {
		for (int i = 0; i < person.length; i++) {
			if (person[i].equals("Don")) {
				return "Don";
			}
			if (person[i].equals("John")) {
				return "John";
			}
			if (person[i].equals("Kent")) {
				return "Kent";
			}
		}
		return "";
	}

	/**
	 * 1、在重构的过程中，如果发现有更简单的解决方案，此时我们就要改变原来的算法。
	 * 2、如果程序的函数库提供的某些功能/特性与自己的代码有重复，那么需要将复杂的算法替换成函数库提供的算法。
	 */
	public String foundPerson1(String[] person) {
		List<String> candidates = Arrays.asList(new String[] { "Don", "John",
				"Kent" });
		for (int i = 0; i < person.length; i++) {
			if (candidates.contains(person[i])) {
				return person[i];
			}
		}
		return "";
	}

}
