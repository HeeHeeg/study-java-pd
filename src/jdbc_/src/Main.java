import config.JdbcConnection;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
//        new JdbcConnection().getJdbc();
        new Controller().selectMode();

    }
}
