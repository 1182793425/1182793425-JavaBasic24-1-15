package version7ProjectStudent.com;

public class STU {
    private int id;
    private String name;
    private int age;
    private String address;

    public STU() {
    }

    public STU(int id, String name, int age, String address) {
        if (id<=0||age<=0){
            System.out.println("id（数字）或者年龄有误");
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "STU{id = " + id + ", name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
