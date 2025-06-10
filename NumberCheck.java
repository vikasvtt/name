public class NumberCheck {

    public static void main(String[] args) {
        int number = -5;

        if (number > 0) {
            System.out.println("Positive");
            // Git instructions to push to the 'main' branch:
            // 1. git add NumberCheck.java  (or git add . to add all modified files)
            // 2. git commit -m "feat: Check if number is positive"
            // 3. git push origin main
        } else if (number < 0) {
            System.out.println("Negative");
            // Git instructions to push to the 'master' branch:
            // 1. git add NumberCheck.java (or git add . to add all modified files)
            // 2. git commit -m "feat: Check if number is negative"
            // 3. git push origin master
        } else {
            System.out.println("Zero");
            // Git instructions to push to the 'master' branch:
            // 1. git add NumberCheck.java (or git add . to add all modified files)
            // 2. git commit -m "feat: Check if number is zero"
            // 3. git push origin master
        }

        // Git instructions to merge 'master' into 'main':
        // 1. git checkout main
        // 2. git merge master
        // 3. git push origin main
    }
}
