package com.stt.euopauto.mock;

import java.util.List;

import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.junit.Test;

public class MockDemo {
	@Test
	public void verify_behaviour() {
		List<String> mockedlist = Mockito.mock(List.class);
		mockedlist.add("one");
		mockedlist.clear();
		
	}

}
