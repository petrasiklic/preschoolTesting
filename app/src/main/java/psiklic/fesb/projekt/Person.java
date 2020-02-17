package psiklic.fesb.projekt;

public class Person {
    private int id, weight, height;
    private String name, lastName, email, address, parent_name, contact, checkbox;


    public Person(int id, String name, String lastName, String email, String address,
                  String parent_name, String contact, int weight, int height, String checkbox)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.parent_name = parent_name;
        this.contact = contact;
        this.weight = weight;
        this.height = height;
        this.checkbox = checkbox;
    }

    public int getId() { return id; }

    public void setId(int id){ this.id = id; }

    public String getName(){ return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }
}
