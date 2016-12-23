
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsmdata.springTest.modules.mapper.DictMapper;
import com.hsmdata.springTest.modules.vo.DictVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/config/applicationContext.xml", "classpath:/config/spring-servlet.xml" })
public class AnnotationTest {
	@Autowired
	private DictMapper dictMapper;

	@Test
	public void testDictList() {
		List<DictVo> list = dictMapper.getAllDictList();
		System.out.println(list);
	}

}
