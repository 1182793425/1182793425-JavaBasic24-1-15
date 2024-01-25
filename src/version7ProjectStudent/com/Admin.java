package version7ProjectStudent.com;

public class Admin {
    private int user;
    private int password;

    public Admin() {
    }

    public Admin(int user, int password) {
        this.user = user;
        this.password = password;
    }

    /**
     * 获取
     * @return user
     */
    public int getUser() {
        return user;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(int user) {
        this.user = user;
    }

    /**
     * 获取
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    public String toString() {
        return "Admin{user = " + user + ", password = " + password + "}";
    }
}
