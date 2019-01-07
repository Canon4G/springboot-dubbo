package com.canon4g.provider;

import com.canon4g.provider.MQ.MQSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class ProviderApplicationTests {

	@Autowired
	private MQSender mqSender;

	@Test
	public void testRabbit() {
		mqSender.send();
	}

}

