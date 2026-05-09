package exception;

public class Person {
	
	 int alter ; 
	 
	 public Person(int alter ) throws OutOfRangeException {
		 
		this.alter = alter ; 
		
		if (alter<0 || alter >120) {
			
			throw new OutOfRangeException("Der alter muss zwischen 0  bis 120 sein ");
		}
		
	}
	 
	 public int getAlter() {
		 
		 return alter ; 
	 }

	 public static void main(String[] args) {
		
		 try {
			 
			Person person = new Person(12);
			
			System.out.println(person.getAlter());
			
			
			
		 } catch (OutOfRangeException e) {

			
			 System.out.println(e.getMessage());
				
				System.out.println();
			
		 }
		 
	
		 try {
				
			 Person person1 = new Person(0);
				
				System.out.println(person1.getAlter());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
		 try {
			 
			 Person person2= new Person(122);
				
				System.out.println(person2.getAlter());
				
				
			} catch (Exception e) {

				System.out.println(e.getMessage());
				
				System.out.println();
			}
		 
		 try {
			 
			 Person person3= new Person(-12);
				
				System.out.println(person3.getAlter());
				
			} catch (Exception e) {

				System.out.println(e.getMessage());
				
				System.out.println();
				
			}
		 
		 try {
			 
			 Person person4= new Person(1232);
				
				System.out.println(person4.getAlter());
				
			} catch (Exception e) {

				System.out.println(e.getMessage());
				
				System.out.println();
			}

		 try {
			
			 Person person5= new Person(120);
				
				
				System.out.println(person5.getAlter());
				
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			System.out.println();
		}
			
	}
}
