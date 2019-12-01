package valid;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CapitalSearchBox {


    public Scene start(Database database) {


        VBox vBox = new VBox();
        ListView<String> list = new ListView<>();

        TextField capitalInput = new TextField();


        Button dothatButton = new Button("Find");



        dothatButton.setOnAction(e -> {
            String capital = (capitalInput.getText());
            list.getItems().add(database.findAllByCapital(capital).getName());
        });


        vBox.getChildren().addAll(capitalInput, dothatButton,list);

        Scene scene = new Scene(vBox, 500, 200);
        return scene;

    }


}


