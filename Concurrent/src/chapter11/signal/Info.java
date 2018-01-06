package chapter11.signal;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class Info{ // ������Ϣ��
    private String name = "name";//����name���ԣ�Ϊ��������set��name��������
    private String content = "content" ;// ����content���ԣ�Ϊ��������set��content��������
    private boolean flag = true ;   // ���ñ�־λ,��ʼʱ������
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition(); //����һ��Condition����
    public  void set(String name,String content){
        lock.lock();
        try{
            while(!flag){
                condition.await() ;
            }
            this.setName(name) ;    // ��������
            Thread.sleep(300) ;
            this.setContent(content) ;  // ��������
            flag  = false ; // �ı��־λ����ʾ����ȡ��
            condition.signal();
        }catch(InterruptedException e){
            e.printStackTrace() ;
        }finally{
            lock.unlock();
        }
    }

    public void get(){
        lock.lock();
        try{
            while(flag){
                condition.await() ;
            }
            Thread.sleep(300) ;
            System.out.println(this.getName() +
                    " --> " + this.getContent()) ;
            flag  = true ;  // �ı��־λ����ʾ��������
            condition.signal();
        }catch(InterruptedException e){
            e.printStackTrace() ;
        }finally{
            lock.unlock();
        }
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setContent(String content){
        this.content = content ;
    }
    public String getName(){
        return this.name ;
    }
    public String getContent(){
        return this.content ;
    }
}
