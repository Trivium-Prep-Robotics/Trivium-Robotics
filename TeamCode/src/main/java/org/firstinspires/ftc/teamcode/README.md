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
