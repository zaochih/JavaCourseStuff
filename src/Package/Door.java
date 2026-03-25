package Package;

public class Door {
    private boolean isOpen = true;

    public void open () {
        if (isOpen) {
            IO.println("Door is already open.");
        } else {
            isOpen = true;
            IO.println("Door is opened.");
        }
    }
    public void close () {
        if (!isOpen) {
            IO.println("Door is already closed.");
        } else {
            isOpen = false;
            IO.println("Door is closed.");
        }
    }
}
