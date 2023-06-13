package com.example.digitsumapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitSumController {

    private int usageCount = 0;

    @GetMapping("/api/digitsum")
    public int getSum(@RequestParam(name = "number") int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        usageCount++;

        return sum;
    }

    @GetMapping("/api/usage")
    public int getUsageCount() {
        return usageCount;
    }

}
