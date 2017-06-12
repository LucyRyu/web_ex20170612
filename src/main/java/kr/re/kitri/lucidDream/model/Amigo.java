package kr.re.kitri.lucidDream.model;

/**
 * Created by danawacomputer on 2017-06-12.
 */
public class Amigo {
    private String amigoName;
    private String amigoPhone;
    private String amigoEmail;

    @Override
    public String toString() {
        return "Amigo{" +
                "amigoName='" + amigoName + '\'' +
                ", amigoPhone='" + amigoPhone + '\'' +
                ", amigoEmail='" + amigoEmail + '\'' +
                '}';
    }

    public String getAmigoName() {
        return amigoName;
    }

    public void setAmigoName(String amigoName) {
        this.amigoName = amigoName;
    }

    public String getAmigoPhone() {
        return amigoPhone;
    }

    public void setAmigoPhone(String amigoPhone) {
        this.amigoPhone = amigoPhone;
    }

    public String getAmigoEmail() {
        return amigoEmail;
    }

    public void setAmigoEmail(String amigoEmail) {
        this.amigoEmail = amigoEmail;
    }
}
