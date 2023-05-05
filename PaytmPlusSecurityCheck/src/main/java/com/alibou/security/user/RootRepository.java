package com.alibou.security.user;

import com.alibou.security.user.Root;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RootRepository extends MongoRepository<Root, ObjectId> {


    List<Root> findAll();
    List<Root> findAllBy_id(String leadId);
    List<Root> findAllByCustomerId(String customerId);
    List<Root> findAllByProductType(String productType);

//    @Transactional
//    @Modifying(flushAutomatically = true)
//    @Query("UPDATE Root e SET e.email = :email WHERE e._id = :id")
//    void updateEmail(@Param("id") String id, @Param("email") String email);
}