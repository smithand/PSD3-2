Narrative:
In order to check I have signed up for all compulsory sessions
as a student
I should be able to check I have signed up for each course individulally

Scenario: A student wants to check that that he has signed up for his "Mathematics" course
Given he has taken "Mathematics"
When the student goes to check his courses
and searches for his courses
Then the system should be able to show him all courses which he has signed up for, inluding compulsory courses
