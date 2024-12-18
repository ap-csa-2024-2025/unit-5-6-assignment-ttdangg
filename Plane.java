public class Plane
{
  // constructors
  public Plane()
  {
    int location = 0;
  }

  public Plane(int loc)
  {
    if (loc >= -2000 && loc <= 2000)
    {
      location = loc;
    }
    else
    {
      location = 0;
    }
  }
  // methods
  public void upward()
  {
    location += 100;
    if (location > 2000)
    {
      location = 2000;
    }
  }

  public void downward()
  {
    location -= 100;
    if (location < -2000)
    {
      location = -2000;
    }

  }

  public int getLocation()
  {
    return location;

  }

  public String toString()
  {
    String output = "";
    for (int i = -2000; i < location; i += 100)
    { 
      output += " ";
    }
    output += "@";
    return output

  }














}
