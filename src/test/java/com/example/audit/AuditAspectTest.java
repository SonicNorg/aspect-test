package com.example.audit;

import com.example.audit.as.as.model.StoreActivationSimRequest;
import com.example.audit.as.as.model.StoreChangeProductRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuditAspectTest {
    @Test
    public void testAspectOnPublic() {
        new TestAuditable().activate("activate iccid", "activate msisdn", "activate region");
    }
    @Test
    public void testAspectOnPrivate() {
        new TestAuditable().changePassword("changePassword iccid", "changePassword msisdn", "changePassword productId");
    }
}
