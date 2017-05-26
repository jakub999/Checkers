import java.util.Arrays;
import java.util.Scanner;
import ui.OthelloReplayUserInterface;
import ui.UserInterfaceFactory;
import ui.LibUIScanner;
import ui.UIAuxiliaryMethods;

public class Checkers {
    LibUIScanner ui;
    private int numberOfGames;

    public Checkers() {
        ui = UIAuxiliaryMethods.askUserForInput();
        OthelloReplayUserInterface ui;
        ui = UserInterfaceFactory.getOthelloReplayUI();
    }


    private void start(){
    	//ui  = UIAuxiliaryMethods.askUserForInput();
    	Scanner numberOfGamesScanner = ui.getScanner();

        numberOfGames = numberOfGamesScanner.nextInt();
        numberOfGamesScanner.nextLine();
        System.out.println(numberOfGames);
        
        Scanner gameProcessingScanner = ui.getScanner();
        
        int blackPieces,
        	whitePieces;
        
        for(int i = 0; i <= numberOfGames; i++){
        	
        blackPieces = gameProcessingScanner.nextInt();
        whitePieces	= gameProcessingScanner.nextInt();
        int[] blackPiecesArray = new int[blackPieces];
        int[] whitePiecesArray = new int[whitePieces];
        
        System.out.println(blackPieces);
    	System.out.println(whitePieces);
        
        	for(int b = 0; b<blackPiecesArray.length; b++){        	
        		blackPiecesArray[b] = gameProcessingScanner.nextInt();
        		} 
        		
        
        	for(int w = 0; w<whitePiecesArray.length; w++){        	
        		whitePiecesArray[w] = gameProcessingScanner.nextInt();
        		}     
        	System.out.println(Arrays.toString(blackPiecesArray));
        	System.out.println(Arrays.toString(whitePiecesArray));
        }
    }

    public static void main(String[] args){
        new Checkers().start();
    }

}
