abstract class Animals
{
	protected String color, breed, name;
	
	abstract void eat();
	void speak()
	{
		System.out.println("I'm an Animal");
		System.out.println("Name = " + name);
		System.out.println("Color = " + color);
		System.out.println("Breed = " + breed);
	}
}
class Cat extends Animals
{
	Cat(String color, String breed, String name)
	{
		this.color = color;
		this.breed = breed;
		this.name = name;
	}
	
	void eat()
	{
		System.out.println(" cat eating food ");
	}
}
class Q2
{
	public static void main(String[] args)
	{
		Cat c = new Cat("Brown","Cat breed","Tom");
		c.eat();
		c.speak();
		System.out.println();
	}
}