package com.example.dasistes;

import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SnakeGame {
    private Color color = Color.web("feffe4");
    private int width;
    private int height;
    private int score;
    private int maxScore;
    private int scorePoints;
    private double speed;

    private boolean noBorder;

//----------------------------------------------------------------------
// Game Difficulty E - EASY, M - MODERATE, C - CHALLENGING
    public SnakeGame(char difficulty) {
        if (difficulty == 'E') {
            speed = 8.5;
            noBorder = true;
        } else if (difficulty == 'M') {
            speed = 8.5;
            noBorder = false;
        } else if (difficulty == 'C') {
            speed = 13;
            noBorder = false;
        }
    }

    public boolean gameWon() {
        return score == maxScore;
    }

    public void incScore() {
        score++;
    }

    public void decMaxScore(int num) {
        this.maxScore = maxScore - num;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void resetScore() {
        score = 0;
        scorePoints = 0;
    }

    public Color getColor() {
        return color;
    }

    public void addPoints(int n) {
        scorePoints = scorePoints + n;
    }

    public int getScorePoints() {
        return scorePoints;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isNoBorder() {
        return noBorder;
    }
//-----------------------------------------------------------------------------------------------------------------
//Variables
    public enum Direction { //enum = constant states {What are enums?: https://www.youtube.com/watch?v=wq9SJb8VeyM}
        UP, DOWN, LEFT, RIGHT //directions can be:
    }
    private boolean running = false;
    private Direction direction = Direction.RIGHT;
    private Timeline timeline = new Timeline();     //timeline is going to be our animation
    public static final int SQUARE_SIZE = 15; //block-size(Snake body): 40 units
    public static final int APP_WIDTH = 30 * SQUARE_SIZE; // width of application
    public static final int APP_HEIGHT = 30 * SQUARE_SIZE; // height of application
    private ObservableList<Node> snake;
//-------------------------------------------------------------------------------------------
//
    private void startGame() {//start Game
        direction = Direction.RIGHT; // move right from beginning
        Rectangle head = new Rectangle(SQUARE_SIZE, SQUARE_SIZE); //create a square/rectangle head
        snake.add(head); // add to (empty) snake list
        timeline.play(); // animation start in loop
        running = true; // all code can execute

    }
    private void stopGame() {
        running = false;
        timeline.stop(); // animation stops// ps
        snake.clear(); // clear all the animation within snake list = no blocks
    }
}

