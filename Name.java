import java.util.Date;

public class Name {
    private String title;
    private String first;
    private String middle;
    private String surname;
    private String surnameParent1;
    private String surnameParent2;
    private String suffixGenerational; // e.g., III, Jr., Sr., etc.
    private String suffixProfessional; // e.g., Ph.D., CPA, etc.

    public Name (
                 String title,
                 String first,
                 String middle,
                 String surname,
                 String surnameParent1,
                 String surnameParent2,
                 String generational,
                 String professional
                 ) {
        this.title = title;
        this.first = first;
        this.middle = middle;
        this.surname = surname;
        this.surnameParent1 = surnameParent1;
        this.surnameParent2 = surnameParent2;
        this.suffixGenerational = generational;
        this.suffixProfessional = professional;
    }

    public String getTitle() {
        /* return Name's title */
        return this.title;
    }

    public String getFirst() {
        /* return Name's first name */
        return this.first;
    }

    public String getMiddle() {
        /* return Name's middle name */
        return this.middle;
    }

    public String getSurname() {
        /* return Name's last name */
        return this.surname;
    }

    public String getSurnameParent1() {
        /* return parent1's last name */
        return this.surnameParent1;
    }

    public String getSurnameParent2() {
        /* return parent2's last name */
        return this.surnameParent2;
    }

    public String getSuffixProfessional() {
    	/* return Name's professional suffix */
    	return this.suffixProfessional;
    }

    public String getSuffixGenerational() {
        /* return Name's generational suffix */
        return this.suffixGenerational;
    }
}
