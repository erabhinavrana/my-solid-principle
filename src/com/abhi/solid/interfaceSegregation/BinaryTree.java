package com.abhi.solid.interfaceSegregation;

/**
 * Created by Abhinav on 12/5/2018.
 */
public class BinaryTree implements Tree {
    @Override
    public int max() {
        return 0;
    }

    @Override
    public int min() {
        return 0;
    }

    @Override
    public void traverse() {
        System.out.println("Traversing Binary Tree.....");
    }
}
