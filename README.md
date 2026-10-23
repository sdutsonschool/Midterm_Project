
# Midterm Project
University Model

# Team Information
Samuel Dutson 
NUID: 003976114

Due to extenuation circumstances, I was given permission by the course staff to complete
this assignment on my own. As all other use cases hinge on it, I opted to implement the Admin use case. 


# Project Overview
For this project we were tasked with integrating a reference implementation of a Digital University System with an Access Control Layer. This implementation ensured proper authentication (login/logout) and role based access (each 'type' of user can only preform tasks associated with their role).

## Key features (From the assignment description on canvas):
1. Administer user accounts (create, modify, and delete accounts).
2. Register persons (students, faculty, academic staff / employees)
3. Manage student records (update, delete, or view student data)
4. Manage faculty records (update, delete, or view faculty data)
5. Manage own profile

All the above features were implemented. View the video demo for a more in-depth overview.

# Installation & Setup Instructions

## 1. Prerequisites

The following tools are required to set up and run the project:

- **Apache NetBeans IDE:** Recommended for opening, building, and running the project.
- **Git:** Required to clone the repository.
- **Internet connection:** Required to download the repository and any project dependencies.

## 2. Clone the Repository

1. Open Terminal on macOS/Linux or PowerShell on Windows.
2. Navigate to the directory where you want to save the project.
3. Run the following commands:

```bash
git clone https://github.com/sdutsonschool/Midterm_Project.git
cd Midterm_Project
```

## 3. Open the Project in NetBeans

1. Launch Apache NetBeans.
2. Select **File → Open Project**.
3. Navigate to the cloned `Midterm_Project` folder.
4. Open the appropriate project directory:
   - `ProfileWorkareaExample 3/ProfileWorkareaExample`

## 4. Build and Run the Project

1. In NetBeans, right-click the project.
2. Select **Clean and Build** to compile the code and resolve dependencies.
3. Once the build succeeds, right-click the project and select **Run** (or press `F6`).
4. Check the Output window to verify that the application starts successfully.


# Authentication & Access Control
All users have a password / username. To login, the user must enter a valid username and password. To logout, the user simply presses the 'logout' button. 

The username and password that the user enters is matched with a user in the system. The user is then navigated to the proper work area based on their user type/role (Admin, Student, Faculty). The actions available to each role match those laid out in the assignment description.

**Note**: As I was the only person on my 'team' I only implemented the admin role functionality. 

# Features Implemented
As mentioned earlier, I was the only person on my team. I implemented the Admin role features. These features can be found in the 'Project Overview' section above. 


# Usage Instructions
More instruction / examples can be found in the submitted video demo.

## Login
To login, enter a valid username / password in the given fields. If the username and/or password is incorrect, you will be prompted to try again. Otherwise, you will be directed to the associated user's task page (varies based on what type of user you're logged in as).

## Logout
At any time, logout by pressing the 'logout' button. 

## Register New Users
1. Log in as an admin user. 
2. Click on the 'Register Persons (HR)' button.
3. Select the type of user that you like to register (admin/employee, student, faculty).
4. Enter valid values in the all fields and press 'save'. 

## Manage All Users
1. Log in as an admin user. 
2. Click on the 'Administer User Accounts' button. 
3. View, Edit, and Delete users as you see fit. 

## Manage Students
1. Log in as an admin user. 
2. Click on the 'Manage Students' button. 
3. View, Edit, and Delete users as you see fit. 

## Manage Faculty
1. Log in as an admin user. 
2. Click on the 'Manage Faculty' button. 
3. View, Edit, and Delete users as you see fit. 


# Testing Guide

## General Testing
To test the admin role do the following:
1. Log in as the pre-created admin user. 
2. Add several new users on varying types (student, admin/employee, faculty) via the provided UI options.
3. Try adding some users with invalid input (leave some fields blank). You'll notice the code properly handles invalid input from the user. 
4. Navigate to the 'Manage Users' tab and preform any desired operations on the users (view, edit, delete, ect).

## Authentication Testing
To test the authentication logic do the following:
1. Log in as the pre-created admin user. 
2. Add several new users on varying types (student, admin/employee, faculty) via the provided UI options.
3. Log in as each user type (student, admin, faculty) and ensure that you're maneuvered to the role's associated task page. 

# Challenges & Solutions

## Challenge
The main challenge that I faced was ensuring updates on one panel properly affected the values on other panels. For example, if an Admin added a new user, we expect said user to appear in the user table when the user opts to 'view all users'.

## Solution
To fix this, I went through my code and made sure that the model objects were ALWAYS being passed and that, outside of the initial setup, I wasn't re-creating the model classes. 

# Future Enhancements
I think a really cool feature could be adding functionality for bringing in transfer credits from another institution.

# Contribution Breakdown
I did this alone. 

# Sources
NOTE: I used some of the code from the previous assignment. I mentioned some of this in my presentation (student register page, last updated field). 