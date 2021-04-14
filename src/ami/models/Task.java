package ami.models;

import javafx.beans.property.*;
//import lombok.Data;

import java.util.Date;

//@Data
public class Task {

    LongProperty id;
    ObjectProperty<Date> complDate;
    StringProperty description;
    BooleanProperty status;
    StringProperty title;
}
