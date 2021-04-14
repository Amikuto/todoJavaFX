package ami;

import ami.controllers.MainSceneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
//        Parent root = FXMLLoader.load(getClass().getResource("/views/initRootLayout.fxml"));
        primaryStage.setTitle("TODO application");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();

        initRootLayout();

    }

    public void initRootLayout() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/initRootLayout.fxml"));
        rootLayout = loader.load();

        Scene scene = new Scene(rootLayout);
        this.primaryStage.setScene(scene);

        primaryStage.show();
    }

    public void showMainScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Main.class.getResource("/views/MainScene.fxml"));
        AnchorPane mainScene = fxmlLoader.load();

        Scene scene = new Scene(mainScene);
        rootLayout.setCenter(mainScene);

        MainSceneController mainSceneController = new MainSceneController();
        fxmlLoader.setController(mainSceneController);
        mainSceneController.setMainApp(this);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
