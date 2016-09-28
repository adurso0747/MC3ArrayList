public class MC3ArrayList 
{
   protected Node log;
   
   public MC3ArrayList()
   {
      log = null;
   }
   
   public MC3ArrayList(Object[] o)
   {
      for(int i = 0; i<o.length; i++)
      {
         Node newNode = new Node(o[i]);
         newNode.setLink(log);
         log = newNode;
      }
   }
   
   public void add(Object o) 
   {
      Node newNode = new Node(o);
      newNode.setLink(log);
      log = newNode;
   }
   
   public void clear()
   {
      log = null;
   }
   
   /*public void ensureCapacity(int minCapacity)
     {
       this method should be left out because link lists
       do not have a capacity until items are added to them.
       to pre allocate memory for a linked list doesn't make sense.
     }
   */
     
   
   public int indexOf(Object o)
   {
      int count = 1;
      Node node;
      node = log;
      while (node != null)
      {
         if(node.getInfo() == o)
         {
            return count;
         }
         else
         {
            count++;
            node = node.getLink();
         }
      }
      return -1;
    }
   public boolean isEmpty()
   {
      if(log == null)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   public Object remove(int index)
   {
      int count = 1;
      Node currNode;
      Node prevNode;
      currNode = log;
      prevNode = null;
      Object o;
      
      while(currNode != null)
      {
         if(count == index)
         {
            o = currNode.getInfo();
            prevNode.setLink(currNode.getLink());
            return o;
         }
         else
         {
            prevNode = currNode;
            currNode = currNode.getLink();
            count++;
         }
       }
      return -1;
   }
   
   public Object get(int index)
   {
      int count = 1;
      Node currNode;
      currNode = log;
      Object o;
      while(currNode != null)
      {
         if(count == index)
         {
            o = currNode.getInfo();
            return o;
         }
         else
         {
            count++;
            currNode = currNode.getLink();
         }
       }
       return -1;
    }
    
   public Object set(int index, Object o)
    {
      int count = 1;
      Node currNode;
      Node prevNode;
      currNode = log;
      prevNode = null;
      Object oldNode = -1;
      
      while(currNode != null)
      {
         if(count == index)
         {
            oldNode = currNode.getInfo();
            currNode.setInfo(o);
            return oldNode;
         }
         else
         {
            count++;
            currNode = currNode.getLink();
         }
       }
       if(currNode == null)
       {
         Node newNode = new Node(o);
         newNode.setLink(log);
         log = newNode;
       }
     return oldNode;
   }
       

    public int size()
    {
      int count = 0;
      Node node;
      node = log;
      while(node !=null)
      {
         count++;
         node = node.getLink();
      }
      return count;
    }
    
    public String toString()
    {
      int count = 1;
      Node node = log;
      String dataString = "Data: \n\n";
      while(node != null)
      {
         dataString = dataString + count + "." + node.getInfo() + "\n";
         count++;
         node = node.getLink();
      }
      return dataString;
    }
    
    public void add(int index, Object o)
    {
      int count = 1;
      Node currNode;
      Node newNode = new Node(o);
      currNode = log;
      Node oldLink = null;
      
      while(currNode != null)
      {
         if(count == (index-1))
         {
            oldLink = currNode.getLink();
            currNode.setLink(newNode);
            count++;
         }
         else if(count == index)
         {
            newNode.setLink(oldLink);
            break;
         }
         else
         {
            count++;
            currNode = currNode.getLink();
         }
      }
    }
    public void addAll(Object[] o)
    {
      Node currNode = log;
      Node newNode = null;
      while(currNode.getLink() != null)
      {
         currNode = currNode.getLink();
      }

      for(int i = 0; i<o.length; i++)
      {
         newNode = new Node(o[i]);
         currNode.setLink(newNode);
         currNode = currNode.getLink();
      }
    }
    
    public void addAll(int index, Object [] o)
    {
      Node currNode = log;
      int count = 1;
      while(count != (index-1))
      {
         currNode = currNode.getLink();
         count++;
      }
      Node oldLink = currNode.getLink();
      
      for(int i = 0; i<o.length; i++)
      {
         Node newNode = new Node(o[i]);
         currNode.setLink(newNode);
         currNode = currNode.getLink();
      } 
      
      currNode.setLink(oldLink);
      
    }
    
    public int lastIndexOf(Object o)
    {
      int count = 1;
      Node currNode = log;
      int index = -1;
      
      while(currNode != null)
      {
         if(currNode.getInfo() == o)
         {
            index = count;
            currNode = currNode.getLink();
            count++;
         }
         else
         {
            currNode = currNode.getLink();
            count++;
         }
      }
      return index;
    }
    
    public Object remove(Object o)
    {
      Node currNode = log;
      Node prevNode = null;
      Object returnedObject = null;
      while(currNode != null)
      {
         if(currNode.getInfo() == o)
         {
            returnedObject = currNode.getInfo();
            prevNode.setLink(currNode.getLink());
            return returnedObject;
         }
         else
         {
            prevNode = currNode;
            currNode = currNode.getLink();
         }
      }
      return returnedObject;
     }
    
    public Object removeAll(Object o)
    {
      Node currNode = log;
      Node prevNode = null;
      Object returnedObject = null;
      while(currNode != null)
      {
         if(currNode.getInfo() == o)
         {
            returnedObject = currNode.getInfo();
            prevNode.setLink(currNode.getLink());
            prevNode = currNode;
            currNode = currNode.getLink();
         }
         else
         {
            prevNode = currNode;
            currNode = currNode.getLink();
         }
      }
      return returnedObject;
     }
     
     public Object[] subList(int fromIndex, int toIndex)
     {
      Node currNode = log;
      Object[] subList = new Object[((toIndex-fromIndex) + 1)];
      if(currNode !=null)
      {
         for(int i = 0; i<subList.length; i++)
         {
            subList[i] = currNode.getInfo();
            currNode = currNode.getLink();
         }
      }
      return subList;
     }
     
     public Object [] toArray()
     {
      Node currNode = log;
      Node oldCurrNode = currNode;
      int i = 0;
      
      while(currNode != null)
      {
         currNode = currNode.getLink();
         i++;
      }
      
      Object[] newArray = new Object[i];
      while(oldCurrNode != null)
      {
        for(int j = 0; j<i; j++)
        {
         newArray[j] = oldCurrNode.getInfo();
         oldCurrNode = oldCurrNode.getLink();
        }
      }
         
      
      
      return newArray;
     }
     
     /*public void trimToSize()
     {
         this method is not needed as the underlying structure
         is a linked list not an array. there is no extra
         capacity in a linked list to be trimmed.
      }
     */

}

   