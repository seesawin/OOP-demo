package com.seesawin.edition.e2;

import com.seesawin.edition.util.LogProvider;
import com.seesawin.edition.util.LogSpec;

public class Test2 {
	// 直接new物件會導致只用端與被使用物件之間產生高偶合度
	// 無法再不改動程式的情況下換掉new出來的物件，因此只要改動程式就會有bug必須重新測試
	private static LogSpec log = new LogProvider();

	public static void main(String[] args) {
		log.info("step 1");
		log.info("step 2");
	}

}
