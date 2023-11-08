package com.sikku.backtraking;


public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        ratInMaze(maze);
    }

    public static void ratInMaze(int[][] maze) {
        int[][] path = new int[maze.length][maze.length];

//       return solveMaze(maze, 0, 0, path);
        printAllPath(maze, 0, 0, path);
    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        path[i][j] = 1;

        if (i == n - 1 && j == n - 1) {
            for (int r = 0; r < path.length; r++) {
                for (int c = 0; c < path[j].length; c++) {
                    System.out.print(path[r][c] + " ");
                }
                System.out.println();
            }
            return true;
        }

        //exploring all direction

        //Top
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }

        //Right
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
        //Down
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }

        //Left
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }

        return false;

    }

    public static void printAllPath(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        path[i][j] = 1;

        if (i == n - 1 && j == n - 1) {
            for (int r = 0; r < path.length; r++) {
                for (int c = 0; c < path[j].length; c++) {
                    System.out.print(path[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        //exploring all direction

        //Top
        printAllPath(maze, i - 1, j, path);

        //Right
        printAllPath(maze, i, j + 1, path);

        //Down
        printAllPath(maze, i + 1, j, path);

        //Left
        printAllPath(maze, i, j - 1, path);
        path[i][j] = 0;

    }


}
