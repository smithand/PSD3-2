Narrative:
In order to create abstract bundles for the system
As a developer
I want to separate each piece in the system into one or more OSGi bundles

Scenario: A developer creates wants to re-use code he has created in a similar system they are creating
Given the already developed system
When the developer looks at it
and he pulls the OSGi bundles
then he should be able to adapt the code with minimum dependencies for the new system he is creating
