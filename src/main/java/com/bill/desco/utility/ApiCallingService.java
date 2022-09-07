package com.bill.desco.utility;

import com.bill.desco.configuration.AES256;
import com.bill.desco.configuration.Credentials;
import com.bill.desco.dto.ApiGetTokenResponseDTO;
import com.bill.desco.dto.BillCollectionDTO;
import com.bill.desco.entity.BillCollectionEntity;
import com.bill.desco.entity.LogEntity;
import com.bill.desco.repository.BillCollectionRepo;
import com.bill.desco.repository.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ApiCallingService {
    @Autowired
    private LogRepo logRepo;

    @Autowired
    private BillCollectionRepo billCollectionRepo;

    @Autowired
    Credentials creds;

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<ApiGetTokenResponseDTO> getToken(String username, String password, HttpSession session){
        ResponseEntity<ApiGetTokenResponseDTO> apiOutput= null;
        String branchCode = AES256.decrypt((String) session.getAttribute("brCode")).trim();
        String userId = AES256.decrypt((String) session.getAttribute("userId")).trim();

        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        String uri = creds.getAPIBaseURL() + "auth/signin";
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>() ;
        map.put("username", username);
        map.put("password", password);
        HttpEntity entity = new HttpEntity<>(map, headers);
        try {
            apiOutput = restTemplate.postForEntity(uri, entity, ApiGetTokenResponseDTO.class);
            LogEntity logEntity = new LogEntity(
                    "signin", uri, entity.toString(), apiOutput.getBody().toString(), apiOutput.getStatusCode().toString(),
                     userId, branchCode.toString()
            );
            logRepo.save(logEntity);
        }catch(Exception e){
            LogEntity logEntity = new LogEntity(
                    "signin", uri, entity.toString(), apiOutput.getBody().toString(), apiOutput.getStatusCode().toString(),
                     userId, branchCode.toString()
            );
            logRepo.save(logEntity);
            System.out.println(e.getMessage());

        }

        return apiOutput;
    }


    public ResponseEntity<BillCollectionDTO> billInformation(String BILL_NO, String apiPassword, HttpSession session){
        ResponseEntity<BillCollectionDTO> billionaireOutput= null;
        String branchCode = AES256.decrypt((String) session.getAttribute("brCode")).trim();
        String userId = AES256.decrypt((String) session.getAttribute("userId")).trim();

        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        String uri = creds.getAPIBaseURL() + "billvendor/billInfo";
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>() ;
        map.put("billNO", BILL_NO);
        HttpEntity entity = new HttpEntity<>(map, headers);
        try {
            billionaireOutput = restTemplate.postForEntity(uri, entity, BillCollectionDTO.class);
            BillCollectionEntity billCollectionEntity = new BillCollectionEntity(
                    "billNo", uri, entity.toString(), billionaireOutput.getBody().toString(), billionaireOutput.getStatusCode().toString(),
                    userId, branchCode.toString()
            );
            billCollectionRepo.save(billCollectionEntity);
        }catch(Exception e){
            BillCollectionEntity billCollectionEntity = new BillCollectionEntity(
                    "billNo", uri, entity.toString(), billionaireOutput.getBody().toString(), billionaireOutput.getStatusCode().toString(),
                    userId, branchCode.toString()
            );
            billCollectionRepo.save(billCollectionEntity);
            System.out.println(e.getMessage());

        }
        return billionaireOutput;
    }


    public ResponseEntity<BillCollectionDTO> savePayment(String BILL_NO, String apiPassword, HttpSession session){
        ResponseEntity<BillCollectionDTO> savePaymentapiOutput= null;
        String branchCode = AES256.decrypt((String) session.getAttribute("brCode")).trim();
        String userId = AES256.decrypt((String) session.getAttribute("userId")).trim();

        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        String uri = creds.getAPIBaseURL() + "billvendor/paymentInfo";
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>() ;
        map.put("billNO", BILL_NO);
        HttpEntity entity = new HttpEntity<>(map, headers);
        try {
            savePaymentapiOutput = restTemplate.postForEntity(uri, entity, BillCollectionDTO.class);
            BillCollectionEntity billCollectionEntity = new BillCollectionEntity(
                    "billNo", uri, entity.toString(), savePaymentapiOutput.getBody().toString(), savePaymentapiOutput.getStatusCode().toString(),
                    userId, branchCode.toString()
            );
            billCollectionRepo.save(billCollectionEntity);
        }catch(Exception e){
            BillCollectionEntity billCollectionEntity = new BillCollectionEntity(
                    "billNo", uri, entity.toString(), savePaymentapiOutput.getBody().toString(), savePaymentapiOutput.getStatusCode().toString(),
                    userId, branchCode.toString()
            );
            billCollectionRepo.save(billCollectionEntity);
            System.out.println(e.getMessage());

        }
        return savePaymentapiOutput;
    }


    public ResponseEntity<BillCollectionDTO> deletePaymentInfo(String BILL_NO, String BILL_TRANSACTIONID  , HttpSession session){
        ResponseEntity<BillCollectionDTO> deletePaymentInfoapiOutput= null;
        String branchCode = AES256.decrypt((String) session.getAttribute("brCode")).trim();
        String userId = AES256.decrypt((String) session.getAttribute("userId")).trim();

        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        String uri = creds.getAPIBaseURL() + "billvendor/deletePaymentInfo";
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>() ;
        map.put("billNO", BILL_NO);
        map.put("billNO", BILL_TRANSACTIONID);
        HttpEntity entity = new HttpEntity<>(map, headers);
        try {
            deletePaymentInfoapiOutput = restTemplate.postForEntity(uri, entity, BillCollectionDTO.class);
            BillCollectionEntity billCollectionEntity = new BillCollectionEntity(
                    "billNo", uri, entity.toString(), deletePaymentInfoapiOutput.getBody().toString(), deletePaymentInfoapiOutput.getStatusCode().toString(),
                    userId, branchCode.toString()
            );
            billCollectionRepo.save(billCollectionEntity);
        }catch(Exception e){
            BillCollectionEntity billCollectionEntity = new BillCollectionEntity(
                    "billNo", uri, entity.toString(), deletePaymentInfoapiOutput.getBody().toString(), deletePaymentInfoapiOutput.getStatusCode().toString(),
                    userId, branchCode.toString()
            );
            billCollectionRepo.save(billCollectionEntity);
            System.out.println(e.getMessage());

        }
        return deletePaymentInfoapiOutput;
    }

}
