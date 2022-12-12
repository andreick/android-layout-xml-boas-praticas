package br.com.alura.aluraviagens.util;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    public static String formatar(int quantidadeDeDias) {
        return quantidadeDeDias > 1 ? quantidadeDeDias + PLURAL : quantidadeDeDias + SINGULAR;
    }

}
