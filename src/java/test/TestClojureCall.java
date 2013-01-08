package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

import clojure.lang.Compiler;
import clojure.lang.RT;
import clojure.lang.Var;

public class TestClojureCall {

	public static void main(String[] args) throws Exception {

		TestClojureCall call = new TestClojureCall();
		call.executeString();
		call.executeFile();
	}

	public Object executeString() {

		Object result = null;

		// a - b
		Reader reader = loadStringContent();
		// a=5 b=3
		result = runClojure(reader);

		return result;
	}

	public Object executeFile() {

		Object result = null;

		// a + b
		final Reader reader = loadFileContent();
		// a=5 b=3
		result = runClojure(reader);
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	protected static Object runClojure(final Reader reader) {

		Compiler.load(reader);

		// Get a reference to the foo function.
		Var foo = RT.var("user", "foo");

		// Call it!
		Object result = foo.invoke(5, 3);
		System.out.println(result);
		return result;
	}

	protected static Reader loadFileContent() {
		Reader reader = null;

		final InputStream in = TestClojureCall.class.getClassLoader()
				.getResourceAsStream("hallo.clj");
		reader = new InputStreamReader(in);

		return reader;
	}

	/**
	 * @return
	 */
	protected static Reader loadStringContent() {
		String str = "(ns user) (defn foo [a b]   (- a b))";
		Reader reader = new StringReader(str);
		return reader;
	}
}
