package cn.leekari;

import cn.leekari.service.TestService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class InitTestHashMap implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Map<String, String> hashMap = TestService.userInfos;
        hashMap.put("1", "张三");
        hashMap.put("2", "李四");
        hashMap.put("3", "王五");
        hashMap.put("4", "赵六");
        hashMap.put("5", "马奇");
    }
}
