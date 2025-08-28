package survey.user;

import java.io.Serializable;

public class User implements Serializable {
	private String firstName;
    private String lastName;
    private String email;
    private String birthday;   // "Date of Birth"
    private String heardFrom;  // radio button
    private String[] wantsUpdates; // checkbox (có thể nhiều)
    private String[] emailOk;      // checkbox (có thể nhiều)
    private String[] contactVia;   // listbox / checkbox

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        birthday = "";
        heardFrom = "";
        wantsUpdates = new String[0];
        emailOk = new String[0];
        contactVia = new String[0];
    }

    public User(String firstName, String lastName, String email, String birthday, 
                String heardFrom, String[] wantsUpdates, String[] emailOk, String[] contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.emailOk = emailOk;
        this.contactVia = contactVia;
    }

    // Getters và Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }

    public String[] getWantsUpdates() { return wantsUpdates; }
    public void setWantsUpdates(String[] wantsUpdates) { this.wantsUpdates = wantsUpdates; }

    public String[] getEmailOk() { return emailOk; }
    public void setEmailOk(String[] emailOk) { this.emailOk = emailOk; }

    public String[] getContactVia() { return contactVia; }
    public void setContactVia(String[] contactVia) { this.contactVia = contactVia; }

    
}
