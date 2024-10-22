//Ejercicios Kotlin --> Java

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int energia = 80;

        if (energia > 50) {
            System.out.println("Personaje fuerte");
        } else {
            System.out.println("Personaje debil");
        }

    }

public void main1() {
        for (int i = 0; i < 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println("Número: " + i);
}
}
    public void main3() {
        String personaje = null;
        if (personaje != null) {
            System.out.println("El personaje es $personaje");
        } else {
            System.out.println("No hay personaje.");
        }
    }
}