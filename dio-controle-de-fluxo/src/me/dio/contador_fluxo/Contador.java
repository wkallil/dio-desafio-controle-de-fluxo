package me.dio.contador_fluxo;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        int parametroUm, parametroDois;
        System.out.println("Digite o primeiro parametro");
        parametroUm = s.nextInt();
        System.out.println("Digite o segundo parametro");
        parametroDois = s.nextInt();

        try {
            Contar(parametroUm, parametroDois);

              } catch (ParametrosInavalidosExcecao e) {
            System.out.println("O Segundo número deve ser maior que o primeiro");
        }
        }

        static void Contar(int parametroUm, int parametroDois) throws ParametrosInavalidosExcecao {
        if (parametroUm > parametroDois){
            throw new ParametrosInavalidosExcecao();
            }
            int resultado = parametroDois - parametroUm;
            for (int i = 1; i <= resultado; i++) {
                System.out.println("Imprimindo o número " + i);
        }
    }
}