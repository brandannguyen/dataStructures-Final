import javafx.application.Application;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Main extends Application {
 
    static Queue<String> deck = new LinkedList<>();
    
    public static void main(String[] args)
    {
        List d = new ArrayList<>();
        Deck deck = new Deck("Clubs", d);
        d = deck.setDeck(13);
        launch(args);
    }
    
   

    public void start(Stage stage) throws Exception {
        
    }
    
    
    public static void createHand(String suit, int n)
    {
        for(int i = 0; i < n; i++)
        {
            
        }
    }
    
    public void play()
    {
        
    }
}
