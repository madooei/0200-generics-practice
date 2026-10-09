package practice;

/** A demo of Card: value equality and the two orders, by rank and by suit. */
public final class CardDemo {

  private CardDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Card nineOfHearts = new Card(9, 'H');
    Card sameNineOfHearts = new Card(9, 'H');
    Card aceOfClubs = new Card(14, 'C');

    // Two separate Card objects with the same rank and suit are the same card.
    System.out.println("9H equals 9H? " + nineOfHearts.equals(sameNineOfHearts));

    // Natural order: by rank, so the ace comes after the nine.
    System.out.println("9H compareTo AC: " + nineOfHearts.compareTo(aceOfClubs));

    // SuitComparator: by suit first, so clubs come before hearts.
    SuitComparator bySuit = new SuitComparator();
    System.out.println("SuitComparator(9H, AC): " + bySuit.compare(nineOfHearts, aceOfClubs));
  }
}
