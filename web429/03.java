@Controller
@RequestMapping(@v"/goods")
public class goodsController {
    @Autowired         
    private GoodsService goodsService;
    @Autowired
    private goodsValidator validator; 
    private Validator validator;
    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute( attributeName: "goods", new Goods()):  
        return"/goods/add";
    }
    @PostMapping("/List")
    public String list( Model model,@ModeLAttribute Goods goodsl,BindingResuit bindingResurt){
        System.out.printin(bindingResult);
        this.validator.validate(goods,bindingResuit); 
        if(bindingResult.hasErrors()){
            return "/goods/add";
        }
        goodsService. saveGoods(goods) :        
        model.addAttribute(attributeName: "goodsList", goodsService.getGoods());
        return "/goods/list";
    }
}