package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = new File("d:\\5.txt");//File.createTempFile("d:\\5.txt", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            if (ivanov==somePerson){
                System.out.println(true);
            }
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            // создаем поток для записи
            PrintWriter writer = new PrintWriter(outputStream);
            // проверяем наличие имени, если есть записываем
            String isNamePresent = this.name != null ? "yes" : "no";
            writer.println(isNamePresent);
            if (isNamePresent.equals("yes")){

                writer.println(this.name);
            }

            writer.flush();
            // проверяем список.
            String isAssetPresent = this.assets.size() > 0 ? "yes" : "no";
            writer.println(isAssetPresent);
            //Если не пустой, записываем все из списка
            if (isAssetPresent.equals("yes")) {
                for (Asset aseets : assets) {
                    writer.println(aseets.getName());
                    writer.println(aseets.getPrice());
                }
                writer.close();
            }
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            // поток для чтения
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isNamePresent = reader.readLine();
            //если имя не пустое - читаем имя
            if (isNamePresent.equals("yes")) {
                this.name  = reader.readLine();
            }

            //проверяем список
            String isAssetPresent = reader.readLine();
            //если список не пустой - считываем все
            if(isAssetPresent.equals("yes")){
                while(reader.ready()){
                    this.assets.add(new Asset((reader.readLine()), Double.parseDouble(reader.readLine())));
                }
                reader.close();
            }
        }
    }
}
