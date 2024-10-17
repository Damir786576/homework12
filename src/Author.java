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

    @Override
    public String toString() {
        return FirstName + " " + SurName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return FirstName.equals(author.FirstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(FirstName);
    }

}
