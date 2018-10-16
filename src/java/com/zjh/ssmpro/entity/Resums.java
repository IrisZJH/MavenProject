package com.zjh.ssmpro.entity;

/**
 * Created by 18221 on 2018/10/12.
 */
public class Resums {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String school;
    private String experience;
    private String skill;
    private String hobby;
    private String advantage;
    private String weakness;
    private int vid;
    private int type;//默认为0,投递中为1，被查看为2，未通过为3

    public Resums() {
    }

    public Resums(String name, String sex, int age, String school, String experience, String skill, String hobby, String advantage, String weakness, int vid) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
        this.experience = experience;
        this.skill = skill;
        this.hobby = hobby;
        this.advantage = advantage;
        this.weakness = weakness;
        this.vid = vid;
    }

    public Resums(int id, String name, String sex, int age, String school, String experience, String skill, String hobby, String advantage, String weakness, int vid) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
        this.experience = experience;
        this.skill = skill;
        this.hobby = hobby;
        this.advantage = advantage;
        this.weakness = weakness;
        this.vid = vid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Resums{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", experience='" + experience + '\'' +
                ", skill='" + skill + '\'' +
                ", hobby='" + hobby + '\'' +
                ", advantage='" + advantage + '\'' +
                ", weakness='" + weakness + '\'' +
                ", vid=" + vid +
                ", type=" + type +
                '}';
    }
}
