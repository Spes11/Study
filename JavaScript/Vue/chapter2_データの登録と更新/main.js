var app = new Vue({
    el: '#app',
    data:{
      message : 'Hello Vue.js!',
      scroll:0,
      count:0,
      //  クラスとスタイルのデータバインディング 
      isChild:false,
      isActive:false,
      textColor:'red',
      bgColor:'lightgray',
      classObject:{
        child:true,
        'is-active':false
      },
      styleObject:{
        color:'red',
        backgroundColor:'lightgray'
      }
    },
    methods:{
      // ボタンをクリックしたときのハンドラ
      increment:function(){
        this.count +=1
      }
    },
    mounted:function(){
      this.scroll=100
    }
  });
  