package patrick.math.mpesa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import patrick.math.mpesa.service.MpesaService;

@RestController
public class MpesaController {

    @Autowired
    private MpesaService mpesaService;
    @GetMapping("/mpesa/process-payment")
    public ResponseEntity<String> processPayment() {
        String response = mpesaService.processPayment();
        return ResponseEntity.ok(response);
    }
}
