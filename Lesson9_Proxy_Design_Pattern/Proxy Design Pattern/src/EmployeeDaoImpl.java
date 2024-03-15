public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("We created employee");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted Employee with employee id");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Returned the employee with employeeId");
        return new Employee();
    }
}
