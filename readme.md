# Overview

This repository is a part of the Java language training plan. Please read the following guidelines before start.

# Getting Start

## Basic Principals

Each repository contains a gradle java project with a number of unit tests. The initial state of all unit tests are *FAILED*. So the aim is to correct the failed test. Please follow the following steps to get the best experience:

* Read the test code and try to understand what it says.
* Trying to fix the test **WITHOUT RUNNING**. This is very important. Because once you run the test, you may find the failure message of the test telling you the expected result. That means you may lose the chance to figure it out by yourself. Note that you should **ONLY** be able to modify code within the **TODO AREA**. The code outside the **TODO AREA** is **NOT** changable.
* Run the test to examine if the fix is correct.
* Answer the following 4 questions after the test is passed.

The 4 questions are:

1. What is the knowledge point of the test? Where is the offical document to the knowledge point?
1. Why the test failed at first?
1. Why you corrected the test that way?
1. Do you have further questions on this knowledge point?

## Example

Let's take a look at an example:

```java
@Test
void should_pass_by_value() {
  int value = 5;

  tryingToUpdateValue(value);

  // TODO: please modify the following code to pass the test
  // <--start
  final int expected = 0;
  // --end-->

  assertEquals(expected, value);
}
```

First, read the test. From the title and code we can know that the test what to examine the behavior when passing an argument. We are not sure what `tryingToUpdateValue` does, so we can jump into its implementation:

```java
private static void tryingToUpdateValue(int value) {
  value += 2;
}
```

Now we have got the full context of the test. The argument is passed by value so the integer will be copied when passing into `tryingToUpdateValue`. Thus the value from the caller site will not change.

Notice that the todo area is in the test method. So we can modify codes within the todo area to pass the test:

```java
  // TODO: please modify the following code to pass the test
  // <--start
  final int expected = 5;
  // --end-->
```

Please note that not all todo areas are located in test method. And some todo area may have further restrictions, for example:

```java
  // TODO: You should not write concrete number here. Please find a property or constant instead.
  // <!--start
  final int maximumSymbol = 0;
  final int minimumSymbol = 0;
  // --end-->
```

The hint indicates that we should not write concrete number here. So I should not write `3` or `0xffffffff`, but write symbol (e.g. `Integer.MAX_VALUE`).

## Running Test

You could run unit tests with the help of IntelliJ. But it is also possible to run unit test via command line: `./gradlew build`.

If you just want to build your code without running test. Please use `./gradlew build -x test
`
Array Test

Collection Test
	- What is the knowledge point of the test? Where is the official document to the knowledge point?
   	- Why the test failed at first?
   	- Why you corrected the test that way?
   	- Do you have further questions on this knowledge point?
   	None

Array Test 
*PUSH 
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test it to understand on how to push value in another array. 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
I corrected it that way for it to store the value. 
- Do you have further questions on this knowledge point?
None

*ensureCapacity
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how to create new size capacity of the array. 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
I clone storage array in a temp array because i will update the size of the storage. 
After that since i clone storage in temp array, i can know put the value input in temp array to storage array then return it. 
- Do you have further questions on this knowledge point?
None

*pop
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how to ppop one element in a array. 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
To pop each elemnt in a array. 
- Do you have further questions on this knowledge point?
None

CollectionTest
*void should_go_through_an_iterator() {
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how to used .hasNext and .next method.
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
I create new array to store the value of the Iterator. 
- Do you have further questions on this knowledge point?
None


*SequenceIterator
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how to create array and get iterator. 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
I created it that way for it to have a list that will act as an holder. 
- Do you have further questions on this knowledge point?
None

*SequenceIterator
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how append value in an array. 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
I created it that way to append value in array. 
Then put the value of list in the Iterator. 
- Do you have further questions on this knowledge point?
None

*hasNext
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how about .hasNext(). 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
To return true since it's checking if the actual and the expected is returning true.
- Do you have further questions on this knowledge point?
None

*Next
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how about .hasNext(). 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
To return true since it's checking if the actual and the expected is returning true. 
- Do you have further questions on this knowledge point?
None

*should_predict_linked_list_operation_result
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how about Array.aslist() 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
Since Array.aslist is use to defined fixed value. 
I input just input the expected output.
- Do you have further questions on this knowledge point?
None

*should_generate_distinct_sequence_on_the_fly
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how remove duplicate item in the array. 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
I create new array and use lamba to check it the list contain duplicated item. 
then after filtering i return the value of filtered array in the iterator. 
- Do you have further questions on this knowledge point?
None

*should_reflects_back_to_original_list_for_sub_range
- What is the knowledge point of the test? Where is the official document to the knowledge point?
The knowledge point of this test is to know how about Array.aslist() 
- Why the test failed at first?
Array is not equal with the expected value.
- Why you corrected the test that way?
Since Array.aslist is use to defined fixed value. 
I input just input the expected output.
- Do you have further questions on this knowledge point?
None



 
