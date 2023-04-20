package com.community.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class PropertyTest {

	@Autowired
	FruitProperty fruitProperty;

	@Test
	void test() {
		List<Fruit> fruitData = fruitProperty.getList();

		assertThat(fruitData.get(0).getName(), is("banana"));
		assertThat(fruitData.get(0).getColor(), is("yellow"));

		assertThat(fruitData.get(1).getName(), is("apple"));
		assertThat(fruitData.get(1).getColor(), is("red"));

		assertThat(fruitData.get(2).getName(), is("water melon"));
		assertThat(fruitData.get(2).getColor(), is("green"));
	}

}
