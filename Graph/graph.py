


class Stack:
    def __init__(self):
        self.container = []

    def push(self, val):
        self.container.append(val)

    def pop(self):
        return self.container.pop()

    def peek(self):
        return self.container[-1]

    def is_empty(self):
        return len(self.container) == 0

    def size(self):
        return len(self.container)
 
class Graph:
    def __init__(self,edges):
        self.edges=edges
        self.graph_dict={}

        for start,end,distance in edges: #for each edge
            if start in self.graph_dict: #if start is in graph_dict
                self.graph_dict[start].append({end:distance}) #append end to graph_dict[start]
            else:
                self.graph_dict[start]=[{end:distance}] #else add start to graph_dict with end and distance
    
    def get_paths(self,start,end,path=[],distance=0,visited_node=[]):
        path=path+[{start:distance}]
        visited_node=visited_node+[start]
        if start==end:
            return [path]
        if start not in self.graph_dict:
            return []
        paths=[]
        for node in self.graph_dict[start]:
            for node_ in node.keys():
                if node_ not in visited_node:
                    new_path=self.get_paths(node_,end,path,node[node_],visited_node)    
                    for i in new_path:
                        paths.append(i)

        return paths

    def get_shortes_path(self,start,end):
        allpaths=self.get_paths(start,end)
        distance={}
        for index,path in enumerate(allpaths):
            total_distance=0
            for node in path:
                for distance_ in node.values():
                    total_distance+=distance_
            distance[index]=total_distance
                
        minvalue=min(distance.values()) 
        min_value_index=[key for key in distance.keys()  if distance[key]==minvalue]    
        return allpaths[min_value_index[0]]    
    def bfs(self,start):
        visited_node=[start]
        worklist=[start]
        parent={}
        idx=0
        while idx<len(worklist):
            node=worklist[idx]
            idx=idx+1

            if node in self.graph_dict:
                for node_ in self.graph_dict[node]:
                    for node_1 in node_:
                        if node_1 not in visited_node:
                            worklist.append(node_1)
                            parent[node_1]=node
                            visited_node.append(node_1)
        return visited_node ,parent           
    def depht_first_search(self,start):
        visited_node=[start]
        
        worklist=Stack()
        worklist.push(start)
        parent={}
        while worklist.size():
            node=worklist.pop()
            # break

            if node in self.graph_dict:
                for node_ in self.graph_dict[node]:
                    for node_1 in node_:
                        if node_1 not in visited_node:
                            worklist.push(node_1)
                            parent[node_1]=node
                            visited_node.append(node_1)




        return visited_node ,parent  
    def iscylce(self,start):
        visited_node=[start]
        worklist=Stack()
        worklist.push(start)
        parent={}
        while worklist.size():
            node=worklist.pop()
            if node in self.graph_dict:
                for node_ in self.graph_dict[node]:
                    for node_1 in node_:
                        if node_1 not in visited_node:
                            worklist.push(node_1)
                            parent[node_1]=node
                            visited_node.append(node_1)
                        else:
                            return True
        return False
     
                    


# routes=(
#     ("Mumbai","Pune",10),
#     ("Mumbai", "Surat",9),
#     ("Surat", "Bangaluru",8),
#     ("Pune","Hyderabad",7),
#     ("Pune","Mysuru",6),
#     ("Hyderabad","Bangaluru",5),
#     ("Hyderabad","Bangaluru",5),
#     ("Hyderabad", "Chennai",4),
#     ("Mysuru", "Bangaluru",3),
#     ("Bangaluru", "Pune",2)

# )  

# routes=(
#     (1,2,0),
#     (1,3,0),
#     (1,5,0),
#     (2,1,0),
#     (3,1,0),
#     (4,2,0),
#     (5,2,0),



# )

routes=(
    (0,3,0),
    (0,2,0),
    (3,2,0),
    (2,0,0),
    (2,1,0),
    (1,3,0),

)
graph=Graph(routes)

start=1
end='Bangaluru'

# print(graph.bfs("Pune"))
# print(graph.depht_first_search(1))
# print(graph)
# print(f"All paths between: {start} and {end}: ",graph.get_paths(start,end))

# print(f"Shorted path between : {start} and {end}: ",graph.get_shortes_path(start,end))

# test={"end":"1"}

# print(test.values())


print(graph.iscylce(1))