package UCNC.com.Mlyn;

public class Index {

    private String message;
    private String name;


    public Index(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Index{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
