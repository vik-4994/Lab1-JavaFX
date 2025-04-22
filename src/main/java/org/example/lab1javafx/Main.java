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

        Rectangle head = new Rectangle(160, 100, 80, 50);
        head.setFill(Color.rgb(128, 0, 255));

        Rectangle body = new Rectangle(125, 150, 150, 100);
        body.setFill(Color.rgb(128, 0, 255));

        Rectangle leftArm = new Rectangle(90, 150, 60, 75);
        leftArm.setFill(Color.rgb(128, 0, 255));

        Rectangle rightArm = new Rectangle(250, 150, 60, 65);
        rightArm.setFill(Color.rgb(128, 0, 255));

        Rectangle leftLeg = new Rectangle(125, 250, 45, 80);
        leftLeg.setFill(Color.rgb(128, 0, 255));

        Rectangle rightLeg = new Rectangle(235, 250, 40, 80);
        rightLeg.setFill(Color.rgb(128, 0, 255));

        Rectangle leftEye = new Rectangle(185, 120, 7.5, 7.5);
        leftEye.setFill(Color.YELLOW);

        Rectangle rightEye = new Rectangle(215, 120, 7.5, 7.5);
        rightEye.setFill(Color.YELLOW);

        Rectangle leftFoot = new Rectangle(170, 310, 10, 20);
        leftFoot.setFill(Color.rgb(128, 0, 255));

        Rectangle rightFoot = new Rectangle(275, 310, 10, 20);
        rightFoot.setFill(Color.rgb(128, 0, 255));

        Polygon leftHorn = new Polygon(162, 100, 162, 70, 135, 85);
        leftHorn.setFill(Color.BLUE);

        Polygon rightHorn = new Polygon(238, 100, 270, 100, 240, 75);
        rightHorn.setFill(Color.BLUE);

        pane.getChildren().addAll(head, body, leftArm, rightArm, leftLeg, rightLeg, leftEye, rightEye, leftHorn, rightHorn, leftFoot, rightFoot);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Monster");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
