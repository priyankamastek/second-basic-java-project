package org.example.rewards;

public class TestRewardPoints {

    public static void main(String[] args) {

//        RewardPoints rewardPoints = new RewardPoints();
//        rewardPoints.applyRewardPoints();

        RewardPoints rpObj1  = new RewardPoints(); // points = 0
        RewardPoints rpObj2 = new RewardPoints(200); // points = 200
        RewardPoints rpObj3 = new RewardPoints(400); // points = 400

        System.out.println("rpObj1 points = " + rpObj1.points);
        System.out.println("rpObj2 points = " + rpObj2.points);
        System.out.println("rpObj3 points = "  + rpObj3.points);

        rpObj1.calculatePoints();
        rpObj2.calculatePoints();
        rpObj3.calculatePoints();

    }
}
