
package guia4ejer4;

class Guerrero extends Personaje {
    private boolean caballo;

    public Guerrero(Position ubicacion, String nick, boolean caballo) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }

    @Override
    public void avanzar() {
        if (caballo) {
            for (int i = 0; i < 10; i++) {
                super.avanzar();
            }
        } else {
            super.avanzar();
        }
    }

    @Override
    public void disparar() {
        if (energia >= 10) {
            super.disparar();
            if (energia < 30) {
                perderCaballo();
            }
        } else {
            System.out.println("No tienes suficiente energía para disparar.");
        }
    }

    private void perderCaballo() {
        caballo = false;
        System.out.println("¡Perdiste tu caballo!");
    }
}