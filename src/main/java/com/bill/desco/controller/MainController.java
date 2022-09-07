package com.bill.desco.controller;

import com.bill.desco.configuration.AES256;
import com.bill.desco.configuration.Credentials;
import com.bill.desco.dto.ApiGetTokenResponseDTO;
import com.bill.desco.dto.BillCollectionDTO;
import com.bill.desco.utility.ApiCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @Autowired
    private Credentials creds;
    @Autowired
     private ApiCallingService apiService;


    @PostMapping(path = {"logout"})
    public String logout(HttpSession session) {
        session.invalidate();
        return creds.getRedirectURL();
    }

    @GetMapping(path = {"/","desco_SSO"})
    public String home(Model model,
                       HttpSession session,
                       HttpServletRequest request) {

        String userName = request.getParameter("userName");
        String userId = request.getParameter("userId");
        String userType = request.getParameter("userType");
        String brName = request.getParameter("brName");
        String brCode = request.getParameter("brCode");
        String sessionId = request.getSession().getId();


        if (session.isNew()) {
            if(request.getParameterMap().containsKey("userName")){
                if ((!userName.isEmpty())  && session.getAttribute("is_session") == null) {
                    session.setAttribute("userName", userName);
                    session.setAttribute("userId", userId);
                    session.setAttribute("userType", userType);
                    session.setAttribute("brName", brName);
                    session.setAttribute("brCode", brCode);
                    session.setAttribute("is_session", true);
                    System.out.println("session has been set ");
                }else{
                    session.invalidate();
                    return creds.getRedirectURL();
                }
            }else{
                session.invalidate();
                return creds.getRedirectURL();
            }

        }

        model.addAttribute("branchName", AES256.decrypt(session.getAttribute("brName").toString()));
        model.addAttribute("userName", AES256.decrypt(session.getAttribute("userName").toString()));
        model.addAttribute("heading", "West Zone Power Distribution Company Limited");
        model.addAttribute("pages", "home");
        model.addAttribute("title", "WZPDCL Bill Collection");
        model.addAttribute("homeContent", "West Zone Power Distribution Company Limited (WZPDCL) Bill Collection");
        return "index";
    }


    @GetMapping(path = {"/","getToken"})
    public String token(Model model,
                       HttpSession session
                       ) {
        if (session.getAttribute("is_session") == null && session.getAttribute("userId") == null)
        {
            session.invalidate();
            return creds.getRedirectURL();
        }
        ResponseEntity<ApiGetTokenResponseDTO> apiOutput =apiService.getToken(creds.getApiUsername(),creds.getApiPassword(),session);
        if(apiOutput.getStatusCodeValue()==200 && apiOutput.getBody().equals("ok")){
            System.out.println(apiOutput.getBody().getAccessToken());
        }else{
            System.out.println(apiOutput.getBody().toString());
        }


        model.addAttribute("branchName", AES256.decrypt(session.getAttribute("brName").toString()));
        model.addAttribute("userName", AES256.decrypt(session.getAttribute("userName").toString()));
        model.addAttribute("heading", "DESCO");
        model.addAttribute("pages", "home");
        model.addAttribute("title", "DESCO Bill Collection");
//        model.addAttribute("homeContent", "West Zone Power Distribution Company Limited (WZPDCL) Bill Collection");
        return "index";
    }




    //        Bill vendor bill info

    @PostMapping(path = {"/","billInformation"})
    public String billingInfo(Model model,
                        HttpSession session
    ) {
        if (session.getAttribute("is_session") == null && session.getAttribute("userId") == null) {
            session.invalidate();
            return creds.getRedirectURL();
        }
        ResponseEntity<BillCollectionDTO> billionaireOutput =apiService.billInformation(creds.getApiUsername(),creds.getApiPassword(),session);
        if(billionaireOutput.getStatusCodeValue()==200 && billionaireOutput.getBody().equals("ok")){
            System.out.println(billionaireOutput.getBody().toString());
        }else{
            System.out.println(billionaireOutput.getBody().toString());
        }


        model.addAttribute("branchName", AES256.decrypt(session.getAttribute("brName").toString()));
        model.addAttribute("userName", AES256.decrypt(session.getAttribute("userName").toString()));
        model.addAttribute("heading", "DESCO");
        model.addAttribute("pages", "home");
        model.addAttribute("title", "DESCO Bill Collection");
//        model.addAttribute("homeContent", "West Zone Power Distribution Company Limited (WZPDCL) Bill Collection");
        return "index";
    }

    //        Bill vendor SAVEbill info


    @PostMapping(path = {"/","savePayment"})
    public String savePayment(Model model,
                              HttpSession session
    ) {
        if (session.getAttribute("is_session") == null && session.getAttribute("userId") == null) {
            session.invalidate();
            return creds.getRedirectURL();
        }
        ResponseEntity<BillCollectionDTO> savePaymentapiOutput =apiService.savePayment(creds.getApiUsername(),creds.getApiPassword(),session);
        if(savePaymentapiOutput.getStatusCodeValue()==200 && savePaymentapiOutput.getBody().equals("ok")){
            System.out.println(savePaymentapiOutput.getBody().toString());
        }else{
            System.out.println(savePaymentapiOutput.getBody().toString());
        }


        model.addAttribute("branchName", AES256.decrypt(session.getAttribute("brName").toString()));
        model.addAttribute("userName", AES256.decrypt(session.getAttribute("userName").toString()));
        model.addAttribute("heading", "DESCO");
        model.addAttribute("pages", "home");
        model.addAttribute("title", "DESCO Bill Collection");
//        model.addAttribute("homeContent", "West Zone Power Distribution Company Limited (WZPDCL) Bill Collection");
        return "index";
    }

    //Delete Info

    @GetMapping(path = {"/","deletePaymentInfo"})
    public String deletePaymentInfo(Model model,
                              HttpSession session
    ) {

        if (session.getAttribute("is_session") == null && session.getAttribute("userId") == null) {
            session.invalidate();
            return creds.getRedirectURL();
        }
        ResponseEntity<BillCollectionDTO> deletePaymentInfoapiOutput =apiService.deletePaymentInfo(creds.getApiUsername(),creds.getApiPassword(),session);
        if(deletePaymentInfoapiOutput.getStatusCodeValue()==200 && deletePaymentInfoapiOutput.getBody().equals("ok")){
            System.out.println(deletePaymentInfoapiOutput.getBody());
        }else{
            System.out.println(deletePaymentInfoapiOutput.getBody().toString());
        }


        model.addAttribute("branchName", AES256.decrypt(session.getAttribute("brName").toString()));
        model.addAttribute("userName", AES256.decrypt(session.getAttribute("userName").toString()));
        model.addAttribute("heading", "DESCO");
        model.addAttribute("pages", "home");
        model.addAttribute("title", "DESCO Bill Collection");
//        model.addAttribute("homeContent", "West Zone Power Distribution Company Limited (WZPDCL) Bill Collection");
        return "index";
    }





}
