package com.san.generics;

import java.util.List;

public interface MyInterface<T> {

	public <T> List<T> isActive(List<T> t);

}
