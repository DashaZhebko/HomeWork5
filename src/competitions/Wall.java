package competitions;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Member member) {
        if (member.getHeight() >= height) {
            member.jump(height);
            return true;
        } else {
            System.out.println(member.getName() + " didn't overcome the racetrack at the distance " + height +
                    ". Overcame " + member.getHeight());
            return false;
        }
    }

}
