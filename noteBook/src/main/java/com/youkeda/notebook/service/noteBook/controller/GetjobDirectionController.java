package com.youkeda.notebook.service.noteBook.controller;

import com.github.pagehelper.Page;
import com.youkeda.notebook.base.BaseController;
import com.youkeda.notebook.base.commonservice.entity.response.Response;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.GetjobDirectionEntity;
import com.youkeda.notebook.service.noteBook.service.GetjobDirectionService;
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
@Api(value="就业方向表controller",tags={"就业方向表"})
@RequestMapping(value = "/getjobDirection")
public class GetjobDirectionController extends BaseController {

    @Autowired
    GetjobDirectionService getjobDirectionService;

  
    /**新增
     * @param in 入参
     * @return Response
     */
    @ApiOperation(value = "新增", notes = "")
    @RequestMapping(value = "/insertGetjobDirection", method = { RequestMethod.POST })
    public Response insertGetjobDirection(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) GetjobDirectionEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        getjobDirectionService.insertGetjobDirection(in,null);
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
    @RequestMapping(value = "/updateGetjobDirection", method = { RequestMethod.POST })
    public Response updateGetjobDirection(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) GetjobDirectionEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        getjobDirectionService.updateGetjobDirection(in);
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
    @RequestMapping(value = "/listGetjobDirection", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="rowNumber",value="每页数据行数",required=false),
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="pageNumber",value="当前页数",required=false)
    })
    public Response listGetjobDirection(Integer rowNumber,Integer pageNumber,
                                 @RequestBody @ApiParam(name="实体",value="传入json格式",required=true) GetjobDirectionEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        List<GetjobDirectionEntity> list = getjobDirectionService.listGetjobDirection(in,rowNumber,pageNumber);
        long total = 0;
        if (rowNumber != null && pageNumber != null) {
            Page<GetjobDirectionEntity> resultPage = (Page<GetjobDirectionEntity>) list;
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
     * @param getjobDirectionId Id
     * @return Response
     */
    @ApiOperation(value = "查询一条", notes = "入参：getjobDirectionId")
    @RequestMapping(value = "/queryGetjobDirectionById", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="String",name="getjobDirectionId",value="就业方向表id",required=true),
    })
    public Response queryGetjobDirectionById(String getjobDirectionId){
        if(StringUtils.isEmpty(getjobDirectionId)){
            throw new ServiceException("queryGetjobDirectionById", 995, "就业方向表id不能为空！");
        }
        GetjobDirectionEntity in = new GetjobDirectionEntity();
        in.setGetjobDirectionId(getjobDirectionId);
        GetjobDirectionEntity entity = getjobDirectionService.queryGetjobDirectionById(in);

        Response res = new Response();
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("entity", entity);
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }

}
