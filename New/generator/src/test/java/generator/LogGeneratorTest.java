package generator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.ILogGenerator;
import by.grsu.accesslog.generator.impl.LogGenerator;
import by.grsu.accesslog.model.Log;


public class LogGeneratorTest {
	
	private ILogGenerator logGenerator;
	
	@Before
	public void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		logGenerator = context.getBean(LogGenerator.class);
	}
	
	@Test
	public void test() {
		Log log = logGenerator.generate();
		System.out.println(log);
		assertTrue(true);
	}

}
