public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    id = input_id;
    grade = input_grade;
    name = input_name;
  }

  public Student(String input_name, int input_id, int input_grade)
  {
    name = input_name;
    id = input_id;
    grade = input_grade;
  }

  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
}
