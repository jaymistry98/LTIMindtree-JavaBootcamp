package com.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

public class VerifyDemo {

	@Test
	public void testMethod() {

		List<String> mockList = Mockito.mock(List.class);

		mockList.add("first");
		mockList.add("second");
		mockList.add("third");
		mockList.add("third");
		mockList.clear();

		Mockito.verify(mockList).add("first");
		Mockito.verify(mockList).add("second");

		Mockito.verify(mockList, VerificationModeFactory.times(2)).add("third");
		Mockito.verify(mockList).clear();

	}

}
