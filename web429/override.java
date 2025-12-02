import java.util.Date;
@Service
public class goodsValidator implements Validator {
    @0verride
    public boolean supports(class<?> clazz) {
        return  Goods,class.isAssignableFrom(clazz);
    }
    @0verride
    public void validate(object target, Errors errors) {           
        Goods goods =(Goods)target;
        ValidationUtils.rejectIfEmpty(errors,"name","goods.name.required","商品名称不能为空！");
        ValidationUtils.rejectIfEmpty(errors,"description","goods.desc.required","商品详情不能为空!");
        if(goods.getPrice() > 100 || goods.getPrice() < 0 ){
            errors.rejectValue( "price","goods.price.invalid","商品价格在0-10o");
        }
        Date goodsData = goods.getDate();
        if(goodsData != null && goodsData.after(new Date())){
            rrors.rejectValue("date","goods.Date.invalid","创建日期必须在当前日期之前");
        }
    }
}