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

public class QueueTests {
  // testing is empty
  public static boolean testIsEmpty() {
    ServingQueue s1 = new ServingQueue(10);
    // approporiate boolean
    return s1.isEmpty();
  }

  // testing peek
  public static boolean testPeek() {
    ServingQueue s2 = new ServingQueue(10);
    Guest.resetNextGuestIndex();
    Guest newGuest = new Guest();
    s2.add(newGuest);
    // return appropriate boolean
    return s2.peek().toString().equals("#1");
  }

  // testing constructor
  public static boolean testConstructor() {
    Guest.resetNextGuestIndex();
    Guest s1 = new Guest("milk");
    // return appropriate boolean
    return s1.toString().equals("#1(milk)");
  }

  public static void main(String[] args) {
    // calling testpeek
    if (testPeek()) {
      // print values
      System.out.println("testPeek passed");
    } else {
      System.out.println("testPeek failed");
    } // calling test is empty
    if (testIsEmpty()) {
      // print value
      System.out.println("testIsEmpty passed");
    } else {
      System.out.println("testIsEmpty failed");
    }
    // calling test constructor
    if (testConstructor()) {
      // return appropriate boolean
      System.out.println("testConstructor passed");
    } else {
      System.out.println("testConstructor failed");
    }



  }

}
