package regiãodosistema;

import java.util.Locale;

public class RegiãoDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é ");
        System.out.println (loc.getDisplayLanguage());
    }
    
}
