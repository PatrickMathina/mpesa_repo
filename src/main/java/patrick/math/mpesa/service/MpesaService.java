package patrick.math.mpesa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MpesaService {


    public String processPayment() {
        // Simulate processing payment
        System.out.println("Processing payment to borrower...");

        // Respond that the payment has been processed
        return "Payment processed successfully.";
    }
}
