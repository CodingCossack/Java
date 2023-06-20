// Program to represent enum constants in String.

// create an enum of type Card
enum Card{
    
    // constant values
    CLUB, DIAMOND, SPADE, HEART;
}

class Main {
    public static void main(String[] args) {

        // create a variable cardType of String type
        String cardType;

        // convert the constant DIAMOND in String 
        cardType = Card.DIAMOND.toString();

        // print cardType
        System.out.println(cardType);
    }
}



