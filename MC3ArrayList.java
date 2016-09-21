public class MC3ArrayList {

   // Much of this program is based on the StringLog found in Section 2.3
   Object[] data;
   int lastIndex = -1;
   static final int INITIAL_CAPACITY = 10;

   //Constructors
   public MC3ArrayList() {
      data = new Object[INITIAL_CAPACITY];
   }
   
   public MC3ArrayList(Object[] o){
      data = o;
      for(int i = 0; i<o.length; i++){
         lastIndex++;
      }
   }
   
   public MC3ArrayList(int initialCapacity){ 
      data = new Object[initialCapacity];
      for(int i = 0; i<initialCapacity; i++){
         lastIndex++;
      }
   }
   
   //Methods
   public void add(Object o){
      lastIndex++;
      if(lastIndex > data.length-1){
         Object[] newData = new Object[lastIndex+1];
         for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
         }
         data = newData;
      }
      data[lastIndex] = o;
   }
   
   public void clear(){
      for(int i=0; i <=lastIndex; i++){
         data[i] = null;
      }
      lastIndex = -1;
   }
   
   public void ensureCapacity(int minCapacity){
      Object[] newData = new Object[minCapacity];
      for(int i = 0; i < data.length; i++){
         newData[i] = data[i];
      }
      data = newData;
   } 
   
   public int indexOf(Object o){
      int i = 0;
      while(i < lastIndex){
         if(o == data[i]){
            return i;
         }
         else{
            i++;
         }
      
       }
      return -1;
   }
   
   public boolean isEmpty(){
      if(lastIndex == -1){
         return true;
      }
      else{
         return false;
      }
   }
   public Object remove(int index){
      Object newObject;
      int newNullIndex = 0;
      newObject = data[index];
      data[index] = null;
      for(int i = index; i < data.length-1; i++){
         data[i] = data[i+1];
         newNullIndex = i+1;
      }
      lastIndex--;
      data[newNullIndex] = null;
      return newObject;
   }
   
   public Object get(int index){
      return data[index];
   }
   
   public Object set(int index, Object o){
      Object newObject = null;
      if(lastIndex == data.length-1){
         newObject = data[index];
         lastIndex++;
         Object[] newData = new Object[lastIndex+1];
         for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
         }
         data = newData;
         for(int i = data.length-1; i > index; i--){
            data[i] = data[i-1];
         }
       data[index] = o;
      }
      else if(index>0 && index<=lastIndex){
         newObject = data[index];
         for(int i = data.length-1; i > index; i--){
            data[i] = data[i-1];
         }
         lastIndex++;
         data[index] = o;
      }
      else{
         data[lastIndex + 1] = o;
         lastIndex++;
      }
      return newObject;
   }
   
   public int size(){
      return (lastIndex + 1);
   }
   
   public String toString(){
      String dataString = "Data: \n\n";
      for(int i = 0; i <= lastIndex; i++)
         dataString = dataString + (i+1) + ". " + data[i] + "\n";
     
      return dataString;
   }
   
   public void add(int index, Object o){
      if(lastIndex == data.length-1){
         lastIndex++;
         Object[] newData = new Object[lastIndex+1];
         for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
         }
         data = newData;
         for(int i = data.length-1; i > index; i--){
            data[i] = data[i-1];
         }
       data[index] = o;
      }
      else if(index>0 && index<=lastIndex){
         for(int i = data.length-1; i > index; i--){
            data[i] = data[i-1];
         }
         lastIndex++;
         data[index] = o;
      }
      else{
         data[lastIndex + 1] = o;
         lastIndex++;
      }
   }
   
   public void addAll(Object[] o){
      if(o.length < (data.length - lastIndex)){ 
         for(int i = 1; i < o.length; i++){
            data[lastIndex + i] = o[i];
         }
      lastIndex = lastIndex + o.length-1;
      }
      else{
         Object[] newData = new Object[lastIndex + o.length];
         int i = 0;
         while(i < lastIndex){
            newData[i] = data[i];
            i++;
         }
         data = newData;
         int j = 0;
         while(j < o.length){
            data[lastIndex + j] = o[j];
            j++;
         }
       lastIndex = lastIndex + o.length-1;
      }
   }
      
   public void addAll(int index, Object[] o){
      if(o.length <= ((data.length - 1) - lastIndex)){ 
         for(int i = 0; i < o.length-1; i++){
            data[index + o.length + i] = data[index+i];
         }
         for(int i = 0; i < o.length; i++){
            data[index + i] = o[i];
         }
       lastIndex=lastIndex + o.length;
      }
      else{
         Object[] newData = new Object[(lastIndex +1) + o.length];
         int i = 0;
         while(i < (lastIndex+1)){
            newData[i] = data[i];
            i++;
         }
         data = newData;
         int j = 0;
         while(j < o.length){
            data[(lastIndex + 1) + j] = o[j];
            j++;
         }
      lastIndex=lastIndex + o.length;
      }
   }
   
   public int lastIndexOf(Object o){
      for (int i = (data.length-1); i > 0; i--){
         if(o == data[i]){
            return i;
         }
         else{
            return -1;
         }
      }
   return -1;
   }
   
  public Object remove(Object o){
      Object newObject;
      int i = 0;
      while(i < data.length){
         if(data[i] == o){
            newObject = data[i];
            data[i] = null;
            int newIndex = i;
            for(int j = newIndex; j < data.length-1; j++){
               data[j] = data[j+1];
            }
          data[data.length-1] = null;
          return newObject;
          }
          else{ 
               i++;
            }
          
      }
    return null;
   }
    public Object removeAll(Object o){
      Object newObject = null;
      int i = 0;
      while(i < data.length){
         if(data[i] == o){
            newObject = data[i];
            data[i] = null;
            }
          i++;
         }
       return newObject;  
     }
     
      public Object[] subList(int fromIndex, int toIndex){
         Object[] newList = new Object[toIndex - fromIndex + 1];
         for (int i = 0; i < toIndex; i++){
            newList[i] = data[fromIndex + i];
         }
         return newList;
      }
      
      public Object[] toArray(){
         Object[] newArray = new Object[data.length];
         for (int i = 0; i < data.length; i++){
            newArray[i] = data[i];
         }
         return newArray;
      }
      
      public void trimToSize(){
         Object[] tempData = new Object[lastIndex+1];
         for (int i = 0; i < lastIndex+1; i++){
            tempData[i] = data[i];
         }
         data = tempData;
      
   }

}