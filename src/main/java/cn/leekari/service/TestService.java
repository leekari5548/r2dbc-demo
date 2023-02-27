package cn.leekari.service;

import cn.leekari.dao.TestDao;
import cn.leekari.entity.TestClass;
import cn.leekari.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Service
public class TestService {

    private final TestDao testDao;

    public static final HashMap<String, String> userInfos = new HashMap<>();

    public TestService(TestDao testDao) {
        this.testDao = testDao;
    }


    public Mono<Result<TestClass>> classInfo(String classId) {
        Mono<TestClass> classInfo = testDao.findById(classId);
        return classInfo.map(data -> {
            final Result<TestClass> responseInfo = new Result<>();
            responseInfo.setData(data);
            return responseInfo;
        });
    }
}
