package competitions;

public class Member {

    private String name;
    private int mHeight;
    private int mLength;

    public Member(String name, int mHeight, int mLength) {
        this.name = name;
        this.mHeight = mHeight;
        this.mLength = mLength;
    }

   public void jump(int height){

        System.out.println(name+ " overcame the wall at the distance " + height);
    }

    public void run(int length){
        System.out.println(name + " overcame the racetrack at the distance " + length);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return mHeight;
    }

    public int getLength() {
        return mLength;
    }
}
