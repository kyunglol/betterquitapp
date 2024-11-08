public class CigarettePerDay {
    private String date;
    private int count;

    CigarettePerDay(String date , int count){
        this.date=date;
        this.count=count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public String getDate() {
        return date;
    }
}
