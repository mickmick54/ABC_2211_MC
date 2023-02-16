package robot;

public class Robot {
	  private String nomRobot;
	  private String maximumX;
	  private int maximumY;
	  private final String minimumX = "A";
	  private final int minimumY = 1;
	  private boolean colisSurRobot;
	  private String positionX;
	  private int positionY;

	  public Robot(String nomRobot, String maximumX, int maximumY) {
	    this.nomRobot = nomRobot;
	    this.maximumX = maximumX;
	    this.maximumY = maximumY;
	    this.colisSurRobot = false;
	    this.positionX = minimumX;
	    this.positionY = minimumY;
	  }

	  public int correspondanceLettresPositionX() {
	    return (int) (positionX.charAt(0) - 'A') + 1;
	  }

	  public int correspondanceNombresPositionY() {
	    return positionY;
	  }

	  public boolean allerAgauche() {
	    if (positionX.equals(minimumX)) {
	      return false;
	    }
	    positionX = String.valueOf((char) (positionX.charAt(0) - 1));
	    return true;
	  }

	  public boolean allerAdroite() {
	    if (positionX.equals(maximumX)) {
	      return false;
	    }
	    positionX = String.valueOf((char) (positionX.charAt(0) + 1));
	    return true;
	  }

	  public boolean monter() {
	    if (positionY == maximumY) {
	      return false;
	    }
	    positionY++;
	    return true;
	  }

	  public boolean descendre() {
	    if (positionY == minimumY) {
	      return false;
	    }
	    positionY--;
	    return true;
	  }

	  public boolean retournerAuDepart() {
	    if (positionX.equals(minimumX) && positionY == minimumY) {
	      return false;
	    }
	    positionX = minimumX;
	    positionY = minimumY;
	    return true;
	  }

	  public boolean prelever() {
	    if (colisSurRobot || positionX.equals(minimumX) && positionY == minimumY) {
	      return false;
	    }
	    colisSurRobot = true;
	    return true;
	  }

	  public boolean deposer() {
	    if (!colisSurRobot || !positionX.equals(minimumX) || positionY != minimumY) {
	      return false;
	    }
	    colisSurRobot = false;
	    return true;
	  }

	  public String getPositionX() {
	    return positionX;
	  }

	  public int getPositionY() {
	    return positionY;
	  }

	  public boolean getColisSurRobot() {
	    return colisSurRobot;
	  }

	  public void setPositionX(String positionX) {
	    this.positionX = positionX;
	  }

	  public void setPositionY(int positionY) {
	    this.positionY = positionY;
	  }

	  @Override
	  public String toString() {
	    return "Robot{" +
	            "nomRobot='" + nomRobot + '\'' +
	            ", maximumX='" + maximumX + '\'' +
	            ", maximumY=" + maximumY +
	            ", colisSurRobot=" + colisSurRobot +
	            ", positionX='" + positionX + '\'' +
	            ", positionY=" + positionY +
	            '}';
	  }
	}

