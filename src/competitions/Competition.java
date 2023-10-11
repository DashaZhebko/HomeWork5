package competitions;

public class Competition {

    public static void competitionResults(){

        Wall wall = new Wall(2);
        Racetrack racetrack = new Racetrack(1000);

        Obstacle [] obstacles = new Obstacle[2];

        obstacles[0] = wall;
        obstacles[1] = racetrack;


        Member robot = new Member("Robot", 5, 2000);
        Member human = new Member("Human", 1, 1005);
        Member cat = new Member("Cat", 1, 5000);

        Member [] members = new Member[3];
        members[0] = robot;
        members[1] = human;
        members[2] = cat;

        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
               if (!obstacles[j].overcome(members[i]))
                break;
            }
        }


    }
}
