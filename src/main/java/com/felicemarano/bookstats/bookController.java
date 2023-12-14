package com.felicemarano.bookstats;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/verification")
public class bookController {

    @PostMapping("/verify")
    public ResponseEntity<String> verifyPost(@RequestBody String message) {
        // Verifica del messaggio ricevuto
        if ("ciao".equalsIgnoreCase(message)) {
            return ResponseEntity.ok("Verifica riuscita. Messaggio ricevuto: " + message);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verifica fallita. Messaggio non valido.");
        }
    }
}
