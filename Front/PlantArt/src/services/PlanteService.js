import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8089";

class EmployeeService {

    getAllPlantes(){
        return axios.get(EMPLOYEE_API_BASE_URL);
    }
    getAllAccessoires(){
        return axios.get(EMPLOYEE_API_BASE_URL);
    }

   

    getPlanteById(employeeId){
        return axios.get(EMPLOYEE_API_BASE_URL + '/' + employeeId);
    }
    getAccessoireById(employeeId){
        return axios.get(EMPLOYEE_API_BASE_URL + '/' + employeeId);
    }

   
}

export default new EmployeeService()