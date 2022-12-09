const { Router }=require("express");
const route=require("./routes");

const router=new Router();
router.use("/",route);
module.exports=router;