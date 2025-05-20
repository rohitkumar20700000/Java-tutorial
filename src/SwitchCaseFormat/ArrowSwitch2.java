package SwitchCaseFormat;

public class ArrowSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        String day = "Sunday";
        String result = switch(day) {
        	case "Saturday", "Sunday" -> "6am";
        	case "Monday" -> "8am";
        	default -> "7am";

        };
        System.out.println(result);

	}

}
