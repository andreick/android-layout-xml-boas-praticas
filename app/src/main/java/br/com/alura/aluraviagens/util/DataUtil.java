package br.com.alura.aluraviagens.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    private static final String DIA_MES = "dd/MM";

    public static String formatarPeriodo(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatadorBrasileiro =
                new SimpleDateFormat(DIA_MES, LocaleUtil.getLocaleBrasileiro());
        String dataFormatadaIda = formatadorBrasileiro.format(dataIda.getTime());
        String dataFormatadaVolta = formatadorBrasileiro.format(dataVolta.getTime());
        return dataFormatadaIda + " - "
                + dataFormatadaVolta + " de "
                + dataVolta.get(Calendar.YEAR);
    }
}