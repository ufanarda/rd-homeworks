package rd.odev12;

import java.sql.*;

public class ConnectToLocalDB {

    static String url = "jdbc:mysql://localhost:3306/sys";
    static String username = "root";
    static String password = "arda123";
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    static Connection connection = null;


    public void connectionToDB(String query) {

        try {
            connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {

                System.out.println("DB bağlantısı başarılı");

                preparedStatement = connection.prepareStatement(query);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String Stock_ID = resultSet.getString("Stock_ID");
                    String Product_Name = resultSet.getString("Product_Name");
                    String Model = resultSet.getString("Model");
                    String Price = resultSet.getString("Price");
                    String Quantity = resultSet.getString("Quantity");
                    String Manufacturer = resultSet.getString("Manufacturer");
                    System.out.println("Stok Numarası: " + Stock_ID + ", Ürün Adı: " + Product_Name + ", Model No: " + Model + ", Ürün Fiyatı: " + Price + ", Stok Adeti: " + Quantity + ", Marka: " + Manufacturer);
                }

                //connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void mpMarkaSorgulama(String marka) {
        String query = "SELECT * FROM sys.mp_stock WHERE Manufacturer IN (" + marka + ")";
        connectionToDB(query);
    }

    public static void main(String[] args) {

        ConnectToLocalDB connectToLocalDB = new ConnectToLocalDB();
        connectToLocalDB.mpMarkaSorgulama("'Apple'");
        connectToLocalDB.mpMarkaSorgulama("'Samsung', 'Xiaomi'");

    }


}
