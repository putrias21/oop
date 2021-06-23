package com.stefano.mazesolver;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BreadthFirst {
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    public static boolean searchPath(int[][] maze, int x, int y, List<Integer> path) {
        Deque<Node> queue = new ArrayDeque<Node>();
        //Store the predecessor node of each point to facilitate printing of the shortest path route
        int[][] pre = new int[maze[0].length][maze.length];
        //Store the shortest path of each point
        int[][] dis = new int[maze[0].length][maze.length];
        for(int i=0; i<dis.length; i++) {
            for(int j=0; j<dis[0].length; j++) {
                dis[i][j] = 100;
            }
        }

        //Enter the starting point, set the distance of the starting point to 0 and mark it as visited
        queue.add(new Node(x, y));
        dis[x][y] = 0;
        maze[x][y] = 2;
        Node temp;
        //Breadth first traverse all accessible points, and note down the shortest path and predecessor node of each point
        while(!queue.isEmpty()) {
            temp = queue.poll();
            //Try the four directions of each point
            for(int i=0; i<4; i++) {
                int tx = temp.x + dx[i];
                int ty = temp.y + dy[i];
                //If the point has not been visited, enqueue the point and mark it as visited
                if(maze[tx][ty] == 0 || maze[tx][ty] == 9) {
                    //Only one step at a time in the maze, so the distance is increased by one
                    dis[tx][ty] = dis[temp.x][temp.y] + 1;
                    pre[tx][ty] = i;
                    maze[tx][ty] = 2;
                    queue.add(new Node(tx, ty));
                }
            }
        }//The shortest path is stored in dis here, and the path is printed using the pre array below

        int a = maze[0].length - 2;
        int b = maze.length - 2;

        path.add(a);
        path.add(b);

//        System.out.printf("The shortest distance from (%d,%d) to (%d,%d) is: %d, the route is:\n",
//                x, y, a, b, dis[a][b]);

        //Reverse access to the shortest path route and merge into the stack
//        Stack<Node> stack = new Stack<Node>();
//        stack.add(new Node(a, b));
        while(a != x || b != y) {
            int da = dx[pre[a][b]];
            int db = dy[pre[a][b]];
            a = a - da;
            b = b - db;
            path.add(a);
            path.add(b);
        }
        //The order of stacking is the route from the start to the end
//        while(!stack.isEmpty()) {
//            Node p = stack.pop();
//            System.out.printf("->(%d,%d)",p.x,p.y);
//            if(p.x == x && p.y == x) maze[p.x][p.y] = 'S';
//            else if(p.x == a && p.y == b) maze[p.x][p.y] = 'E';
//            else maze[p.x][p.y] = '*';
//        }

        if(path.get(0) == maze[0].length && path.get(1) == maze.length) {
            return true;
        }

        return false;
    }
}
