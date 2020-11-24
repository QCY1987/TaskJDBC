package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        //Util util=new Util();
        UserDaoHibernateImpl userDaoHibernate=new UserDaoHibernateImpl();
       //userDaoHibernate.createUsersTable();
       //userDaoHibernate.saveUser("Anton", "Voitenko", (byte) 33);
       // System.exit(0);
        //userDaoHibernate.saveUser("Ant", "Voit", (byte) 32);
       // userDaoHibernate.saveUser("An", "Vo", (byte) 35);
       //userDaoHibernate.dropUsersTable();
        //userDaoHibernate.cleanUsersTable();
        //userDaoHibernate.getAllUsers();
       // userDaoHibernate.removeUserById();
       // System.exit(0);



        //UserDaoJDBCImpl userDaoJDBC=new UserDaoJDBCImpl();
        //userDaoJDBC.createUsersTable();
       /*userDaoJDBC.saveUser("Ant", "Voit", (byte) 33 );
        userDaoJDBC.saveUser("Anton", "Voitenko", (byte) 31 );
*/
        //userDaoJDBC.dropUsersTable();
        //userDaoJDBC.removeUserById(1);
        //userDaoJDBC.cleanUsersTable();


    }
}
