package valid;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.stream.Collectors;

public class SquareSearchBox {
    public Scene start(Database database) {

        VBox vbox = new VBox();



        TextField squareInput = new TextField();


        Button dothatButton = new Button("Find");
        GridPane.setConstraints(dothatButton, 1, 2);

        ListView<String> list = new ListView<String>();


        dothatButton.setOnAction(e -> {
            double sqr = Double.parseDouble(squareInput.getText());

            list.setItems(FXCollections.observableList(
                    database.findAllWhereSquareBiggerThan(sqr).stream()
                            .map(Country::getName)
                            .collect(Collectors.toList())
                    )
            );

        });


        vbox.getChildren().addAll(squareInput, dothatButton, list);

        Scene scene = new Scene(vbox, 500, 200);
        return scene;

    }

}
