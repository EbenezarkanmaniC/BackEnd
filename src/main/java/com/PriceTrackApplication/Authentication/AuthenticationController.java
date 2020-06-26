package com.PriceTrackApplication.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;




@RestController
public class AuthenticationController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/login")

    public ResponseEntity<?> retrieveUserDetails(@RequestParam String email, @RequestParam String password ){
        System.out.println(email + password);


        String sql = "SELECT email, password FROM User WHERE email = ? AND password = ?";
        UserDetails user = new UserDetails(email,password);
        System.out.println(user.getEmail() + user.getPassword());
        try {
            UserDetails list = jdbcTemplate.queryForObject(sql, new Object[]{user.getEmail(), user.getPassword()}, (rs, rowNum) ->
                    new UserDetails(
                            rs.getString(1),
                            rs.getString(2)
                    ));
            if (list.getEmail() != null && list.getPassword() != null) {
                System.out.println("email :" + list.getEmail() + "Successfully Looged in");
                return ResponseEntity.noContent().build();
            }
            else {
                throw new EmptyResultDataAccessException("email :"+user.getEmail());
            }
        }
        catch(Exception e){
            System.out.println("Service interrupted" + e.toString());

            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
//        return "Sucessfully login";
    }


}
