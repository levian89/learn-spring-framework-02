package com.in28minutes.learnspringframework.game;

public class GameRunnerWithTightCoupling {

    private PacmanGame game;
//    private SuperContraGame game;
//    private MarioGame game; // tight coupling: if I want to run the marioGame, I need to change the code
                              // in the GameRunner to this... (without interface)


    public GameRunnerWithTightCoupling(PacmanGame game) {
        this.game = game;
    }
//    public GameRunnerWithTightCoupling(SuperContraGame game) {
//        this.game = game;
//    }

//    public GameRunner(MarioGame game) { // tight coupling: if I want to run the marioGame, I need to change the code
//                                        // in the GameRunner... and this (without interface)
//        this.game = game;
//    }


    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
