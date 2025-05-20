package SwitchCaseFormat;

public class ArrowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String day = "Sunday";
        String result = "";
        switch(day) {
        	case "Saturday", "Sunday" -> result = "6am";
        	case "Monday" -> result = "8am";
        	default -> result = "7am";

        }
        System.out.println(result);


    


	}

}
