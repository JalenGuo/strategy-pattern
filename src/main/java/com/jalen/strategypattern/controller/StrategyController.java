package com.jalen.strategypattern.controller;

import com.jalen.strategypattern.context.PayStrategyContext;
import com.jalen.strategypattern.strategy.PayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
public class StrategyController {
    @Autowired
    private PayStrategyContext payStrategyContext;

    /**
     * 支付
     * 支付方式：WECHAT（微信支付） ALIPAY（支付宝支付） UNIONPAY（银联支付）
     *
     * @param amount
     * @param payType
     * @return
     */
    @GetMapping("/pay")
    public String pay(@RequestParam("amount") double amount, @RequestParam("payType") String payType) {
        PayStrategy payStrategy = payStrategyContext.getPayStrategy(payType);
        return payStrategy.pay(amount);
    }
}
