# Groovy NullPointerException in 'each' method
This repository demonstrates a common NullPointerException that can occur in Groovy when using the `each` method on a list that might be null.  The example shows how to handle this situation gracefully using safe navigation or null checks.

## Problem
The Groovy `each` method is convenient for iterating over lists. However, if the list is null, a `NullPointerException` is thrown.

## Solution
The solution involves adding a null check before using the `each` method, or using the safe navigation operator.
