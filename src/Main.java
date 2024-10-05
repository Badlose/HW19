import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String Log = "Testlog__123";
        String Pass = "TestPass_123";
        String passConfirm = "TestPass_123";

        check(Log, Pass, passConfirm);

    }

    public static void check(String login, String password, String confirmPassword) {
        Check check = new Check();
        try {
            check.check(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Введен некорректный логин");
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Введен некорректный пароль");
        } finally {
            System.out.println("Проверка завершена");
        }
    }
}