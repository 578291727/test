package com.springboottest.test.been;

/**
 @author 彭伟
 @version 1.0 */
public class informayion {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String name;

    @Override
    public String toString() {
        return "informayion{" + "name='" + name + '\'' + ", age=" + age + ", hight='" + hight + '\'' + ", sex='" + sex + '\'' + '}';
    }

    private Integer age;
    private String hight;
    private String sex;

}
