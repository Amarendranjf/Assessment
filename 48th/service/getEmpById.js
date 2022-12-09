const { json } = require('body-parser');

module.exports.getEmpById=async(req,res)=>{
    var employees=require('./employees');
    const obj=req.params;
    console.log(obj.id);
    var id=obj.id;
    var employee=employees[id]
    console.log(employee);
    res.send({employee});
}