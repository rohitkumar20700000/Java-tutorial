package SwitchCaseFormat;

public class YieldSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        String day = "Sunday";
        String result = switch(day) {
        	case "Saturday", "Sunday" :yield "6am";
        	case "Monday":yield "8am";
        	default:yield "7am";

        };
        System.out.println(result);

	}

}
