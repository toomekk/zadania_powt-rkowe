package org.example.kwiaciarnia;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class PriceList implements Map<String, Double>{

    private static PriceList instance;
    private PriceList() {
    }

    public static PriceList getInstance() {
        if (instance == null) {
            instance = new PriceList();
        }
        return instance;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Double get(Object key) {
        return null;
    }

    @Override
    public Double put(String key, Double value) {
        return null;
    }

    @Override
    public Double remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Double> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<Double> values() {
        return null;
    }

    @Override
    public Set<Entry<String, Double>> entrySet() {
        return null;
    }
}
