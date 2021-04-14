package ami.controllers;

import ami.Main;
import ami.models.Task;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class MainSceneController {

    private Main mainApp;

    public TableView<Task> taskTableView;
    public TableColumn<Task, Long> taskIdColumn;
    public TableColumn<Task, String> taskTitleColumn;
    public Button deleteTaskButton;
    public Button editTaskButton;
    public Button addTaskButton;
    public Text descriptionText;
    public Text titleText;
    public Text statusText;
    public Text compDateText;
    public Text tagsText;
    public Text categoriesText;

    public void initialize(){}

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}
