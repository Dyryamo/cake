package com.cake.service;

import com.cake.bean.Addr;

import java.util.List;

public interface AddrService {
    public List<Addr> allUserAddr(int userId);
    public void updateAddr(int Id, Addr addr);
    public void deleteAddr(int AddrId);
    public void addAddr(int UserId, Addr addr);
    public Addr getAddrUser(int userId, int addrId);
}
