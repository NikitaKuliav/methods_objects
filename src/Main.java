public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Aleksandr", "Pushkin");
        Author author2 = new Author("Михаил", "Булгаков");
        Author author3 = new Author("Aleksandr", "Pushkin");
//
        Book book1 = new Book("Руслан и Людмила", author1, 1820);
        Book book2 = new Book("Мастер и Маргарита", author2, 1966);
        Book book3 = new Book("Руслан и Людмила", author1, 1820);
//
//        System.out.println("Первая книга = " + book1.getBookTitle());
//        System.out.println("Имя автора второй книги = " + book2.getAuthor().getName());
//        System.out.println("Год издания первой книги = " + book1.getPublishYear());
//
//        book1.setPublishYear(1822);
//
//        System.out.println("Год издания первой книги после изменения = " + book1.getPublishYear());
        System.out.println(author1);
        System.out.println(author1.hashCode());
        System.out.println(author1.equals(author3));
        System.out.println("-----------------------");
        System.out.println(book1);
        System.out.println(book1.hashCode());
        System.out.println(book1.equals(book3));

    }
}