package dubbo.service.api.service;

import org.springframework.stereotype.Service;

import dubbo.service.api.IDemo2Api;

@Service
public class IDemo2Service implements IDemo2Api {

	@Override
	public String hh(String name) {
		return "hh:" + name;
	}

}
