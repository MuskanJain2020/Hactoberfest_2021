Hacktoberfest 2021 ✨
Welcome everyone!🙌 This repository is made for everyone who wanted to learn about open-source and paricipate in Hacktoberfest 2021.

forthebadge forthebadge forthebadge forthebadge

     

      

Hey there!👋

What can you do here?🧐
You can solve questions put up by contributors (tag moderators in comment to assign an issue to you and mention the language you will be using).
You can put up a problem yourself.
You can even contribute a project made by you!
Please read this issue click here for more information.
New to github? No problem :) Refer to these resources 🆕
In Hindi Language -> Learn complete Git and Github in 1 video by Anuj Bhaiya: Youtube
In English Language -> Complete Git and GitHub Tutorial: Youtube
Git and github articles on atlassian.com: Website
Steps to put up an issue:📑
First let's see when should you create an issue?

If you want to contribute a question or project.
If you have a better solution to an existing solved issue.
To create an issue:
Click on the Issue button at top of the page:
pic1

Click new issue and fill up the details!
pic2

Note: Issues must clearly mention what they are addressing, if a problem is being put up then explain it using an example.

Get contributing🤩
Note: One must read CODE_OF_CONDUCT before starting work on any issue

First things first, In order to contribute you have to create a Pull Request from your forked repo which is a remote clone of this upstream repository.
pic3

Click this button at the top of screen to fork this repo, don't forget to star the repository!:
pic4

Now head over to the forked repository and copy the clone HTTPS URL:
pic5

Next up clone the forked repo on to the local machine using:

git clone <copied-fork-link>

Run these command to add remote origin

git remote add origin <The url of forked github repository>
If this command give message like git remote already exist then run this command

git remote set-url origin <The url of forked github repository>
It is critical to keep your forked repository in sync the upstream repository so merge conflicts can be avoided:

git remote add upstream
git fetch upstream
git pull upstream main
Create a seperate branch to work on:

The branch name must be selected according to the issue

git checkout -b <branch-name>

Contributors must follow the directory structure guidelines:

All files must be kept in a directory.
Directory name must resemble the issue assigned.
Based on the language used, create a directory inside the language directory.
Example: If I am writing in Python I will create a directory inside Python directory.
In case a project is being contributed make sure to add the files inside a directory(name according to project) which in turn must be placed inside the Projects directory.
Changes done by you will not affect existing structure of the project.
Add a README.md with your name and link to github profile using [your-name](link-to-profile)
After the contribution work is ready go ahead and add it to staging area:

git add -A

Now it is time to commit your changes and sync these changes to forked repo:

git commit -m <your_message>

git push origin <branch-name>

Issue a pull request from forked repo to this repo:

Head over to Pull Request tab in the forked repo and click on New Pull Request pic6

Verify base and head repository name and branch names. pic7

Fill in the title and provide a concise description. pic8

Wait for respose on the PR. Congratulations you just contributed to open source!

Code of conduct 👨‍💻
CODE_OF_CONDUCT.md

Labels 🏷
Issues labelled with language name e.g Python, mean that the particular issue has been assigned for language in the label

Let's connect
