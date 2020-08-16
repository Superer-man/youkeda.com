package com.youkeda.notebook.base.commonservice;

/**
 * 		常量
 * @author ly
 *
 */
public class Constants { 
	
    //用户超时时间1小时
    public static final long SESSION_TIMEOUT = 3600L;

    //通用密码
    public static final String pwd = "167893";
    
    //混淆字符串
    public static final String str = "";
    
	/*通用状态currentStatus*/
	public static final String STATUS_ONGOING = "0";//进行中
	public static final String STATUS_SUCCESS = "1";//成功
	public static final String STATUS_FAIL = "2";//失败
	public static final String STATUS_GIVING = "3";//作废
	
	
	/*错误编码 key*/
	public static final String errorMsg = "errorMsg";
	
	/*true 已删除  */
	public static final String ISDEL_TRUE = "1";
	public static final String ISDEL_FALSE = "0";
	
	/*默认分页大小  */
	public static final Integer DEFAULT_PAGE = 1;//默认页码
	public static final Integer DEFAULT_PAGESIZE = 10;//默认每页数据量
	
	//修改和新增标识 
	public static final String UPDATE_MES = "2"; //修改
	public static final String ADD_MES = "1"; //新增
	
	//是否可修改
	public static final String IS_CHANGE_NO = "0"; //不可修改
	public static final String IS_CHANGE_YES = "1"; //可修改
	
	
	/*模块类型*/
	public static final String PROCESS_TYPE_PURCHASEPLAN= "purchasePlan";//采购计划
	public static final String PROCESS_TYPE_PURCHASEORDER= "purchaseOrder";//采购订单
	public static final String PROCESS_TYPE_MONEYPLAN= "moneyPlan";//资金计划
	public static final String PROCESS_TYPE_COSTPLAN= "costPlan";//费用预算
	public static final String PROCESS_TYPE_PAYMENTAPPLY= "paymentApply"; //付款申请
	public static final String PROCESS_TYPE_NEWS= "admNews";//新闻公告
	public static final String PROCESS_TYPE_GAIN= "shouldGain";//应收
	public static final String PROCESS_TYPE_SALEPLAN= "salePlan";//销售计划
	
	/**编码规则 项目类型*/
	public static final String CODERULE_TYPE_COMM = "commodity";//商品编码规则类型
	
	/*金额变化*/
	public class moneyCalcType{//0-减少 1-增加
		public static final String add="1";
		public static final String sub="0";
	}
	
	/*商品档案维护所用到常量*/
	public static final Integer TYPEID_END_LENGTH = 10;//商品档案末级编码位数
	
	/*商品档案性质*/
	/**父级概念商品*/
	public static final String COMM_NATURE_ONE= "1";
	/**子级实例商品*/
	public static final String COMM_NATURE_TWO= "2";
	/*商品档案维护所用到常量*/
	public static final String CODELV_END= "5";//商品档案末级级别
	//属性是填写还是选择
	public static final String PLAN_ATTR_ONE= "1";//商品属性是填写
	public static final String PLAN_ATTR_TWO= "2";//商品属性是选择
	//商品是否有唯一码
	public static final String IS_NO_SNCODE= "0";//商品无唯一码
	public static final String IS_YES_SNCODE= "1";//商品有唯一码
	//商品是否启用物理属性
	public static final String IS_PHYSICAL_NO= "0";//否
	public static final String IS_PHYSICAL_YES= "1";//是
	//商品sku类型
	public static final String SKU_TYPE_ONE= "1";//单一商品
	public static final String SKU_TYPE_TWO= "2";//sku商品 父级
	public static final String SKU_TYPE_THREE= "3";//sku商品实例
	//是否是入库码
	public static final String NO_INHOUSE_CODE= "0";//不是入库码
	public static final String YES_INHOUSE_CODE= "1";//是入库码
	//是否是出库码
	public static final String NO_OUTHOUSE_CODE= "0";//不是出库码
	public static final String YES_OUTHOUSE_CODE= "1";//是出库码
	/*商品税务信息是否一致*/
	public static final String NO_ISCON= "0";//不一致
	public static final String YES_ISCON= "1";//一致
	/**商品类别预设属性不可编辑*/
	public static final String ATTR_PLAN_NO= "0";
	/**商品类别预设属性可编辑*/
	public static final String ATTR_PLAN_YES= "1";
	/**是否确认修改类别预设信息 0否 1是*/
	public static final String IS_CHANGE_ABLEPLAN_NO = "0";
	/**是否确认修改类别预设信息 0否 1是*/
	public static final String IS_CHANGE_ABLEPLAN_YES = "1";
	/**是否确认修改类别税务信息 0否 1是*/
	public static final String IS_CHANGE_TAX_NO = "0";
	/**是否确认修改类别税务信息 0否 1是*/
	public static final String IS_CHANGE_TAX_YES = "1";
	/**商品规格参数是否自定义状态  0非自定义填写 1非自定义选择 3自定义*/
	public static final String IS_CUSTOM_NO_WRITE = "0";
	/**商品规格参数是否自定义状态  0非自定义填写 1非自定义选择 3自定义*/
	public static final String IS_CUSTOM_NO_CHOOSE = "1";
	/**商品规格参数是否自定义状态  0非自定义填写 1非自定义选择 3自定义*/
	public static final String IS_CUSTOM_YES = "3";
	
	/**
	 * 订单拆合类型
	 * @author pengxin
	 *
	 */
	public class orderDealType{
		public static final String ORDER_SPLIT="0";//拆
		public static final String ORDER_MERGE="1";//合
	}
	
	/**
	 * 进位系数
	 * @author pengxin
	 *
	 */
	public class coefficientType{
		public static final String ROUND_HALF_UP="0";//四舍五入
		public static final String ROUND_HALF="0.5";//0.5
		public static final String ROUND_RATIONAL="1";//1
	}
	
	/*库房入库所用到常量*/
	/*签收状态*/
	public static final String SIGN_WAIT= "12";//待签收
	public static final String SIGN_HALF= "13";//签收中
	public static final String SIGN_OVER= "14";//签收完成
	/*入库状态*/
	public static final String IN_HOUSE_WAIT= "12";//待入库
	public static final String IN_HOUSE_HALF= "13";//入库中
	public static final String IN_HOUSE_OVER= "14";//入库完成
	/*SN码状态 ，1.删除缓存sn码   2.回滚，删除已入库   3.入库*/
	public static final String SN_STATE_DEL= "1";//待入库
	public static final String SN_STATE_NO= "2";//入库中
	public static final String SN_STATE_OK= "3";//入库完成
	/*入库列表忽略入库状态查询常量*/
	public static final String IN_HOUSESTATE_NO= "noInState";//忽视入库状态查询常量

	/* 采购计划相关常量  */
	//参数校验返回值
	public static final int  VPASS_CODE = 0; //校验通过，接口数据正常返回，无服务器异常
	public static final int  VER_CODE = 1; //校验检测出错误
	//采购类型
	public static final String COMM_TYPE = "1"; //商品采购
	public static final String SERVICE_TYPE = "2"; //服务采购
	public static final String OFFICE_TYPE = "3"; //办公采购
	
	//保存和提交标识
	public static final String SAVE_MES = "1"; //保存
	public static final String SUBMIT_MES = "2"; //提交
	public static final String GIVING_MES = "3"; //作废
	//采购计划服务分类数量常量
	public static final int    SERVICE_NUM = 1;
	/* 返回code */
	public static final int    CODE_SUCCESS = 0 ;//成功
	public static final int    CODE_FAIL = 1 ;//失败
	/* 状态常量  */
	/**全部**/
	public static final String STATUS_ALL = "0"; //全部
	/**待提交**/
	public static final String STATUS_WAIT_SUBMIT = "1"; //待提交
	/**待处理（可执行）**/
	public static final String STATUS_WAIT_DEAL = "2"; //待处理（可执行）
	/**已处理（可跟单）**/
	public static final String STATUS_HAVE_DEAL = "3";//已处理（可跟单）
	/**已作废**/
	public static final String STATUS_HAVE_GIVING = "4";//已作废
	/**待审批**/
	public static final String STATUS_WAIT_APPROVED = "7"; //待审批
	/**已通过**/
	public static final String STATUS_APPROVED = "8"; //已通过
	/**已驳回**/
	public static final String STATUS_HAVE_REJECT = "9";//已驳回
	/**待执行**/
	public static final String STATUS_WAIT_EXECUTE = "10";//待执行
	/**已执行**/
	public static final String STATUS_HAVE_EXECUTE = "11";//已执行
	/**未完成（未订货，未还款，未确认）**/
	public static final String STATUS_UN_ORDER = "12"; //未完成（未订货，未还款，未确认）
	/**部分完成（部分订货，部分还款，部分确认）**/
	public static final String STATUS_PART_ORDER = "13"; //部分完成（部分订货，部分还款，部分确认）
	/**已完成（全订货，全还款，全确认）**/
	public static final String STATUS_HAVE_ORDER = "14"; //已完成（全订货，全还款，全确认）
	
	/*采购订单来源*/
	public static final String SOURCE_TYPE_SELF = "1";//自增生成的订单
	public static final String SOURCE_TYPE_PLAN = "2";//计划生成的订单
	
	/*采购贸易模式*/
	public static final String TRADE_TYPE_INSIDE = "1";//国内
	public static final String TRADE_TYPE_OUTSIDE = "2";//国外
	
	/*费用类型*/
	public static final String COST_TYPE_BEFORE = "1";//预付款
	public static final String COST_TYPE_ITEM = "2";//货款
	public static final String COST_TYPE_TARITAX = "3";//关税
	public static final String COST_TYPE_ADDTAX = "4";//增值税
	public static final String COST_TYPE_SERVICE = "5";//服务费
	
	/* 应付相关常量  */
	public static final String PAY_STATUS_ALL = "0"; //全部
	public static final String PAY_STATUS_UNPAY = "1"; //未付款
	public static final String PAY_STATUS_PAYING = "2"; //部分付款
	public static final String PAY_STATUS_PAYED = "3";//已付款
	
	public static final String PAYMENT_TYPE_ALL = "0"; //全部
	public static final String PAYMENT_TYPE_GOODS = "1"; //货款
	public static final String PAYMENT_TYPE_TAX = "2"; //税金
	public static final String PAYMENT_TYPE_SERVICE = "3";//服务费
	public static final String PAYMENT_TYPE_REIM = "4";//报销款
	
	//应付款来源
	public static final String SOURCE_TYPE_MINE = "1";//自增
	public static final String SOURCE_TYPE_ORDER = "2";//来源采购订单
	
	//应付统计采购订单类型
	public static final String COUNT_TYPE_UNPAY = "1";//统计未完成付款的
	public static final String COUNT_TYPE_DATE = "2";//统计当日日期已超过订单应付日期的
	public static final String COUNT_TYPE_PAYAPPLYED = "3";//已提交付款申请的
	public static final String COUNT_TYPE_PAYABLE = "4";//按应付类型统计
	public static final String COUNT_TYPE_PERIODAGE = "5";//按账龄统计
	public static final String COUNT_TYPE_SUPPLIER = "6";//按供应商统计
	
	public static final String COUNT_TYPE_SUPPLIER_ASC = "1";//按供应商统计正序排序
	public static final String COUNT_TYPE_SUPPLIER_DESC = "2";//按供应商统计倒序排序
	
	/*订单来源*/
	public static final String ORDER_FROM_PURCHASE = "1";//采购订单
	public static final String ORDER_FROM_SALE = "2";//销售订单
	
	/* 资金计划相关常量  */
	//资金计划列表查询参数常量
	public static final int PLAN_STATUS_ALL = 0; //全部
	public static final int PLAN_STATUS_WAIT_SUBMIT = 1; //待提交
	public static final int PLAN_STATUS_WAIT_APPROVED = 2; //待审批
	public static final int PLAN_STATUS_APPROVED = 3;//已通过
	public static final int PLAN_STATUS_WAIT = 4;//待生效 
	public static final int PLAN_STATUS_ING = 5; //生效中
	public static final int PLAN_STATUS_PASS = 6; //已失效
	public static final int PLAN_STATUS_HAVE_REJECT = 7; //已驳回 
	public static final int PLAN_STATUS_HAVE_GIVING = 8; //已作废
	
	//资金计划关联单号类型
	public static final String FX_TYPE_ORDER = "1"; //采购单号
	public static final String FX_TYPE_SALE = "2"; //销售单号
	
	/* 费用计划相关常量  */
	//归属类型 (0：公有，1：私有)
	public static final String ATTRI_PUB = "0"; //0：公有
	public static final String ATTRI_PRI = "1"; //1：私有
	//资金与费用计划状态 （ 1：待生效 2：生效中 3：已失效）
	public static final String PLAN_WAIT = "1"; //1：待生效
	public static final String PLAN_ING = "2"; //2：生效中
	public static final String PLAN_PASS = "3"; // 3：已失效
	
	/** 发票图表入参 1 查询发票待签收数和金额 */
	public static final String INVOICE_TYPE_ONE = "1"; 
	/** 发票图表入参 2 查询发票超期签收数和金额(截止日期是当前日期的不算在内) */
	public static final String INVOICE_TYPE_TWO = "2"; 
	
	public static final String SIGN_DB = "JSDSTLXXXTGCYXGS";//德邦物流约定sign
	public static final String COMPANY_CODE_DB = "EWBJSDSTLXXXTGCYXGS3712";//德邦约定公司编号
	
	
	
	//库房打单状态
	/** 已打单 */
	public static final String PRINT_STATE_YES = "1";
	/** 未打单 */
	public static final String PRINT_STATE_NO = "0";
	//库房打单,关联单号类型
	/** 库房打单 关联单号类型， 销售审核单 */
	public static final String ODD_TYPE_SALE = "1";
	
	
	
	
	//干伟固定1-15
	/**
	 * SupplierService接口实现中
	 * WarehouseInFoService
	 * returnMes（）对应的参数 flag 0
	 */
	public static final String VALUE_ZERO = "0";  //成功值0 
	/**
	 * SupplierService接口实现中
	 * WarehouseInFoService
	 * returnMes（）对应的参数 flag 1 
	 */
	public static final String VALUE_ONE = "1"; //错误值1  
	
	/**
	 * createReimbursementInfo
	 * 
	 */
	public static final String SAVE_FALG = "1"; //保存标记
	/**
	 * createReimbursementInfo
	 * 
	 */
	public static final String SUBMIT_FALG = "2"; //提交标记
	
	/**
	 * 下面待用 
	 */
	public static final String VALUE_TWO  = "2"; 
	public static final String VALUE_THREE  = "3"; 
	public static final String VALUE_FOUR  = "4"; 
	public static final String VALUE_FIVE  = "5"; 
	public static final String VALUE_SIX  = "6"; 
	public static final String VALUE_SEVEN  = "7"; 
	public static final String VALUE_EIGHT  = "8"; 
	public static final String VALUE_NINE  = "9"; 
	public static final String VALUE_TEN  = "10"; 
	public static final String VALUE_ELEVEN  = "11"; 
	public static final String VALUE_TWELVE  = "12"; 
	public static final String VALUE_THIRTEEN  = "13"; 
	public static final String VALUE_FOURTEEN  = "14"; 
	public static final String VALUE_FIFTEEN  = "15";  
	//常用字符串
	public static final String VALUE_USERID  = "userId";  
	//常用字符串
	public static final String VALUE_USERNAME  = "userName";  
	//常用字符串
	public static final Object VALUE_WAREHOUSEID = "warehouseId";
	
	
	
	public static final int INT_ZERO= 0;
	/**
	 * SupplierService中所有方法的开始验证后放回CODE比较
	 * WarehouseInFoService 中所有方法的开始验证后放回CODE比较
	 * Response res中ResponseHeader的CODE值
	 * 
	 */
	public static final int FLASE_ONE= 1;//错误值1 
	public static final int INT_TWO  = 2; 
	public static final int INT_THREE  = 3; 
	public static final int INT_FOUR  = 4; 
	public static final int INT_FIVE  = 5; 
	public static final int INT_SIX  = 6; 
	public static final int INT_SEVEN  = 7; 
	public static final int INT_EIGHT  = 8; 
	public static final int INT_NINE  = 9; 
	public static final int INT_TEN  = 10; 
	public static final int INT_ELEVEN  = 11; 
	public static final int INT_TWELVE  = 12; 
	public static final int INT_THIRTEEN  = 13; 
	public static final int INT_FOURTEEN  = 14; 
	public static final int INT_FIFTEEN  = 15;  
	
	
	
	
	
	/**
	 * SupplierService接口实现中
	 * getResult()这个方法调用时,对应的successIf参数，成功与否
	 */
	public static final int FLAG_TRUE  = 0;  //成功
	public static final int FLAG_FLASE  = 1;  //失败 
	
	
	/**
	 * SupplierService接口实现中
	 * getResult()这个方法调用时，对应的flag参数，封装放回结果的方式
	 */
	public static final int FLAG_ONE  = 0;// 返回一集合，保存到map
	public static final int FLAG_TWO  = 2;// 直接返回集合
	public static final int FLAG_THREE  = 3;// 返回一个已经有所有数据的MAP
	
	/**
	 * SupplierService接口实现中
	 * 公共放回消息 增加修改删除查询之后成功/失败的放回消息
	 */
	public static final String MESG_SUCCESS  = "【操作成功】";
	public static final String MESG_FALSE  = "【操作失败】";
	/**
	 * SupplierService接口实现中
	 * 供应商中常见的消息
	 */ 
	public static final String MESG_SUPPLIER_ID_NULL  = "【供应商Id为空!】";
	public static final String MESG_WAREHOUSE_ID_NULL  = "【仓库Id为空!】";
	public static final String MESG_SUPPLIER_NAME_NULL  = "【供应商名称为空!】";
	public static final String MESG_SUPPLIER_ORGID_NULL  = "【组织ID为空!】";			
	public static final String VERIFY_THROUGH  = "【验证通过】";
	
	
	/**
	 * SupOperationService
	 * createNewSupplierVersion（FLAG）
	 * goPackingRequest(flag) 用于新增的参数封装
	 * 的新增验证的参数标记   
	 */
	public static final String CREATEFLAG  = "1";//新增验证
	/**
	 * /**
	 * SupOperationService
	 * createNewSupplierVersion（FLAG）
	 * 的修改验证的参数标记   
	 */
	public static final String UPDATEFLAG  = "2";//修改验证 
	
	
	/**采购订单是否执行标志**/
	public static final int EXECUTION_NO   = 0;//未执行
	public static final int EXECUTION_YES  = 1;//已执行
	
	/**组织相关常量**/
	/**当前数据状态**/
	public static final String ORG_DATA_STATE_DEL  = "-1";//已删除
	
	public class payType{
		public static final String bankCard="0";
		
		public static final String virtualCard="1";
		
		public static final String alipay="2";
		
		public static final String wxpay="3";
	}
	
	/*新闻公告发布方式*/
	public static final String PUB_QUARTZ = "0";//定时器发布
	public static final String PUB_SELF   = "1";//手动发布
	
	public class dealType{//0-支出 1-收入
		public static final String in="1";
		public static final String out="0";
	}
	
	/*新闻公告操作指令*/
	public static final String NEWS_SAVE = "1";
	public static final String NEWS_SUBMIT = "2";
	public static final String NEWS_DELETE = "3";
	public static final String NEWS_GIVING = "4";
	public static final String NEWS_PUBLISH = "5";
	
	/*待收款订单状态*/
	/**全部**/
	public static final String GAIN_ORDER_ALL = "0";//全部
	/**待收款**/
	public static final String GAIN_ORDER_WAIT = "1";//待收款
	/**收款中**/
	public static final String GAIN_ORDER_PART = "2";//收款中
	/**收款完成**/
	public static final String GAIN_ORDER_FINISH = "3";//收款完成
	
	/*收支类型*/
	public static final String PAYMENT_IN = "1";//收入
	public static final String PAYMENT_OUT = "2";//支出
	
	/*外币设置相关常量*/
	/**取数方式**/
	public static final String FETCHMODEL_API = "1";//接口获取
	public static final String FETCHMODEL_ROLE = "2";//规则生成
	public static final String FETCHMODEL_MANUAL = "3";//手工录入
	
	/**取数频率**/
	public static final String FREQUENCY_REAL_TIME = "1";//实时
	public static final String FREQUENCY_DAY = "2";//每日
	public static final String FREQUENCY_WEEK = "3";//每周
	public static final String FREQUENCY_MONTH = "4";//每月

	public class status{//当前状态 1进行中  2成功  3失败 4作废
		public static final String ongoing="1";
		public static final String success="2";
		public static final String fail="3";
		public static final String cancel="4";
	}
	
	public class payCode{//支付结果 0成功 1失败
		public static final String success="0";
		public static final String fail="1";
	}
	
	public class signInvContentType{//发票签收中发票内容类型
		public static final String all="0";//全部
		public static final String payment="1";//货款
		public static final String addtax="2";//增值税
		public static final String tratax="3";//关税
		public static final String service="4";//服务费
	}
	
}
