package cute.coder.bean;

import java.util.Date;

/**
 * Created by cute coder
 * 2019/5/15 22:02
 */
public class MyUser {

    String username;

    Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
