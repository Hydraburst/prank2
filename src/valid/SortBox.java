package valid;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Comparator;
import java.util.stream.Collectors;

public class SortBox {
    public Scene start(Database database){


        VBox vbox = new VBox();
        HBox hBox = new HBox();

        ListView<String> list = new ListView<>();

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().addAll("name sort", "square sort", "pop sort");

        //Set a default value
        choiceBox.setValue("Choice an sort option");


        Button sortButton = new Button("sort");






        sortButton.setOnAction(e ->{

            String sort = choiceBox.getValue();
            Comparator<Country> comp = null;
            switch (sort) {
                case "name sort":
                    comp = new NameComparator();
                    break;
                case "square sort":
                    comp = new SquareComparator();
                    break;
                case "pop sort":
                    comp = new PopulationComparator();
                    break;
            }

            list.setItems(FXCollections.observableList(
                    database.sort(comp).stream()
                            .map(Country::getName)
                            .collect(Collectors.toList())
                    )
            );


        });

        hBox.getChildren().addAll(choiceBox,sortButton);

        vbox.getChildren().addAll(hBox,list);

        Scene scene = new Scene(vbox, 500, 200);
        return scene;

    }
}
