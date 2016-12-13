package org.mybatis.generator.logging;

public class Log4jImpl implements Log {

	public Log4jImpl(Class<?> clazz) {
		
	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void error(String s, Throwable e) {
		System.err.println(s);
	}

	@Override
	public void error(String s) {
		System.err.println(s);
	}

	@Override
	public void debug(String s) {
		System.out.println(s);
	}

	@Override
	public void warn(String s) {
		System.out.println(s);
	}
}
