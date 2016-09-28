public class Node
{
   private Object info;
   private Node link;
   
   public Node(Object info)
   {
      this.info = info;
      link = null;
   }
   
   public void setInfo(Object info)
   {
      this.info = info;
   }
   
   public Object getInfo()
   {
      return info;
   }
   
   public void setLink(Node link)
   {
      this.link = link;
   }
   
   public Node getLink()
   {
      return link;
   }
}