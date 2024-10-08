package com.jalen.strategypattern.service.strategy;

import com.jalen.strategypattern.strategy.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * 具体策略类-支付宝支付
 */
@Service("ALIPAY")
public class AliPayStrategy implements PayStrategy {
    @Override
    public String pay(double amount) {
        return "使用支付宝支付了" + amount + "元";
    }
}
