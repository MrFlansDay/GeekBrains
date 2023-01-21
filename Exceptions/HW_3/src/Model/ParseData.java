package Model;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseData {
    public String[] parseName(String name) throws Exception {
        String[] str = name.split(" ");
        if (str.length < 3) throw new Exception("Invalid name entered");
        if (isAlpha(str[0]) && isAlpha(str[1]) && isAlpha(str[2]) && str.length == 3) return str;
        else throw new Exception("Invalid name entered");
    }

    public Date parseDate(String date) throws Exception {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.parse(date);
    }

    public long parsePhone(String phone) throws Exception {
        if (phone.length() != 11 || phone.toCharArray()[0] != '8') throw new Exception("Invalid phone entered");
        return Long.parseLong(phone);
    }


    private boolean isAlpha(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
