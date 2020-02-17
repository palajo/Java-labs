package ua.lviv.iot.first.lab;

public class PuzzleMaker {
	
    private final static int numberOfPuzzles = 4;

	public static void main(String[] args) {
		
		Puzzle puzzle1 = new Puzzle("Super great puzzle, suitable for everybody!", 250, 125, 50, "boy", "star-wars", "china", 12); 	
		Puzzle puzzle2 = new Puzzle("You will find it amazing! Kyoto city.", 150, 100, 40, "girl"); 	
		Puzzle puzzle3 = new Puzzle("Los Angles, CA. Just complete it!", 450, 150, 75); 	
		
		Puzzle.setDifficulty("hard");
		
		System.out.println(puzzle1);
		System.out.println(puzzle2);
		System.out.println(puzzle3);
		
		
		/* space between */
		System.out.println("*****");
		
		
		
		/* Циклу з передумовою */
        int currentPuzzleNumber = 0;
        Puzzle[] arrayOfPuzzles = new Puzzle[numberOfPuzzles];
        
        while (currentPuzzleNumber < numberOfPuzzles) {
        	arrayOfPuzzles[currentPuzzleNumber] = new Puzzle();
        	currentPuzzleNumber++;
        }

        /* Вивести всі елементи масиву з кроку 14 */
        for (Puzzle currentPuzzle: arrayOfPuzzles){
            System.out.println(currentPuzzle);
        }
	}

}