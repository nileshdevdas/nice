package nice.scalanice

object SetDemo extends App {

   val set1 = Set(1,2,3,4,5);

   val set2 = Set(3,4,5,6);
   
   println(set1 diff set2); // compares left
   
   println(set2 diff set1); // compares left
   
   println(set1 union set2)
   
   println(set1 intersect set2);
   
   println(set1 ++ set2)
   
   println(set2 -- set1);
   
   println(set1 - 3) ;
}