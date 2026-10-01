package com.java.learning.oop.lecture.two.polymorphism;

import javax.management.ObjectInstance;

public class Circle extends Shape{
    public String name = "Circle";
    void area(){
        System.out.println("Area is pie * r * r");
    }

//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
}



//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//package com.nayapay;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.ReadPreference;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.nayapay.crypto.ConfidentialPropertiesCryptoService;
//import com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository;
//import com.nayapay.readonly.repository.CustomerRaastAccountReadRepository;
//import com.nayapay.readonly.repository.MerchantBranchReadRepository;
//import com.nayapay.readonly.repository.MerchantRoleReadRepository;
//import com.nayapay.readonly.repository.MerchantUserReadRepository;
//import com.nayapay.readonly.repository.NayapayUserReadRepository;
//import com.nayapay.readonly.repository.OAuth2AccessTokenReadRepository;
//import com.nayapay.readonly.repository.OAuth2RefreshTokenReadRepository;
//import com.nayapay.readonly.repository.RoleReadRepository;
//import com.nayapay.readonly.repository.UserDeviceReadRepository;
//import com.nayapay.readonly.repository.UserLoginReadRepository;
//import com.nayapay.readonly.repository.BankReadRepository;
//import com.nayapay.readonly.repository.ConsumerAddressReadRepository;
//import com.nayapay.readonly.repository.ConsumerKYCReadRepository;
//import com.nayapay.readonly.repository.ConsumerRosterReadRepository;
//import com.nayapay.readonly.repository.ConsumerTxReadRepository;
//import com.nayapay.readonly.repository.CurrencyReadRepository;
//import com.nayapay.readonly.repository.MerchantCategoryCodeReadRepository;
//import com.nayapay.readonly.repository.MerchantLogoReadRepository;
//import com.nayapay.readonly.repository.MerchantUnidentifiedLogoReadRepository;
//import com.nayapay.readonly.repository.NayapayIdToUserIdMappingReadRepository;
//import com.nayapay.readonly.repository.PaymentInfoMapReadRepository;
//import com.nayapay.readonly.repository.RemittanceAccountNumberReadRepository;
//import com.nayapay.readonly.repository.WalletStatementUrlReadRepository;
//import com.nayapay.readonly.repository.WhiteBlackListReadRepository;
//import com.nayapay.readonly.repository.DisbursementMerchantSecretReadRepository;
//import com.nayapay.readonly.repository.MerchantBranchReadRepository;
//import com.nayapay.readonly.repository.MerchantBusinessInfoReadRepo;
//import com.nayapay.readonly.repository.WslogReadRepository;
//import com.nayapay.readonly.repository.CmsAccountReadRepository;
//import com.nayapay.readonly.repository.CmsActivityLogReadRepository;
//import com.nayapay.readonly.repository.CmsCardControlConfigReadRepository;
//import com.nayapay.readonly.repository.CmsCardReadRepository;
//import com.nayapay.readonly.repository.CmsDebitRemainingLimitReadRepository;
//import com.nayapay.readonly.repository.CmsProductDebitLimitReadRepository;
//import com.nayapay.readonly.repository.CmsSharedIndividualLimitReadRepository;
//import com.nayapay.readonly.repository.TransactionCodesReadRepository;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.DependsOn;
//import org.springframework.context.annotation.FilterType;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//@Configuration
//@DependsOn("confidentialPropertiesCryptoService")
//@EnableMongoRepositories(
//        basePackages = "com.mycompany.readonly.repository",
//        mongoTemplateRef = "secondaryMongoTemplate",
//        includeFilters = @ComponentScan.Filter(
//                type = FilterType.ASSIGNABLE_TYPE,
//                classes = {
//                        WslogReadRepository.class,
//                        UserLoginReadRepository.class,
//                        DisbursementMerchantSecretReadRepository.class,
//                        MerchantBusinessInfoReadRepo.class,
//                        CustomerRaastAccountReadRepository.class
//                }
//        )
//)
//public class SecondaryMongoDbConfiguration {
//
//    private static Logger logger = LogManager.getLogger(SecondaryMongoDbConfiguration.class);
//
//    private ConnectionString getConnectionString() {
//        String connectionString = ConfidentialPropertiesCryptoService.GetDecryptedEnvironmentProperty("mongo.secondary.connection.string");
//        connectionString = connectionString.replaceFirst("username_and_password", getUsernameAndPassword());
//        return new ConnectionString(connectionString);
//    }
//
//    @Bean(name = "secondaryMongoTemplate")
//    public MongoTemplate secondaryMongoTemplate() {
//        logger.info("Creating secondary mongoDb connection for readonly...");
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(getConnectionString())
//                .readPreference(ReadPreference.secondaryPreferred())
//                .build();
//
//        MongoClient mongoClient = MongoClients.create(settings);
//        return new MongoTemplate(mongoClient, getConnectionString().getDatabase());
//    }
//
//    private String getUsernameAndPassword(){
//        String username = ConfidentialPropertiesCryptoService.GetDecryptedEnvironmentProperty("mongo.secondary.connection.username");
//        String password = ConfidentialPropertiesCryptoService.GetDecryptedEnvironmentProperty("mongo.secondary.connection.password");
//        return username +":"+ password;
//    }
//}
//
//
//
