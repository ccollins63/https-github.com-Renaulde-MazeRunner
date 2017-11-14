import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.ImageView;

public class MazeGUI extends Application
{
    int[][] maze = new int[][]
            {
                    {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                    {0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
                    {0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0},
                    {0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0},
                    {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
                    {0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
                    {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
            };

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception
    {
        BorderPane border = new BorderPane();
        GridPane gridPane = new GridPane();

        border.setCenter(gridPane);
        Rectangle rec = new Rectangle();
        rec.setFill(Color.GREEN);

        for (int row = 0; row < maze.length; row++)
        {
            for (int column = 0; column < maze[row].length; column++)
            {
                switch(maze[row][column])
                {
                    case 0:
                    {
                        ImageView bushWall = new ImageView(new Image("https://vignette4.wikia.nocookie.net/deathbattlefanon/" +
                                "images/c/cf/Harry_Potter.png/revision/latest?cb=20151117161832"));
                        bushWall.setFitHeight(5);
                        bushWall.setFitWidth(5);
                        gridPane.add(bushWall, row, column);
                        break;
                    }

                    case 1:
                    {
                        break;
                    }

                    case 2:
                    {
                        ImageView harryPotter = new ImageView(new Image("https://vignette4.wikia.nocookie.net/deathbattlefanon/" +
                                "images/c/cf/Harry_Potter.png/revision/latest?cb=20151117161832"));
                        harryPotter.setFitHeight(5);
                        harryPotter.setFitWidth(5);
                        gridPane.add(harryPotter, row, column);
                        break;
                    }

                    case 3:
                    {
                        ImageView trail = new ImageView(new Image("http://1000logos.net/wp-content/uploads/2017/02/Harry-Potter-symbol.png"));
                        trail.setFitHeight(5);
                        trail.setFitWidth(5);
                        gridPane.add(trail, row, column);
                        break;
                    }
                }
            }
        }

            Scene scene = new Scene(border, 50, 50);
            primaryStage.setTitle("MazeRunner");
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
