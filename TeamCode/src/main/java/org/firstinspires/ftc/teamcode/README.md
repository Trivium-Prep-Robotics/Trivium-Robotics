# How to Use This
This repository is a fork of the [ftcRobotControler](https://github.com/FIRST-Tech-Challenge/FtcRobotController). This repository has extra skeleton code to have a head start when starting the season.

The two repositories that fork from this are [18625-Trivium-Knightmares](https://github.com/Trivium-Prep-Robotics/18625-Trivium-Knightmares) and [14254-Trivium-Knightlights](https://github.com/Trivium-Prep-Robotics/14254-Trivium-Knightligths)

![image](https://github.com/user-attachments/assets/6c02b179-7de0-48e2-8849-99d6d2f8d264)

## Updating this Repo
As of right now this repo is ahead
![image](https://github.com/user-attachments/assets/11f62a3e-fc08-4635-81d9-bf846b843240)
But if it is ever behind you need update this repo

![image](https://github.com/user-attachments/assets/c7c4e973-367f-4cb0-b707-4ad3ff2c1b4e)

- To start you can use the git command `git remote -v` to check that you have the upstream set.

  - If you get this:

![image](https://github.com/user-attachments/assets/9e8fddb2-db40-4c07-9a16-f21c25ec8c66)

Your good, but if you got this:

![image](https://github.com/user-attachments/assets/d4d73de4-ac05-4120-919c-118643cdd72b)

Type `git remote add upstream https://github.com/FIRST-Tech-Challenge/FtcRobotController` and then when you do that again you can check with `git remote -v`

- The next step is to download the recent changes into the local Git base. To do this use `git fetch upstream`.

- Next step is to use `git merge upstream/master --commit -m "merge from upstream"`

- Perfect. To finalize it just use `git push origin master`

The command line should look like this:
```
git remote add upstream https://github.com/FIRST-Tech-Challenge/FtcRobotControllerhttps://github.com/FIRST-Tech-Challenge/FtcRobotController
git fetch upstream
git merge upstream/main --commit -m "merge from upstream"
git push origin main
```
## Updating the other two repos
You do the same thing, but make sure that the upstream link is https://github.com/Trivium-Prep-Robotics/Trivium-Robotics instead

## What is in this repo?
This is good skeleton code to start the season.

- The [teleOp folder](https://github.com/Trivium-Prep-Robotics/Trivium-Robotics/tree/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/teleOp) already has skeleton teleOp code that already has field centric drive and imports the parts, arm, claw, and drive classes that are used.
- The [auto folder](https://github.com/Trivium-Prep-Robotics/Trivium-Robotics/tree/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/teleOp) already has skeleton auto code as well.
### [Parts](https://github.com/Trivium-Prep-Robotics/Trivium-Robotics/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/Parts.java)
This class has the robot configured in it. 
- The drive train motors all you have to do is change their name to what is in the control hub configuration.
- Has other motors as well like piv1, piv2, and slides
  - Simply delete this and add in the motors you use, these are what our robot had and I left them as an example of other motors
- Servo
  - We have the claw and wrist servo, again delete these and put any servos that you use instead.
