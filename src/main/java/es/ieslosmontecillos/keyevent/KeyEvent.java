package es.ieslosmontecillos.keyevent;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class KeyEvent extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        StackPane pane = new StackPane();



        Text text = new Text(20,20,"A");
        pane.getChildren().add(text);
        scene.setRoot(pane);

        scene.setOnKeyPressed(event -> {

            KeyCode kC =event.getCode();

            switch (kC){
                case UP:
                   text.setTranslateY(text.getTranslateY()-10);
                    break;
                    case DOWN:
                        text.setTranslateY(text.getTranslateY()+10);
                        break;
                        case LEFT:
                            text.setTranslateX(text.getTranslateX()-10);
                            break;
                            case RIGHT:
                                text.setTranslateX(text.getTranslateX()+10);
                                break;
                                default:
                                    text.setText(event.getText());
                                    break;
            }

        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}