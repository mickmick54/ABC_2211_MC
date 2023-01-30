package dames;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while (true) {
	        int[][] moves = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
	        boolean[][] board = new boolean[8][8];
	        int posi = 0;
			int prevPosi = posi;
	        int posj = 0;
			int prevPosj = posj;
	
	        // Initialize board
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                board[i][j] = false;
	            }
	        }
	
	        // Input row coordinate
	        posi = -1;
	        boolean correct = false;
	        while (!correct) {
	            System.out.print("Enter the row coordinate of your piece: ");
	            posi = sc.nextInt();
	            if (posi >= 0 && posi <= 7) {
	                correct = true;
	            } else {
	                posi = prevPosi;
	            }
	        }
	
	        // Input column coordinate
	        posj = -1;
	        correct = false;
	        while (!correct) {
	            System.out.print("Enter the column coordinate of your piece: ");
	            posj = sc.nextInt();
	            if (posj >= 0 && posj <= 7) {
	                correct = true;
	            }else {
	                posj = prevPosj;
	            }
	        }
	
	        // Place piece on virtual board
	        board[posi][posj] = true;
	
	        // Input move
	        System.out.println("What move?");
	        System.out.println(" - 0: up-left");
	        System.out.println(" - 1: up-right");
	        System.out.println(" - 2: down-left");
	        System.out.println(" - 3: down-right");
	        int dep = -1;
	        correct = false;
	        while (!correct) {
	            dep = sc.nextInt();
	            if (dep >= 0 && dep <= 3) {
	                correct = true;
	            }
	        }
	
	        // Calculate future piece coordinates
	        int i2 = posi + moves[dep][0];
	        int j2 = posj + moves[dep][1];
	        boolean moveOK = i2 >= 0 && i2 <= 7 && j2 >= 0 && j2 <= 7;
	
	        // Check if move is valid
	        if (moveOK) {
	            board[posi][posj] = false;
	            board[i2][j2] = true;
	
	            // Display updated board
	            for (int i = 0; i < 8; i++) {
	                for (int j = 0; j < 8; j++) {
	                    if (board[i][j]) {
	                        System.out.print(" O ");
	                    } else {
	                        System.out.print(" X ");
	                    }
	                }
	                System.out.println();
	            }
	        } else {
	            System.out.println("Invalid move");
	        }
    	}
    }
}
