package com.hby.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hby.entity.Voucher;

public interface IVoucherService extends IService<Voucher> {
    void addSeckillVoucher(Voucher voucher);
}
