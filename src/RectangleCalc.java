import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
/**
 * Created by dsm2404 on 3/1/2017.
 * Purpose: Calculate area/perimeter of a rectangle based on user input
 */
public class RectangleCalc extends Application {
    public void start(Stage primaryStage){ //sets stage for javafx
        TextInputDialog input= new TextInputDialog();
        input.setTitle("Rectangle perimeter/area");
        input.setContentText("enter the height of the rectangle");// allows user input 
        input.showAndWait();//shows stage and waits for it to be hidden

        String width = input.getResult();//gets result of the property input
        double doublewidth = Double.parseDouble(width);// creates width into string
        input.setContentText("Enter the width of the rectangle");
        input.showAndWait();
        String height = input.getResult();
        double doubleheight = Double.parseDouble(height);
        /*
         * Sets up variables and calculations 
         */
        double area;
        area=doublewidth*doubleheight;
        double perimeter =2*(doublewidth+doubleheight);
        // generates output and result for previous inputs
        Alert output=new Alert(Alert.AlertType.INFORMATION);
        output.setContentText("The area of the rectangle is "+area +"\n" +"The perimeter of the rectangle is " +perimeter);
        output.showAndWait();

    }
    // Launches application
    public static void main(String[] args) {
        Application.launch(args);


    }


}


