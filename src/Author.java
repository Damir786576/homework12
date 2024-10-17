public class Author {
    private final String FirstName;
    private final String SurName;

    public Author(String FirstName, String SurName) {
        this.FirstName = FirstName;
        this.SurName = SurName;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getSurName() {
        return SurName;
    }
    public String toString() {
        return FirstName + " " + SurName;
    }
}
