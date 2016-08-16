findEmployeeById=SELECT employee.NAME, employee.ID \
          FROM EMPLOYEE employee \
          WHERE employee.id= :id
findEmployeeByNameAndId=SELECT employee.NAME, employee.ID \
          FROM EMPLOYEE employee \
          WHERE employee.id= :id AND employee.name=:name