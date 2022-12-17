package warGameFinal;

//Card class
public class Card
{
//instance variables
private int value;
private String name;

//constructor
public Card(String name, int value)
{
this.name = name;
this.value = value;
}

//return the name
public String getName()
{
return name;
}

//method return value
public int getValue()
{
return value;
}

//method set the name
public void setName(String name)
{
this.name = name;
}

//method set the value
public void setValue(int value)
{
this.value = value;
}

//method describe
public void describe()
{
System.out.println (name);
}
}
