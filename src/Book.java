public class Book {
    String author;
    String title;

    public int hashCode() {
        int result = 17;
        result = 31 * result + author.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Book other)) {
            return false;
        }
        return author.equals(other.author) && title.equals(other.title);
    }
}
