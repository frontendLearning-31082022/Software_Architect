package c.Liskov_substitution;

public class BadWays {

    class A{

        Mysql mysql=new Mysql();

        int limitInput(int one,int two){
            return one+two;
        }

        void weakenPostLogic(){
            mysql.close();
        }
    }
    class B extends A{

        //no destroy public vars logic

        @Override
        int limitInput(int one,int two){
            if(one>0)return two;
            return one+two;
        }

        @Override
        void weakenPostLogic(){
            String data="";
        }

    }



}

class Mysql{
    void close(){}
}