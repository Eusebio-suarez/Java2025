package people;

public class Patient extends Person{
    //attributes
    String document;
    String eps;
    String phoneNum;
    String address;

    //constructor
    public Patient(String document,String eps,String phoneNum,String address,String name, String gender, int ege) {
        super(name, gender, ege);
        this.document = document;
        this.eps = eps;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    //getters and setters
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //show the information
    @Override
    public String toString() {
        return super.toString()+
                "Patient{" +
                "document='" + document + '\'' +
                ", eps='" + eps + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
