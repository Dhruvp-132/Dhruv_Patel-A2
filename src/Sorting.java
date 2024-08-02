// Sorting.java
import java.util.Comparator;

public interface Sorting<T> {
    // QueueInterface Methods
    void AddVisitorToQueue(Visitor visitor);

    void RemoveVisitorFromQueue(Visitor visitor);

    void PrintQueue();

    // CollectionInterface Methods
    void RunOneCycle();

    void PrintRideHistory();

    void sort(Comparator<T> comparator);
}
