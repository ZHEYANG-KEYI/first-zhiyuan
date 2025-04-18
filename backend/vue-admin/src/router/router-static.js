import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zhiyuanzhezhaomu from '@/views/modules/zhiyuanzhezhaomu/list'
    import zhiyuanzherenwu from '@/views/modules/zhiyuanzherenwu/list'
    import fuwuquyu from '@/views/modules/fuwuquyu/list'
    import huodongxinxi from '@/views/modules/huodongxinxi/list'
    import zhaomushenqing from '@/views/modules/zhaomushenqing/list'
    import fuwutongji from '@/views/modules/fuwutongji/list'
    import forum from '@/views/modules/forum/list'
    import zhiyuanzhefuwu from '@/views/modules/zhiyuanzhefuwu/list'
    import peixunxinxi from '@/views/modules/peixunxinxi/list'
    import peixunchengji from '@/views/modules/peixunchengji/list'
    import renwujinzhan from '@/views/modules/renwujinzhan/list'
    import renwutongzhi from '@/views/modules/renwutongzhi/list'
    import canjiapeixun from '@/views/modules/canjiapeixun/list'
    import huodongzhubanfang from '@/views/modules/huodongzhubanfang/list'
    import zhiyuanxiaozuzhang from '@/views/modules/zhiyuanxiaozuzhang/list'
    import config from '@/views/modules/config/list'
    import zhiyuanzhe from '@/views/modules/zhiyuanzhe/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zhiyuanzhezhaomu',
        name: '志愿者招募',
        component: zhiyuanzhezhaomu
      }
      ,{
	path: '/zhiyuanzherenwu',
        name: '志愿者任务',
        component: zhiyuanzherenwu
      }
      ,{
	path: '/fuwuquyu',
        name: '服务区域',
        component: fuwuquyu
      }
      ,{
	path: '/huodongxinxi',
        name: '活动信息',
        component: huodongxinxi
      }
      ,{
	path: '/zhaomushenqing',
        name: '招募申请',
        component: zhaomushenqing
      }
      ,{
	path: '/fuwutongji',
        name: '服务统计',
        component: fuwutongji
      }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/zhiyuanzhefuwu',
        name: '志愿者服务',
        component: zhiyuanzhefuwu
      }
      ,{
	path: '/peixunxinxi',
        name: '培训信息',
        component: peixunxinxi
      }
      ,{
	path: '/peixunchengji',
        name: '培训成绩',
        component: peixunchengji
      }
      ,{
	path: '/renwujinzhan',
        name: '任务进展',
        component: renwujinzhan
      }
      ,{
	path: '/renwutongzhi',
        name: '任务通知',
        component: renwutongzhi
      }
      ,{
	path: '/canjiapeixun',
        name: '参加培训',
        component: canjiapeixun
      }
      ,{
	path: '/huodongzhubanfang',
        name: '活动主办方',
        component: huodongzhubanfang
      }
      ,{
	path: '/zhiyuanxiaozuzhang',
        name: '志愿小组长',
        component: zhiyuanxiaozuzhang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/zhiyuanzhe',
        name: '志愿者',
        component: zhiyuanzhe
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
