package cn.leekari.controller;

import cn.leekari.entity.TestClass;
import cn.leekari.service.TestService;
import cn.leekari.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping("test0")
    public Mono<String> getUserId(@RequestParam(defaultValue = "test") String userId) {
        return Mono.just(userId);
    }

    @GetMapping("test1")
    public Flux<String> getList(@RequestParam(defaultValue = "test") String user) {
        String[] users = new String[10];
        for (int i = 0; i < 10; i++) {
            users[i] = user;
        }
        return Flux.just(users);
    }

    @GetMapping("class/{classId}")
    public Mono<Result<TestClass>> classInfo(@PathVariable String classId) {
        return testService.classInfo(classId);
    }
}
