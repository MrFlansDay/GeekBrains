package Model;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class SaveData {
    ParseData parseData;

    public SaveData () {
        parseData = new ParseData();
    }

    String save(String strName, String strBirthDate, String strPhone, Gender gender) throws Exception {
        String[] name = parseData.parseName(strName);
        Date birthDate = parseData.parseDate(strBirthDate);
        long phone = parseData.parsePhone(strPhone);
        File dir = new File("D://1//GeekBrains//Seminars//Exceptions//HW_3//Data");
        boolean flag = true;

        for(File item : Objects.requireNonNull(dir.listFiles())) {
            if (item.getName().equals(name[0] + ".txt")) flag = false;
        }

        if (flag) {
            try(FileWriter writer = new FileWriter(dir + "//" + name[0] + ".txt", false)) {
                writer.write(String.format("<%s><%s><%s><%td.%tm.%tY> <%d><%s>", name[0], name[1], name[2],
                        birthDate, birthDate, birthDate, phone, gender));
                return "OK";
            } catch (Exception e) {
                return Arrays.toString(e.getStackTrace());
            }
        } else {
            try(FileWriter writer = new FileWriter(dir + "//" + name[0] + ".txt", true)) {
                writer.write(String.format("\n<%s><%s><%s><%td.%tm.%tY> <%d><%s>", name[0], name[1], name[2],
                        birthDate, birthDate, birthDate, phone, gender));
                return "OK";

            } catch (Exception e) {
                return Arrays.toString(e.getStackTrace());
            }
        }
    }
}
