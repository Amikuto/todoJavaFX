package ami.models;

import javafx.beans.property.*;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.List;

public class Task {

    private final LongProperty id;
    private final ObjectProperty<LocalDate> complDate;
    private final StringProperty description;
    private final BooleanProperty status;
    private final StringProperty title;
    private final ListProperty<Category> categories;
    private final ListProperty<Tag> tags;

    public Task(Long id, LocalDate complDate, String description, Boolean status, String title, List<Category> categories, List<Tag> tags) {
        this.id = new SimpleLongProperty(id);
        this.complDate = new SimpleObjectProperty<>(complDate);
        this.description = new SimpleStringProperty(description);
        this.status = new SimpleBooleanProperty(status);
        this.title = new SimpleStringProperty(title);
        this.categories = new SimpleListProperty<>((ObservableList<Category>) categories);
        this.tags = new SimpleListProperty<>((ObservableList<Tag>) tags);
    }

    public Task(Long id, LocalDate complDate, String description, Boolean status, String title) {
        this.id = new SimpleLongProperty(id);
        this.complDate = new SimpleObjectProperty<>(complDate);
        this.description = new SimpleStringProperty(description);
        this.status = new SimpleBooleanProperty(status);
        this.title = new SimpleStringProperty(title);
        this.categories = new SimpleListProperty<>(null);
        this.tags = new SimpleListProperty<>(null);
    }

    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public LocalDate getComplDate() {
        return complDate.get();
    }

    public ObjectProperty<LocalDate> complDateProperty() {
        return complDate;
    }

    public void setComplDate(LocalDate complDate) {
        this.complDate.set(complDate);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public boolean isStatus() {
        return status.get();
    }

    public BooleanProperty statusProperty() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status.set(status);
    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public ObservableList<Category> getCategories() {
        return categories.get();
    }

    public ListProperty<Category> categoriesProperty() {
        return categories;
    }

    public void setCategories(ObservableList<Category> categories) {
        this.categories.set(categories);
    }

    public ObservableList<Tag> getTags() {
        return tags.get();
    }

    public ListProperty<Tag> tagsProperty() {
        return tags;
    }

    public void setTags(ObservableList<Tag> tags) {
        this.tags.set(tags);
    }
}
