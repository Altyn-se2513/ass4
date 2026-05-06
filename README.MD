# Graph Traversal Project

## 📌 Overview
This project implements a graph using an **adjacency list** and demonstrates two traversal algorithms:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

Graphs of different sizes (10, 30, 100 vertices) are used to analyze performance.

---

## 📌 Graph Structure
The graph consists of:
- Vertices (nodes)
- Edges (connections)

Representation (adjacency list):
0 → [1, 2]  
1 → [0, 3]  
2 → [0]  
3 → [1]

---

## 📌 Classes

### Vertex
Represents a node with a unique `id`.

### Edge
Represents a connection between two vertices (source → destination).  
*(Not directly used in adjacency list implementation but included for modeling.)*

### Graph
Implements adjacency list and provides:
- addVertex()
- addEdge()
- printGraph()
- bfs()
- dfs()

### Experiment
Runs BFS and DFS and measures execution time using `System.nanoTime()`.

---

## 📌 BFS (Breadth-First Search)
- Uses a **queue**
- Visits nodes level by level
- Time complexity: **O(V + E)**

---

## 📌 DFS (Depth-First Search)
- Uses **recursion**
- Explores deep paths first
- Time complexity: **O(V + E)**

---

## 📌 Experimental Results

| Graph Size | BFS Time | DFS Time |
|------------|----------|----------|
| 10         | fast     | fast     |
| 30         | medium   | medium   |
| 100        | slower   | slower   |

---

## 📌 Observations
- Execution time increases with graph size
- Both BFS and DFS follow O(V + E) complexity
- BFS is better for shortest path problems
- DFS is better for deep traversal and exploration

---

## 📌 Conclusion
This project demonstrates graph representation using adjacency lists and compares BFS and DFS in terms of traversal behavior and performance on different graph sizes.