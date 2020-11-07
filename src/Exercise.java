class Exercise {
    /**
     * exercise's name
     */
    String exerciseName;
    String description;
    int durationInSeconds;
    /**
     * <code>false</code> means floor exercise
     */
    boolean isStandUp;

    public Exercise(String exerciseName, String description, int durationInSeconds, boolean isStandUp) {
        this.exerciseName = exerciseName;
        this.description = description;
        this.durationInSeconds = durationInSeconds;
        this.isStandUp = isStandUp;
    }

    public void print() {
        System.out.println(exerciseName + "                " + " Duration: " + durationInSeconds + " seconds");
        System.out.println("-----------------------------------------");
        System.out.println("DESCRIPTION: " + description);
        System.out.println();
    }

    public static void main(String[] args) {

        Exercise[] exercises = new Exercise[]{
                new Exercise("PushUps", "Place your hands on the floor. \nRaise up onto your toes so that all of your body weight is on your hands and your feet. \nBend your elbows and lower your chest down toward the floor.\nThen, push off the floor and extend them so that you return to the starting position.", 30, false),
                new Exercise("Planks", "Start on the floor on your hands and knees. \nLower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart.\nMaintain a straight line from heels through the top of your head, looking down at the floor.\nNow, tighten your abs and hold.", 90, false),
                new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles.\nExtend arms out straight so they are parallel with the ground, palms facing down.\nGo to a squat and exhale, then explode back up to standing, driving through heels.", 45, true),
                new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor.\n Your back is straight. Lift your leg up, and straighten it. \nForm a 90 degree angle in the ankle. \nRaise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. \nReturn to the starting position and repeat. ", 60, false),
                new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. \nStay for 15 seconds, then repeat with your other leg.", 90, true),
                new Exercise("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. \nRepeat with other hand.", 60, true)
        };
        System.out.println("\nAll exercises:");
        System.out.println("====================\n");
        for (Exercise exercise : exercises) {
            exercise.print();
        }

        System.out.println("\nAll floor exercises:");
        System.out.println("====================\n");
        for (Exercise exercise : exercises) {
            if (!exercise.isStandUp) {
                exercise.print();
            }
        }

        System.out.println("\nFloor exercise more than 60 seconds:");
        System.out.println("====================\n");
        for (Exercise exercise : exercises){
            if(!exercise.isStandUp && exercise.durationInSeconds > 60){
                exercise.print();
            }
        }
    }
}

