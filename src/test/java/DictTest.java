import com.hsmdata.springTest.common.utils.HttpClientUtil;

/**
 * 字典测试
 */
public class DictTest {
    public static void main(String[] args) {
       // testAllDictList();
        testDictListByDictType();
    }

    @SuppressWarnings("unused")
    private static void testAllDictList() {
        String url = "http://127.0.0.1/priceless/dict/list/all";       
        HttpClientUtil.sendPost(url, "");
    }
    
    private static void testDictListByDictType() {
        String url = "http://127.0.0.1/priceless/dict/list/some?dictType=COMPANY";
        HttpClientUtil.sendHttpsGet(url);
    }
}
