package br.com.apigetway.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;

        // verifica se o usuario enviar uma virgula seja trocado por um ponto
        // BR 10,25 // US 10.25
        String number = strNumber.replaceAll(",", ".");

        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
