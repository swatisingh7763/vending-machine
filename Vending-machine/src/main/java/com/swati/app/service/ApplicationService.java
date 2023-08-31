package com.swati.app.service;

import com.swati.app.models.Address;
import com.swati.app.models.Item;
import com.swati.app.models.Machine;
import com.swati.app.repo.AddressRepository;
import com.swati.app.repo.ItemRepository;
import com.swati.app.repo.MachineRepository;
import com.swati.app.req.AddressReq;
import com.swati.app.req.ItemRequest;
import com.swati.app.req.MachineRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApplicationService {
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    MachineRepository machineRepository;

    public Address addAddress(AddressReq addressReq) {
        Address add = Address.builder()
                .id(addressReq.getId())
                .city(addressReq.getCity())
                .build();

        return addressRepository.save(add);
    }

    public Item addItem(ItemRequest itemRequest) {
        Item item=Item.builder()
                .id(itemRequest.getId())
                .type(itemRequest.getType())
                .name(itemRequest.getName())
                .price(itemRequest.getPrice())
                .count(itemRequest.getCount())
                .build();

        return itemRepository.save(item) ;
    }



    public Machine addMachine(MachineRequest machineRequest) {
        Machine machine= Machine.builder()
                .id(machineRequest.getId())
                .availableCash(machineRequest.getAvailableCash())
                .name(machineRequest.getName())
                .itemList(itemRepository.findAllById(machineRequest.getItemList()))
        .build();

        return machineRepository.save(machine);
    }

    public Machine findVmById(Integer id) {
        return machineRepository.findById(id).get();
    }
}
