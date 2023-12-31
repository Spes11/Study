var app = new Vue({
    el: '#app',
    data:{
      // テキストのバインディング
      message:'Hello Vue.js!',

      // 繰り返しの描画
      list:['りんご','ばなな','いちご'],

      // 条件分岐
      show: true
    },
    // イベントの利用
    methods:{
      handleClick:function(event){
        alert(event.target)
      }
    }
  });
  