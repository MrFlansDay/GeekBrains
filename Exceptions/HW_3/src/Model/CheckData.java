package Model;

import java.util.Date;
import java.util.Objects;

public class CheckData {
    ParseData parseData;
    String[] name;
    Date birthDate;
    long phone;


    public void checkAllData(String name, String birthDate, String phone) throws Exception {
        parseData = new ParseData();
        checkCount(name, birthDate, phone);
        this.name = checkParseName(name);
        this.birthDate = checkParseDate(birthDate);
        this.phone = checkParsePhone(phone);

    }

    private void checkCount(String name, String birthDate, String phone) throws Exception {
        if (Objects.equals(name, "") || Objects.equals(birthDate, "") || Objects.equals(phone, ""))
            throw new Exception("Not all data entered");
    }

    private String[] checkParseName(String name) throws Exception {
        return parseData.parseName(name);
    }

    private Date checkParseDate(String birthDate) throws Exception {
        return parseData.parseDate(birthDate);
    }

    private long checkParsePhone(String phone) throws Exception {
        return parseData.parsePhone(phone);
    }

}
