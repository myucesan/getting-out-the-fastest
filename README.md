A maze is represented by a weighted directed graph 𝐺=(𝑉,𝐸)
, where 𝑉
denotes the set containing 𝑛
vertices and 𝐸
the set containing 𝑚
directed edges. Each vertex represents an intersection or end point in the maze and the edges represent paths between them. A directed edge is used for (downhill) tunnels and holes that you can jump into, but where it is impossible to get back. Because of this, it may become impossible to reach the exit.

Some edges take longer than others, which is expressed in their weight.

Additionally, the sheer number of options you can choose from in every vertex overwhelms you quite a bit. As such every vertex takes 1
additional time step per outgoing edge (because you have to find out what is the correct one).

Design and implement an algorithm that determines the path from 𝑠
to 𝑡
that takes the least amount of time ( which is the sum of lengths of all edges plus for all vertices (except 𝑡
) the number of outgoing edges). Let the algorithm just print the total time of this path. Aim for the most efficient algorithm you can think of. Extremely slow implementations will likely trigger timeouts in the spec tests.