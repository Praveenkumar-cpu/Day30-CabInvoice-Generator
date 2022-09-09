package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabInvoiceGeneratorTest {

    @Test
   public void givenDistanceAndTimeShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.calculateFare(10, 5);
        Assertions.assertEquals(105.0, totalFare);
    }
        @Test
    public void givenDistanceAndTimeShouldReturnMinimumFare(){
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.calculateFare(0.1,3);
        Assertions.assertEquals(5.0, totalFare);
        }
    }
