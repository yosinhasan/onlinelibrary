package onlinelibrary.objects;

public class Publisher implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7427700395674616996L;
	private String name;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
