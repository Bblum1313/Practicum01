import java.util.Calendar;


public class Person {

        private String ID;
        private String fName;
        private String lName;
        private String title;
        private int yob;


    /**
     *
     * @param ID: ID of person
     * @param fName: first name of person
     * @param lName: last name of person
     * @param title: title of person
     * @param yob: persons year of birth
     */
    public Person(String ID, String fName, String lName, String title, int yob) {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.title = title;
        this.yob = yob;
    }

    public String fullName() {
        return fName + " " + lName;
    }
    public String formalName(String fullName){
        return title + " " + fullName;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getyob() {
        return yob;
    }

    public void setyob(int yob) {
        this.yob = yob;
    }
    public String getAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - yob;
        return String.valueOf(age);
    }

    public String getAge(int year) {
        int age = year - yob;
        return String.valueOf(age);
    }
    public String toCSV()
    {

        final char DQ = '\"';

        return(DQ + ID + DQ + ", " + DQ + fName + DQ + ", " +  DQ + lName +  DQ + ", " +  DQ + title + DQ + ", " + yob);

    }
}


