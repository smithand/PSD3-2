Narrative:
In order to allow for over 100 courses
As an admin
I should not be limited to under 100 courses being added to the system

Scenario: A lecturer wishes to add a course to the system, but the system already contains 99 courses
Given the course to be added
when the admin goes to add it to the system
and he imports it in
then the system should accept it and place it as the 100th course
