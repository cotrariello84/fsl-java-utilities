package com.fsl.utilities.spring.autowiring;

import static junit.framework.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fsl.spring.autowiring.byname.Player;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-autowiring-test.xml" })
public class AutoWiringTest {

	@Autowired
	private Player player;

	@Test
	public void testByName() {
		assertTrue(player.getCounty()!=null);
	}

}
