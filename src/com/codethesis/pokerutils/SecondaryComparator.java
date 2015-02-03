package com.codethesis.pokerutils;

import java.util.Comparator;

public class SecondaryComparator implements Comparator<Card> {

	@Override
	public int compare(Card card1, Card card2) {
		return new Integer(card1.getRank().getPosition(false)).compareTo(card2
				.getRank().getPosition(false));
	}

}
