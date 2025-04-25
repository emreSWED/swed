public class Developer {
    private String name;
    private int age;
    private String language;
    private int experience;
    private String level;

    public Developer(String name, int age, String language, int experience, String level) {
        setName(name);
        setAge(age);
        setLanguage(language);
        setExperience(experience);
        setLevel(level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) this.name = name;
        else throw new IllegalArgumentException("Name cannot be empty.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else throw new IllegalArgumentException("Age must be positive.");
    }

    public void setLanguage(String language) {
        if (!language.isEmpty()) this.language = language;
        else throw new IllegalArgumentException("Language cannot be empty.");
    }

    public void setExperience(int experience) {
        if (experience >= 0) this.experience = experience;
        else throw new IllegalArgumentException("Experience cannot be negative.");
    }

    public void setLevel(String level) {
        if (level.matches("Junior|Mid-Level|Senior")) this.level = level;
        else throw new IllegalArgumentException("Level must be Junior, Mid-Level or Senior.");
    }

}
