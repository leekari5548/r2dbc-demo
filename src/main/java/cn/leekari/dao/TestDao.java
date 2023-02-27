package cn.leekari.dao;

import cn.leekari.entity.TestClass;
import org.springframework.data.r2dbc.convert.R2dbcConverter;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import org.springframework.data.r2dbc.core.ReactiveDataAccessStrategy;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.support.SimpleR2dbcRepository;
import org.springframework.data.relational.repository.query.RelationalEntityInformation;
import org.springframework.data.repository.query.Param;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TestDao extends R2dbcRepository<TestClass, String> {

    @Query("select class_id,class_name,teacher_ids from class_info where class_id = :classId")
    public abstract Mono<TestClass> findByClassId(@Param("classId") String classId);

//    @Query("select teacher_id,teacher_name from teacher_info where teacher_id = :teacherId")
//    Mono<TestClass> findByTeacherId(@Param("teacherId") String teacherId);
//
//
//    @Query("select teacher_id,teacher_name from teacher_info where teacher_id in :teacher_ids")
//    Flux<TestTeacher> findByTeacherIds(List<String> teacherIds);

}
