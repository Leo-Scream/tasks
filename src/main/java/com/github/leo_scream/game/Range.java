package com.github.leo_scream.game;

import java.util.Iterator;
import java.util.List;

/**
 * Specification: src/test/kotlin/com/github/leo_scream/game/RangeSpec.kt
 */
public interface Range {

    int lowerBound();

    int upperBound();

    default boolean isBefore(final Range other) {
        throw new UnsupportedOperationException();
    }

    default boolean isAfter(final Range other) {
        throw new UnsupportedOperationException();
    }

    default boolean isConcurrent(final Range other) {
        throw new UnsupportedOperationException();
    }

    default boolean contains(final int value) {
        throw new UnsupportedOperationException();
    }

    default List<Integer> asList() {
        throw new UnsupportedOperationException();
    }

    default Iterator<Integer> asIterator() {
        throw new UnsupportedOperationException();
    }

    static Range within(final int lower, final int upper) {
        return new Range() {
            @Override
            public int lowerBound() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int upperBound() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
