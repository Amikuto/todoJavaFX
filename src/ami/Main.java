package ami;

import ami.controllers.MainSceneController;
import ami.controllers.UserLoginPageController;
import ami.controllers.UserRegistrationPageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class Main extends Application {

    Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("TODO application");
        this.primaryStage.setMaximized(true);

        InputStream iconStream = getClass().getResourceAsStream("/icons/todo.jpeg");
        assert iconStream != null;
        Image image = new Image(iconStream);
        this.primaryStage.getIcons().add(image);

        initRootLayout();
        if (showLoginPage()) {
            showMainScene();
        }

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

        rootLayout.setCenter(mainScene);

        MainSceneController mainSceneController = new MainSceneController();
        fxmlLoader.setController(mainSceneController);
        mainSceneController.setMainApp(this);
    }

    public boolean showLoginPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/UserLoginPage.fxml"));
        AnchorPane loginPage = loader.load();

        Stage dialogStage = new Stage();
        dialogStage.setTitle("Вход");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(loginPage);
        dialogStage.setScene(scene);

        UserLoginPageController controller = loader.getController();
        controller.setDialogStage(dialogStage);
        controller.setMainApp(this);

        dialogStage.showAndWait();
        return controller.isLoginClicked();
    }

    public void showRegistrationPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/views/UserRegistrationPage.fxml"));
        AnchorPane registrationPage = loader.load();

        Stage dialogStage = new Stage();
        dialogStage.setTitle("Регистрация");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(registrationPage);
        dialogStage.setScene(scene);

        UserRegistrationPageController controller = loader.getController();
        controller.setDialogStage(dialogStage);

        dialogStage.showAndWait();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
