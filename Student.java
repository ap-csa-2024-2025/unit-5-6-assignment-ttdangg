public class Student
{
  private int ID;
  private int grade;
  private String name;


  // Constructors

  // public Student(int input_id, int input_grade, String input_name)
  // {
  //   id = input_id;
  //   grade = input_grade;
  //   name = input_name;
  // }


  // public Student(String input_name, int input_id, int input_grade)
  // {
  //   name = input_name;
  //   id = input_id;
  //   grade = input_grade;
  // }


  // using this

  public Student(String name, int ID, int grade)
  {
    this.name = name;
    this.ID = ID;
    this.grade = grade;
  }

  // Setters

  public void setName(String name)
  {
    this.name = name;
  }

  public void setID(int ID)
  {
    this.ID = ID;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }
  



  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
}
