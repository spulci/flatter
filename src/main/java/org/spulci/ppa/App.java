package org.spulci.ppa;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class App{
    public <T> List<T> flattenListOfListsStream(List<List<T>> list) {
        return list.stream()
          .flatMap(Collection::stream)
          .collect(Collectors.toList());    
    }

    public Integer[] flattenArrayOfArrayStream(Integer[][] array) {
        return  Arrays.stream(array)
          .flatMap(Arrays::stream)
          .toArray(Integer[]::new);
    }
}
