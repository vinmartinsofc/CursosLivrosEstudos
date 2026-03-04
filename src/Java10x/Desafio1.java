package Java10x;

public class Desafio1 {
    private String name;
    private int age;
    private String missionName;
    private String missionLevel;
    private boolean missionStatus;

    public Desafio1(String name, int age, String missionName, String missionLevel, boolean missionStatus) {
        this.name = name;
        this.age = age;
        this.missionName = missionName;
        this.missionLevel = missionLevel;
        if (age < 15) {
            this.missionStatus = false;
        } else {
            this.missionStatus = true;
        }
    }


    public void showNinjaStatus() {
        System.out.println("Ninja: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mission: " + missionName);
        System.out.println("Difficulty: " + missionLevel);
        System.out.println("Concluded? " + missionStatus);
        System.out.printf("%-10s%n", "**********");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionLevel() {
        return missionLevel;
    }

    public void setMissionLevel(String missionLevel) {
        this.missionLevel = missionLevel;
    }

    public boolean isMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(boolean missionStatus) {
        this.missionStatus = missionStatus;
    }
}
