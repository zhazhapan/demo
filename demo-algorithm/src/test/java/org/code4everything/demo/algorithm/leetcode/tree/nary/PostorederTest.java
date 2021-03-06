package org.code4everything.demo.algorithm.leetcode.tree.nary;

import org.code4everything.demo.algorithm.leetcode.model.Node;
import org.junit.Test;

import java.util.ArrayList;

public class PostorederTest {

    @Test
    public void postorder() {
        Postoreder postoreder = new Postoreder();
        Node node = new Node(1);
        node.children = new ArrayList<>();
        node.children.add(new Node(3));
        node.children.add(new Node(2));
        node.children.add(new Node(4));
        node.children.get(0).children = new ArrayList<>();
        node.children.get(0).children.add(new Node(5));
        node.children.get(0).children.add(new Node(6));
        System.out.println(postoreder.postorder(node));
    }
}
