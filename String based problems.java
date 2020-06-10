// the "nambier Number Generation //
class TheNambiarNumberGenerator {

	public int nnGenerator(String input1){
		
		String mobileNo = input1;
		StringBuilder numbiarNo = new StringBuilder();

		for (int i = 0; i < mobileNo.length(); i++) {
			int firstDigit = Integer.parseInt(String.valueOf(mobileNo.charAt(i)));
			int firstDigitEvenOrOdd = firstDigit % 2 == 0 ? 0 : 1; // even=0; odd=1
			int sum = firstDigit;
			int j = i + 1;

			if (j == mobileNo.length()) {
				numbiarNo.append(firstDigit);
				break;
			}

			while (true) {
				sum += Integer.parseInt(String.valueOf(mobileNo.charAt(j++)));

				if (sum % 2 != firstDigitEvenOrOdd || j >= mobileNo.length()) {
					numbiarNo.append(sum);
					i = j - 1;
					break;
				}
			}
		}
		
		return Integer.parseInt(numbiarNo.toString());
	}
}

// User Id generation //
class UserIDGeneration {

	public String userIdGeneration(String input1,String input2,int input3,int input4){
		
		String firstName = input1;
		String lastName = input2;
		int pin = input3;
		int N = input4;
		
		String longerName;
		String smallerName;
		StringBuilder userId = new StringBuilder();
		
		if (firstName.length() > lastName.length()) {
			longerName = firstName;
			smallerName = lastName;
		} else if (firstName.length() < lastName.length())  {
			longerName = lastName;
			smallerName = firstName;
		} else {
			if (firstName.compareTo(lastName) < 1 ) {
				longerName = lastName;
			    smallerName = firstName;
			} else {
				longerName = firstName;
			    smallerName = lastName;
			}
		}
		
		userId.append(smallerName.charAt(smallerName.length() - 1));
		userId.append(longerName);
		
		for (int i = 0; i < userId.length(); i++) {
			if (Character.isUpperCase(userId.charAt(i)))
				userId.setCharAt(i, Character.toLowerCase(userId.charAt(i)));
			else
				userId.setCharAt(i, Character.toUpperCase(userId.charAt(i)));
		}
		
		userId.append(String.valueOf(pin).charAt(N - 1));
		userId.append(String.valueOf(pin).charAt(String.valueOf(pin).length() - N));
		
		return userId.toString();
	}
}

// message controlled robot movement //

class MessageControlledRobotMovement {

	public String moveRobot(int input1,int input2,String input3,String input4){
		
		int X = input1;
		int Y = input2;
		String currentPos = input3;
		String msg = input4;
		
		int currX = Integer.parseInt(currentPos.split("-")[0]);
		int currY = Integer.parseInt(currentPos.split("-")[1]);
		String currD = currentPos.split("-")[2]; // E/W/N/S
		String[] instructions = msg.split(" "); // M L R M M L M ...
		StringBuilder output = new StringBuilder();
		
		System.out.println(Arrays.toString(instructions));
		System.out.println("Curr: " + currX + currY + currD);
		
		for (int i = 0; i < instructions.length; i++) {
			System.out.print(instructions[i] + ":: ");
			if (instructions[i].equals("M")) {
				if (currD.equals("E") && (currX + 1 > X )) {
					output.append("-ER");
					break;
				} 
				if (currD.equals("W") && (currX - 1 < 0 )) {
					output.append("-ER");
					break;
				} 
				if (currD.equals("N") && (currY + 1 > Y )) {
					output.append("-ER");
					break;
				} 
				if (currD.equals("S") && (currY - 1 < 0 )) {
					output.append("-ER");
					break;
				}

				if (currD.equals("E")) currX++;
				else if (currD.equals("W")) currX--;
				else if (currD.equals("N")) currY++;
				else if (currD.equals("S")) currY--;
			} else {
				if (currD.equals("E") && instructions[i].equals("L"))
				    currD = "N";
				else if (currD.equals("E") && instructions[i].equals("R"))
					currD = "S";
				else if (currD.equals("W") && instructions[i].equals("L"))
					currD = "S";
				else if (currD.equals("W") && instructions[i].equals("R"))
					currD = "N";
				else if (currD.equals("N") && instructions[i].equals("L"))
					currD = "W";
				else if (currD.equals("N") && instructions[i].equals("R"))
					currD = "E";
				else if (currD.equals("S") && instructions[i].equals("L"))
					currD = "E";
				else if (currD.equals("S") && instructions[i].equals("R"))
					currD = "W";
			}
			
			output.delete(0, output.length());
			output.append(currX + "-" + currY + "-" + currD);
			System.out.println(output);
		}
		
		return output.toString();
	}
}
