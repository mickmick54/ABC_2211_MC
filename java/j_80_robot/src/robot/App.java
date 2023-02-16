package robot;

public class App {

	public static void main(String[] args) {
		Robot robot = new Robot("Robot1", "J", 5);

		// Déplacer le robot à droite
		robot.allerAdroite();

		// Déplacer le robot vers le haut
		robot.monter();

		// Prélever un colis
		robot.prelever();

		// Déplacer le robot au point de départ
		robot.retournerAuDepart();

		// Déposer le colis
		robot.deposer();

		// Afficher la position du robot
		System.out.println("Position actuelle du robot : " + robot.getPositionX() + robot.getPositionY());

		// Afficher l'état du robot
		System.out.println("Le robot a-t-il un colis sur lui ? " + robot.getColisSurRobot());

		// Afficher la représentation en chaîne de caractères du robot
		System.out.println(robot.toString());

	}

}
