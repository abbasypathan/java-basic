package com.javabasic.i18n;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry() + "_" + l.getLanguage());
		System.out.println(l.getDisplayCountry() + "_" + l.getDisplayLanguage());

		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getDisplayCountry());

		String[] isoCountries = Locale.getISOCountries();
		for (String string : isoCountries) {
			System.out.println(string);
		}
	}
}
