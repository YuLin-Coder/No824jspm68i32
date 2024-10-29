<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
  <meta charset="UTF-8">
  <meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0' />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>首页</title>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <script src="../../xznstatic/js/jquery-3.3.1.min.js"></script>
	<script src="../../xznstatic/js/SuperSlide.2.1.3.js"></script>
	<script src="../../xznstatic/js/plugin.js"></script>
	<script src="../../xznstatic/js/banner.js"></script>
	<script src="../../xznstatic/js/index.js"></script>
	<script src="../../xznstatic/js/more.js"></script>
	<link rel="stylesheet" href="../../xznstatic/css/style.css">
</head>

<body>
  <div id="app">
    <div class="layui-carousel" id="swiper">
      <div carousel-item id="swiper-item">
        <div v-for="(item,index) in swiperList" v-bind:key="index">
          <img class="swiper-item" :src="item.img" width="100%" height="400px">
        </div>
      </div>
    </div>

    <div class="about-culture-box">
      <div class="about-culture">
        <div class="about-black-title">
          <h4>游戏信息推荐</h4>
          <i></i>
        </div>
        <div class="about-culture-piclist">
          <ul>
            <li v-for="(item,index) in youxixinxiRecommend" v-bind:key="index" @click="jump('../youxixinxi/detail.jsp?id='+item.id)">
              <img :src="item.tupian?item.tupian.split(',')[0]:''" width="310" height="350" />
              <div class="about-culture-words">
                <h6>{{item.youximingcheng}}</h6>
                <p></p>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>


    <div class="about-culture-box">
      <div class="about-culture">
        <div class="about-black-title">
          <h4>游戏信息展示</h4>
          <i></i>
        </div>
        <div class="about-culture-piclist">
          <ul>
            <li v-for="(item,index) in youxixinxiList" v-bind:key="index" @click="jump('../youxixinxi/detail.jsp?id='+item.id)">
              <img :src="item.tupian?item.tupian.split(',')[0]:''" width="310" height="350" />
              <div class="about-culture-words">
                <h6>{{item.youximingcheng}}</h6>
                <p v-if="item.price">{{item.price}} RMB</p>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>

    <div class="copyright">
      <div class="box clearfix">
        <p style="text-align: center;" v-text="projectName"></p>
      </div>
    </div>
  </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <script src="../../js/config.js"></script>
  <script src="../../modules/config.js"></script>
  <script src="../../js/utils.js"></script>

  <script>
    var vue = new Vue({
      el: '#app',
      data: {
        projectName: projectName,
        swiperList: [{
          img: '../../img/banner.jpg'
        }],
      youxixinxiRecommend: [],

      youxixinxiList: [],
        newsList: []
      },
      filters: {
        newsDesc: function(val) {
          if (val) {
            val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
            if (val.length > 60) {
              val = val.substring(0, 60);
            }

            return val;
          }
          return '';
        }
      },
      methods: {
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var form = layui.form;
      var carousel = layui.carousel;
      var http = layui.http;
      var jquery = layui.jquery;

      http.request('config/list', 'get', {
        page: 1,
        limit: 5
      }, function(res) {
        if (res.data.list.length > 0) {
          var swiperItemHtml = '';
          for (let item of res.data.list) {
            if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
              swiperItemHtml +=
                '<div>' +
                '<img class="swiper-item" src="' + item.value + '" width="100%" height="400px">' +
                '</div>';
            }
          }
          jquery('#swiper-item').html(swiperItemHtml);
          // 轮播图
          carousel.render({
            elem: '#swiper',
            width: '100%',
            height: '400px',
            arrow: 'always',
            anim: 'fade',
            interval: 1800,
            indicator: 'inside'
          });
        }
      });
              

      http.request(`youxixinxi/autoSort`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.youxixinxiRecommend = res.data.list;
      });

      http.request(`youxixinxi/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.youxixinxiList = res.data.list;
      });
    });
  </script>
</body>

</html>