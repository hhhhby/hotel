package com.hby.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hby.entity.SeckillVoucher;
import com.hby.entity.Voucher;
import com.hby.mapper.VoucherMapper;
import com.hby.service.ISeckillVoucherService;
import com.hby.service.IVoucherService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static com.hby.utils.RedisConstants.SECKILL_STOCK_KEY;


@Service
public class VoucherServiceImpl extends ServiceImpl<VoucherMapper, Voucher> implements IVoucherService {

    @Resource
    private ISeckillVoucherService seckillVoucherService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    @Transactional
    public void addSeckillVoucher(Voucher voucher) {
        save(voucher);

        SeckillVoucher seckillVoucher = new SeckillVoucher();
        seckillVoucher.setVoucherId(voucher.getId());
        seckillVoucher.setStock(voucher.getStock());
        seckillVoucher.setBeginTime(voucher.getBeginTime());
        seckillVoucher.setEndTime(voucher.getEndTime());

        seckillVoucherService.save(seckillVoucher);
        stringRedisTemplate.opsForValue().set(SECKILL_STOCK_KEY+voucher.getId(), voucher.getStock().toString());
    }
}



