package com.abhi.solid;

import com.abhi.solid.databaseInversion.DatabaseHandler;
import com.abhi.solid.databaseInversion.MySQLDatabase;
import com.abhi.solid.databaseInversion.OracleDatabase;
import com.abhi.solid.interfaceSegregation.BalancedTree;
import com.abhi.solid.interfaceSegregation.BinaryTree;
import com.abhi.solid.interfaceSegregation.IBalancedTree;
import com.abhi.solid.interfaceSegregation.Tree;
import com.abhi.solid.liskov.*;
import com.abhi.solid.openclosed.InsertionSort;
import com.abhi.solid.openclosed.MergeSort;
import com.abhi.solid.openclosed.SorterManager;
import com.abhi.solid.singleresponsibility.Book;
import com.abhi.solid.singleresponsibility.BookOperations;

/**
 * Created by Abhinav on 11/29/2018.
 *
 * -----SOLID Responsibility Principle------
 * ---- S : Single Responsibility ------
 * ---- O : Open Closed Principle ------
 * ---- L : Liskov Substitution --------
 * ---- I : Iterface Segregation -------
 * ---- D : Dependency Inversion -------
 *
 */
public class SolidApp {

    public static void main(String []args){

        // Single Responsibility principle
        BookOperations book1 = new Book("Abhi", 102);
        book1.save();

        //Open-Closed Principle
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new InsertionSort());
        sorterManager.sort(new MergeSort());

        //Liskov Substitution Principle
        NormalVehicle vehicle = new Car();
        vehicle.speed();
        vehicle.addFuel();

        ElectricVehicle electricVehicle = new ElectricCar();
        electricVehicle.speed();
        electricVehicle.chargeBattery();

        //Interface Segregation Principle
        Tree tree = new BinaryTree();
        tree.traverse();

        IBalancedTree iBalancedTree = new BalancedTree();
        iBalancedTree.traverse();
        iBalancedTree.rotateLeft();
        iBalancedTree.rotateRight();

        //Dependency Inversion Principle
        DatabaseHandler databaseHandler = new DatabaseHandler(new MySQLDatabase()); //Runtime dependency injection
        databaseHandler.connect();
        databaseHandler.disconnect();

        databaseHandler = new DatabaseHandler(new OracleDatabase());
        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}
