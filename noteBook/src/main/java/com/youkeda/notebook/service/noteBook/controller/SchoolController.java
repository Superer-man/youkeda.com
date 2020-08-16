package com.youkeda.notebook.service.noteBook.controller;

import com.github.pagehelper.Page;
import com.youkeda.notebook.base.BaseController;
import com.youkeda.notebook.base.commonservice.entity.response.Response;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.SchoolEntity;
import com.youkeda.notebook.service.noteBook.service.SchoolService;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Api(value="院校表controller",tags={"院校表"})
@RequestMapping(value = "/school")
public class SchoolController extends BaseController {

    @Autowired
    SchoolService schoolService;

  
    /**新增
     * @param in 入参
     * @return Response
     */
    @ApiOperation(value = "新增", notes = "")
    @RequestMapping(value = "/insertSchool", method = { RequestMethod.POST })
    public Response insertSchool(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) SchoolEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        schoolService.insertSchool(in,null);
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }
    
	/**修改
     * @param in 入参
     * @return Response
     */
    @ApiOperation(value = "修改", notes = "")
    @RequestMapping(value = "/updateSchool", method = { RequestMethod.POST })
    public Response updateSchool(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) SchoolEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        schoolService.updateSchool(in);
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }
    

    /**查询列表
     * @param rowNumber 条数
     * @param pageNumber 页数
     * @param in 入参
     * @return Response
     */
    @ApiOperation(value = "查询列表", notes = "")
    @RequestMapping(value = "/listSchool", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="rowNumber",value="每页数据行数",required=false),
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="pageNumber",value="当前页数",required=false)
    })
    public Response listSchool(Integer rowNumber,Integer pageNumber,
                                 @RequestBody @ApiParam(name="实体",value="传入json格式",required=true) SchoolEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        List<SchoolEntity> list = schoolService.listSchool(in,rowNumber,pageNumber);
        long total = 0;
        if (rowNumber != null && pageNumber != null) {
            Page<SchoolEntity> resultPage = (Page<SchoolEntity>) list;
            total = resultPage.getTotal();
        }
        Response res = new Response();
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("totalCount", total);
        resMap.put("list", list);
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }
    
    /**查询一条
     * @param schoolId Id
     * @return Response
     */
    @ApiOperation(value = "查询一条", notes = "入参：schoolId")
    @RequestMapping(value = "/querySchoolById", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="String",name="schoolId",value="院校id",required=true),
    })
    public Response querySchoolById(String schoolId){
        if(StringUtils.isEmpty(schoolId)){
            throw new ServiceException("querySchoolById", 995, "院校id不能为空！");
        }
        SchoolEntity in = new SchoolEntity();
        in.setSchoolId(schoolId);
        SchoolEntity entity = schoolService.querySchoolById(in);

        Response res = new Response();
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("entity", entity);
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }

}
