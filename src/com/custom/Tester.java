package com.custom;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Tester 
{
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset
	
	public static void main(String[] args) 
	{
		List<Employee> list = EmployeeAdder.addDetails();
		
		Set<Integer> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();

/*		 1. Filter Employees by Gender:
		 - Retrieve a list of all female employees. 	*/
		System.out.println(RED+"*****Retrieve a list of all female employees********"+RESET);
		
		list.stream()
		.filter(t -> t.getGender().equals("Female"))
		.forEach(System.out::println);

/*		2. Filter Employees by Age:
		- Get a list of employees older than 30 years.		*/
		System.out.println(RED+"*****Get a list of employees older than 30 years.********"+RESET);
	
		list.stream()
		.filter(emp -> emp.getAge() > 30)
		.forEach(System.out::println);

/*		3. Filter Employees by Salary:
		- Find employees with a salary greater than $50,000 		*/
		System.out.println(RED+"*****Find employees with a salary greater than $50,000.********"+RESET);
	
		list.stream()
		.filter(emp -> emp.getSalary() > 50000)
		.forEach(System.out::println);
	
/*		4. Map Employee Names:
		- Create a list of employee names (Strings).		*/	
		System.out.println(RED+"*************Create a list of employee names (Strings)*************"+RESET);
	
		List<String> empNameList = list.stream()
		.map(emp -> emp.getName())
		.toList();
		System.out.println(empNameList);
		
/*		5. Calculate Average Salary:
		- Calculate the average salary of all employees. */	
		System.out.println(RED+"*********Calculate the average salary of all employees.*******"+RESET);

		double avgSal = list.stream()
		.mapToDouble(Employee::getSalary)
		.average()
		.orElse(0.0);
		System.out.println("Average salary : "+avgSal);
		
/*		6. Find Maximum Salary:
		- Find the employee with the highest salary.	*/
		System.out.println(RED+"*********Find the employee with the highest salary.********"+RESET);

		double maxSal = list.stream()
		.mapToDouble(Employee::getSalary)
		.max()
		.orElse(0);
		System.out.println("Max sal : "+maxSal);
		
/*      7.Group Employees by Gender:
		- Group employees by gender and return a map with gender as 
		  the key and a list of employees as the value.		*/
		System.out.println(RED+"******Group employees by gender and return a map******"+RESET);
		
		Map<String, List<Employee>> group = list.stream()
		.collect(Collectors.groupingBy(Employee::getGender));
		group.forEach((k,v) -> System.out.println(k+" -> "+v));
	
/* 		8. Count Male Employees:
		- Count the number of male employees.		*/
		System.out.println(RED+"**********Count the number of male employees.*********"+RESET);
		
		long count = list.stream()
		.filter(emp -> emp.getGender().equals("Male"))
		.count();
		System.out.println("Count Emp : "+count);
		
/*		9. Sum of All Salaries:
		- Calculate the total sum of salaries for all employees.	*/
		System.out.println(RED+"*********Calculate the total sum of salaries for all employees.**********"+RESET);
		
		double sum = list.stream()
		.mapToDouble(emp -> emp.getSalary())
		.sum();
		System.out.println("Sum of Sal : "+sum);
		
/*		10. Sort Employees by Name:
		- Sort the employees by their names in alphabetical order.	*/
		System.out.println(RED+"*******Sort the employees by their names in alphabetical order.*****"+RESET);

		list.stream()
		.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
		.forEach(System.out::println);
		
		System.out.println("...... OR ........");
		
		list.stream()
		.sorted(Comparator.comparing(Employee::getName))
		.forEach(System.out::println);

/*		11. Sort Employees by Age:
		- Sort the employees by age in ascending order.		*/
		System.out.println(RED+"**********Sort the employees by age in ascending order.********"+RESET);
		
		list.stream()
		.sorted(Comparator.comparingInt(Employee::getAge))
		.forEach(System.out::println);
		
/*		12. Sort Employees by Salary:
		- Sort the employees by salary in descending order.	*/
		System.out.println(RED+"*********Sort the employees by salary in descending order.******"+RESET);

		list.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.forEach(System.out::println);
		
/*		13. Find Oldest Employee:
		- Find the oldest employee.	*/
		System.out.println(RED+"*********Find the oldest employee.*********"+RESET);
		
		list.stream()
		.sorted(Comparator.comparingInt(Employee::getAge).reversed())
		.limit(1)
		.forEach(System.out::println);
		
		System.out.println("........ OR ........");
		
		int maxAge = list.stream()
		.mapToInt(Employee::getAge)
		.max().getAsInt();
		System.out.println("Oldest Employee Age : "+maxAge);
		
		System.out.println("........ OR ........");
		
		Employee employee = list.stream()
		.max((a,b) -> Integer.compare(a.getAge(), b.getAge()))
		.get();
		System.out.println(employee);
		
/*		14. Group Employees by Age:
		- Group employees into age groups (e.g., 20-30, 31-40, etc.) and return a map
		with age group as the key and a list of employees as the value. 	*/
		System.out.println(RED+"****Group employees into age groups (e.g., 20-30, 31-40, etc.)*****"+RESET);
		
		LinkedHashMap<String, List<Employee>> collect = list.stream()
		.collect(Collectors.groupingBy(
				t ->
				{
					int age = t.getAge();
					if(age>=20 && age<=30)
						return "20-30";
					else if (age>=31 && age<=40)
						return "31-40";
					else
						return "40+";
				},
				LinkedHashMap::new,
				Collectors.toList()	
		));
		collect.forEach((k,v) -> System.out.println(k+" -> "+v));
		
/* 		15. Find Employees with a Specific Age:
		- Find all employees who are exactly 35 years old.	*/
		System.out.println(RED+"************ Find all employees who are exactly 35 years old.***********"+RESET);

		list.stream()
		.filter(emp -> emp.getAge() == 35)
		.forEach(System.out::println);
		
/* 		16. Calculate the Sum of Salaries by Gender:
 		- Calculate the sum of salaries for each gender (i.e., male and female)
		and return a map with gender as the key and the sum of salaries as the value.	*/
		System.out.println(RED+"********* Calculate the sum of salaries for each gender**********"+RESET);
		
		Map<String, Double> collect2 = list.stream()
		.collect(Collectors.groupingBy(Employee::getGender, 
				Collectors.summingDouble(Employee::getSalary))
		);
		collect2.forEach((k,v) -> System.out.println(k+" -> "+v));
		
/*		17. Find Employees with Names Starting with "E":
		- Find all employees whose names start with the letter "E."	*/
		System.out.println(RED+"*********Find all employees whose names start with the letter E******"+RESET);
		
		list.stream()
		.filter(emp -> emp.getName().startsWith("E"))
		.forEach(System.out::println);
		
/*		18. Calculate the Average Salary for Male and Female Employees:
		- Calculate the average salary separately for male
		and female employees and return a map with gender
		as the key and the average salary as the value.		*/
		System.out.println(RED+"**********Calculate the average salary separately for male and female*********"+RESET);		
		
		Map<String, Double> collect3 = list.stream()
		.collect(Collectors.groupingBy(Employee::getGender, 
				Collectors.averagingDouble(Employee::getSalary)
		));
		collect3.forEach((k,v) -> System.out.println(k+" -> "+v));
		
/* 		19. Find the Top N Highest Paid Employees:
		- Find the top N employees with the highest salaries.		*/
		System.out.println(RED+"*******Find the top N employees with the highest salaries.********"+RESET);
	
		list.stream()
		.sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
		.limit(3)
		.forEach(System.out::println);
		
		System.out.println("........ OR ............");
		
		list.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.limit(3)
		.forEach(System.out::println);

/* 		20. Retrieve Distinct Age Values:
		- Get a list of distinct ages of all employees.		*/
		System.out.println(RED+"*********Get a list of distinct ages of all employees.*********"+RESET);

		List<Integer> ages = list.stream()
		.map(Employee::getAge)
		.distinct()
		.toList();
		System.out.println(ages);
		
/*		21. Find the Three Lowest-Paid Employees:
		- Find and display the names of the three employees with the lowest salaries.	*/
		System.out.println(RED+"*******Find and display the names of the three employees with the lowest salaries.********"+RESET);
		
		list.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.limit(3)
		.map(emp -> emp.getName())
		.forEach(System.out::println);
		
/* 		22. Sort Employees by Name Length:
 		- Sort employees by the length of their names (shortest to longest).	*/
		System.out.println(RED+"***********Sort employees by the length of their names (shortest to longest).*******"+RESET);
		
		list.stream()
		.sorted(Comparator.comparingInt(emp -> emp.getName().length()))
		.forEach(System.out::println);
		
/* 		23. Group Employees by Age Range:
		- Group employees into custom age ranges (e.g., 20-29, 30-39, etc.) and
		return a map with the age range as the key and a list of employees as the value.	*/
		System.out.println(RED+"*********Group employees into custom age ranges (e.g., 20-29, 30-39, etc.)*********"+RESET);
		
		list.stream()
		.collect(Collectors.groupingBy(
			t ->{
				int age = (t).getAge();
				if(age >= 20 && age <= 29)
					return "20-29";
				else if(age >= 30 && age <= 39)
					return "30-39";
				else
					return "40+";
			}
		)).forEach((k, v) -> System.out.println(k+" -> "+v));
		
/*		24. Find the Average Salary of Employees Aged 30 or Younger:
		- Calculate the average salary of employees aged 30 or younger.	*/
		System.out.println(RED+"********Calculate the average salary of employees aged 30 or younger.******"+RESET);
		
		double avgSalary = list.stream()
		.filter(emp -> emp.getAge() <= 30)
		.mapToDouble(Employee::getSalary)
		.average()
		.orElse(0.0);
		System.out.println(avgSalary);
		
/*		25. Find the Names of Male Employees with Salaries Over $53,000:
		- Retrieve the names of male employees with salaries over $53,000.	*/
		System.out.println(RED+"**********Retrieve the names of male employees with salaries over $53,000.***********"+RESET);		

		List<String> list2 = list.stream()
		.filter(emp -> emp.getGender().equals("Male"))
		.filter(emp1 -> emp1.getSalary() > 53000)
		.map(emp -> emp.getName())
		.toList();
		System.out.println(list2);
		
/* 		26. Find the Youngest Female Employee:
		- Find the youngest female employee.		*/
		System.out.println(RED+"**********Find the youngest female employee.**********"+RESET);

		Employee employee2 = list.stream()
		.filter(k -> k.getGender().equals("Female"))
		.min(Comparator.comparingInt(Employee::getAge))
		.get();
		System.out.println(employee2);
		
		System.out.println("........ OR ........");
		
		Employee employee3 = list.stream()
		.filter(k -> k.getGender().equals("Female"))
		.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)))
		.get();
		System.out.println(employee3);
		
/* 		27. Retrieve the Names of Employees in Reverse Order:
		- Get a list of employee names in reverse order (from the last employee to the first).	*/
		System.out.println(RED+"******Get a list of employee names in reverse order*******"+RESET);
		
		List<String> list3 = list.stream()
		.map(Employee::getName)
		.collect(Collectors.toList());	// Can't do direct toList() it will immutable so we can't reverse it
		Collections.reverse(list3);
		System.out.println(list3);
		
/*		28. Find the Highest Salary Among Female Employees:
		- Find the highest salary among female employees.	*/
		System.out.println(RED+"******Find the highest salary among female employees."+RESET);
		
		Employee max = list.stream()
		.filter(emp -> emp.getGender().equals("Female"))
		.max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(max);
		
/*		29. Group Employees by Age and Gender:
		- Group employees by both age and gender and return a multi-level map.	*/
		System.out.println(RED+"********Group employees by both age and gender and return a multi-level map.*****"+RESET);		
		
		list.stream()
		.collect(Collectors.groupingBy(Employee::getAge, 
			Collectors.groupingBy(Employee::getGender)))
			.forEach((k,v) -> System.out.println(k+" -> "+v));
		
/* 		30. Find the Sum of Salaries for Employees with Names Containing "Smith":
		- Calculate the sum of salaries for employees whose names contain the substring "Smith."	*/
		System.out.println(RED+"******* Calculate the sum of salaries for employees whose names contain the substring Smith***"+RESET);		
		
		double sum2 = list.stream()
		.filter(emp -> emp.getName().contains("Smith"))
		.mapToDouble(Employee::getSalary)
		.sum();
		System.out.println(sum2);

	}
}

















