/*Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс).
Создать массив объектов. Вывести:
     a) список поездов, следующих до заданного пункта назначения;
     b) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;
     c) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TrainTask {
    public static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        ArrayList<Train> list = new ArrayList();
        list.add(new Train("Dachstein Salzkammergut", 100, "10:00",
                200, 100, 50, 20));
        list.add(new Train("Monistrol de Montserrat", 320, "09:00",
                300, 70, 30, 5));
        list.add(new Train("Venice", 100, "13:00",
                150, 50, 20, 0));

        listToDestination(list); //список поездов, следующих до заданного пункта назначения;
        timeAndDest(list); //список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;
        destAndLux(list); //список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
        cleanUp();
    }

    public static void listToDestination(ArrayList<Train> list) {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please type destination below: ");
            String destination = reader.readLine();
            int count = 0;
            for (Train train : list) {
                if (train.getDestination().equalsIgnoreCase(destination)) {
                    System.out.println(train);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Sorry, we don't have it");
            }
        } catch (Exception e) {
            System.out.println("Oops, something gone wrong!");
        }
    }
    public static void timeAndDest(ArrayList<Train> list) {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Searching by time and destination. Please type destination below: ");
            String destination = reader.readLine();
            System.out.println("Please type time in format '00:00' below: ");
            String time = reader.readLine();
            DateFormat dateFormat = new SimpleDateFormat("hh:mm");
            Date requiredTime = dateFormat.parse(time);
            int count = 0;
            for (Train train : list) {
                Date date = dateFormat.parse(train.getTime());
                if (train.getDestination().equalsIgnoreCase(destination) && date.after(requiredTime)) {
                    System.out.println(train);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Sorry, we don't have it");
            }
        } catch (Exception e) {
            System.out.println("Oops, something gone wrong!");
        }
    }
    public static void destAndLux(ArrayList<Train> list) {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Searching luxury places to this destination. Please type destination below: ");
            String destination = reader.readLine();
            int count = 0;
            for (Train train : list) {
                if (train.getDestination().equalsIgnoreCase(destination) && train.getLuxury() > 0) {
                    System.out.println(train);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Sorry, we don't have it");
            }
        } catch (Exception e) {
            System.out.println("Oops, something gone wrong!");
        }
    }

    public static void cleanUp() throws IOException {
        reader.close();
    }


}
