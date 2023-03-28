//access modifier 
//specifier where a property/ method is accessible there are four types of access modifierin java 

// private
// default
// protected
// public



class MyEmployee
{
  private int id;
  private String name;


  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }

  public int getId()
  {
    return id;
  }


}
public class pr_40 {
    public static void main(String[] args) {
        MyEmployee laxman=new MyEmployee();
       
        //we can't access the private member directly 
        // laxman.id=45;
        // laxman.name="Laxman Singh Bisht";

        laxman.setName("Laxman Singh Bisht");
        System.out.println(laxman.getName());

    }
}
