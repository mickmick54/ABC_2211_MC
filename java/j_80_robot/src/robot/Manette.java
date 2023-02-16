package robot;

import java.util.Scanner;

public class Manette {
  public static void main(String[] args) {
    Robot robot = new Robot("Robot1", "J", 5);
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Entrez une commande (g: aller à gauche, d: aller à droite, h: monter, b: descendre, r: retourner au point de départ, p: prélever un colis, o: déposer un colis) :");
      String commande = scanner.nextLine();
      
      switch (commande) {
        case "g":
          if (robot.allerAgauche()) {
            System.out.println("Le robot est allé à gauche");
          } else {
            System.out.println("Le robot ne peut pas aller plus à gauche");
          }
          break;
        case "d":
          if (robot.allerAdroite()) {
            System.out.println("Le robot est allé à droite");
          } else {
            System.out.println("Le robot ne peut pas aller plus à droite");
          }
          break;
        case "h":
          if (robot.monter()) {
            System.out.println("Le robot est monté");
          } else {
            System.out.println("Le robot ne peut pas monter plus haut");
          }
          break;
        case "b":
          if (robot.descendre()) {
            System.out.println("Le robot est descendu");
          } else {
            System.out.println("Le robot ne peut pas descendre plus bas");
          }
          break;
        case "r":
          if (robot.retournerAuDepart()) {
            System.out.println("Le robot est retourné au point de départ");
          } else {
            System.out.println("Le robot est déjà au point de départ");
          }
          break;
        case "p":
          if (robot.prelever()) {
            System.out.println("Le robot a prélevé un colis");
          } else {
            System.out.println("Le robot ne peut pas prélever un colis");
          }
          break;
        case "o":
          if (robot.deposer()) {
            System.out.println("Le robot a déposé un colis");
          } else {
            System.out.println("Le robot ne peut pas déposer un colis");
          }
          break;
        case "q":
          System.out.println("Programme terminé");
          return;
        default:
          System.out.println("Commande invalide");
          break;
      }
      
      System.out.println("Position actuelle du robot : " + robot.getPositionX() + robot.getPositionY());
      System.out.println("Le robot a-t-il un colis sur lui ? " + robot.getColisSurRobot());
    }
  }
}

