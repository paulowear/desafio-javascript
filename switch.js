let nomeHeroi = "Homem de ferro";
let XP = 8002;

    switch(true) {
        case (XP < 1000):
            XP = "Ferro";    
            console.log("O Herói de nome " + nomeHeroi + " está no nível de " + XP);
            break;
        case (XP >= 2001 && XP <= 5000):
            XP = "Bronze";
            console.log("O Herói de nome " + nomeHeroi + " está no nível de " + XP);
            break;
        case (XP >= 6001 && XP <= 7000):
            XP = "Ouro";    
            console.log("O Herói de nome " + nomeHeroi + " está no nível de " + XP);
            break;
        case (XP >= 7001 && XP <= 8000):
            XP = "Platina";
            console.log("O Herói de nome " + nomeHeroi + " está no nível de " + XP);
            break;
        case (XP >= 8001 && XP <= 9000):
            XP = "Ascendente";
            console.log("O Herói de nome " + nomeHeroi + " está no nível de " + XP);
            break;
        case (XP >= 9001 && XP <= 10000):
            XP = "Imortal";
            console.log("O Herói de nome " + nomeHeroi + " está no nível de " + XP);
            break;
        case (XP >= 10001):
            XP = "Radiante";
            console.log("O Herói de nome " + nomeHeroi + " está no nível de " + XP);
            break;

        

}