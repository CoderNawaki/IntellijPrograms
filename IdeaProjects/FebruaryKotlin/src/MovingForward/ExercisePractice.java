package MovingForward;
class Tesla implements Runnable
{
  private String name;

  public Tesla(String nm)
  {
      name = nm;
  }
  public void run()
  {
      for (int i=0;i<2;i++)
      {
          try{
              Thread.sleep(1000);
              System.out.println("doing the process of"+name);
          }catch (InterruptedException e){

          }
      }
  }
}
class ExercisePractice{
    public static void main(String[] args) {
        Tesla t1 = new Tesla("Tesla car");
        Thread th1 = new Thread(t1);
        th1.start();
        System.out.println("the ending process is done.");
    }

}
