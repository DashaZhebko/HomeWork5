package competitions;

public class Racetrack extends Obstacle {
    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Member member) {
        if (member.getLength() >= length) {
            member.run(length);
            return true;
        } else {
            System.out.println(member.getName() + " didn't overcome the racetrack at the distance " + length +
                    ". Overcame " + member.getLength());
            return false;
        }
    }

}
