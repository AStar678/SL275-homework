public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name,Author[] authors,double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name,Author[] authors,double price,int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String[] getAuthorNames(){
        String[] nameList = new String[authors.length];
        for (int index = 0;index < authors.length;index ++){
            nameList[index] = authors[index].getName();
        }
        return nameList;
    }

    public String toString(){

        StringBuilder authorStr = new StringBuilder();
        authorStr.append("{");
        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                authorStr.append(",");
            }
            authorStr.append(authors[i].toString());
        }
        authorStr.append("}");

        return "Book[name=" + name + ",authors=" + authorStr + ",price=" + price + ",qty=" + qty + "]";

    }
    
}
