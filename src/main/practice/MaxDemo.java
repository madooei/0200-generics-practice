package practice;

import java.util.Comparator;

import generics.DynamicArray;

/** A demo of the generic max, by natural order and by a Comparator. */
public final class MaxDemo {

  private MaxDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    DynamicArray<Integer> scores = new DynamicArray<>();
    scores.add(50);
    scores.add(90);
    scores.add(70);
    System.out.println("max score: " + MoreArrayUtils.max(scores));

    DynamicArray<String> names = new DynamicArray<>();
    names.add("Zoe");
    names.add("Alexander");
    names.add("Grace");
    System.out.println("max name, alphabetically: " + MoreArrayUtils.max(names));
    System.out.println("max name, by length: " + MoreArrayUtils.max(names, new ByLength()));
  }

  // Orders strings by length, a different order from the alphabetical one.
  private static class ByLength implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
      return Integer.compare(a.length(), b.length());
    }
  }
}
