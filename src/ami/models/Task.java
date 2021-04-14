package ami.models;

import javafx.beans.property.*;

import java.util.Date;

public class Task {

    LongProperty id;
    ObjectProperty<Date> complDate;
    StringProperty description;
    BooleanProperty status;
    StringProperty title;
}
