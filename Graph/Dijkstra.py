
import queue


class Graph:
    def __init__(self,edges):
        self.edges=edges
        self.graph_dict={}
        self.all_node=[]

        for start,end,distance in edges: #for each edge
            if start in self.graph_dict: #if start is in graph_dict
                self.graph_dict[start].append({end:distance}) #append end to graph_dict[start]
            else:
                self.graph_dict[start]=[{end:distance}] #else add start to graph_dict with end and distance
            if start not in self.all_node:
                self.all_node.append(start)
            if end not in self.all_node:
                self.all_node.append(end)    
        # print(self.graph_dict)

    def shortest_path(self,start,end):
        visited={}
        distance={}
        queue_=[]
        idx=0
        for key in self.all_node:
            visited[key]=False
            distance[key]=float('inf')
        distance[start]=0   
        queue_.append(start)

        while idx <len(queue_) and not visited[end]:
            current=queue_[idx]
            idx+=1 
            self.update_neighoubr(current,distance)
            minnode=self.pick_smallest_node(distance,visited)
            if minnode :
                queue_.append(minnode)
                
            visited[current]=True    
        print(queue_,distance)
    def update_neighoubr(self,current,distance):
        neighbours=self.graph_dict[current]
        for neighbour  in neighbours:
            for key in neighbour.keys():
                if distance[current]+neighbour[key]<distance[key]:
                    distance[key]=distance[current]+neighbour[key]  
    def pick_smallest_node(self,distance,visited):
        min_distance=float("inf")
        min_node=None
        for node in distance:
            if  not visited[node] and distance[node]<min_distance:
                min_distance=distance[node]
                min_node=node
        return min_node        

routes=(
    ("Mumbai","Pune",10),
    ("Mumbai", "Surat",9),
    ("Surat", "Bangaluru",8),
    ("Pune","Hyderabad",7),
    ("Pune","Mysuru",6),
    ("Hyderabad","Bangaluru",5),
    ("Hyderabad","Bangaluru",5),
    ("Hyderabad", "Chennai",4),
    ("Mysuru", "Bangaluru",3),
    ("Bangaluru", "Pune",2)

)  

g1=Graph(routes)
g1.shortest_path('Mumbai','Bangaluru')
