# Generics — Practice: An Orderable Card and a Generic max

Two practice problems: give `Card` value equality and two orderings, then write a generic `max` over a `DynamicArray`.

## Prerequisites

- JDK 17+

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  src/
    main/
      generics/
        DynamicArray.java   # the chapter's growable generic array, vendored here
                             # so this problem's code runs standalone
      practice/
        Card.java           # a value type: equals, hashCode, Comparable
        SuitComparator.java # an external ordering for Card, by suit
        MoreArrayUtils.java # a generic max over a DynamicArray
      demo/                 # one demo per problem class
        CardDemo.java
        MoreArrayUtilsDemo.java
  scripts/
    run.sh                  # compile everything and run one demo
```

## How to compile and run

- `scripts/run.sh demo.CardDemo` — compiles all source into `out/` and runs that one demo. Every class you implement has its own demo, `demo.CardDemo` and `demo.MoreArrayUtilsDemo`, so you can run one before you start the other.

There is no build tool and no test suite: testing is introduced later in the course. The script above is all you need.

## What's here

- `practice.Card` — a value type: value equality by rank and suit (`equals`/`hashCode`) and a natural order by rank, then suit (`Comparable<Card>`), kept consistent with each other.
- `practice.SuitComparator` — an ordering of cards by suit, then rank, supplied from outside `Card`.
- `practice.MoreArrayUtils` — a generic `max` over a `DynamicArray`, in two forms: by natural order (`<T extends Comparable<T>>`) and by a supplied `Comparator<T>`.
- `demo.CardDemo` and `demo.MoreArrayUtilsDemo` — one demo per problem class. `CardDemo` shows the value equality of `Card` and its two orders, and `MoreArrayUtilsDemo` shows `max` by natural order and by a `Comparator`.
- `generics.DynamicArray<T>` — the chapter's growable generic array. Vendored here unchanged so this problem's code has no dependency on the chapter's own code and compiles and runs on its own.
