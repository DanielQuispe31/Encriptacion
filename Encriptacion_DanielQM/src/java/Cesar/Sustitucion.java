package Cesar;


public class Sustitucion {

    Cifrador cifrador = new Cifrador();
    Descifrador descifrador = new Descifrador();

    public void setDesplazamientoNCifrador(int desplazamientoN) {
        cifrador.setDesplazamientoN(desplazamientoN);
    }

    public void setDesplazamientoNDescifrador(int desplazamientoN) {
        descifrador.setDesplazamientoN(desplazamientoN);
    }

    //Encriptamos la cadena que le enviamos
    public String encriptarTextoClaro(String textoClaro) {
        String textoCifrado = "";
        for (int i = 0; i < textoClaro.length(); i++) {
            if (textoClaro.charAt(i) != ' ') {
                textoCifrado += cifrador.getTextoCifrado(textoClaro.charAt(i)) + "";
            } else {
                textoCifrado += " ";
            }
        }
        return textoCifrado;
    }

    //Desencripta la cadena
    public String desencriptarTextoCifrado(String textoCifrado) {
        String textoClaro = "";
        for (int i = 0; i < textoCifrado.length(); i++) {
            if (textoCifrado.charAt(i) != ' ') {
                textoClaro += descifrador.getTextoClaro(textoCifrado.charAt(i)) + "";
            } else {
                textoClaro += " ";
            }
        }
        return textoClaro;
    }
}
