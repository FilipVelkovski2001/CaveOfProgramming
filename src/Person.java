class Brain{
	
	public Brain() {
		
		System.out.println("Thinking ....");
	}
	
}


class Person {
	
	

	private String name;
	private String surname;
	

	public Person() {
		
		Brain brain = new Brain();
	
		System.out.println("Constructor running!");
		
	}
	
	public Person(String name) {
		
  
         System.out.println(name);
		
	}
	
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
				
	}
	
	
	public void writeName() {
		
		System.out.println("My name is "+ this.name);
		
		
	}
	
	
}


