package com.concepts.dp.creational.singletondp;

public class SingletonClient {

	public static void main(String[] args) {
		
		EagerInitializedSingleton.getInstance();
		//After EagerInitializedSingleton class loaded .
		//Check output
		EagerInitializedSingleton.getInstance();
		
		StaticBlockSingleton.getInstance();
		LazyInitializedSingleton.getInstance();
		ThreadSafeSingleton.getInstance();
		ThreadSafeSingletonUsingDoubleLocking.getInstance();
		ThreadSafeSingletonUsingDoubleLocking.getInstance();
		
		BillPughSingleton.getInstance();
		BillPughSingleton.getInstance();

	}

}
