package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctIterable<T> implements Iterable<T> {
    private Iterable<T> iterable;

    public DistinctIterable(Iterable<T> iterable) {
        this.iterable = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return new DistinctIterator<>(iterable.iterator());
    }

    public List<T> toList() {
        ArrayList<T> result = new ArrayList<>();
        this.forEach(result::add);
        return result;
    }
}

class DistinctIterator<E> implements Iterator<E> {
    // TODO: Implement the class to pass the test. Note that you cannot put all items into memory or you will fail.
    // <--start
    private final Iterator<E> iterator;

    DistinctIterator(Iterator<E> iterator) {
//        this.iterator = iterator;
//        List<Integer> list = new ArrayList(Arrays.asList(this.iterator));
        List<E> list = new ArrayList<>();
        iterator.forEachRemaining(e -> {
            if (!list.contains(e))
                list.add(e);
        });
        this.iterator = list.iterator();
        // List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
//        List<Integer> listWithoutDuplicates = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(listWithoutDuplicates);
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }


    @Override
    public E next() {
        return iterator.next();
    }
    // --end->
}

