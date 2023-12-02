package br.com.paulo.desafio;

public class Desafio {
    public static void main(String[] args) {
        String nomeHeroi = "Homem de ferro";
        int XP = 8002;
        String nivel = "";

        switch (XP) {
            case 0:
            case 1:
            case 2:
            case 3:
            // ... outros casos até 1000
            case 1000:
                nivel = "Ferro";
                break;
            case 1001:
            case 1002:
            // ... outros casos até 2000
            case 2000:
                nivel = "Bronze";
                break;
            // Adicione mais casos conforme necessário
            default:
                nivel = "Radiante";  // Valor padrão para casos não especificados
        }

        System.out.println("O Heroi de nome " + nomeHeroi + " esta no nivel de " + nivel);
    }
}
