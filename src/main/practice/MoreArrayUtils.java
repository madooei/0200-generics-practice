package practice;

import java.util.Comparator;

import generics.DynamicArray;

/**
 * Practice algorithms over a DynamicArray, in the same style as the chapter's
 * ArrayUtils. Each method reaches the elements only through the public size and
 * get operations, and assumes the array is non-empty (get(0) throws otherwise).
 */
public final class MoreArrayUtils {

  private MoreArrayUtils() {
    // This class is a namespace, not a blueprint — don't instantiate it.
  }

  // Assumes list is not null. Returns the largest element by natural order.
  // Mirrors indexOfMin, but keeps the element itself and flips the comparison
  // from < to >.
  public static <T extends Comparable<T>> T max(DynamicArray<T> list) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes list is not null. Returns the largest element by the given order.
  // No Comparable bound is needed here — the ordering arrives in cmp, so T can
  // be anything.
  public static <T> T max(DynamicArray<T> list, Comparator<T> cmp) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
