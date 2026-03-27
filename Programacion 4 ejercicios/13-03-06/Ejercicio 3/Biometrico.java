interface Autenticador {
    boolean autenticar();
}

class UsuarioPassword implements Autenticador {
    public boolean autenticar() {
        System.out.println("Login con usuario y contraseña");
        return true;
    }
}

class GoogleAuth implements Autenticador {
    public boolean autenticar() {
        System.out.println("Login con Google");
        return true;
    }
}

class Biometrico implements Autenticador {
    public boolean autenticar() {
        System.out.println("Login biométrico");
        return true;
    }
}

public class MainAuth {
    public static void main(String[] args) {
        Autenticador a1 = new UsuarioPassword();
        Autenticador a2 = new GoogleAuth();
        Autenticador a3 = new Biometrico();

        a1.autenticar();
        a2.autenticar();
        a3.autenticar();
    }
}