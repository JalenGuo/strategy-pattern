package com.jalen.strategypattern.service.strategy;

import com.jalen.strategypattern.strategy.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * 具体策略类-微信支付
 */
@Service("WECHAT")
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public String pay(double amount) {
        return "使用微信支付了" + amount + "元";
    }
}
