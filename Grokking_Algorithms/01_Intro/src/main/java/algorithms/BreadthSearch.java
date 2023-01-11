package main.java.algorithms;

import java.util.*;

public class BreadthSearch {

    public static Map<String , List<String >> graph = new HashMap<>();

    List<String> alreadyProcessed = new ArrayList<>();

    public String findTheSeller (String name){
        Queue<String> peopleQueue = new ArrayDeque<>(graph.get(name));

        while(!peopleQueue.isEmpty()){

            String person = peopleQueue.poll();
            if (!alreadyProcessed.contains(person)) {

                if (person.endsWith("m")) {
                    return person;
                } else {

                    peopleQueue.addAll(graph.get(person));
                    alreadyProcessed.add(person);
                }
            }
        }
    return "No seller was found";

    }

    public static void main(String[] args) {

        graph.put("anton", new ArrayList<>(Arrays.asList("alice", "bob", "claire")));
        graph.put("bob", new ArrayList<>(Arrays.asList("anuj", "peggy")));
        graph.put("alice", new ArrayList<>(Arrays.asList("peggy")));
        graph.put("claire", new ArrayList<>(Arrays.asList("thom", "jonny", "Claire")));
        graph.put("anuj", Collections.EMPTY_LIST);
        graph.put("peggy", Collections.EMPTY_LIST);
        graph.put("thom", Collections.EMPTY_LIST);
        graph.put("jonny", Collections.EMPTY_LIST);

        System.out.println(new BreadthSearch().findTheSeller("anton"));
    }
}
