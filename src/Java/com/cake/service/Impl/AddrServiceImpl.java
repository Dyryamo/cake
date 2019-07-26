package com.cake.service.Impl;

import com.cake.bean.Addr;
import com.cake.bean.AddrExample;
import com.cake.dao.AddrMapper;
import com.cake.service.AddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addrServiceImpl")
public class AddrServiceImpl implements AddrService {

    @Autowired
    AddrMapper addrMapper;

    @Override
    public List<Addr> allUserAddr(int userId) {
        AddrExample addrExample = new AddrExample();
        AddrExample.Criteria criteria = addrExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Addr> addrs = addrMapper.selectByExample(addrExample);
        return addrs;
    }

    @Override
    public void updateAddr(int Id, Addr addr) {
        Addr addr1 = addrMapper.selectByPrimaryKey(Id);
        addr1.setAddress(addr.getAddress());
        addr1.setPhonenumber(addr.getPhonenumber());
        addrMapper.updateByPrimaryKey(addr1);
    }

    @Override
    public void deleteAddr(int AddrId) {
        addrMapper.deleteByPrimaryKey(AddrId);
    }

    @Override
    public void addAddr(int UserId, Addr addr) {
        addr.setUserid(UserId);
        addrMapper.insert(addr);
    }

    @Override
    public Addr getAddrUser(int userId, int addrId) {
        AddrExample addrExample = new AddrExample();
        AddrExample.Criteria criteria = addrExample.createCriteria();
        criteria.andUseridEqualTo(userId).andIdEqualTo(addrId);
        List<Addr> addrs = addrMapper.selectByExample(addrExample);
        if (addrs.size() == 0)
            return null;
        return addrs.get(0);
    }
}
