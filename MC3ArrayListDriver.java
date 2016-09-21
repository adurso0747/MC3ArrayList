public class MC3ArrayListDriver{

   public static void main(String[] args){
      
      Object[] o = {1,2,3,4,5};
      Object o1 = 5;
      Object o2 = 7;
      Object o3 = 3;
      Object o4 = 6;
      Object o5 = 8;
      Object o6 = 4;
      Object o7 = 200;
      
      //Constructor test
      MC3ArrayList a = new MC3ArrayList(); // Initial capacity of 10
      MC3ArrayList b = new MC3ArrayList(o); // Initial capacity of 5
      MC3ArrayList c = new MC3ArrayList( 300 ); // Initial capacity of 300
      
      //Method tests
      for(int i=0; i<12; i++){
         a.add(o1);
      }
      a.clear();
      b.ensureCapacity(8);
      b.add(o1);
      System.out.println(b.indexOf(o1));
      System.out.println(c.indexOf(o1));
      System.out.println(a.isEmpty());
      b.add(o2);
      b.add(o2);
      b.remove(2);
      System.out.println(c.get(5));
      b.set(2, o3);
      b.set(6, o4);
      b.ensureCapacity(10);
      b.set( 200, o5);
      System.out.println(b.size());
      System.out.println(b.toString());
      b.add(4, o6);
      b.ensureCapacity(13);
      b.add(8, o2);
      b.add(500, o5);
      b.addAll(o);
      for(int i = 0; i<5; i++){
         a.add(01);
      }
      a.addAll(3, o);
      a.addAll(10, o);
      System.out.println(a.lastIndexOf(o1));
      System.out.println(a.lastIndexOf(o7));
      a.remove(o3);
      a.removeAll(o1);
      a.subList(1,5);
      a.toArray();
      b.ensureCapacity(20);
      b.trimToSize();
   }
}
      