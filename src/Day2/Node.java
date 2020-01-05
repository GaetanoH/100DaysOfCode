package Day2;

import java.util.List;

public class Node {

    private int heuristicValue;
    private int movementCost;
    private int totalCost;
    int xPos;
    int yPos;
    private List<Node> adjacentNodes;

    Node(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    int getHeuristicValue() {
        return heuristicValue;
    }

    void setHeuristicValue(int heuristicValue) {
        this.heuristicValue = heuristicValue;
    }

    public int getMovementCost() {
        return movementCost;
    }

    public void setMovementCost(int movementCost) {
        this.movementCost = movementCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public List<Node> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(List<Node> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    int manhattenDistance(Node n, int x, int y) {
        return Math.abs(n.xPos - x) + Math.abs(n.yPos - y);
    }

    @Override
    public String toString() {
        return "(" + this.xPos + ", " + this.yPos + ")";
    }
}
