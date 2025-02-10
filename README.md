# Groovy ConcurrentModificationException Bug
This repository demonstrates a common bug in Groovy where a `ConcurrentModificationException` occurs when modifying a list while iterating over it using `eachWithIndex`.

The `bug.groovy` file contains the buggy code. The `bugSolution.groovy` file provides a corrected version.

## Bug Description
The original code attempts to remove an element from a list while iterating through it. This causes a `ConcurrentModificationException` because the iterator's internal state is invalidated by the list modification.

## Solution
The solution uses an iterator's `remove()` method to safely remove elements from the list during iteration. This avoids the `ConcurrentModificationException`.