package in.codecraftsbysanta.paymentservice.controllers;

import in.codecraftsbysanta.paymentservice.dtos.InitiatePaymentDTO;
import in.codecraftsbysanta.paymentservice.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDTO initiatePaymentDTO) {

        return paymentService.getPaymentLink(initiatePaymentDTO.getAmount(), initiatePaymentDTO.getOrderId(),
                initiatePaymentDTO.getPhoneNumber(),initiatePaymentDTO.getName(),initiatePaymentDTO.getEmail());

    }
}
