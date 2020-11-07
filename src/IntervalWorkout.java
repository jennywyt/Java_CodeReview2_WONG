import java.util.ArrayList;

public class IntervalWorkout {

    /**
     * more than one
     */
    ArrayList<Exercise> severalExercises;
    int reps;
    int breakTimeInSec;

    public IntervalWorkout(ArrayList<Exercise> severalExercises, int reps, int breakTimeInSec) {
        this.severalExercises = severalExercises;
        this.reps = reps;
        this.breakTimeInSec = breakTimeInSec;
    }

    public void printWorkout() {
        System.out.println("*****************************");
        System.out.println("Interval Workout Starts!!!!");
        System.out.println("*****************************");
        System.out.println("=============================");


        for (int i = 1; i <= reps; i++) {
            System.out.println("Round " + i + ":");

            for (Exercise exercise : severalExercises) {
                System.out.println(exercise.exerciseName + " (" + exercise.durationInSeconds + " seconds" + ")");
            }

            if (i != reps) {
                System.out.println("=============================");

                System.out.println("Break Time" + " (" + breakTimeInSec + " Seconds)");
                System.out.println("=============================");
            }

        }
        System.out.println("*****************************");
        System.out.println("Good Job! The pain you feel today will be the strength you feel tomorrow!");
        System.out.println("*****************************");
    }

    public static void main(String[] args) {


        ArrayList<Exercise> workOut = new ArrayList<>();
        workOut.add(new Exercise("Push-ups", "", 30, false));
        workOut.add(new Exercise("Squat", "", 60, true));
        workOut.add(new Exercise("Plank", "", 60, false));

        IntervalWorkout move = new IntervalWorkout(workOut, 4, 30);


        move.printWorkout();


    }
}