package givens_4_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author agivens
 */
public class Givens_4_MethodMadness extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Givens JavaFX Project");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 450);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawPawsAndHead(gc);
        drawEars(gc);
        drawEyes(gc);
        drawNose(gc);
        drawWhiskers(gc);
        drawMouth(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawPawsAndHead(GraphicsContext gc) {
        gc.setFill(Color.POWDERBLUE);
        gc.setStroke(Color.AQUAMARINE);
        gc.fillRoundRect(100, 390, 100, 60, 45, 45);
        gc.strokeRoundRect(100, 390, 100, 60, 45, 45);
        gc.fillRoundRect(400, 390, 100, 60, 45, 45);
        gc.strokeRoundRect(400, 390, 100, 60, 45, 45);
        gc.fillRoundRect(200, 280, 200, 150, 40, 45);
        gc.strokeRoundRect(200, 280, 200, 150, 40, 45);
    }
    
    private void drawEars(GraphicsContext gc) {
        gc.fillPolygon(new double[]{210, 240, 270},
                new double[]{280, 230, 280}, 3);
         gc.strokePolygon(new double[]{210, 240, 270},
                new double[]{280, 230, 280}, 3);
         gc.fillPolygon(new double[]{325, 355, 385},
                new double[]{280, 230, 280}, 3);
         gc.strokePolygon(new double[]{325, 355, 385},
                new double[]{280, 230, 280}, 3);
    }
    
    private void drawEyes(GraphicsContext gc) {
        gc.setFill(Color.ALICEBLUE);
        gc.fillOval(330, 300, 40, 50);
        gc.fillOval(230, 300, 40, 50);
        gc.setFill(Color.BLACK);
        gc.fillOval(345, 300, 20, 30);
        gc.fillOval(245, 300, 20, 30);
    }
    
    private void drawNose(GraphicsContext gc) {
        gc.setFill(Color.PINK);
        gc.fillPolygon(new double[]{280, 300, 320},
                new double[]{380, 350, 380}, 3);
    }
    
    private void drawWhiskers(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.strokeLine(283, 375, 263, 355);
        gc.strokeLine(283, 375, 263, 375);
        gc.strokeLine(320, 375, 340, 375);
        gc.strokeLine(320, 375, 340, 355);
    }
    
    private void drawMouth(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.strokeArc(215, 380, 100, 30, 10, -70, ArcType.OPEN);
    }
}
