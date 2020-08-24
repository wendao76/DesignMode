package com.github.jiegou.shipeiqi;

/**
 * @author wendao76
 * @version 1.0
 * @description 类描述信息
 * @className SourceAppApi
 * @date 2020-8-24 19:45
 */
public class NewSourceAppImp implements INewSourceApp{
    ISourceApp sourceApp;

    public NewSourceAppImp(){
        sourceApp = new SourceAppImp();
    }

    @Override
    public void doSomething(String actionName){
        sourceApp.doSomething(this.getClass().getName(), actionName);
    }
}
