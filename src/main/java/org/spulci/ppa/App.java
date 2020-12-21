package org.spulci.ppa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class App{
    public <T> List<T> flattenListOfListsStream(List<List<T>> list) {
        return list.stream()
          .flatMap(Collection::stream)
          .collect(Collectors.toList());    
    }

    public Integer[] flattenArrayOfArrayStream(Integer[][] array) {
        return  Arrays.stream(array)
          .flatMap(Stream::of)
          .toArray(Integer[]::new);
    }
}
