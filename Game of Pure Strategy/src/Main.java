import javafx.application.Application;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Main extends Application {
 
    static List d = new ArrayList<>();
    static List p = new ArrayList<>();
    static List a = new ArrayList<>();
    static Deck deck = new Deck("Clubs", d);
    static Deck playerHand = new Deck("Hearts", p);
    static Deck cpuHand = new Deck("Diamonds", a);
    static int turn = 1;
    
    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        deck.setDeck(13);
        System.out.println();
        playerHand.setDeck(13);
        int card = deck.flipCard();
        Image img = new Image(getCardNum(card));
        Image back = new Image("Cards/CardBack.jpg");
        ImageView viewBack = new ImageView(back);
        ImageView view = new ImageView(img);
        Button flip = new Button("Flip");
        flip.setMaxWidth(100);
        flip.setMaxHeight(200);
        view.setX(560); 
        view.setY(300); 
        view.setFitHeight(80);
        view.setPreserveRatio(true);
        viewBack.setX(480); 
        viewBack.setY(300); 
        viewBack.setFitHeight(80);
        viewBack.setPreserveRatio(true);
        flip.setOnAction(value ->  {
           if(deck.getCurrentSize() > 0)
           {
               int newCard = deck.flipCard();
               Image image = new Image(getCardNum(newCard));
               view.setImage(image);
               if(deck.getCurrentSize() == 0)
               {
                   viewBack.setImage(null);
               }
           }
         });
        Group root = new Group(view, viewBack, flip);
        Scene scene = new Scene(root, 1280, 720, Color.WHITE);
        stage.setTitle("Button Graphics");
        stage.setScene(scene);
        stage.show();
    }
    
    public String getCardNum(int n)
    {
        String s = "Cards/";
        if(n == 1)
        {
            return s += "ace_of_clubs.png";
        }
        if(n == 11)
        {
            return s += "jack_of_clubs.png";
        }
        if(n == 12)
        {
            return s += "queen_of_clubs.png";
        }
        if(n == 13)
        {
            return s += "king_of_clubs.png";
        }
        return s += String.valueOf(n) + "_of_clubs.png";
    }
    
    public static void gameStart() {
        //this method will be called when the start button is clicked
        //calls stage builder setup and creates initial decks and hands
    }

    public static void gameTurn() {
        //function for calling next point-card
        //function for taking player's bet
        //function for taking ai's bet
        //function for bet comparison / round win

        //test
        if(turn == 1) {
            turn = 2;
        }
        else {
            turn = 1;
        }
        gameTurn();
    }
}
