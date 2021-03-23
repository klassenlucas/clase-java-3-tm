package ejercicios.ejercicio1;

public class PasswordSimple extends Password{
    public PasswordSimple() {
        super("^(?=.*[a-z])(?=\\S+$).{4,}$");
    }
}
