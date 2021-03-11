//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: Book Library: Project 3
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

public class DessertSolvers {


  /**
   * @param numberOfGuests
   * @param guestsSkipped
   * @return
   */
  public static Guest firstDessertVariableSkips(int numberOfGuests, int guestsSkipped) {
    // if its not positive
    if (numberOfGuests <= 0 || guestsSkipped < 0) {
      throw new IllegalArgumentException();
    }
    // new serving queue
    ServingQueue s1 = new ServingQueue(numberOfGuests);
    // resetting guest
    Guest.resetNextGuestIndex();
    Guest guest = null;
    for (int i = 0; i < numberOfGuests; i++) {
      s1.add(new Guest());
    }

    while (!s1.isEmpty()) {
      guest = s1.remove(); // serving
      if (s1.isEmpty())
        break;
      for (int j = 0; j < guestsSkipped; j++) { // skipping
        s1.add(s1.remove());
      }
    }

    return guest;
  }


  /**
   * @param numberOfGuests
   * @param coursesServed
   * @return
   */
  public static Guest firstDessertVariableCourses(int numberOfGuests, int coursesServed) {
    // throws exception
    if (numberOfGuests <= 0 || coursesServed <= 0) {
      throw new IllegalArgumentException();
    }
    // 2 queues to keep track
    ServingQueue s2 = new ServingQueue(numberOfGuests);
    ServingQueue s3 = new ServingQueue(numberOfGuests);
    // resetting guest
    Guest.resetNextGuestIndex();
    // adding number of guests
    for (int i = 0; i < numberOfGuests; i++) {
      s2.add(new Guest());
    }

    // if theres just on couse served
    if (coursesServed == 1) {
      return s2.peek();
    } else {

      for (int i = 0; i < coursesServed - 1; i++) {
        while (true) {
          s3.add(s2.remove());
          if (s2.isEmpty())
            break;
          s2.add(s2.remove());
        }
        for (int j = 0; j < numberOfGuests - 1; j++) {
          s3.add(s3.remove());
        }
        s2 = s3;
        s3 = new ServingQueue(numberOfGuests);

      }

      return s2.peek();
    }


  }

}
