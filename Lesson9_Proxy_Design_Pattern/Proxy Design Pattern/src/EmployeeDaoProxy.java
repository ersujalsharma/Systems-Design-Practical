public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client == "ADMIN"){
            employeeDao.create(client,employee);
            return;
        }
        else{
            throw new Exception("Can't have Access to create");
        }
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client == "ADMIN"){
            employeeDao.delete(client,employeeId);
            return;
        }
        else{
            throw new Exception("Can't have access to Delete");
        }
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client == "ADMIN" || client == "USER")
            return employeeDao.get(client,employeeId);
        throw new Exception("Access Denied");
    }
}
