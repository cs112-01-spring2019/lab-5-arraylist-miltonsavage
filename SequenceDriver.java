public class SequenceDriver
{
   public static void main(String[] args)
   {
      Sequence firstSequence = new Sequence();
      firstSequence.add(1);
      firstSequence.add(4);
      firstSequence.add(9);
      firstSequence.add(16);
      System.out.print("First before: ");
      System.out.println(firstSequence.toString());

      Sequence secondSequence = new Sequence();
      secondSequence.add(9);
      secondSequence.add(7);
      secondSequence.add(4);
      secondSequence.add(9);
      secondSequence.add(11);
      System.out.print("Second before: ");
      System.out.println(secondSequence.toString());

      Sequence combinedSequence = firstSequence.append(secondSequence);
      System.out.print("Appended: ");
      System.out.println(combinedSequence.toString());
      System.out.println("Expected: [1, 4, 9, 16, 9, 7, 4, 9, 11]");

      Sequence mergedSequence = firstSequence.merge(secondSequence);
      System.out.print("Merged: ");
      System.out.println(mergedSequence.toString());
      System.out.println("Expected: [1, 9, 4, 7, 9, 4, 16, 9, 11]");

      System.out.print("First after: ");
      System.out.println(firstSequence.toString());

      System.out.print("Second after: ");
      System.out.println(secondSequence.toString());

      Sequence thirdSequence = new Sequence();
      thirdSequence.add(1);
      thirdSequence.add(4);
      thirdSequence.add(9);
      thirdSequence.add(16);
      System.out.print("Third before: ");
      System.out.println(thirdSequence.toString());

      Sequence fourthSequence = new Sequence();
      fourthSequence.add(4);
      fourthSequence.add(7);
      fourthSequence.add(9);
      fourthSequence.add(9);
      fourthSequence.add(11);
      System.out.print("Fourth before: ");
      System.out.println(fourthSequence.toString());

      Sequence mergedSortedSequence = thirdSequence.mergeSorted(fourthSequence);
      System.out.print("Merged Sorted: ");
      System.out.println(mergedSortedSequence.toString());
      System.out.println("Expected: [1, 4, 4, 7, 9, 9, 9, 11, 16]");

      System.out.print("Third after: ");
      System.out.println(thirdSequence.toString());

      System.out.print("Fourth after: ");
      System.out.println(fourthSequence.toString());


      Sequence fifthSequence = new Sequence();
      fifthSequence.add(16);
      fifthSequence.add(4);
      fifthSequence.add(9);
      fifthSequence.add(4);
      fifthSequence.add(7);
      fifthSequence.add(9);
      fifthSequence.add(9);
      fifthSequence.add(11);
      fifthSequence.add(16);
      fifthSequence.add(1);
      System.out.println("Fifth before: ");
      System.out.println(fifthSequence);
      fifthSequence.removeDuplicates();
      System.out.println("Fifth after removing duplicates: ");
      System.out.println(fifthSequence);


   }
}