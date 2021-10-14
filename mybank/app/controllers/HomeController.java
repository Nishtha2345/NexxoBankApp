package controllers;

import dto.*;
import models.Transaction;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;
import services.*;

import javax.inject.Inject;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject
    private RegistrationService registrationService;
    private Object RegistrationRequestDto;
    private RegistrationService LoginService;
    private Object LoginRequestDto;


    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
       // return ok(views.html.index.render());
        return ok();
    }

    public Result login() {
//        return ok(views.html.login.render());
        return ok();
    }


    public Result registration() {
        //return ok(views.html.registration.render());
        return ok();
    }

    public Result transaction() {
        //return ok(transactionHistory.render());
        return ok();
   }

    public Result deposit() {
        //return ok(views.html.deposit.render());
        return ok();
    }

    public Result withdraw() {
        //return ok(views.html.withdraw.render());
        return ok();
    }

    public Result admin() {
//        return ok(views.html.admin.render());
        return ok();
    }
@Inject
private ViewListService viewListService;
    public Result viewlist(Integer roleId) {
        System.out.println("in view list");
        List<CustomerListResponseDto> customerListResponseDtoList = viewListService.viewList(roleId);
       return ok(Json.toJson(customerListResponseDtoList));

    }

   public Result viewPage(Integer roleId) {
       List<CustomerListResponseDto> customerListResponseDtoList = viewListService.viewList(roleId);
               //return ok(views.html.viewlist.render(customerListResponseDtoList));
       return ok();

    }

    @Inject
    private FormFactory formFactory;

    public Result saveData(Http.Request request) {
        System.out.println("Saving data called ");
        try {
        RegistrationResponseDto responseDto = new RegistrationResponseDto();
        Form<RegistrationRequestDto> registrationForm =
                formFactory
                        .form(RegistrationRequestDto.class)
                        .bindFromRequest(request);

        RegistrationRequestDto requestDto = registrationForm.get();
        responseDto = registrationService.save(requestDto);//saving portion done
        return ok(Json.toJson(responseDto));} catch (Exception ex) {
            System.out.println("Exception occurred " + ex);
            return ok();
        }
    }

    @Inject
    private LoginService loginService;

   public Result checkLogin(Http.Request request) {
        LoginResponseDto responseDto1 = new LoginResponseDto();
        LoginResponseDto responseDto = new LoginResponseDto();

        Form<LoginRequestDto> loginRequestForm =
                formFactory
                        .form(LoginRequestDto.class)
                        .bindFromRequest(request);
        dto.LoginRequestDto requestDto = loginRequestForm.get();
        responseDto = loginService.checkLogin(requestDto);
       System.out.println("user id  " + responseDto.getUserId());
        return ok(Json.toJson(responseDto))
                .addingToSession(request,"userId", responseDto.getUserId() != null ? responseDto.getUserId().toString() : "");
   }

    @Inject
    private WithdrawService withdrawService;


   public  Result getUserData(Http.Request request, Integer userId) {
       System.out.println("*********************" + userId);
       DashboardResponseDto responseDto = new DashboardResponseDto();
       List<Transaction> transaction = Transaction.find.query().where().eq("userId.id", userId).findList();
       Float totalAmount = 0.00F;
       for(Transaction tran : transaction) {
           if(tran.getTransactionType().getId() == 2)
                totalAmount += tran.getAmount();
           if(tran.getTransactionType().getId() == 1)
               totalAmount -= tran.getAmount();
       }
       responseDto.setBalance(totalAmount.toString());
       return ok(Json.toJson(responseDto));
   }

    public Result withdrawCash(Http.Request request) {
        Form<WithdrawRequestDto> withdrawRequestForm =
                formFactory
                        .form(WithdrawRequestDto.class)
                        .bindFromRequest(request);
        WithdrawRequestDto requestDto = withdrawRequestForm.get();
        WithdrawResponseDto responseDto = withdrawService.withdrawCash(requestDto);
        return ok(Json.toJson(responseDto));


    }

    @Inject
    private DepositService depositService;

    public Result depositMoney(Http.Request request) {
        DepositResponseDto responseDto = new DepositResponseDto();

        Form<DepositRequestDto> depositRequestDtoForm =
                formFactory
                        .form(DepositRequestDto.class)
                        .bindFromRequest(request);
        DepositRequestDto depositRequestDto = depositRequestDtoForm.get();

        responseDto = depositService.depositMoney(depositRequestDto);
        return ok(Json.toJson(responseDto));
    }

    @Inject
    private ActivateService activateService;

    public Result activateCustomer(Integer userId) {
        ActivateResponseDto responseDto = new ActivateResponseDto();

        responseDto = activateService.activateCustomer(userId);
        return ok(Json.toJson(responseDto));
    }

    @Inject
    private DeactivateService deactivateService;

    public Result deactivateCustomer(Integer userId) {
        DeactivateResponseDto responseDto = new DeactivateResponseDto();

        responseDto = deactivateService.deactivateCustomer(userId);
        return ok(Json.toJson(responseDto));

    }

    @Inject
    private TransactionHistoryService transactionHistoryService;

    public Result transactionHistoryCustomer(Http.Request request, Integer userId) {
        List<TransactionHistoryResponseDto> responseDto = transactionHistoryService.transactionHistoryService(userId);
        return ok(Json.toJson(responseDto));
    }
    public Result transactionHistoryPage(Integer userId){
        List<TransactionHistoryResponseDto> responseDto = transactionHistoryService.transactionHistoryService(userId);
        //return ok(views.html.transactionHistory.render(responseDto));
        return ok();
    }
}
