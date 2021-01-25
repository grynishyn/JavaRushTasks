package com.javarush.task.task20.task2002;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
Метод main реализован только для вас и не участвует в тестировании.


Требования:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users пустой.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users не пустой.
3. Класс Solution.JavaRush не должен поддерживать интерфейс Serializable.
4. Класс Solution.JavaRush должен быть публичным.
5. Класс Solution.JavaRush не должен поддерживать интерфейс Externalizable.
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File yourFile = File.createTempFile("your_file_name", null);
            File yourFile = new File("C:\\1.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User usr = new User();
            usr.setFirstName("Igor");
            usr.setLastName("Grynishyn");
            usr.setBirthDate(new GregorianCalendar(1990, 10,7).getTime());
            usr.setMale(true);
            usr.setCountry(User.Country.UKRAINE);
            javaRush.users.add(usr);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны


            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataOutputStream outToFile = new DataOutputStream(outputStream);

            outToFile.writeInt(users.size());
            for (User user : users) {
                /*String firstName = usr.getFirstName() != null ? usr.getFirstName() : "null";
                String lastName = usr.getLastName() != null ? usr.getLastName() : "null";
                String birthDate = usr.getBirthDate() != null ? dateFormat.format(usr.getBirthDate()) : "null";
                String country = usr.getCountry() != null ? usr.getCountry().toString() : "null";
                String sex = usr.isMale() == true ? "male" : "female";
                outToFile.write(firstName + "\r\n");
                outToFile.write(lastName + "\r\n");
                outToFile.write(birthDate + "\r\n");
                outToFile.write(country + "\r\n");
                outToFile.write(usr.getCountry().toString() + "\r\n");
                outToFile.write(sex + "\r\n");*/

                String firstName = (user.getFirstName() == null) ? "null" : user.getFirstName();
                outToFile.writeUTF(firstName);
                String lastName = (user.getLastName() == null) ? "null" : user.getLastName();
                outToFile.writeUTF(lastName);
                outToFile.writeLong(user.getBirthDate().getTime());
                outToFile.writeBoolean(user.isMale());
                outToFile.writeUTF(user.getCountry().name());
            }
            outToFile.flush();
        }


        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
//        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            DataInputStream fromFile = new DataInputStream(inputStream);
//        users.clear();

            int usersCount = fromFile.readInt();
            for (int i = 0; i < usersCount; i++) {
            /*
            String firstName = fromFile.readLine();
            String lastName = fromFile.readLine();
            String birthDate = fromFile.readLine();
            String country = fromFile.readLine();
            String sex = fromFile.readLine();
            User usr = new User();
            usr.setFirstName(firstName);
            usr.setLastName(lastName);
            usr.setBirthDate(birthDate.equals("null") ? null :  dateFormat.parse(birthDate));
            usr.setCountry(country.equals("null") ? null: User.Country.valueOf(country));
            usr.setMale(sex.equals("male") ? true : false);*/

                User user = new User();

                String firstName = fromFile.readUTF();
                if (firstName.equals("null")) firstName = null;
                user.setFirstName(firstName);
                String lastName = fromFile.readUTF();
                if (lastName.equals("null")) lastName = null;
                user.setLastName(lastName);
                user.setBirthDate(new Date(fromFile.readLong()));
                user.setMale(fromFile.readBoolean());
                user.setCountry(User.Country.valueOf(fromFile.readUTF()));

                users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}