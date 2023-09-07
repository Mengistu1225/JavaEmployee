import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String,String> capitalcitys=new HashMap<>();
        capitalcitys.put("england","london");
        capitalcitys.put("us","washington dc");
        capitalcitys.put("ethiopia","ethiopia");
        capitalcitys.put("keny"," nairobi");
        capitalcitys.put("Eretria","asmera");

        for(String key: capitalcitys.keySet()){
            System.out.println("country "+key+" capacitycity "+capitalcitys.get(key));
        }


    }
}
