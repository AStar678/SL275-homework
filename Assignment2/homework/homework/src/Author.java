public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name,String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
