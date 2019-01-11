package com.mongodb.test;
/*
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.springboot.util.mongodb.MongoDBUtil;
import org.bson.Document;
import org.bson.conversions.Bson;*/
import org.junit.Test;

public class MongoDBTest {
    /**
     * 插入数据
     */
  /*  @Test
    public void insertTest(){
        String dbName = "reporterDB";
        String collName = "member";
        MongoCollection<Document> coll = MongoDBUtil.instance.getCollection(dbName, collName);

        for (int i = 0; i < 4; i++) {
            Document userDoc = new Document();
            userDoc.put("id",i);
            userDoc.put("username","张三");
            userDoc.put("password","123456");
            userDoc.put("sex","男");
            coll.insertOne(userDoc);
        }
        MongoDBUtil.instance.close();
    }

    *//**
     * 删除表
     *//*
    @Test
    public void delTest(){
        String dbName = "reporterDB";
        String collName = "member";
        MongoDBUtil.instance.dropCollection(dbName,collName);
        MongoDBUtil.instance.close();
    }

    *//**
     * 根据id删除
     *//*
    @Test
    public void delById(){
        String dbName = "reporterDB";
        String collName = "member";
        MongoCollection<Document> coll = MongoDBUtil.instance.getCollection(dbName, collName);
        int result = 0;
        for (int i = 0; i < 4; i++) {
            Bson filter = Filters.eq("id", i);
            DeleteResult deleteResult = coll.deleteOne(filter);
            result +=  deleteResult.getDeletedCount();
        }
        System.out.println(result);
        MongoDBUtil.instance.close();

    }

    *//**
     * 修改
     *//*
    @Test
    public void updateTest(){
        String dbName = "reporterDB";
        String collName = "member";
        MongoCollection<Document> coll = MongoDBUtil.instance.getCollection(dbName, collName);

        // 修改数据
         String id = "0";
         Document aa = new Document();
         aa.put("password", "6655");
         aa.put("username", "sunliang");
         MongoDBUtil.instance.updateById(coll, id, aa);
        MongoDBUtil.instance.close();
    }

    @Test
    public void selectTest(){
        String dbName = "reporterDB";
        String collName = "member";
        MongoCollection<Document> coll = MongoDBUtil.instance.getCollection(dbName, collName);
        // 查询所有
        Bson filter = Filters.eq("password", "123456");
        MongoCursor<Document> mongoCursor = MongoDBUtil.instance.find(coll, filter);


        for (MongoCursor<Document> it = mongoCursor; it.hasNext(); ) {
            Document document = it.next();
            System.out.println("========username=============:"+document.get("username"));
            System.out.println("========id=============:"+document.get("id"));
        }

    }*/
}
