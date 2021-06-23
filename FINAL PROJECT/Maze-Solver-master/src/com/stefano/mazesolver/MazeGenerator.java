package com.stefano.mazesolver;

public class MazeGenerator {

    private int rows, cols;
    private int[] dx = {-1, 0, 1, 0};
    private int[] dy = {0, -1, 0, 1};
    private int[][] maze;

    public MazeGenerator(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        maze = new int[rows][cols];
        for(int i=0; i<rows; ++i) {
            for(int j=0; j<cols; ++j) {
                maze[i][j] = 1;
            }
        }
        generateMaze(1, 1);
    }

    private void generateMaze(int cx, int cy) {
        if(maze[cx][cy] == -1) {
            maze[cx][cy] = 0;
        }
    }

    public int[][] getMaze() {
        return maze;
    }
}
