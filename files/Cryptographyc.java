package exer_20;

public class Cryptographyc {

    public void encrypt(String textoNormal) {
        int i;

        String textoCodificado = "";

        for (i = 0; textoNormal.length() > i; i++) {
            textoCodificado += encrypt(textoNormal.charAt(i));
        }
        System.out.println(textoCodificado);

    }


    private char encrypt(char charNormal) {
        char charCodificado;

        if (charNormal >= 97 && charNormal <= 122) {
            charCodificado = (char) ((charNormal - 97 + 3) % 26 + 97);
        } else if (charNormal >= 65 && charNormal <= 90) {
            charCodificado = (char) ((charNormal - 65 + 3)% 26 + 65);
        } else {
            charCodificado = charNormal;
        }
        return charCodificado ;
    }



    public void decrypt(String textoCodificado) {
        int i;
        String textoNormal = "";

        for (i = 0; textoCodificado.length() > i; i++) {
            textoNormal += decrypt(textoCodificado.charAt(i));
        }
        System.out.println(textoNormal);
    }

    private char decrypt(char charCodificado) {
        char charNormal;

        if (charCodificado >= 97 && charCodificado <= 122) {
            charNormal = (char) ((charCodificado - 97 - 3)%26 + 97);
            if ((charCodificado - 97 - 3) < 0) {
                charNormal += 26;
            }
        } else if (charCodificado >= 65 && charCodificado <= 90) {
            charNormal = (char)((charCodificado - 65 - 3)%26 + 65);
            if ((charCodificado - 65 - 3) < 0) {
                charNormal += 26;
            }
        } else {
            charNormal = charCodificado;
        }
        return charNormal;
    }

}
