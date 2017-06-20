package com.choa.ex5;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:**/webapp/WEB-INF/spring/root-context.xml", "file:**/webapp/WEB-INF/spring/servlet-context.xml"})
public abstract class MyAbstractTestUnit {
	
}
