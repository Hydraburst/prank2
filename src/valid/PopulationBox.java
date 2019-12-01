package valid;


import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.stream.Collectors;

public class PopulationBox {


    public Scene start(Database database) {


        VBox vBox = new VBox();


        TextField nameInput = new TextField();
        ListView<String> list = new ListView<>();


        Button dothatButton = new Button("Find");
        GridPane.setConstraints(dothatButton, 1, 2);


        dothatButton.setOnAction(e -> {
            int pop = Integer.parseInt(nameInput.getText());
            list.setItems(FXCollections.observableList(
                    database.remove(pop).stream()
                            .map(Country::getName)
                            .collect(Collectors.toList())
                    )
            );

        });


        vBox.getChildren().addAll(nameInput, dothatButton,list);

        Scene scene = new Scene(vBox, 500, 200);
        return scene;

    }


}
