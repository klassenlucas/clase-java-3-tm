package ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        String pwd;

        printLines();
        System.out.println("");

        System.out.println("Contraseña fuerte debe tener una maysucula, una minuscula, un numero, un simbolo y al menos 8 caracteres entre los mencionados");
        System.out.println("");
        trySetValue("Probando+1", new PasswordFuerte());
        printLine();
        trySetValue("Probando1", new PasswordFuerte());

        System.out.println("");
        printLines();
        System.out.println("");


        System.out.println("Contraseña intermedia debe tener una mayuscula, una minuscula, un numero y al menos 8 caracteres entre los mencionados");
        System.out.println("");
        trySetValue("Probando1", new PasswordIntermedia());
        printLine();
        trySetValue("probando1", new PasswordIntermedia());

        System.out.println("");
        printLines();
        System.out.println("");


        System.out.println("Contraseña debil debe tener al menos cuatro letras minusculas");
        System.out.println("");
        trySetValue("asdf", new PasswordSimple());
        printLine();
        trySetValue("asd", new PasswordSimple());

        System.out.println("");
        printLines();
    }

    private static void trySetValue(String pwd, Password p) {
        try {
            p.setValue(pwd);
            System.out.println("La contraseña cumplio correctamente con los requisitos");
        } catch (NoCumpleCondicionException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("La password era: " + pwd);
        }
    }

    private static void printLines() {
        printLine();
        printLine();
        printLine();
    }

    private static void printLine(){
        System.out.println("-----------");
    }
}
