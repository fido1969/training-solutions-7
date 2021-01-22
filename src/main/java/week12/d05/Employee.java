package week12.d05;

import java.util.List;

public class Employee {

    private int age;
    private int skillLevel;
    private String name;
    private List<String> skills;

    public Employee(int age, int skillLevel, String name, List<String> skills) {
        this.age = age;
        this.skillLevel = skillLevel;
        this.name = name;
        this.skills = skills;
    }

    public int getAge() {
        return age;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "skillLevel=" + skillLevel +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
