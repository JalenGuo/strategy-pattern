package com.jalen.strategypattern.context;

import com.jalen.strategypattern.strategy.PayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付接口上下文
 */
@Component
public class PayStrategyContext {
    /**
     * 策略集合
     * 设计模式：工厂模式
     */
    @Autowired
    private final Map<String, PayStrategy> payStrategyMap = new HashMap<>();

    public PayStrategy getPayStrategy(String payType) {
        PayStrategy payStrategy = payStrategyMap.get(payType);
        if (ObjectUtils.isEmpty(payStrategy)) {
            throw new RuntimeException("暂不支持的支付类型");
        }
        return payStrategy;
    }
}
