package domain;

public class Calendar {
    private  int competition_id;
    private  String competition_name;
    private  String competition_short_name;
    private  int edition_id;
    private  int edition_name;
//    private final String events;

    public void setCompetition_id(int competition_id) {
        this.competition_id = competition_id;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public void setCompetition_short_name(String competition_short_name) {
        this.competition_short_name = competition_short_name;
    }

    public void setEdition_id(int edition_id) {
        this.edition_id = edition_id;
    }

    public void setEdition_name(int edition_name) {
        this.edition_name = edition_name;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "competition_id=" + competition_id +
                ", competition_name='" + competition_name + '\'' +
                ", competition_short_name='" + competition_short_name + '\'' +
                ", edition_id=" + edition_id +
                ", edition_name=" + edition_name +
                '}';
    }
}
