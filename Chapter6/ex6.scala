object Cards extends Enumeration {
	val Club = Value("♣")
	val Diamond = Value("♦")
	val Heart = Value("♥")
	val Spade = Value("♠")
}

for(card <- Cards.values) println(card)