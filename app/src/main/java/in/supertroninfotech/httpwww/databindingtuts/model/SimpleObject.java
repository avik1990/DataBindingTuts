package in.supertroninfotech.httpwww.databindingtuts.model;

/**
 * Created by User1 on 02-03-2018.
 */

public class SimpleObject {
    public String name;
    public String age;

    public SimpleObject(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
