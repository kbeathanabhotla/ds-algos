package com.saikrishna.datastructures.linkedlist;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by SaiKrishnaKishore on 1/14/2016.
 */
public class LinkedListTest {

    @Test
    public void test_create_an_empty_list_and_verify_size() {
        // @@ EXERCISE
        LinkedList ll = new LinkedList();

        // @@ VERIFY
        Assert.assertTrue(ll.size() == 0);
    }

    @Test
    public void test_create_list_add_element_verify_size() {
        // @@ EXERCISE
        LinkedList ll = new LinkedList();
        ll.add(5);

        // @@ VERIFY
        Assert.assertTrue(ll.size() == 1);
    }

    @Test
    public void test_create_list_add_multiple_elements_verify_size() {
        // @@ EXERCISE
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(6);
        ll.add(5);

        // @@ VERIFY
        Assert.assertTrue(ll.size() == 3);
    }

    @Test
    public void test_verify_exists() {
        // @@ EXERCISE
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(6);
        ll.add(5);

        // @@ VERIFY
        Assert.assertTrue(ll.exists(5) == 0);
        Assert.assertTrue(ll.exists(6) == 1);
    }

    @Test
    public void test_reverse_linkedlist() {
        // @@ SETUP
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(6);
        ll.add(7);

        // @@ EXERCISE
        ll.reverse();

        // @@ VERIFY
        Assert.assertTrue(ll.get(0) == 5);
        Assert.assertTrue(ll.get(1) == 6);
        Assert.assertTrue(ll.get(2) == 7);
    }

    @Test
    public void test_rotate_left() {
        // @@ SETUP
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(6);
        ll.add(7);

        // @@ EXERCISE
        ll.rotateLeft(1);
        ll.rotateLeft(2);
        ll.rotateLeft(3);
        ll.rotateLeft(4);
        ll.rotateLeft(5);
        ll.rotateLeft(6);

        // @@ VERIFY
        Assert.assertTrue(ll.get(0) == 7);
        Assert.assertTrue(ll.get(1) == 6);
        Assert.assertTrue(ll.get(2) == 5);
    }

    @Test
    public void test_linked_list_keep_m_and_delete_n() {
        // @@ SETUP
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        ll.add(11);
        ll.add(12);

        // @@ EXERCISE
        ll.keepMAndDeleteN(2,3);

        // @@ VERIFY
        Assert.assertTrue(ll.get(0) == 12);
        Assert.assertTrue(ll.get(1) == 11);
        Assert.assertTrue(ll.get(2) == 7);
        Assert.assertTrue(ll.get(3) == 6);
    }

    @Test
    public void test_linked_list_keep_m_and_delete_n_should_delete_all_nodes_if_m_is_zero() {
        // @@ SETUP
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        ll.add(11);
        ll.add(12);

        // @@ EXERCISE
        ll.keepMAndDeleteN(0,3);

        // @@ VERIFY
        Assert.assertTrue(ll.size() == 0);
    }
}
