package com.PriceTrackApplication.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PriceTrackApplication.Authentication.UserDetails;

@RestController
public class NotificationRouteController {

    @Autowired
    EmailService emailService;
    @Autowired
    JdbcTemplate jdbcTemplate;
	private UserDetails list;

    public ResponseEntity<?> retrieveUserDetails(@RequestParam String email)
    {
    	 String sql = "SELECT email FROM User WHERE email = ? ";
         UserDetails user = new UserDetails(email);
         System.out.println(user.getEmail() );
         try {
            
			setList(jdbcTemplate.queryForObject(sql, new Object[]{user.getEmail()}, (rs, rowNum) ->
                     new UserDetails(rs.getString(1))));
            
             
         }
         catch(Exception e){
             System.out.println("Service interrupted" + e.toString());

             return new ResponseEntity(HttpStatus.BAD_REQUEST);
         }
		return null;

    }
    @GetMapping("/sendMail")
    public String sendEmailNotification(){
        System.out.println("Inside Send Mail=====================================>");
        emailService.sendMail(" "," Notification ","Your Product");
        System.out.println("After send mail");
        return "Successfully Sent";
    }
	public UserDetails getList() {
		return list;
	}
	public void setList(UserDetails list) {
		this.list = list;
	}
}
