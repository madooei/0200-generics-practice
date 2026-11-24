package demo;

import generics.DynamicArray;
import java.util.Comparator;
import practice.MoreArrayUtils;

/** A demo of MoreArrayUtils: the generic max, by natural order and by a Comparator. */
public final class MoreArrayUtilsDemo {

  private MoreArrayUtilsDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    DynamicArray<Integer> scores = new DynamicArray<>();
    scores.add(50);
    scores.add(90);
    scores.add(70);

    // Expect 90.
    System.out.println("max score: " + MoreArrayUtils.max(scores));

    DynamicArray<String> names = new DynamicArray<>();
    names.add("Zoe");
    names.add("Alexander");
    names.add("Grace");

    // Alphabetically, Zoe comes last. Expect Zoe.
    System.out.println("max name, alphabetically: " + MoreArrayUtils.max(names));

    // By length, Alexander is the longest. Expect Alexander.
    System.out.println("max name, by length: " + MoreArrayUtils.max(names, new ByLength()));
  }

  // Orders strings by length, a different order from the alphabetical one.
  private static class ByLength implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
      return Integer.compare(first.length(), second.length());
    }
  }
}
