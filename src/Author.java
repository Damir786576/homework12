public class Author {
    private final String nameFirst;
    private final String nameSecond;

    public Author(String FirstName, String SurName) {
        this.nameFirst = FirstName;
        this.nameSecond = SurName;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }

    @Override
    public String toString() {
        return nameFirst + " " + nameSecond;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        boolean isnameFirst = nameFirst.equals(author.nameFirst);
        boolean isnameSecond = nameSecond.equals(author.nameSecond);
        return isnameFirst && isnameSecond;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameFirst, nameSecond);
    }

}
