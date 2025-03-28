/**
 * This class contains methods to process arrays of {@link Employee} objects.
 *
 * @author  author name
 * @version  1.0.0
 * @see  Employee
 */

public class  EmployeeArray  {
	/**
	 * Creates an array with three objects of class {@link Employee}.
	 * <p>
	 * The first element of the array is the object
	 * <code>first</code>, the second element of the array is
	 * the object <code>second</code>, and  the third element of the
	 * array is the object <code>third</code>.
	 * </p>
	 *
	 * @param first  a {@link Employee} object.
	 * @param second  a {@link Employee} object.
	 * @param third  a {@link Employee} object.
	 * @return  an array with the objects <code>first</code>,
	 *           <code>second</code>, and <code>third</code>.
	 */
	public static Employee[] makeArray(Employee  first, Employee  second,
	                                   Employee  third)  {
		Employee[] employees = new Employee[3];
	    employees[0] = first;
		employees[1] = second;
		employees[2] = third;
		return employees;
	}

	/**
	 * Creates a new array from the specified array of {@link Employee}
	 * objects.
	 * <p>
	 * The elements in the new array have the same order as those in
	 * the specified array.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  a <i>new</i> array of the objects in the specified array.
	 */
	public static Employee[] copyArray(Employee[]  array)  {

		Employee[] newArray = new Employee[array.length];
		for(int index = 0;index < array.length;index ++){
			newArray[index] = array[index];
		}
		return newArray;
	}


	/**
	 * Returns the {@link Employee} object with the specified ID.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @param id  an employee ID.
	 * @return  The {@link Employee} object with the specifed
	 *          ID. Returns <code>null</code> if there are no employees
	 *          in the specified array with the specifed ID.
	 */
	public static Employee getEmployee(Employee[]  array, int id)  {
		for(int index = 0;index < array.length;index ++){
			if (array[index].getId() == id){
				return array[index];
			}
		}
		return null; 
	}

	/**
	 * Returns the number of employees whose salary is higher than the specified
	 * dollar amount.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @param amount  a dollar amount.
	 * @return  the number of employees whose salary is higher than the
	 *          specified dollar amount.
	 */
	public static int countHigherSalaries(Employee[]  array, double amount)  {

		int number = 0;
		for(int index = 0;index < array.length;index ++){
			if (array[index].getSalary() > amount){
				number ++;
			}
		}
		return number;
	}

	/**
	 * Returns the sum of the salaries of the employees in the specified
	 * array.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the sum of the salaries of the employees in the specified
	 *          array.
	 */
	public static double sumSalaries(Employee[]  array)  {
		double sum = 0;
		for(int index = 0;index < array.length;index ++){
			sum += array[index].getSalary();
		}

		return sum; 
	}

	/**
	 * Obtains the highest salary in the specified array.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the highest salary in the specified array.
	 */
	public static double getHighestSalary(Employee[]  array)  {
		double highest = 0;
		for(int index = 0;index < array.length;index ++){
			if(array[index].getSalary() > highest){
				highest = array[index].getSalary();
			}
		}
		return highest; 
	}

	/**
	 * Increases the salary of every employee in the specified array by the
	 * specified amount.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 */
	public static void increaseAll(Employee[] array, double amount)  {
		for(int index = 0;index < array.length;index ++){
			double salary = array[index].getSalary();
			array[index].setSalary(salary + amount);
		}
	}

	/**
	 * Returns a string representation of the specified
	 * {@link Employee} array.
	 * <p>
	 * Uses the method <code>toString</code> in class <code>Employee</code>
	 * to obtain the string representation of each object in the array.
	 * </p>
	 * A new line character ( \n ) separates the string representations
	 * of each <code>Employee</code> object. For example:
	 * </p>
	 * <pre>
	 * Employee[102,Mary Jones,68250.0]\n
	 * Employee[101,Joe Smith,36000.0]\n
	 * Employee[103,Richard Wong,92175.0]
	 * </pre>
	 * <p>
	 * Note that the string returned does <i>not</i> end with a new line
	 * character (\n).
	 * </p>
	 * <p>
	 * This method assumes that every element in the specified array
	 * contains a valid reference to an <code>Employee</code> object.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the string representation of the specified array
	 */

	public static String displayAll(Employee[] array) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			Employee employee = array[i];
			result.append("Employee[").append(employee.getId()).append(",")
				  .append(employee.getName()).append(",").append(employee.getSalary()).append("]");
			if (i < array.length - 1) {
				result.append("\n");
			}
		}
		return result.toString();
	}
}