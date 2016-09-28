public class JeuDeNim{
  public static void main(String[]args){
    Terminal.ecrireStringln("Entrez le nb d'alumettes");
    int n=Terminal.lireInt();
    boolean joueur=true;
    int coup_precedent=0;
    int coup=0;
    
    
    while(n>0 && n!=coup_precedent) {
      if(joueur){
        Terminal.sautDeLigne();
        Terminal.ecrireStringln("le joueur 1 joue");
      }else{
        Terminal.sautDeLigne();
        Terminal.ecrireStringln("le joueur 2 joue");
      }
      Terminal.ecrireStringln("Il reste : "+"*** "+n+" allumettes ***");
      Terminal.sautDeLigne();
      Terminal.ecrireStringln("Tirer 1,2 ou 3 allumettes");
      Terminal.sautDeLigne();
      coup=Terminal.lireInt();
      if(coup==coup_precedent || coup>3 || coup<0 || coup>n){
        Terminal.ecrireStringln("");
        Terminal.ecrireStringln("C'est interdit. Rejoue.");
      } 
      else{
        n=n-coup;
        coup_precedent=coup;
        joueur=!joueur;
      }
      
    }
       Terminal.ecrireStringln("Le jeu est terminŽ");
       if(n!=coup_precedent) {
         if(joueur){
        Terminal.ecrireStringln("le joueur 2 gagne");
        }else{
        Terminal.ecrireStringln("le joueur 1 gagne");
        }
       } else{
        if(!joueur){
        Terminal.ecrireStringln("Vous tes dans une impasse.");
          Terminal.ecrireStringln("le joueur 2 gagne");
        }else{
          Terminal.ecrireStringln("Vous tes dans une impasse.");
        Terminal.ecrireStringln("le joueur 1 gagne");
        }
        }
    }
  }

//*******JEU DE TEST*******
//N=4 J1=2;J2=1->J2 gagne
//N=2 J1=1->J1 gagne
//N=10 J1=3;J2=3;J2=2;J1=3;J2=2->J2 gagne
//N=10 J1=3;J2=2;J1=3;J2=1;J1=1->J1 gagne 


//BUGS
//N=2->J2gagne->faux





// programme de base
//    while(jeu==true) {
//      
//      coup_precedent=coup;
//      if(joueur){
//        Terminal.ecrireStringln("le joueur 1 joue");
//      }else{
//        Terminal.ecrireStringln("le joueur 2 joue");
//      }
//      Terminal.ecrireStringln("Tirer 1,2 ou 3 allumettes");
//      coup=Terminal.lireInt();
//      n=n-coup;
//      if(n<=0 || coup==coup_precedent){
//        jeu=false;
//        Terminal.ecrireStringln("le jeu est terminÃ©");
//      }else {
//        joueur=!joueur;
//      }
//    }