Narrative:
In order to support concurrent use of the system
as a user
I want to be able to stay on the system when 99 other users are also online.

Scenario: A student needs to log onto the system when there is already 99 people inside the system
Given the log in details
when the user tries to log in to the concurrent system
and there are 99 other users
then the system shall let him log in and not throw any errors or crash
