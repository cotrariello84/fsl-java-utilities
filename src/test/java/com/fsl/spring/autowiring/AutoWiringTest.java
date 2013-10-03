package com.fsl.spring.autowiring;

import static junit.framework.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fsl.spring.autowiring.Player;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-autowiring-test.xml" })
public class AutoWiringTest {

	@Autowired
	private Player namePlayer;

	@Autowired
	private Player typePlayer;
	
	@Autowired
	private Player ctorPlayer;
	
	@Autowired
	private Player defaultPlayer;
	
	@Test
	public void testByName() {
		assertTrue(namePlayer.getPosition().equals("goalie"));
	}

	@Test
	public void testByType() {
		assertTrue(typePlayer.getPosition().equals("rightBack"));
	}
	
	@Test
	public void testByCtor() {
		assertTrue(ctorPlayer.getPosition().equals("centerBack"));
	}
	
	@Test
	public void testByDefault() {
		assertTrue(defaultPlayer.getPosition().equals("leftBack"));
	}
	
}
