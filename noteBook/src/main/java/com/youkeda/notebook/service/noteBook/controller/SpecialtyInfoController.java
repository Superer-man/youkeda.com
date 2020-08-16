package com.youkeda.notebook.service.noteBook.controller;

import com.github.pagehelper.Page;
import com.youkeda.notebook.base.BaseController;
import com.youkeda.notebook.base.commonservice.entity.response.Response;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.SpecialtyInfoEntity;
import com.youkeda.notebook.service.noteBook.service.SpecialtyInfoService;
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
@Api(value="专业情况表controller",tags={"专业情况表"})
@RequestMapping(value = "/specialtyInfo")
public class SpecialtyInfoController extends BaseController {

    @Autowired
    SpecialtyInfoService specialtyInfoService;

  
    /**新增
     * @param in 入参
     * @return Response
     */
    @ApiOperation(value = "新增", notes = "")
    @RequestMapping(value = "/insertSpecialtyInfo", method = { RequestMethod.POST })
    public Response insertSpecialtyInfo(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) SpecialtyInfoEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        specialtyInfoService.insertSpecialtyInfo(in,null);
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
    @RequestMapping(value = "/updateSpecialtyInfo", method = { RequestMethod.POST })
    public Response updateSpecialtyInfo(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) SpecialtyInfoEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        specialtyInfoService.updateSpecialtyInfo(in);
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
    @RequestMapping(value = "/listSpecialtyInfo", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="rowNumber",value="每页数据行数",required=false),
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="pageNumber",value="当前页数",required=false)
    })
    public Response listSpecialtyInfo(Integer rowNumber,Integer pageNumber,
                                 @RequestBody @ApiParam(name="实体",value="传入json格式",required=true) SpecialtyInfoEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        List<SpecialtyInfoEntity> list = specialtyInfoService.listSpecialtyInfo(in,rowNumber,pageNumber);
        long total = 0;
        if (rowNumber != null && pageNumber != null) {
            Page<SpecialtyInfoEntity> resultPage = (Page<SpecialtyInfoEntity>) list;
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
     * @param specialtyInfoId Id
     * @return Response
     */
    @ApiOperation(value = "查询一条", notes = "入参：specialtyInfoId")
    @RequestMapping(value = "/querySpecialtyInfoById", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="String",name="specialtyInfoId",value="专业id",required=true),
    })
    public Response querySpecialtyInfoById(String specialtyInfoId){
        if(StringUtils.isEmpty(specialtyInfoId)){
            throw new ServiceException("querySpecialtyInfoById", 995, "专业id不能为空！");
        }
        SpecialtyInfoEntity in = new SpecialtyInfoEntity();
        in.setSpecialtyInfoId(specialtyInfoId);
        SpecialtyInfoEntity entity = specialtyInfoService.querySpecialtyInfoById(in);

        Response res = new Response();
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("entity", entity);
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }

}
