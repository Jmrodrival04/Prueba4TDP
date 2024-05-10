package Programa;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HaltChecker {

    public static boolean verificarSiSeDetendra(Programa programa) {
        if (programa instanceof ProgramaCuentaArriba) {
            // As we know ProgramaCuentaArriba does not stop on its own
            return false;
        } else if (programa instanceof ProgramaCuentaAtras) {
            ProgramaCuentaAtras cuentaAtras = (ProgramaCuentaAtras) programa;
            // It will stop when the value reaches 0 or below
            return cuentaAtras.getValor() <= 0;
        }
        return false;
    }

    }