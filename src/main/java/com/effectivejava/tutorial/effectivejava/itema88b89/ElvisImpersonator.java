package com.effectivejava.tutorial.effectivejava.itema88b89;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ElvisImpersonator {

	private final static byte[] serializedFormByMe = { -84, -19, 0, 5, 115, 114, 0, 57, 99, 111, 109, 46, 101, 102, 102,
			101, 99, 116, 105, 118, 101, 106, 97, 118, 97, 46, 116, 117, 116, 111, 114, 105, 97, 108, 46, 101, 102, 102,
			101, 99, 116, 105, 118, 101, 106, 97, 118, 97, 46, 105, 116, 101, 109, 97, 56, 56, 98, 56, 57, 46, 69, 108,
			118, 105, 115, 25, -50, 97, 112, -40, -77, 44, 14, 2, 0, 1, 91, 0, 13, 102, 97, 118, 111, 114, 105, 116,
			101, 83, 111, 110, 103, 115, 116, 0, 19, 91, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114,
			105, 110, 103, 59, 120, 112, 117, 114, 0, 19, 91, 76, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 83, 116,
			114, 105, 110, 103, 59, -83, -46, 86, -25, -23, 29, 123, 71, 2, 0, 0, 120, 112, 0, 0, 0, 2, 116, 0, 9, 72,
			111, 117, 110, 100, 32, 68, 111, 103, 116, 0, 16, 72, 101, 97, 114, 116, 98, 114, 101, 97, 107, 32, 72, 111,
			116, 101, 108 };
	
	public static Object deserialize(byte[] bytes) {
		try {
			return new ObjectInputStream(new ByteArrayInputStream(bytes)).readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static void main(String[] args) {
		// Initializes ElvisStealer.impersonator and returns
		// the real Elvis (which is Elvis.INSTANCE)
		Elvis elvis = (Elvis) deserialize(serializedFormByMe);
		elvis.printFavorites();

	}

}
