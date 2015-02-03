package com.codethesis.pokerutils;

public enum Rank {
	
	two(2, 2, '2'),
	three(3, 3, '3'),
	four(4, 4, '4'),
	five(5, 5, '5'),
	six(6, 6, '6'),
	seven(7, 7, '7'),
	eight(8, 8, '8'),
	nine(9, 9, '9'),
	ten(10, 10, 'T'),
	jack(11, 2, 'J'),
	queen(12, 2, 'Q'),
	king(13, 2, 'K'),
	ace(14, 1, 'A');
	
	private final int primaryPosition;
	
	private final int secondaryPosition;
	
	private final char symbol;
	
	Rank(int primaryPosition, int secondaryPosition, char symbol) {
		this.primaryPosition = primaryPosition;
		this.secondaryPosition = secondaryPosition;
		this.symbol = symbol;
	}
	
	public int getPosition() {
		return getPosition(true);
	}
	
	public int getPosition(boolean primary) {
		return primary ? primaryPosition : secondaryPosition;
	}
	
	public char getSymbol() {
		return symbol;
	}
	
}
