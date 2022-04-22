package org.lang;

public class LanguageInfo {
	public void tamillanguage() {
		System.out.println("tamil language");
		System.out.println("tamil");
	}
	public void englishlanguage() {
		System.out.println("english language");
	}
	public void hindilanguage() {
		System.out.println("hindi language");
	}
	public static void main(String[]args) {
		LanguageInfo l = new LanguageInfo();
		l.tamillanguage();
		l.englishlanguage();
		l.hindilanguage();
		StateDetails t = new StateDetails();
		t.southindia();
		t.northindia();
	}
}
