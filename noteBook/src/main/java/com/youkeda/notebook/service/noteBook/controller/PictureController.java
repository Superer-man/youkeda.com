package com.youkeda.notebook.service.noteBook.controller;

import com.github.pagehelper.Page;
import com.youkeda.notebook.base.BaseController;
import com.youkeda.notebook.base.commonservice.entity.response.Response;
import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import com.youkeda.notebook.service.noteBook.entity.PictureEntity;
import com.youkeda.notebook.service.noteBook.service.PictureService;
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
@Api(value="图片表controller",tags={"图片表"})
@RequestMapping(value = "/picture")
public class PictureController extends BaseController {

    @Autowired
    PictureService pictureService;

  
    /**新增
     * @param in 入参
     * @return Response
     */
    @ApiOperation(value = "新增", notes = "")
    @RequestMapping(value = "/insertPicture", method = { RequestMethod.POST })
    public Response insertPicture(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) PictureEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        pictureService.insertPicture(in,null);
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
    @RequestMapping(value = "/updatePicture", method = { RequestMethod.POST })
    public Response updatePicture(@RequestBody @ApiParam(name="实体",value="传入json格式",required=true) PictureEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        in.setUpdateName(this.getUserName());
        in.setUpdateId(this.getUserId());
        in.setUpdatePostId(this.getPostId());
        in.setUpdatePostName(this.getPostName());
        Response res = new Response();
        pictureService.updatePicture(in);
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
    @RequestMapping(value = "/listPicture", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="rowNumber",value="每页数据行数",required=false),
            @ApiImplicitParam(paramType="query" ,dataType="Integer",name="pageNumber",value="当前页数",required=false)
    })
    public Response listPicture(Integer rowNumber,Integer pageNumber,
                                 @RequestBody @ApiParam(name="实体",value="传入json格式",required=true) PictureEntity in){
    	in.setCreateName(this.getUserName());
        in.setCreateId(this.getUserId());
        in.setCreatePostId(this.getPostId());
        in.setCreatePostName(this.getPostName());
        List<PictureEntity> list = pictureService.listPicture(in,rowNumber,pageNumber);
        long total = 0;
        if (rowNumber != null && pageNumber != null) {
            Page<PictureEntity> resultPage = (Page<PictureEntity>) list;
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
     * @param pictureId Id
     * @return Response
     */
    @ApiOperation(value = "查询一条", notes = "入参：pictureId")
    @RequestMapping(value = "/queryPictureById", method = { RequestMethod.POST })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query" ,dataType="String",name="pictureId",value="图片id",required=true),
    })
    public Response queryPictureById(String pictureId){
        if(StringUtils.isEmpty(pictureId)){
            throw new ServiceException("queryPictureById", 995, "图片id不能为空！");
        }
        PictureEntity in = new PictureEntity();
        in.setPictureId(pictureId);
        PictureEntity entity = pictureService.queryPictureById(in);

        Response res = new Response();
        Map<String,Object> resMap = new HashMap<String,Object>();
        resMap.put("entity", entity);
        resMap.put("result", 0);
        res.setBody(resMap);
        return res;
    }

}
