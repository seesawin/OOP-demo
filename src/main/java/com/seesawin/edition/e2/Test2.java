package com.seesawin.edition.e2;

import com.seesawin.edition.util.LogProvider;
import com.seesawin.edition.util.LogSpec;

public class Test2 {
	// ����new����|�ɭP�u�κݻP�Q�ϥΪ��󤧶����Ͱ����X��
	// �L�k�A����ʵ{�������p�U����new�X�Ӫ�����A�]���u�n��ʵ{���N�|��bug�������s����
	private static LogSpec log = new LogProvider();

	public static void main(String[] args) {
		log.info("step 1");
		log.info("step 2");
	}

}
