# Matrix

## Island Perimeter

Perimeter = 4 × land_cells − 2 × shared_edges

Reason:
Each cell has 4 sides.
A shared side is counted twice, so subtract 2.

Implementation trick:
Check only up and left neighbors to count each shared edge once.

Similar logic has been implemented in SurfaceArea3D
For each tower, its surface area is 4 * v + 2
However, 2 adjacent tower will hide the area of connected part.
The hidden part is min(v1, v2) and we need just minus this area * 2

Here also, we check up and left to count shared edge.

```java
for(int i = 0; i < row; i++){
        for( int j = 0; j<col;j++){
            if(grid[i][j]>0)
                sa +=4*grid[i][j]+2;
            if(i >0) //this neighbor check has to be kept in mind
                sa -=Math.min(grid[i][j], grid[i-1][j])*2;
            if(j >0)
                sa -=Math.min(grid[i][j], grid[i][j-1])*2;
        }
        }
```

## Reshape Matrix

- 2D matrix to 1D matrix : res[i*col + j] = mat[i][j]
- 1D matrix to 2D matrix : res[i/col][i%col] = mat[i]

## Image Smoother

Sometimes optimizing brute force techniques also do the job

## Flood Fill

BFS(Graph, start_vertex):
    
    for each vertex v in Graph:
        visited[v] ← false
    
    queue ← empty queue
    
    visited[start_vertex] ← true
    enqueue(queue, start_vertex)

    while queue is not empty:
        v ← dequeue(queue)
        process(v) //problem specific logic

        for each neighbor u of v:
            if visited[u] = false:
                visited[u] ← true
                enqueue(queue, u)

## Transpose matrix

- Input a matrix MxN
- Create new new transpose matrix NxM
- Transpose[j][i] = Original[i][j]

## Projection Area of 3D shapes

From the top, the shadow made by the shape will be 1 square for each non-zero value.

From the side, the shadow made by the shape will be the largest value for each row in the grid.

From the front, the shadow made by the shape will be the largest value for each column in the grid.

