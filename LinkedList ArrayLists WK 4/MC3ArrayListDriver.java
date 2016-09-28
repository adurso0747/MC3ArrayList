public class MC3ArrayListDriver
{
   public static void main(String[] args)
   {
      Object[] o = {1,2,3,4,5};
      Object o1 = 6;
      Object o2 = 7;
      Object o3 = 4;
      Object o4 = 3;
      MC3ArrayList a = new MC3ArrayList();
      MC3ArrayList b = new MC3ArrayList(o);
      a.add(o1);
      a.add(o2);
      b.add(o1);     
      a.clear();
      int test = b.indexOf(o3);
      boolean test2 = a.isEmpty();
      boolean test3 = b.isEmpty();
      Object test4 = b.remove(3);
      Object test5 = b.remove(80);
      Object test6 = b.get(3);
      Object test7 = b.get(80);
      b.set(3, o3);
      Object test8 = b.set(40,o2);
      int test9 = b.size();
      System.out.println(b.toString()); 
      b.add(5, o4);
      b.addAll(o);
      b.addAll(8, o);
      int test10 = b.lastIndexOf(o4);
      b.remove(o1); 
      b.removeAll(o3);
      Object[] test11 = b.subList(1,3);
      Object[] test12 = b.toArray();
   }
}
   