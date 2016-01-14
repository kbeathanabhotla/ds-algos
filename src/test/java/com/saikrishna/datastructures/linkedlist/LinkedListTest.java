package com.saikrishna.datastructures.linkedlist;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by SaiKrishnaKishore on 1/14/2016.
 */
public class LinkedListTest {

    @Test
    public void test_create_an_empty_linkedlist_and_verify_size() {
        // @@ EXERCISE
        LinkedList ll = new LinkedList();

        // @@ VERIFY
        Assert.assertTrue(ll.size() == 0);
    }

    @Test
    public void test_create_linkedlist_add_element_verify_size() {
        // @@ EXERCISE
        LinkedList ll = new LinkedList();
        ll.add(5);

        // @@ VERIFY
        Assert.assertTrue(ll.size() == 1);
    }

    @Test
    public void test_create_linkedlist_add_multiple_elements_verify_size() {
        // @@ EXERCISE
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(6);
        ll.add(5);

        // @@ VERIFY
        Assert.assertTrue(ll.size() == 3);
    }

    @Test
    public void test_ll() {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(6);
        ll.add(7);

        System.out.println(ll);
        ll.reverse();
        System.out.println(ll);


    }
}
