# HeadFirst_README
# 策略模式
## 定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立与使用算法的客户

```java
    interface  fly(){ fly_behavior();}
    interface quack(){quack_behavior();}
    //功能封装
    public abstract class Duck (){ 
        fly fly_instance;
        quack quack_instance;
        public void Duck(){
        }
        public_method();
    }
    //添加实例对象，通过对象调用
    public  class user extends Duck{
        public void user(){
            fly_instance=new implements_fly();
            quack_instance=new implements_quack();
        }   
        @Override
        public_method();
    }
    //主方法使用
class main{
    public static void main(String[] args){
        Duck duck=new user();
        duck.fly_instance();
        duck.quack_instance();
    }
}
