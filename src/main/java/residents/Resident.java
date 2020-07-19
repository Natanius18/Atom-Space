package residents;

public class Resident {
    private String name;
    private String skill;
    private String email;

    public Resident(String name, String skill, String email) {
        this.name = name;
        this.skill = skill;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

