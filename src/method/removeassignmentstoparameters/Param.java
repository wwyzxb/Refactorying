package method.removeassignmentstoparameters;

import java.util.Date;

public class Param {
	public static void main(String[] args) {
		Date d1=new Date("1 Apr 98");
		nextDateUpdate(d1);
		System.out.println("d1 after nextDay:"+d1);//d1 after nextDay:Thu Apr 02 00:00:00 CST 1998
		
		Date d2=new Date("1 Apr 98");
		nextDateReplace(d2);
		System.out.println("d2 after nextDay:"+d2);//d2 after nextDay:Wed Apr 01 00:00:00 CST 1998
	}

	private static void nextDateUpdate(Date arg) {
		arg.setDate(arg.getDate() + 1);
		System.out.println("arg in nextDay: " + arg);//arg in nextDay: Thu Apr 02 00:00:00 CST 1998
	}

	private static void nextDateReplace(Date arg) {
		//在编码的过程中要尽量避免对参数的赋值
		arg = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
		System.out.println("arg in nextDay:" + arg);//arg in nextDay:Thu Apr 02 00:00:00 CST 1998
	}

}
