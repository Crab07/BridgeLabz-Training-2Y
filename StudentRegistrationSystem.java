public class StudentRegistrationSystem {

    public static void main(String[] args) {
        String[] studentNames = new String[5];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter the names of 5 registered students:");
        for (int i = 0; i < studentNames.length; i++) {
            studentNames[i] = scanner.nextLine();
        }

        System.out.println("Registered student names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        String[] studentNames2 = new String[5];
        System.out.println("Enter the names of 5 students to check registration:");
        for (int i = 0; i < studentNames2.length; i++) {
            studentNames2[i] = scanner.nextLine();
        }

        for (String nameToCheck : studentNames2) {
            boolean found = false;
            for (String registeredName : studentNames) {
                if (registeredName.equals(nameToCheck)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(nameToCheck + " is Registered");
            } else {
                System.out.println(nameToCheck + " Not Found");
            }
        }

        scanner.close();
    }
}