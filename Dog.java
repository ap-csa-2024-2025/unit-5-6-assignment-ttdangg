public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;



  // constructors

  // default constructor 
  public Dog()
  {
    breed = "weiner dog";
    name = "cat";
    color = "rainbow";
    weight = 10;
  }


  public Dog(String iBreed, String iName, String iColor, double iWeight)
  {
    breed = iBreed;
    name = iName;
    color = iColor;
    if (iWeight < 0)
    {
      weight = 0;
    }
    else
    {
      weight = iWeight;
    }
  }



  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }
  public void setWeight(double iWeight)
  {
    if (iWeight < 0)
    {
      weight = 0;
    }
    else
    {
      weight = iWeight;
    }
    
  }
  public void setName(String iName)
  {
    name = iName;
  }
  public void setColor(String iColor)
  {
    color = iColor;
  }

  // Make getters
  public String getBreed()
  {
    return breed;
  }
  public double getWeight()
  {
    return weight;
  }
  public String getName()
  {
    return name;
  }
  public String getColor()
  {
    return color;
  }
}
