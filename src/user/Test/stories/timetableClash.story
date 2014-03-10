Narrative:
In order to make sure students are able to complete the course
As an Adminsitrator
I want to check that there are no timetable slot clashes between courses

Scenario: A student has signed up for multiple new sessions, but as an admin I am not sure if the sessions he have chosen are possible
Given a students list of sessions they have signed up for
When the admin checks the times of the sessions
and gathers all relevant data
then it will check that no slots clash together and flag up an error if they do
