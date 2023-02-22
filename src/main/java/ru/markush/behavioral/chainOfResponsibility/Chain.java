package ru.markush.behavioral.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Chain {

    private List<ChainItem> chain;

    public Chain() {
        chain = new ArrayList<>();
    }

    public void add(ChainItem ... items){
        chain.addAll(List.of(items));
    }

    public Object process(Object object) {
        Object current = object;
        for (ChainItem chainItem : chain) {
            current = chainItem.consume(current);
        }
        return current;
    }
}
