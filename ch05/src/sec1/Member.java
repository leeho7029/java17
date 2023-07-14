package sec1;

public class Member {
    private String name = "kim"; //기본값으로 kim 설정
    private String age; //
    private String tel; //
    private String address;

    public Member() { }


    public Member(String name, String age, String tel, String address) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
