package in.co.healingcircle.healingcircle;

public class SwitchwordModel {

    int id;
    String heading, number, description;

    public SwitchwordModel() {
    }

    public SwitchwordModel(int id, String heading, String number, String description) {

        this.id = id;
        this.heading = heading;
        this.number = number;

        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
