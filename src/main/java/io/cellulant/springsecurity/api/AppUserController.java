package io.cellulant.springsecurity.api;

import io.cellulant.springsecurity.entity.AppUser;
import io.cellulant.springsecurity.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AppUserController {
    private final AppUserService appUserService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>>getUsers(){
        return ResponseEntity.ok().body(appUserService.getUsers());
    }

}
