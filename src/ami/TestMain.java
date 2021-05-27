package ami;

import ami.models.Task;
import ami.request.TaskRequest;

import java.io.IOException;

public class TestMain {
    public static void main(String[] args) throws IOException {
        System.out.println(TaskRequest.getAllTasks().get(1).getTitle());
    }
}
