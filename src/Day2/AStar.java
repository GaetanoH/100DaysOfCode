package Day2;

import java.util.Arrays;

public class AStar {

    public static void main(String[] args) {

        final int gCostDiagonal = 14;
        final int gCostVerHor   = 10;

        Node startingPoint, endingPoint;

        //Make a 2D grid
        Node[][] grid = new Node[6][7];

        //Fill grid with node objects
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = new Node(x, y);
            }
        }

        //Set start and endpoint
        endingPoint = grid[4][5];

        //Calculate heuristic values for all nodes, ignore walls/blockages
        for (Node[] list: grid) {
            for (Node node : list) {
                node.setHeuristicValue(node.manhattenDistance(node, endingPoint.xPos, endingPoint.yPos));
            }
        }

        for (Node[] nodeList : grid) {
            for (Node node : nodeList) {
                System.out.print(node.getHeuristicValue() + " ");
            }
            System.out.println();
        }
    }



}
