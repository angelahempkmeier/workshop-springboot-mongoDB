//package com.aggsdp.workshopmongo.mongodb;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.ServerApi;
//import com.mongodb.ServerApiVersion;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//
//@Configuration
//public class MongoConfig extends AbstractMongo{"_id":{"$oid":"6431780c341857b928de7280"}}ClientConfiguration {
//
//
//    @Value("${spring.data.mongodb.uri}")
//    private String mongoUri;
//
//    @Override
//    protected String getDatabaseName() {
//        // Retorne o nome do banco de dados
//        return "mongoworkshop";
//    }
//
//    @Override
//    public MongoClient mongoClient() {
//        // Configurar o cliente do MongoDB com a URI
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(new ConnectionString(mongoUri))
//                .build();
//
//        return MongoClients.create(settings);
//    }
//}
//
//
