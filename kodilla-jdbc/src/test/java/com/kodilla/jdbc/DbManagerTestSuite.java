package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(6, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = """
                SELECT USERS.*, COUNT(POSTS.ID) AS POST_COUNT
                FROM USERS
                JOIN POSTS ON USERS.ID = POSTS.USER_ID
                GROUP BY USERS.ID
                HAVING COUNT(POSTS.ID) >= 2
                """;

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then

        assertTrue(rs.next());
        Assert.assertEquals("John", rs.getString("FIRSTNAME"));
        Assert.assertEquals("Smith", rs.getString("LASTNAME"));
        Assert.assertEquals(2, rs.getInt("POST_COUNT"));
    }
}

