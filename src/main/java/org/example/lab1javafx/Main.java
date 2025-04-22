package org.example.lab1javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: lightgray;");

        Rectangle body = new Rectangle(150, 100, 100, 200);
        body.setFill(Color.BLUE);

        Rectangle leftArm = new Rectangle(100, 130, 50, 50);
        leftArm.setFill(Color.BLUE);

        Rectangle rightArm = new Rectangle(250, 130, 50, 50);
        rightArm.setFill(Color.BLUE);

        Rectangle leftLeg = new Rectangle(160, 300, 30, 50);
        leftLeg.setFill(Color.BLUE);

        Rectangle rightLeg = new Rectangle(210, 300, 30, 50);
        rightLeg.setFill(Color.BLUE);

        Rectangle leftEye = new Rectangle(180, 120, 30, 5);
        leftEye.setFill(Color.YELLOW);

        Rectangle rightEye = new Rectangle(220, 120, 30, 5);
        rightEye.setFill(Color.YELLOW);

        Polygon leftHorn = new Polygon(150, 100, 130, 80, 150, 60);
        leftHorn.setFill(Color.BLUE);

        Polygon rightHorn = new Polygon(250, 100, 270, 80, 250, 60);
        rightHorn.setFill(Color.BLUE);

        pane.getChildren().addAll(body, leftArm, rightArm, leftLeg, rightLeg, leftEye, rightEye, leftHorn, rightHorn);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Monster");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
