package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util util=new Util();
        UserDaoJDBCImpl userDaoJDBC=new UserDaoJDBCImpl();
        //userDaoJDBC.createUsersTable();
       /*userDaoJDBC.saveUser("Ant", "Voit", (byte) 33 );
        userDaoJDBC.saveUser("Anton", "Voitenko", (byte) 31 );
*/
        //userDaoJDBC.dropUsersTable();
        //userDaoJDBC.removeUserById(1);
        //userDaoJDBC.cleanUsersTable();
        userDaoJDBC.getAllUsers();

    }
}
