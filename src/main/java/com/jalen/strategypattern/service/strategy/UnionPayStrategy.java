package com.jalen.strategypattern.service.strategy;

import com.jalen.strategypattern.strategy.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * 具体策略类-银联支付
 */
@Service("UNIONPAY")
public class UnionPayStrategy implements PayStrategy {
    @Override
    public String pay(double amount) {
        return "使用银联支付了" + amount + "元";
    }
}
