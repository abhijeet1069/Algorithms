package algo.greedy.textbook;

import java.util.*;

// Invariant : Women improves
public class GaleShapley {

    public static Map<String, String> stableMatching(
            Map<String, List<String>> menPref,
            Map<String, List<String>> womenPref) {

        // Build ranking map for women: woman -> (man -> rank)
        Map<String, Map<String, Integer>> womenRank = getStringMapMap(womenPref);

        // woman : current partner
        Map<String, String> womanPartner = new HashMap<>();

        // man -> next proposal index
        Map<String, Integer> nextProposalIndex = new HashMap<>();
        for (String man : menPref.keySet()) {
            nextProposalIndex.put(man, 0);
        }
        // free men queue
        Queue<String> freeMen = new ArrayDeque<>(menPref.keySet());

        while (!freeMen.isEmpty()) {
            String man = freeMen.poll();

            int index = nextProposalIndex.get(man);
            String woman = menPref.get(man).get(index);
            nextProposalIndex.put(man, index + 1);

            if (!womanPartner.containsKey(woman)) {
                // woman is free
                womanPartner.put(woman, man);
            } else {
                String currentMan = womanPartner.get(woman);
                // compare preferences
                if (womenRank.get(woman).get(man)
                        < womenRank.get(woman).get(currentMan)) {
                    womanPartner.put(woman, man);
                    freeMen.add(currentMan);
                } else {
                    freeMen.add(man);
                }
            }
        }

        return womanPartner;
    }

    private static Map<String, Map<String, Integer>> getStringMapMap(Map<String, List<String>> womenPref) {
        Map<String, Map<String, Integer>> womenRank = new HashMap<>();
        for (var entry : womenPref.entrySet()) {
            String woman = entry.getKey();
            List<String> prefs = entry.getValue();

            Map<String, Integer> rankMap = new HashMap<>();
            for (int i = 0; i < prefs.size(); i++) {
                rankMap.put(prefs.get(i), i);
            }
            womenRank.put(woman, rankMap); //lower number is better preference
            //womenRank["X"] = { "B":0, "A":1, "C":2 }
        }
        return womenRank;
    }

    // Demo
    public static void main(String[] args) {

        Map<String, List<String>> menPref = Map.of(
                "A", List.of("X", "Y", "Z"),
                "B", List.of("X", "Y", "Z"),
                "C", List.of("Y", "Z", "X")
        );

        Map<String, List<String>> womenPref = Map.of(
                "X", List.of("B", "A", "C"),
                "Y", List.of("A", "C", "B"),
                "Z", List.of("A", "B", "C")
        );

        Map<String, String> matching =
                stableMatching(menPref, womenPref);

        for (var entry : matching.entrySet()) {
            System.out.println(
                    "Woman " + entry.getKey() +
                            " is matched with Man " + entry.getValue()
            );
        }
    }
}