package trucos;

import trucos.acopladores.Perro;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws InterruptedException {

/*
        System.out.println("Numero aleatorio: " + VariableEstaticaPesada.NUMEROS_ALEATORIOS.get(5));
        System.out.println("230 x 292 =  " + VariableEstaticaPesada.multiplicar(230,292));*/

        HashMap<Perro, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            map.put(new Perro("Pitbull"), i);
        }
        Thread.sleep(100000);
    }
}
