package br.com.paulo.desafio;

public class Desafio{
    
    public static void main(String[] args) {
        String nomeHeroi = "Homem de ferro";
        String nivel = "";
        int XP = 500;
    
     if (XP < 1000){
        nivel = "Ferro";
    } else if(XP >= 1001 && XP <= 2000){
        nivel = "Bronze";
    } else if (XP >= 2001 && XP <= 5000){
        nivel = "Prata";
    } else if (XP >= 6001 && XP <= 7000){
        nivel = "Ouro";
    } else if (XP >= 7001 && XP <= 8000){
        nivel = "Platina";
    } else if (XP >= 8001 && XP <= 9000){
        nivel = "Ascendente";
    } else if (XP >= 9001 && XP <= 10000){
        nivel = "Imortal";
    } else if (XP >= 10001){
        nivel = "Radiante";
}
 
    System.out.print("O Heroi de nome " + nomeHeroi + " esta no nivel de " + nivel);
    }
}