import java.util.ArrayList;
import java.lang.Math;

public class Sequence
{
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }

   public void add(int n)
   {
      values.add(n);
   }

   public String toString()
   {
      return values.toString();
   }

   public int get(int x){                    //implementing three other of ArrayList's functions, might have been easier to just inherit ArrayList
      return values.get(x);
   }

   public int length(){
      return values.size();
   }

   public void remove(int x){
      values.remove(x);
   }


   public Sequence append(Sequence other)
   {
      Sequence newSeq = new Sequence();
      for (int i=0; i < this.length(); i++){
         newSeq.add(this.get(i));
      }
      for (int j=0; j < other.length(); j++){
         newSeq.add(other.get(j));
      }

      return newSeq;
   }

   public Sequence merge(Sequence other){
      Sequence mergeSeq = new Sequence();
      int totalLength = this.length() + other.length();

      for (int i=0; i < totalLength; i++){
         if (this.length() > i){
            mergeSeq.add(this.get(i));
         }
         if (other.length() > i){
            mergeSeq.add(other.get(i));
         }
      }

      return mergeSeq;
   }

   public Sequence mergeSorted(Sequence other){
      Sequence mergedSortedSeq = new Sequence();
      int fullLength = this.length() + other.length();
      int thisIndex = 0;
      int otherIndex = 0;
      while (mergedSortedSeq.length() < fullLength){                    
         if (thisIndex == this.length()){                      //if first sequence is exhausted, appends rest of other sequence and breaks
            for (int j = otherIndex; j < other.length(); j++){
               mergedSortedSeq.add(other.get(j));
            }
            break;
         }
         if (otherIndex == other.length()){                     
            for (int k = thisIndex; k < this.length(); k++){
               mergedSortedSeq.add(this.get(k));
            }
            break;
         }
         if (this.get(thisIndex) < other.get(otherIndex)){
            mergedSortedSeq.add(this.get(thisIndex));
            thisIndex ++;
         }
         else{
            mergedSortedSeq.add(other.get(otherIndex));
            otherIndex ++;
         }
      }
      return mergedSortedSeq;

   }

   public void removeDuplicates(){
      int index = 0;
      for (int i = 0; i < this.length(); i++){
         for (int j = i + 1; j < this.length(); j++){
            while (this.get(i) == this.get(j)){                   //using while, so that it checks the new j after the previous j is removed
               this.remove(j);
            }
         }
      }
   }
}