NON FUNCTIONAL REQUIREMENTS

Security/0

Narrative:
In Order to keep information and data safe
As a administrator
I want to authenticate users via the MyCampus single sign-up service

Scenario: A student wants to sign in to register for courses, but he wants to be sure that nobody else can use his log in details to hinder his sign-up
Given a course to sign up for
When the student decides to sign up for the course
and he logs into the system
then he should be the only person able to access the correct log-in credentials with no multi-users present within the system

Security/1

Narrative:
In order to seperate functions and provide correct functionality through personas
As a User
I want the relevant distinction between: students, lecturers, admins and tutors

Scenario: A user logs in to the system
Given the correct log-in details
When the user logs in
and he checks what functionality he has
then he should only be able to access information and functions that suit his user persona without being able to make dangerous changes

Interprobability/0

Narrative:
In order to create abstract bundles for the system
As a developer
I want to seperate each piece in the system into one or more OSGi bundles

Scenario: A developer creates wants to re-use code he has created in a similar system they are creating
Given the already developed system
When the developer looks at it
and he pulls the OSGi bundles
then he should be able to adapt the code with minimum dependancies for the new system he is creating

Performance/0

Narrative:
In order to allow for over 100 courses
As an admin
I should not be limited to under 100 courses being added to the system

Scenario: A lecturer wishes to add a course to the system, but the system already contains 99 courses
Given the course to be added
when the admin goes to add it to the system
and he imports it in
then the system should accept it and place it as the 100th course

Performance/1

Narrative:
In order to allow vast support for session types
as a lecturer
I should be able to create over 10 different types of session

Scenario: A lecturer wants to add an eleventh session type for her class
Given the new session type to be added
when the lecturer goes to add this new session type
and they put in the relevant information
then the system should add it as the eleventh session type for that class with no errors

Performance/2

Narrative:
In order to create a system which allows for entire university use
as an admin
I shall accomodate for at least 1000 different users

Scenario: A student has joined the university system and it brings the total past 999 users
Given the new student who is joining the system
when the admin goes to add the student
then the system should add the student as the 1000th member with no issues

Performance /3

Narrative:
In order to support enough time table slots for the year
as a lecturer
I want to be able to create 20 or more timetable slots for a single session

Scenario: A lecturer wishes to intitiate all the sessions for their class at the start of the year without having to do it over time
Given the time for the session
when the lecturer wants to add 21 instances of the session
and they want to do it at the same time
then the system shall allow them to create the 21 sessions neccessary.

Performance /4

Narrative:
In order to support concurrent use of the system
as a user
I want to be able to stay on the system when 99 other users are also online.

Scenario: A student needs to log onto the system when there is already 99 people inside the system
Given the log in details
when the user tries to log in to the concurrent system
and there are 99 other users
then the system shall let him log in and not throw any errors or crash

USER STORY 1:

Narrative:
In order to identify teaching session
As a lecturer
I want to import a myCampus Course successfully

Scenario: Lecturer chooses a course they need information on to start making teaching sessions
Given a specified course
When the lecturer needs the course information in the booking system
and the system is booted up
then the information will be transferred from MyCampus

USER STORY 2:

Narrative:
In order to identify timetable slots
As a lecturer
I want to add sessions to a course via the system

Scenario: a lecturer decides that he wants to identify slots within a timetable by adding labs and tutorials for the students
Given a relevant teaching session that is part of the course
When the lecturer wants to let the student identify the slots they need to attend
and the lecturer wants to track the teaching sessions
then the sessions for a course will be added to the relevant parties timetables

USER STORY 4:

Narrative:
To avoid creating a large number of sessions
As a lecturer
I want to specify that a session is a one off, or recurs weekly or fortnightly

Scenario: A Lecturer will be organizing a one-off presentation by a firm wanting to talk to the student
Given the details for the upcoming presentation
When the lecturer organizes the session via the system
and has the relevant information
then they can make sure that the event only appears on the time-slot it has been organized for 

USER STORY 8:

Narrative:
To successfully host a session and record it
As an administrator
I want to assign a room to a timetable slot

Scenario: The administrator needs to keep track of a new class that has started up and it's frequency of sessions
Given the information of where the session is going to take place
when the room conformation is recieved
and the session is definatley going to go ahead
then the room should be assigned to the specficed time-table slot to record the booking of the room

USER STORY 11:

Narrative:
In order to take the course
As a student
I want to book a timetable slot for each session of my course

Scenario: A student has a new course they need to sign up for 
Given the information required for their degree, the student will sign up for a new course
When the student knows what course to sign up for 
and looks at the sessions they need to sign up for
then they can sign up for each session that is neccessary

USER STORY 14:

Narrative:
In order to know when sessions happen
As a lecturer
I want to see the details (time, location, students, tutor) for every timetable slot in a session

Scenario: A lecturer begins her teaching week and wishes to know how her/his timetable is looking for the upcoming week in order to organize other activities
Given the timetable function in the system
When the lecturer needs to know all her information for the upcoming week
then the system will display all the timetable slots and their information for her.
