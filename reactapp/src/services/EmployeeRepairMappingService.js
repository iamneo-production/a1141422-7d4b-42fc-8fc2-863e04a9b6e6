import axios from 'axios';
const API_BASE_URL = 'https://8080-eafabcbdbecabfcdcbbdbeaabbeaeaadbdbabf.project.examly.io';
const EmployeeRepairMappingService = {
  getAllEmployeeMappings: () => {
    return axios.get(API_BASE_URL+'/api/employeeRepairMapping');
  },
  assignRepairIdToEmployee: (employeeId, repairId) => {
    return axios.put( API_BASE_URL+'/api/employeeRepairMapping/assignRepairIdToEmployee/'+employeeId, repairId);
  },
  
};
export default EmployeeRepairMappingService;