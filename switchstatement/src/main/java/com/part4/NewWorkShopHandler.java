package com.part4;

/**
 * Created by $lyl on 2017/4/5.
 */

/**
 * 创建具体的命令
 */
public class NewWorkShopHandler extends  Handler{

    public NewWorkShopHandler(CatalogApp catalogApp) {
        super(catalogApp);
    }

    @Override
    protected HandlerResponse execute(String param) {
        String a = "First ";
        String b = "is ";
        String c = "new workshop";
        String result = a + b + c ;
        JiexiParam(param + a );
        return new HandlerResponse(result);
    }

    private void JiexiParam( String param){
        System.out.println("Need analysis, Params" + param);
        System.out.println("Success");
    }
}
