
package guia4ejer4;

    abstract class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas = 3;
    protected int energia = 100;
    protected char orientacion = 'N';

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }

    public void disparar() {
        if (energia >= 10) {
            energia -= 10;
            System.out.println(nick + " ha disparado. Energía restante: " + energia);
        } else {
            System.out.println("No tienes suficiente energía para disparar.");
        }
    }

    public void girar() {
        switch (orientacion) {
            case 'N':
                orientacion = 'E';
                break;
            case 'E':
                orientacion = 'S';
                break;
            case 'S':
                orientacion = 'O';
                break;
            case 'O':
                orientacion = 'N';
                break;
        }
        System.out.println("Girando hacia " + orientacion);
    }

    public void avanzar() {
        switch (orientacion) {
            case 'N':
                ubicacion.setY(ubicacion.getY() + 1);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX() + 1);
                break;
            case 'S':
                ubicacion.setY(ubicacion.getY() - 1);
                break;
            case 'O':
                ubicacion.setX(ubicacion.getX() - 1);
                break;
        }
        System.out.println("Avanzando hacia " + orientacion + " a la posición (" + ubicacion.getX() + ", " + ubicacion.getY() + ")");
    }
}
