public class Author {
    private final String FirstName;
    private final String MiddleName;
    private final String LastName;

    public Author(String FirstName, String MiddleName, String LastName) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }
    public String getMiddleName() {
        return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }
}
