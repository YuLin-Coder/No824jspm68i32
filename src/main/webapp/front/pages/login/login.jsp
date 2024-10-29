<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <title>登录</title>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/util.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/main.css">
</head>
<body>
  <div id="app">
    <div class="dowebok">
      <div class="container-login100">
        <div class="wrap-login100">
          <div class="login100-pic js-tilt" data-tilt="">
            <img src="../../xznstatic/img/img-01.png">
          </div>
  
          <form class="login100-form validate-form layui-form">
            <span class="login100-form-title">
              登 录
            </span>
  
            <div class="wrap-input100 validate-input">
              <div class="layui-form-item">
                <div class="layui-input-block" style="margin-left: 0;">
                  <input class="input100" type="text" name="username" required lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input" lay-ignore>
                </div>
              </div>
              <span class="focus-input100"></span>
              <span class="symbol-input100">
                <i class="fa fa-envelope" aria-hidden="true"></i>
              </span>
            </div>
  
            <div class="wrap-input100 validate-input">
              <div class="layui-form-item">
                <div class="layui-input-block" style="margin-left: 0;">
                  <input class="input100" type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input" lay-ignore>
                </div>
              </div>
              <span class="focus-input100"></span>
              <span class="symbol-input100">
                <i class="fa fa-lock" aria-hidden="true"></i>
              </span>
            </div>

            <div class="layui-form-item">
              <div class="layui-input-block" style="text-align: left;margin-left: 0;">
                <input v-if="item.tableName!='users'" v-for="(item,index) in menu" v-bind:key="index" type="radio" name="role" :value="item.tableName" :title="item.roleName">
              </div>
            </div>
  
            <div class="container-login100-form-btn">
              <div class="layui-form-item" style="margin-bottom: 0;">
                <div class="layui-input-block" style="margin-left: 0;">
                  <button class="layui-btn btn-submit login100-form-btn" lay-submit lay-filter="login" lay-ignore>登录</button>
                </div>
              </div>
            </div>
  
            <div class="text-center p-t-12">
              <a class="txt2" style="margin-right: 10px;" v-if="item.tableName!='users'" v-for="(item,index) in menu" v-bind:key="index" :href="'javascript:registerClick(\''+item.tableName+'\')'">注册{{item.roleName.replace('注册','')}}</a>
            </div>

            <div class="text-center p-t-136"></div>
          </form>
        </div>
      </div>
    </div>
  </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <!-- 组件配置信息 -->
  <script src="../../js/config.js"></script>
  <!-- 扩展插件配置信息 -->
  <script src="../../modules/config.js"></script>
  <!-- 工具方法 -->
  <script src="../../js/utils.js"></script>

  <script>
    var vue = new Vue({
      el: '#app',
      data: {
        menu: menu
      },
      methods: {
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'element', 'carousel', 'form', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var carousel = layui.carousel;
      var form = layui.form;
      var http = layui.http;
      var jquery = layui.jquery;

      // 登录
      form.on('submit(login)', function(data) {
        data = data.field;
        if (!data.role) {
          layer.msg('请选择登录用户类型', {
            time: 2000,
            icon: 5
          });
          return false;
        }
        http.request(data.role + '/login', 'get', data, function(res) {
          layer.msg('登录成功', {
            time: 2000,
            icon: 6
          });
          // 登录凭证
          localStorage.setItem('Token', res.token);
          localStorage.setItem('role', jquery('input[name="role"]:checked').attr('title'));
          // 当前登录用户角色
          localStorage.setItem('userTable', data.role);
          localStorage.setItem('sessionTable', data.role);
          // 用户名称
          localStorage.setItem('adminName', data.username);
          http.request(data.role + '/session', 'get', {}, function(res) {
            // 用户id
            localStorage.setItem('userid', res.data.id);
            // 路径访问设置
            window.location.href = '../../index.jsp';
          })
        });
        return false
      });
    });

    /**
      * 跳转登录
      * @param {Object} tablename
      */
    function registerClick(tablename) {
      window.location.href = '../' + tablename + '/register.jsp?tablename=' + tablename;
    }
  </script>

</body>

</html>