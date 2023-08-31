package com.swati.app.controller;

import com.swati.app.models.Address;
import com.swati.app.models.Item;
import com.swati.app.models.Machine;
import com.swati.app.req.AddressReq;
import com.swati.app.req.ItemRequest;
import com.swati.app.req.MachineRequest;
import com.swati.app.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ApplicationController {
@Autowired
    ApplicationService applicationService;

    @RequestMapping(method = RequestMethod.POST, value = "/addAddress")
    public Address addAddress(@RequestBody AddressReq addressReq) {

        return applicationService.addAddress(addressReq);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addItem")
    public Item addItem(@RequestBody ItemRequest itemRequest) {

        return applicationService.addItem(itemRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addMachine")
    public Machine addMachine(@RequestBody MachineRequest machineRequest) {

        return applicationService.addMachine(machineRequest);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/findVM/{id}")
    public Machine findVmById(@PathVariable Integer id) {
        return applicationService.findVmById(id);
    }

}
