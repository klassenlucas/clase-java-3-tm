package ejercicios.ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    String regexp;
    String pwd;

    public Password(String regexp) {
        this.regexp = regexp;
    }

    public void setValue(String pwd) throws NoCumpleCondicionException{
        if(matchWithRegExp(pwd)) {
            this.pwd = pwd;
        } else throw new NoCumpleCondicionException("La contraseña ingresada no cumple con los requisitos");
    }

    public boolean matchWithRegExp(String s) {
        Pattern r = Pattern.compile(regexp);
        Matcher m = r.matcher(s);
        return m.find();
    }
}
