//package com.jdbcdemo.jdbc_connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import java.util.*;
//
//public class App {
//
//    private static final String URL  = "jdbc:mysql://localhost:3306/ankush";
//    private static final String USER = "root";
//    private static final String PASS = "root";
//
//    public static void main(String[] args) {
//
//        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
//
//            System.out.println("Connected Successfully!");
//
//            Statement st = conn.createStatement();
//
//            String createTable =
//                "CREATE TABLE IF NOT EXISTS students (" +
//                "id INT PRIMARY KEY AUTO_INCREMENT, " +
//                "name VARCHAR(50), " +
//                "email VARCHAR(50), " +
//                "age INT)";
//
//            st.executeUpdate(createTable);
//
//            String insertQuery =
//                "INSERT INTO students (name, email, age) VALUES " +
//                "('Tejas', 'tejas@example.com', 22), " +
//                "('Rani', 'rani@example.com', 20), " +
//                "('Madu', 'madu@example.com', 23)";
//
//            st.executeUpdate(insertQuery);
//            
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter name: ");
//            String n = sc.nextLine();
//
//            System.out.print("Enter email: ");
//            String e = sc.nextLine();
//
//            System.out.print("Enter age: ");
//            int a = sc.nextInt();
//
//            String insert =
//                "INSERT INTO students (name, email, age) VALUES ('" + n + "', '" + e + "', " + a + ")";
//
//            st.executeUpdate(insert);
//            System.out.println("New data inserted!");
//
//            
//            String selectQuery = "SELECT * FROM students";
//
//            ResultSet rs = st.executeQuery(selectQuery);
//
//            while (rs.next()) {
//            // Moves row-by-row through the table result.
//
//
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                int age = rs.getInt("age");
//
//                System.out.println(id + " | " + name + " | " + email + " | " + age);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
package com.jdbcdemo.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;

public class App {

    private static final String URL  = "jdbc:mysql://localhost:3306/ankush";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {

            System.out.println("Connected Successfully!");

            Statement st = conn.createStatement();

            String createTable =
                "CREATE TABLE IF NOT EXISTS students (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(50), " +
                "email VARCHAR(50), " +
                "age INT)";

            st.executeUpdate(createTable);

            Scanner sc = new Scanner(System.in);

            // ---------- INSERT (using user input) ----------
            System.out.print("Enter name: ");
            String n = sc.nextLine();

            System.out.print("Enter email: ");
            String e = sc.nextLine();

            System.out.print("Enter age: ");
            int a = sc.nextInt();

            insertStudent(n, e, a);

            // ---------- DISPLAY DATA ----------
            readStudents();

            // ---------- UPDATE A STUDENT ----------
            updateStudent(1, "Updated Name", "updated@mail.com", 30);

            // ---------- DELETE A STUDENT ----------
            deleteStudent(2);

            // ---------- DISPLAY AGAIN ----------
            readStudents();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // INSERT
    public static void insertStudent(String name, String email, int age) {
        String query = "INSERT INTO students (name, email, age) VALUES (?, ?, ?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, age);

            int rows = ps.executeUpdate();
            System.out.println(rows + " Student Inserted Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public static void readStudents() {
        String query = "SELECT * FROM students";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("email") + " | " +
                    rs.getInt("age")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updateStudent(int id, String name, String email, int age) {
        String query = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, age);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " Student Updated Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " Student Deleted Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

