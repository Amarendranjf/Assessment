const { Router }=require("express");
const router=new Router();

const emp=require("../service/getEmployeesList");
const empId=require("../service/getEmpById");
router.get("/",emp.getEmployeesList);
router.get("/id",empId.getEmpById);
module.exports=router;