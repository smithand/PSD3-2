Narrative:
In Order to keep information and data safe
As a administrator
I want to authenticate users via the MyCampus single sign-up service

Scenario: A student wants to sign in to register for courses, but he wants to be sure that nobody else can use his log in details to hinder his sign-up
Given a course to sign up for
When the student decides to sign up for the course
and he logs into the system
then he should be the only person able to access the correct log-in credentials with no multi-users present within the system
