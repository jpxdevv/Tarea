public class Tarea1 {

    public static String compress(String text) {

        String resultado = "";     // aquí vamos a ir construyendo la cadena comprimida
        int contador = 1;
        int recorrer = text.length();// cuenta cuántas veces se repite la letra actual

        for (int i = 1; i < recorrer; i++) {   // <-- ESTO es lo que estamos definiendo ahorita

            if (text.charAt(i) == text.charAt(i - 1)) {
                // son iguales -> seguimos en la misma racha
                contador++;
            } else {

                // son diferentes -> "cerramos" la racha anterior
                // (aquí falta: agregar a "resultado" la letra anterior + el contador)
                // (aquí falta: reiniciar el contador a 1)
            }
        }

        // fuera del for: falta "cerrar" la última racha que quedó pendiente

        return resultado;
    }

}