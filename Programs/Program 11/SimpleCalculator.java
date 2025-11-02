import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class SimpleCalculator extends Application {
    TextField display = new TextField();
    double num1 = 0, num2 = 0, result = 0;
    String operator = "";
    boolean start = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setPrefHeight(50);

        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setPadding(new Insets(10));

        String[] keys = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+",
            "C"
        };

        int i = 0;
        for (String k : keys) {
            Button b = new Button(k);
            b.setPrefSize(60, 60);
            b.setOnAction(e -> handleButton(k));
            grid.add(b, i % 4, i / 4);
            i++;
        }

        VBox root = new VBox(10, display, grid);
        root.setPadding(new Insets(10));

        stage.setScene(new Scene(root, 270, 360));
        stage.setTitle("Simple Calculator");
        stage.show();
    }

    void handleButton(String value) {
        if (value.equals("C")) {
            display.clear();
            num1 = num2 = result = 0;
            operator = "";
            start = true;
            return;
        }

        if ("+-*/".contains(value)) {
            try {
                num1 = Double.parseDouble(display.getText());
                operator = value;
                display.clear();
            } catch (NumberFormatException e) {
                display.setText("Error");
                start = true;
            }
            return;
        }

        if (value.equals("=")) {
            try {
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = (num2 == 0) ? 0 : num1 / num2; break;
                default: result = num2; break;
                }
            }
            catch (NumberFormatException e) {
                display.setText("Error");
                start = true;
                return;
            }
            display.setText(String.valueOf(result));
            start = true;
            return;
        }

        // For numbers and decimal
        if (start) {
            display.clear();
            start = false;
        }
        display.appendText(value);
    }
}
