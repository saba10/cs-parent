package com.capgemini.bean;

import org.junit.*;
import static org.junit.Assert.*;

public class GiftCardTest {

	private GiftCard gift;

	@Before
	public void setUp() throws Exception {
		gift = new GiftCard();
		gift.setGiftCardId("Capgemini");
		gift.setGiftCardValue("5000");
	}

	@Test
	public void testGetGiftCardId() throws Exception {
		assertEquals("Capgemini", gift.getGiftCardId());
		assertNotEquals("DTP", gift.getGiftCardId());
		assertNotNull(gift);
		assertTrue(gift.getGiftCardValue().equals("5000"));
		assertNotNull(gift.getGiftCardId());
	}

	@Test
	public void testGetGiftCardValue() throws Exception {
		assertEquals("5000", gift.getGiftCardValue());
		assertNotEquals("4532", gift.getGiftCardValue());
		assertNotNull(gift.getGiftCardId());
		assertTrue(gift.getGiftCardId().equals("Capgemini"));
		assertNotNull(gift.getGiftCardValue());
	}

	@Test
	public void testSetGiftCardId() throws Exception {
		gift.setGiftCardId("DTP");
		assertEquals("DTP", gift.getGiftCardId());
		assertNotEquals("Capgemini", gift.getGiftCardId());
		assertNotNull(gift);
		assertTrue(gift.getGiftCardValue().equals("5000"));
		assertNotNull(gift.getGiftCardId());
		
	}

	@Test
	public void testSetGiftCardValue() throws Exception {
		gift.setGiftCardValue("10000");
		assertEquals("10000", gift.getGiftCardValue());
		assertNotEquals("4532", gift.getGiftCardValue());
		assertNotNull(gift.getGiftCardId());
		assertTrue(gift.getGiftCardId().equals("Capgemini"));
		assertNotNull(gift.getGiftCardValue());
	}

	@After
	public void tearDown() throws Exception {
		gift = null;
		System.gc();
	}
}