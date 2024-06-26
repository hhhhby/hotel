package com.hby.controller;


import com.hby.dto.Result;
import com.hby.entity.Voucher;
import com.hby.service.IVoucherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/voucher")
public class VoucherController {

    @Resource
    private IVoucherService voucherService;


    @PostMapping("seckill")
    public Result addSeckillVoucher(@RequestBody Voucher voucher){
        voucherService.addSeckillVoucher(voucher);
        return Result.ok(voucher.getId());

    }










}
