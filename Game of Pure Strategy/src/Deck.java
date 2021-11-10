import java.util.ArrayList;
import java.util.List;

public class Deck {
    String suit;
    List deck = new ArrayList<>();
    public Deck(String suit, List deck)
    {
        this.suit = suit;
        this.deck = deck;
    }
    
    public void setSuit(String s)
    {
        suit = s;
    }
    
    public String getSuit()
    {
        return suit;
    }

    public List setDeck(int n)
    {
       if(n > 0)
       {
           deck.add(n);
           System.out.print(n + ", ");
           setDeck(n-1);
       }
       return deck;
    }
    
    public int flipCard()
    {
        int random = (int) Math.floor(Math.random() * deck.size());
        int card = (int)deck.get(random);
        deck.remove(random);
        return card;
    }
    
    public String toString()
    {
        String str = "";
        for(int i = 0; i < deck.size(); i++)
        {
            str += deck.get(i).toString() + ", ";
        }
        return str;
    }
}
