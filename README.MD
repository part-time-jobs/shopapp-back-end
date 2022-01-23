# 商城app后端服务
- 首页商品列表接口：\
 参数： `pageNo 页数 pageSize 每页条数 classify 分类`（狗粮：402 ； 猫粮401 ； 零食：500；玩具：102； 护理：101 ）\
  127.0.0.1:8088/api/manage/GoodsList?pageNo=1&pageSize=10 
------
- 商品详情页面接口 \
1.获取商品详情 \
参数： `goodsNo 商品编号` \
127.0.0.1:8088/api/miniapps/getWXGoodsInfo?goodsNo=1338628\
2.加入购物车接口 post请求 \
参数：`userId: '', 用户id quantity: '', 数量 goodsId: '' 商品id` \
127.0.0.1:8088/api/miniapps/addCart 
- 购物车页面接口 \
1. 获取购物车列表 get请求 \
127.0.0.1:8088/api/miniapps/getCardList?userId= 参数：userId: '', 用户id \
2.更新购物车数量 post请求 参数： userId: '', quantity: '',
goodsId: '' 127.0.0.1:8088/api/miniapps/updateCart c.删除购物车 post请求 参数：userId: '', ids :[] 商品GoodsId 例如：ids: ["1604740", "6780851", "1047032", "3048516", "6653708", "7768108"] 127.0.0.1:8088/api/miniapps/delCart d.去结算 post请求 参数：userId: '', orderNo: orderNo, orderStatus:'2', //2待支付 goodList: [{ orderNo:'', //订单号 goodsId:'', //商品编号 goodsName:'', //商品名称 num:'', //购物车商品数量 goodsImage:'', //商品图片 saleAmount:'' //金额 }]127.0.0.1:8088/api/miniapps/submitOrderNew 
- 订单列表页面接口 \
1.获取订单列表 get请求 参数： pageNo:'' 页数 pageSize:'' 每页条数 userId: '' 用户id \
127.0.0.1:8088/api/miniapps/getWXOrderList