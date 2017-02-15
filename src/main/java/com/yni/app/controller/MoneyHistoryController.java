package com.yni.app.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.yni.app.service.MoneyHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leandro on 10/02/17.
 */
@RestController
@RequestMapping("/history")
public class MoneyHistoryController {

    @Autowired
    private MoneyHistoryService moneyHistoryService;

    @RequestMapping(value = "/percentageVariation", method = GET)
    public ResponseEntity<?> getPercentageHistoryVariation() {
        return new ResponseEntity<>(moneyHistoryService.getPercentageHistoryVariation(), OK);
    }

}
