package Week_7.Day_47;

public class Find_Center_of_Star_Graph_1791 {
    public int findCenter(int[][] edges) {
        // Extract the first edge's vertices
        int firstVertexOfFirstEdge = edges[0][0];
        int secondVertexOfFirstEdge = edges[0][1];

        // Extract the second edge's vertices
        int firstVertexOfSecondEdge = edges[1][0];
        int secondVertexOfSecondEdge = edges[1][1];

        // The center of a star graph is connected to all other vertices.
        // Therefore, the center must be one of the vertices in the first edge.
        // We check if the first vertex of the first edge is the same as any vertex in the second edge.
        if (firstVertexOfFirstEdge == firstVertexOfSecondEdge || firstVertexOfFirstEdge == secondVertexOfSecondEdge) {
            // If true, then the first vertex of the first edge is the center.
            return firstVertexOfFirstEdge;
        } else {
            // If not, then the second vertex of the first edge must be the center.
            return secondVertexOfFirstEdge;
        }
    }
}
