package grokking.algo.Chapter_1_Introduction_to_Algo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BFS {

    public String searchClosestWay(Map<String, List<String>> graph, String start, String finish) {
        List<String> nodes = graph.get(start);
        return checkNodes(graph, nodes, finish);
    }

    private String checkNodes(Map<String, List<String>> graph, List<String> nodes, String finish) {
        Set<String> checked = new HashSet<>();
        LinkedList<String> queue = new LinkedList<>(nodes);
        boolean notFound = true;
        int count = 0;
        while (notFound) {
            String node = queue.getFirst();
            if (!checked.contains(node)) {
                count++;
                if (node.equals(finish)) {
                    notFound = false;
                } else {
                    checked.add(node);
                    queue.removeFirst();
                    List<String> childNodes = graph.get(node);
                    if (childNodes != null) {
                        childNodes.forEach(queue::addLast);
                    }
                }
            } else {
                queue.removeFirst();
            }
        }

        return String.valueOf(count);
    }

}
