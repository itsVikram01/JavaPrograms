package java_codes.oops.inheritance;

public class Book extends Product{
    // Getters and Setters for author and numPages
    private String author = "xyz";
    private int numPages = 10;

    @Override // Explicitly mark this as overriding
    public void displayDetails() {
        super.displayDetails(); // Call parent class displayDetails
        System.out.println("Author: " + author + ", Pages: " + numPages);
    }
}
