package com.youkeda.notebook.service.noteBook.controller;

import com.github.pagehelper.Page;
import com.youkeda.notebook.base.BaseController;
import com.youkeda.notebook.base.commonservice.entity.response.Response;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.NiceLearnerEntity;
import com.youkeda.notebook.service.noteBook.service.NiceLearnerService;
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
@Api(value="优秀学员表controller",tags={"优秀学员表"})
@RequestMapping(value = "/niceLearner")
public class NiceLearnerController extends BaseController {

    @Autowired
    NiceLearnerService niceLearnerService;

  
    /**新增
     * @param in 入参
     * @return Response
     */
    @ApiOperation(value = "新增", notes = "")
    @RequestMapping(value = "/insertNiceLearner", method = { RequestMethod.POST })
    public Response insertNiceLearner(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) NiceLearnerEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        niceLearnerService.insertNiceLearner(in,null);
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
    @RequestMapping(value = "/updateNiceLearner", method = { RequestMethod.POST })
    public Response updateNiceLearner(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) NiceLearnerEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        niceLearnerService.updateNiceLearner(in);
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
    @RequestMapping(value = "/listNiceLearner", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="rowNumber",value="每页数据行数",required=false),
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="pageNumber",value="当前页数",required=false)
    })
    public Response listNiceLearner(Integer rowNumber,Integer pageNumber,
                                 @RequestBody @ApiParam(name="实体",value="传入json格式",required=true) NiceLearnerEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        List<NiceLearnerEntity> list = niceLearnerService.listNiceLearner(in,rowNumber,pageNumber);
        long total = 0;
        if (rowNumber != null && pageNumber != null) {
            Page<NiceLearnerEntity> resultPage = (Page<NiceLearnerEntity>) list;
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
     * @param learnerId Id
     * @return Response
     */
    @ApiOperation(value = "查询一条", notes = "入参：learnerId")
    @RequestMapping(value = "/queryNiceLearnerById", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="String",name="learnerId",value="优秀学员id",required=true),
    })
    public Response queryNiceLearnerById(String learnerId){
        if(StringUtils.isEmpty(learnerId)){
            throw new ServiceException("queryNiceLearnerById", 995, "优秀学员id不能为空！");
        }
        NiceLearnerEntity in = new NiceLearnerEntity();
        in.setLearnerId(learnerId);
        NiceLearnerEntity entity = niceLearnerService.queryNiceLearnerById(in);

        Response res = new Response();
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("entity", entity);
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }

}
