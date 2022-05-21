public class Machine {
    private String name;
    private String type;
    private int prics;

    public Machine(String name, String type, int prics) {
        this.name = name;
        this.type = type;
        this.prics = prics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrics() {
        return prics;
    }

    public void getPrics(int prics) {
        this.prics = prics;
    }




}