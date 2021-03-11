//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Book Library: Project 8
// Files:
// Course: CS 300, Spring '19
//
// Author: Sheriff Issaka
// Email: issaka@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:
// Partner Email:
// Partner Lecturer's Name:
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// _X__ Write-up states that pair programming is allowed for this assignment.
// __X_ We have both read and understand the course Pair Programming Policy.
// _X__ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: (identify each person and describe their help in detail)
// Online Sources: (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * @author Sheriff
 *
 */
public class ServingQueue extends Guest {
  // keeping all guests
  private Guest[] array;
  // checking size
  private int size;
  // keeping front of array
  private int front = 0;
  // keeping the back
  private int back = 0;

  /**
   * Creates a new array based queue with a capacity of "seatsAtTable" guests. This queue should be
   * initialized to be empty.
   * 
   * @param seatsAtTable the size of the array holding this queue data
   */
  public ServingQueue(int seatsAtTable) {
    // setting size to the number of seats
    array = new Guest[seatsAtTable];
    size = 0;
  }

  /**
   * Checks whether there are any guests in this serving queue.
   * 
   * @return true when this queue contains zero guests, and false otherwise.
   */
  /**
   * @return size
   */
  public boolean isEmpty() {
    // appropriate boolean returned if size is or isnt zero
    return size == 0;
  }

  /**
   * Adds a single new guest to this queue (to be served after the others that were previously added
   * to the queue).
   * 
   * @param newGuest is the guest that is being added to this queue.
   * @throws IllegalStateException when called on a ServingQueue with an array that is full
   */
  /**
   * @param newGuest
   */
  public void add(Guest newGuest) {
    if (array.length == size) {
      // if it's full an exception is thrown
      throw new IllegalStateException();
    } else {
      // increasing back
      array[back++] = newGuest;
      // using modulos to find appropriate positions
      back = back % array.length;
    } // incrementing size
    size++;
  }

  /**
   * Accessor for the guest that has been in this queue for the longest. This method does not add or
   * remove any guests.
   * 
   * @return a reference to the guest that has been in this queue the longest.
   * @throws IllegalStateException when called on an empty ServingQueue
   */
  /**
   * @return array[front]
   */
  public Guest peek() {
    // an exception is guest list is empty
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    // returned value
    return array[front];
  }

  /**
   * Removes the guest that has been in this queue for the longest.
   * 
   * @return a reference to the specific guest that is being removed.
   * @throws IllegalStateException when called on an empty ServingQueue
   */
  /**
   * @return re
   */
  public Guest remove() {
    // throws exceptions
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    // keeping front
    Guest re = array[front];
    // setting array to null
    array[front++] = null;
    // using modulus to determine position
    front = front % array.length;
    // decrementing size
    size--;
    // returning guest
    return re;
  }

  /**
   * The string representation of the guests in this queue should display each of the guests in this
   * queue (using their toString() implementation), and should display them in a comma separated
   * list that is surrounded by a set of square brackets. (this is similar to the formatting of
   * java.util.ArrayList.toString()). The order that these guests are presented in should be (from
   * left to right) the guest that has been in this queue the longest, to the guest that has been in
   * this queue the shortest. When called on an empty ServingQueue, returns "[]".
   * 
   * @return string representation of the ordered guests in this queue
   * @see java.lang.Object#toString()
   */
  /*
   * (non-Javadoc)
   * 
   * @see Guest#toString()
   */
  @Override
  public String toString() {
    // setting front
    String toRe = "[";
    if (isEmpty()) {
      // if its empty
      return "[]";
    } else {
      for (int i = 0; i < size; i++) {
        toRe += array[(front + i) % array.length].toString() + ",";
      }
      toRe = toRe.substring(0, toRe.length() - 1);
      return (toRe + "]");
    }
  }
}
