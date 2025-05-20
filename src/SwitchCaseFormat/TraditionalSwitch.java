package SwitchCaseFormat;

public class TraditionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String day = "Sunday";
        String result = "";

        switch(day) {
            case "Saturday","Sunday":
                result = "6am";
                break;
            case "Monday":
                result = "8am";
                break;
            default:
                result = "7am";
        }

        System.out.println(result);


	}

}
