package Goods;

public class Goods {
    private String id;

    public Goods(String id, String name, int remains) {
        this.id = id;
        this.name = name;
        this.remains = remains;
    }

    public Goods () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRemains() {
        return remains;
    }

    public void setRemains(int remains) {
        this.remains = remains;
    }

    private String name;
    private int remains;

    public String toString () {
        return "Goods [" + id + ", " + name + ", " + remains + "]";
    }
}
