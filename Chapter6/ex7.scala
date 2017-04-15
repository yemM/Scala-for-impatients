object Card extends Enumeration {
	type Card = Value

	val Club = Value("♣")
	val Diamond = Value("♦")
	val Heart = Value("♥")
	val Spade = Value("♠")
}

import Card._
def isBlack(card: Card) = card == Club || card == Spade

println(isBlack(Card.Club))
println(isBlack(Card.Diamond))
println(isBlack(Card.Heart))
println(isBlack(Card.Spade))
