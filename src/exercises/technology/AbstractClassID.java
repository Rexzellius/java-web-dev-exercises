package exercises.technology;

public abstract class AbstractClassID {
    private final int abstractId;
    private static int nextAbstractID = 1;

    public AbstractClassID() {
        this.abstractId = nextAbstractID;
        nextAbstractID++;
    }

    public int getId() {
        return abstractId;
    }
}
