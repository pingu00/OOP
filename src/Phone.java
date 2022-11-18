import java.util.*;

class Phone {
    private String name;
    private String address;
    private String phoneNumber;
    public Phone(String address, String phoneNumber) {
        this.address = address; this.phoneNumber = phoneNumber;
    }
    public Phone() {}
    // 삽입
    void setName(String name) {this.name = name;}
    void setAddress(String address) {this.address = address;}
    void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    void insertAddress(Scanner s) {setAddress(s.next());}
    void insertPhoneNumber(Scanner s) {setPhoneNumber(s.next());}
    // 삭제
    void deleteName() {this.name = null;}
    void deleteAddress() {this.address = null;}
    void deletePhoneNumber() {this.phoneNumber = null;}
    // 찾기, 전체보기
    String getName() {return name;}
    String getAddress() {return address;}
    String getPhoneNumber() {return phoneNumber;}
    void printName() {System.out.println(getName() + " ");}
    void printAddress() {System.out.println(getAddress() + " ");}
    void printPhoneNumber() {System.out.println(getPhoneNumber() + " ");}
    void printAll() {
        System.out.println(getName() + " " + getAddress() + " " + getPhoneNumber());
    }
}

