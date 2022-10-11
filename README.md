**How can I ensure that my code, program, or software is functional and secure?**

I can start by reviewing the requirements then creating pseudocode and/or a flowchart.  I can make sure that input is validated.  I can have a peer review my code to ensure it is functional.  A peer can also look at my code to make sure it is clean and legible.  I can also create tests that will ensure my program will do what is required and limit unauthorize usage.

**How do I interpret user needs and incorporate them into a program?**

I can view the needs as a checklist and use them when creating code.  First the requirements can be incorporated into the program through comments such as "#The program should do this."  Then under my comments I can create method or function stubs to get started with "#TO DO"s to come back to later.  From there I can work in pieces to ensure each requirement (or as I see it, a checklist) is ticked off my list and completed. 

**How do I approach designing software?**

First, I determine through the user what the software needs to do.  Then I design the pieces I want within the software through flowcharts or pseudocode.  Then I create comments within my code that include each requirement.  I then create method or function stubs and write the code within those stubs one at a time.  In this case, we also created unit tests and I designed my unit tests so all possible forms of input were tested and my code coverage was 100%.

**Project One Summary**

**Scenario**

You are a software engineer for Grand Strand Systems, a software engineering company that focuses on developing and testing back-end services. You’ve been given an assignment to develop a mobile application for a customer. The customer will provide you with the requirements. Your job is to code up the application and provide unit tests to verify that it meets the customer’s requirements. You will be delivering the contact, task, and appointment services. The purpose of these services is to add, update, and delete contact, task, and appointment objects within the application.

**Directions**

You have been asked to code up a mobile application for a client and provide unit tests to verify that it meets the customer’s requirements. In order to do so, you must complete the following:

**Contact Service:** In the Module Three milestone, you developed the contact service. The contact service used in-memory data structures to support storing contacts (no database required). In addition, there was no UI for this assignment. You verified the contact service through JUnit tests. The contact service contained a contact object along with the contact service. The requirements were as follows:<br/>
1. Contact Class Requirements<br/>
  a. The contact object shall have a required unique contact ID String that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.<br/>
  b. The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.<br/>
  c. The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.<br/>
  d. The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.<br/>
  e. The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.<br/>

2. Contact Service Requirements<br/>
  a. The contact service shall be able to add contacts with unique ID.<br/>
  b. The contact service shall be able to delete contacts per contactId.<br/>
  c. The contact service shall be able to update contact fields per contactId. The following fields are updatable:<br/>
    1. firstName<br/>
    2. lastName<br/>
    3. PhoneNumber<br/>
    4. Address
    
**Task Service:** In the Module Four milestone, you developed the task service. The task service used in-memory data structures to support storing tasks (no database required). In addition, there was no UI for this assignment. You verified the task service through JUnit tests. The task service contained a task object along with the task service. The requirements were as follows:<br/>
1. Task Requirements<br/>
  a. The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.<br/>
  b. The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.<br/>
  c. The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
2. Task Service Requirements<br/>
  a. The task service shall be able to add tasks with a unique ID.<br/>
  b. The task service shall be able to delete tasks per taskId.<br/>
  c. The task service shall be able to update task fields per taskId. The following fields are updatable:<br/>
    1. name<br/>
    2. description<br/>
Appointment Service: In the Module Five milestone, you developed the appointment service. The appointment service used in-memory data structures to support storing appointments (no database required). In addition, there was no UI for this assignment. You verified the appointment service through JUnit tests. The appointment service contained an appointment object along with the appointment service. The requirements were as follows:
Appointment Requirements
The appointment object shall have a required unique appointment ID String that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
The appointment object shall have a required appointment Date field. The appointmentDate field cannot be in the past. The appointmentDate field shall not be null. Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Appointment Service Requirements
The appointment service shall be able to add appointments with a unique appointmentId.
The appointment service shall be able to delete appointments per appointmentId.
