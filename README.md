
<div align="center"> <img align="center" alt="dschackfest" src="https://res.cloudinary.com/de4by5q8o/image/upload/v1633197681/hackfest2021_ocjn5n.svg" height='150' width='350'></div>

# 📱EasyLinks🔗
[![Issues](https://img.shields.io/github/issues/DSC-JSS-NOIDA/EasyLinks)](https://github.com/DSC-JSS-NOIDA/EasyLinks/issues)
[![PRs](https://img.shields.io/github/issues-pr/DSC-JSS-NOIDA/EasyLinks)](https://github.com/DSC-JSS-NOIDA/EasyLinks/pulls)
[![Maintenance](https://img.shields.io/maintenance/yes/2021?color=orange&logo=github)](https://github.com/DSC-JSS-NOIDA/)
[![Forks](https://img.shields.io/github/forks/DSC-JSS-NOIDA/EasyLinks?style=social)](https://github.com/DSC-JSS-NOIDA/EasyLinks) [![Stars](https://img.shields.io/github/stars/DSC-JSS-NOIDA/EasyLinks?style=social)](https://github.com/DSC-JSS-NOIDA/EasyLinks) [![Watchers](https://img.shields.io/github/watchers/DSC-JSS-NOIDA/EasyLinks?style=social)](https://github.com/DSC-JSS-NOIDA/EasyLinks) [![Twitter Follow](https://img.shields.io/twitter/follow/GDSCJSSATEN?style=social)](https://twitter.com/GDSCJSSATEN)

#### An Open Source App which enables users to drop all their professional handles and projects at one place. This is a Beginner Friendly Repository made for Open Source Enthusiasts who can contribute to the App during HacktoberFest 2021.

## Features✨
- User can share their various platforms' handles.
- User can add their projects with heading and description.
- User can search other user's profile.
- User can get a shareable link for their profiles.

## Tech to be used🛠️
- Android SDK
- Kotlin
- Firebase
- Deep linking

## Our Contributors  !! ✨
#### Thanks to these wonderful people: ✨

<table>
	<tr>
		<td>
			<a href="https://github.com/DSC-JSS-NOIDA/EasyLinks/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=DSC-JSS-NOIDA/EasyLinks" />
</a>
		</td>
	</tr>
</table>



## Set up and contribute in EasyLinks⚙️

### 1. Star and Fork this Repository
###### You can star ⭐ and fork 🍽️ this repository on GitHub by navigating at the top of this repository.

<img width="1680" alt="Screenshot 2021-10-02 at 1 15 22 PM" src="https://user-images.githubusercontent.com/55213645/135708202-051f4cbd-9928-432a-a5fc-bc23d7ac665e.png">

###### GitHub repository URLs will reference both the username associated with the owner of the repository, as well as the repository name. For example, DSC-JSS-NOIDA is the owner of this repository, so the GitHub URL for this project is:

https://github.com/DSC-JSS-NOIDA/EasyLinks

###### When you’re on the main page for the repository, you’ll see a button to "Star" and “Fork” the repository on your upper right-hand side of the page, underneath your user icon.

### 2. Clone the Repository
###### To make your own local copy of the repository you would like to contribute to, let’s first open up a terminal window.
###### We’ll use the git clone command along with the URL that points to your fork of the repository.
###### This URL will be similar to the URL above, except now it will end with .git. In the example above, the URL will look like this:

https://github.com/your-username/EasyLinks.git

###### You can alternatively copy the URL by using the green “Clone or download” button from your repository page that you just forked from the original repository page. Once you click the button, you’ll be able to copy the URL by clicking the binder button next to the URL:

<img width="1680" alt="Screenshot 2021-10-02 at 1 18 15 PM" src="https://user-images.githubusercontent.com/55213645/135708268-94e69b4b-eae7-4dbd-8dfd-d046e5c4e2dc.png">

###### Once we have the URL, we’re ready to clone the repository. To do this, we’ll combine the git clone command with the repository URL from the command line in a terminal window:
```
git clone https://github.com/your-username/EasyLinks.git
```
<img width="1016" alt="Screenshot 2021-10-02 at 1 24 43 PM" src="https://user-images.githubusercontent.com/55213645/135708421-1ded2316-b8b7-49c2-85a8-ebc9cbeab526.png">

### 3. Download Android Studio
###### Link to Developers page: https://developer.android.com/studio

![android studio](https://user-images.githubusercontent.com/55213645/96348578-7efd5500-10c7-11eb-8b6f-12e231721e17.png)

### 4. Open the Project
###### After completing the setup for Android Studio open the project.

<img width="946" alt="Screenshot 2021-10-02 at 1 28 09 PM" src="https://user-images.githubusercontent.com/55213645/135708519-d38b9d6b-ab43-4a93-b03e-0dc615dc768e.png">


### 5. Create New Branch
###### Once the project is opened create a new branch and checkout in it where you can make the changes in the code.
###### You can do this either from terminal or Directly in Android Studio.
###### To do from Terminal:
```
git branch new-branch
git checkout new-branch
```
###### To do directly from Android Studio
###### Click on Git branch in the bottom-right corner in Android Studio and create a new branch from there and checkout to it.

![](https://github.com/DSC-JSS-NOIDA/Plasma-Donor-App/blob/master/AppReadmeFiles/Change_branch.png)


### 6. Commit and Push
###### After making the required changes commit and push your code
###### Terminal:
###### To add the changes after you have made the modifications
``` git add . ``` or ``` git add -A ```
###### To commit and push the changes
```
git commit -m <Your-commit-message>
```
```
git push --set-upstream origin new-branch
```
###### From Android Studio:

<img width="1680" alt="Screenshot 2021-10-02 at 2 06 10 PM" src="https://user-images.githubusercontent.com/55213645/135709500-d3fcc00a-5b5f-4b8c-9e2c-d7c9854ca6ed.png">
<img width="1680" alt="Screenshot 2021-10-02 at 2 06 27 PM" src="https://user-images.githubusercontent.com/55213645/135709516-fb80abf8-dfa8-4128-85f5-dc90b16895f6.png">


### 7. Update Local Repository
###### While working on a project alongside other contributors, it is important for you to keep your local repository up-to-date with the project as you don’t want to make a pull request for code that will cause conflicts. To keep your local copy of the code base updated, you’ll need to sync changes.
###### We’ll first go over configuring a remote for the fork, then syncing the fork.

### 8. Configure a Remote for the Fork
###### You’ll have to specify a new remote upstream repository for us to sync with the fork. This will be the original repository that you forked from. you’ll have to do this with the git remote add command.
```
git remote add upstream https://github.com/DSC-JSS-NOIDA/EasyLinks
```
###### In this example, // upstream // is the shortname we have supplied for the remote repository since in terms of Git, “upstream” refers to the repository that you cloned from. If you want to add a remote pointer to the repository of a collaborator, you may want to provide that collaborator’s username or a shortened nickname for the shortname.

### 9. Sync the Fork
###### Once you have configured a remote that references the upstream and original repository on GitHub, you are ready to sync your fork of the repository to keep it up-to-date.
To sync your fork, from the directory of your local repository in a terminal window, you’ll have to use the // git fetch // command to fetch the branches along with their respective commits from the upstream repository. Since you used the shortname “upstream” to refer to the upstream repository, you’ll have to pass that to the command:
``` git fetch upstream ```
###### Switch to the local master branch of our repository:
``` git checkout master ```
###### Now merge any changes that were made in the original repository’s master branch, that you will access through your local upstream/master branch, with your local master branch:
``` git merge upstream/master ```

### 10. Create Pull Request
###### At this point, you are ready to make a pull request to the original repository.
###### Now navigate to your forked repository, and press the “New pull request” button on your left-hand side of the page.

<img width="1680" alt="Screenshot 2021-10-02 at 2 15 05 PM" src="https://user-images.githubusercontent.com/55213645/135709644-009bd104-e68e-4560-b914-2273e9e8011c.png">

### Want to improve it ✨? Feel free to contribute💥💥

<br>

### Built with 	❤️ by Google Developer Student Club JSS

<br>

![](https://camo.githubusercontent.com/d24f2f8414437a9491ea3145cafd373167315d50/68747470733a2f2f666f7274686562616467652e636f6d2f696d616765732f6261646765732f6275696c742d776974682d6c6f76652e737667) ![](https://camo.githubusercontent.com/e82fcde6b4952d69611ae4cf507b13fe6ae8e028/68747470733a2f2f666f7274686562616467652e636f6d2f696d616765732f6261646765732f6275696c742d666f722d616e64726f69642e737667)
<br>

###### Need help? Feel free to contact us @ [dscjssnoida@gmail.com](mailto:dscjssnoida@gmail.com)
## Connect with us
<div align="center">
 <a href="https://dscjss.in/"><img src="https://raw.githubusercontent.com/DSC-JSS-NOIDA/QuickLearn/main/assets/images/gdsc-logo.png"  height=100px /></a> <br><br> 
<a href="https://github.com/DSC-JSS-NOIDA" target="_blank">
<img src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 5px;" />
</a>
<a href="https://twitter.com/DSCJSSATEN" target="_blank">
<img src=https://img.shields.io/badge/twitter-%2300acee.svg?&style=for-the-badge&logo=twitter&logoColor=white alt=twitter style="margin-bottom: 5px;" />
</a>
<a href="https://www.linkedin.com/company/dsc-jssaten/" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 5px;" />
</a>
<a href="https://www.facebook.com/dscjssnoida/" target="_blank">
<img src=https://img.shields.io/badge/facebook-%232E87FB.svg?&style=for-the-badge&logo=facebook&logoColor=white alt=facebook style="margin-bottom: 5px;" />
</a>
<a href="https://www.instagram.com/dscjssaten/?igshid=9ubqtp1ssqsi" target="_blank">
<img src=https://img.shields.io/badge/instagram-%23000000.svg?&style=for-the-badge&logo=instagram&logoColor=white alt=instagram style="margin-bottom: 5px;" />
</a>
<a href="https://medium.com/dsc-jss-noida" target="_blank">
<img src=https://img.shields.io/badge/medium-%23292929.svg?&style=for-the-badge&logo=medium&logoColor=white alt=medium style="margin-bottom: 5px;" />
</a>  
<a href="https://www.youtube.com/channel/UCkELk5JFDceaSf8pBa19kDQ" target="_blank">
<img src=https://img.shields.io/badge/youtube-%23FF0000.svg?&style=for-the-badge&logo=youtube&logoColor=white alt=youtube style="margin-bottom: 5px;" />
</a> 
</div> 



This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
