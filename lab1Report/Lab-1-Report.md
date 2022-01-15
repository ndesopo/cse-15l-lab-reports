# Remotely Connecting (an epic blog post)

## Installing VSCode
- VSCode can be downloaded at https://code.visualstudio.com/download
- Click the download button for your type of computer
- Execute the VSCode installer by double clicking it in your downloads folder
- Once installed, VSCode should open to something like this:
![image1](image1.PNG)

## Remotely Connecting
- First, make sure you have OpenSSH installed for both client and server on your computer. 
    - This should only be an issue if you’re on Windows
- Go to Settings > Apps > Apps & Features > Optional Features > Add a feature
    - Install OpenSSH Client and OpenSSH Server
- Next, find your ieng6 account by logging into  https://sdacs.ucsd.edu/~icc/index.php
    - All engineering students’ ieng6 accounts start with “cs15lwi22” and end with different characters, so it’s important to remember the characters after 22
- On VSCode, click the “Terminal” tab at the top, and then click “New Terminal”
- To remotely connect to the ieng6 server, enter this command into the terminal: ssh cs15lwi22zzz
    - Replace the z’s in the command with the characters specific to your account
    - Answer “yes” when it asks if you want to continue connecting.
    - It’s going to ask for your password. By default, your password for this account will still be your ucsd email password
![image2](image2.PNG)


## Trying Some Commands

## Moving Files with "SCP"

## Setting an SSH Key

## Optimizing Route Running