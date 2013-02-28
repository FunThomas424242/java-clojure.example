package clojure.actions;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Assert;
import org.junit.Test;

import clojure.actions.ClojureCall;
import clojure.actions.Constants;
import clojure.lang.Compiler;
import clojure.lang.RT;
import clojure.lang.Var;

public class ClojureCallTest {

	private static final Long ACHT = new Long(8);
	private static final Long ZWEI = new Long(2);
	private static final Long FUENF = new Long(5);
	private static final Long DREI = new Long(3);

	protected static Object runClojure(final Reader reader) {

		Compiler.load(reader);

		// Get a reference to the foo function.
		Var foo = RT.var(Constants.USER, Constants.FOO);

		// Call it!
		Object result = foo.invoke(FUENF, DREI);
		System.out.println(result);
		return result;
	}

	@Test
	public final void testFileAddition() {

		final InputStream in = ClojureCall.class.getClassLoader()
				.getResourceAsStream(Constants.FILE_PLUS_CLI);
		Reader reader = new InputStreamReader(in);

		Object result = runClojure(reader);
		Assert.assertTrue(ACHT.equals(result));

	}

	@Test
	public final void testStringSubtraktion() {

		String str = "(ns user) (defn foo [a b]   (- a b))";
		Reader reader = new StringReader(str);

		Object result = runClojure(reader);
		Assert.assertTrue(ZWEI.equals(result));

	}
}
