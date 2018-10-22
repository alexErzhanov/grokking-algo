package grokking.algo.Chapter_1_Introduction_to_Algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BFSTest {

    @Test
    public void shouldFindClosestWayToElement() {
        //given
        BFS bfs = new BFS();
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("S", Arrays.asList("1", "2"));
        graph.put("1", Arrays.asList("3", "F"));
        graph.put("2", Arrays.asList("3", "4"));
        graph.put("4", Arrays.asList("3", "5"));

        //when
        String closestWay = bfs.searchClosestWay(graph, "S", "5");

        //then
        assertEquals("6", closestWay);
    }

}