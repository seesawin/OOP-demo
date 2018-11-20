package com.seesawin.edition.e2;

import com.seesawin.edition.util.LogSpec;
import com.seesawin.edition.util.NewLogProvider;

public class Test3 {
	private static LogSpec log = new NewLogProvider();

	public static void main(String[] args) {
		log.info("step 3");
		log.info("step 4");
	}

}
