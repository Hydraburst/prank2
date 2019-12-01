package valid;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CountryBase extends Application {


    Stage window;
    Scene scene;
    Button button;
    private Database database;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        {
            database = new Database();

        database.add(new Country("Brazil", "Brasilia", Continents.SOUTH_AMERICA, 207353391, 8515767, 1));
        database.add(new Country("USA", "Washington", Continents.NORTH_AMERICA, 328915700, 9519431, 2));
        database.add(new Country("Ukraine", "Kyiv", Continents.EUROPE, 41840426, 6035491, 3));
        database.add(new Country("Bulgaria", "Sofia", Continents.EUROPE, 7000000, 110994, 4));
        database.add(new Country("Moldova", "Kishinev", Continents.EUROPE, 3550900, 33846, 5));
        database.add(new Country("Russia", "Moscow", Continents.EUROPE, 146793744, 17098246, 6));
        database.add(new Country("Austria", "Vienna", Continents.EUROPE, 8857960, 83879, 7));
        database.add(new Country("Poland", "Warsaw", Continents.EUROPE, 37972812, 312696, 8));
        database.add(new Country("France", "Paris", Continents.EUROPE, 67022000, 640679, 9));
        database.add(new Country("Spain", "Madrid", Continents.EUROPE, 46733038, 505990, 10));
        }

        window = primaryStage;
        window.setTitle("Main");
        button = new Button("Do that");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().addAll("Removing from the database all countries with less than than given population", "Search by the name of the capital",
                "Search for occupied square over a given", "Providing information about the states of a given continent with a choice of sorting method");


        //Set a default value
        choiceBox.setValue("Choice an option");

        button.setOnAction(e -> getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        scene = new Scene(layout, 500, 250);
        window.setScene(scene);
        window.show();

    }

    private void getChoice(ChoiceBox<String> choiceBox) {
        String option = choiceBox.getValue();

        switch (option) {

            case "Removing from the database all countries with less than than given population":
                window.setScene(new PopulationBox().start(database));
                break;

            case "Search by the name of the capital":
                window.setScene(new CapitalSearchBox().start(database));
                break;

            case "Search for occupied square over a given":
                window.setScene(new SquareSearchBox().start(database));
                break;
            case "Providing information about the states of a given continent with a choice of sorting method":
                window.setScene(new SortBox().start(database));
                break;




        }
    }


}
