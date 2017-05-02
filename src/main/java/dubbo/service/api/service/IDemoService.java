package dubbo.service.api.service;

import org.springframework.stereotype.Service;

import dubbo.service.api.IDemoApi;

@Service
public class IDemoService implements IDemoApi{
	public String sayHello(String name){
		System.out.println(name);
		return "hello:" + name;
	}
}