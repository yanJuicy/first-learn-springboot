package com.community.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "fruit")
public class FruitProperty {
	private List<Fruit> list;

	public List<Fruit> getList() {
		return list;
	}

	public void setList(List<Fruit> list) {
		this.list = list;
	}
}
