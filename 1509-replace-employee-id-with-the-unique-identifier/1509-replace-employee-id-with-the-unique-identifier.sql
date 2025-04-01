select Employees.name,EmployeeUNI.unique_id
from Employees
LEFT JOIN EmployeeUNI
ON Employees.id=EmployeeUNI.id
ORDER BY Employees.name asc
