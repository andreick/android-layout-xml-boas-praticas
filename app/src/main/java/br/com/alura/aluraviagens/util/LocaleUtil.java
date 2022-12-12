package br.com.alura.aluraviagens.util;

import java.util.Locale;

public class LocaleUtil {

    private static final String PT_BR = "pt-BR";

    public static Locale getLocaleBrasileiro() {
        return Locale.forLanguageTag(PT_BR);
    }
}
