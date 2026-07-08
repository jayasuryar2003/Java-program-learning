package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;

// Question: Detect cycles in a list of parent-child relationships.
public class Node {

        int id, parentId;
        Node(int id, int parentId) {
            this.id = id;
            this.parentId = parentId;
        }

    static void main() {
        List<Node> nodes = Arrays.asList(
                new Node(1, 0), new Node(2, 1), new Node(3, 2), new Node(4, 3), new Node(5, 4), new Node(2, 5)
        );
        boolean hasCycle = nodes.stream()
                .anyMatch(node -> nodes.stream().filter(n -> n.id == node.parentId).anyMatch(n -> n.id == node.id));
        System.out.println(hasCycle);



    }
    }



