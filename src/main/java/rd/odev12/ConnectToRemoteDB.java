package rd.odev12;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ConnectToRemoteDB {

    static String url = "jdbc:mysql://sql11.freemysqlhosting.net/sql11683450";
    static String username = "sql11683450";
    static String password = "zJJDHznSQU";
    static PreparedStatement preparedStatement = null;
    static ResultSet resutSet = null;
    static Connection connection = null;


    public static void printQuery(List list) {
        System.out.println("ARAMA SONUÇLARI:");
        for (Object l : list) {
            System.out.println("Result: " + l);
        }
    }


    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create(url, username, password);

        try (Handle handle = jdbi.open()) {

            handle.execute("CREATE TABLE IF NOT EXISTS mobilephones (id SERIAL PRIMARY KEY, device_name VARCHAR(100), os VARCHAR(100), releaseyear integer)");

            handle.execute("INSERT INTO mobilephones (device_name, os, releaseyear) VALUES (?,?,?)", "iPhone 15", "IOS", 2023);
            handle.execute("INSERT INTO mobilephones (device_name, os, releaseyear) VALUES (?,?,?)", "Galaxy S23", "Android", 2023);
            handle.execute("INSERT INTO mobilephones (device_name, os, releaseyear) VALUES (?,?,?)", "iPhone 14", "IOS", 2022);
            handle.execute("INSERT INTO mobilephones (device_name, os, releaseyear) VALUES (?,?,?)", "Galaxy S22", "Android", 2022);
            handle.execute("INSERT INTO mobilephones (device_name, os, releaseyear) VALUES (?,?,?)", "Galaxy S24", "Android", 2022);


            System.out.println("\n TABLO OLUŞTURMA VE VERİ GİRİŞİ \n");

            List results = handle.createQuery("SELECT * FROM mobilephones WHERE os = :os")
                    .bind("os", "Android").mapToMap().list();

            printQuery(results);


            System.out.println("\n TABLO GÜNCELLEMESİ \n");
            handle.createUpdate("UPDATE mobilephones SET releaseyear = 2024 WHERE device_name = :device_name")
                    .bind("device_name", "Galaxy S24").execute();

            List results2 = handle.createQuery("SELECT * FROM mobilephones").mapToMap().list();

            printQuery(results2);

            System.out.println("\n TABLODAN VERİ SİLİNMESİ \n");
            handle.createUpdate("DELETE FROM mobilephones WHERE releaseyear = 2024").execute();

            List results3 = handle.createQuery("SELECT * FROM mobilephones").mapToMap().list();

            printQuery(results3);


            System.out.println("\n TABLO SİLİNİR \n");
            handle.createUpdate("DROP TABLE mobilephones").execute();


        } catch (StatementException e) {
            e.printStackTrace();
        }


    }


}
