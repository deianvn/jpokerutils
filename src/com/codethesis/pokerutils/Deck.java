package com.codethesis.pokerutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>(52);

	public Deck() {
		this(true);
	}

	public Deck(boolean prepareDefaultDeck) {
		if (prepareDefaultDeck) {
			prepareDefaultDeck();
		}
	}

	public int size() {
		return cards.size();
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public void remove(Card card) {
		cards.remove(card);
	}

	public void remove(int index) {
		cards.remove(index);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void reverse() {
		Collections.reverse(cards);
	}

	public void sort() {
		sort(true);
	}

	public void sort(boolean byPrimaryPosition) {
		if (byPrimaryPosition) {
			Collections.sort(cards, new PrimaryComparator());
		} else {
			Collections.sort(cards, new SecondaryComparator());
		}
	}

	public Card pop() {
		Card card = cards.get(0);
		cards.remove(0);

		return card;
	}

	private void prepareDefaultDeck() {
		cards.add(new Card(Suit.clubs, Rank.two));
		cards.add(new Card(Suit.diamonds, Rank.two));
		cards.add(new Card(Suit.hearts, Rank.two));
		cards.add(new Card(Suit.spades, Rank.two));
		cards.add(new Card(Suit.clubs, Rank.three));
		cards.add(new Card(Suit.diamonds, Rank.three));
		cards.add(new Card(Suit.hearts, Rank.three));
		cards.add(new Card(Suit.spades, Rank.three));
		cards.add(new Card(Suit.clubs, Rank.four));
		cards.add(new Card(Suit.diamonds, Rank.four));
		cards.add(new Card(Suit.hearts, Rank.four));
		cards.add(new Card(Suit.spades, Rank.four));
		cards.add(new Card(Suit.clubs, Rank.five));
		cards.add(new Card(Suit.diamonds, Rank.five));
		cards.add(new Card(Suit.hearts, Rank.five));
		cards.add(new Card(Suit.spades, Rank.five));
		cards.add(new Card(Suit.clubs, Rank.six));
		cards.add(new Card(Suit.diamonds, Rank.six));
		cards.add(new Card(Suit.hearts, Rank.six));
		cards.add(new Card(Suit.spades, Rank.six));
		cards.add(new Card(Suit.clubs, Rank.seven));
		cards.add(new Card(Suit.diamonds, Rank.seven));
		cards.add(new Card(Suit.hearts, Rank.seven));
		cards.add(new Card(Suit.spades, Rank.seven));
		cards.add(new Card(Suit.clubs, Rank.eight));
		cards.add(new Card(Suit.diamonds, Rank.eight));
		cards.add(new Card(Suit.hearts, Rank.eight));
		cards.add(new Card(Suit.spades, Rank.eight));
		cards.add(new Card(Suit.clubs, Rank.nine));
		cards.add(new Card(Suit.diamonds, Rank.nine));
		cards.add(new Card(Suit.hearts, Rank.nine));
		cards.add(new Card(Suit.spades, Rank.nine));
		cards.add(new Card(Suit.clubs, Rank.ten));
		cards.add(new Card(Suit.diamonds, Rank.ten));
		cards.add(new Card(Suit.hearts, Rank.ten));
		cards.add(new Card(Suit.spades, Rank.ten));
		cards.add(new Card(Suit.clubs, Rank.jack));
		cards.add(new Card(Suit.diamonds, Rank.jack));
		cards.add(new Card(Suit.hearts, Rank.jack));
		cards.add(new Card(Suit.spades, Rank.jack));
		cards.add(new Card(Suit.clubs, Rank.queen));
		cards.add(new Card(Suit.diamonds, Rank.queen));
		cards.add(new Card(Suit.hearts, Rank.queen));
		cards.add(new Card(Suit.spades, Rank.queen));
		cards.add(new Card(Suit.clubs, Rank.king));
		cards.add(new Card(Suit.diamonds, Rank.king));
		cards.add(new Card(Suit.hearts, Rank.king));
		cards.add(new Card(Suit.spades, Rank.king));
		cards.add(new Card(Suit.clubs, Rank.ace));
		cards.add(new Card(Suit.diamonds, Rank.ace));
		cards.add(new Card(Suit.hearts, Rank.ace));
		cards.add(new Card(Suit.spades, Rank.ace));
	}

}
