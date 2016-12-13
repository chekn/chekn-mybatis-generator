package com.ckn.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class StartUp {
	/**
	 * 新建一个类StartUp，找到org.mybatis.generator.api.ShellRunner这个类，它就是生成文件的入口类，拷贝106-117行代码，再稍微作下修改。
	 * 详细说明见<a href="http://www.blogjava.net/bolo/archive/2015/04/10/424271.html">http://www.blogjava.net/bolo/archive/2015/04/10/424271.html</a>
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		File configFile= new File(StartUp.class.getResource("/com/ckn/main/mybatis-generator.xml").toURI());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback shellCallback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
		myBatisGenerator.generate(null);
		System.out.println(warnings);
	}
}
