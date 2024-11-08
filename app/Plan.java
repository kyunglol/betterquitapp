public class Plan {
    private String steps;
    private String date;

    Plan(String steps , String date){
        this.steps=steps;
        this.date=date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getDate() {
        return date;
    }

    public String getSteps() {
        return steps;
    }
}
