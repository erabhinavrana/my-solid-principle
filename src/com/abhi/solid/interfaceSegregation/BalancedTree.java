package com.abhi.solid.interfaceSegregation;

/**
 * Created by s727248 on 12/5/2018.
 */
public class BalancedTree implements IBalancedTree {
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
        System.out.println("Traversing Balanced tree.....");
    }

    @Override
    public void rotateLeft() {
        System.out.println("Rotate left balanced tree.....");
    }

    @Override
    public void rotateRight() {
        System.out.println("Rotate Right balanced tree.....");
    }
}
