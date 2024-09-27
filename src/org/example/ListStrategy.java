package org.example;

public interface ListStrategy<T> {
    MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode);
    MyNode<T> remove(MyNode<T> head);
}
