# CS305-Artemis-Financial-Practices-for-Secure-Software-Report


### •	**Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?**


Artemis Financial is a consulting company, its specialty lies in developing individualized financial plans for clients. These such financial plans can include retirement plans, savings plans, investment plans, and even insurance plans. Artemis Financial wanted to modernize their operations but in order to do this they needed to ensure the security of both of their client data and financial information. The issue they wanted us to address is the implementation of secure communication mechanisms for their web application. This included a file verification step which uses a checksum to ensure data integrity during transfers.


### •	**What did you do well when you found your client's software security vulnerabilities? Why is it important to code securely? What value does software security add to a company's overall well-being?**


I consider that I successfully identified and addressed their security vulnerabilities by thoroughly analyzing their existing codebase. I also ran dependency checks and implemented modern encryption techniques such as the AES-256 and SSL/TLS protocols. It is important to code securely because it protects the user’s sensitive data from any unauthorized access and breaches. This ensures both client trust and compliance. The value that software security adds to a company’s overall well-being is that it enhances the company’s reputation, it also prevents costly data breaches. Which allows for the safeguarding against any potential legal and financial repercussions.


### •	**Which part of the vulnerability assessment was challenging or helpful to you?**


The part of the vulnerability assessment that was challenging to me was distinguishing between the true positives and negatives. However, I must admit that this part of the vulnerability assessment report was also helpful for me as well since it deepened my understanding of security vulnerabilities and how to mitigate them. 


### •	**How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?**


I increased layers of security by implementing encryption for data that is in transit through the use of SSL/TLS and also by applying cryptographic hashing algorithms for data verification through the use of SHA-256. In the future, I would use tools like the OWASP dependency check, static code analysis tools, along with a combination of regular updates to all libraries and dependencies. I would ensure that I use secure coding practices and follow the industry’s standard guidelines like those outlined by OWASP in order to decide which mitigation techniques used.


### •	**How did you make certain the code and software applicaton were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?**


I made certain that the code and software application were functional and secure by running comprehensive tests, including unit tests and functional tests. After refactoring the code, I checked if I introduced any new vulnerabilities by running a secondary dependency check using the OWASP dependency check and comparing it to the first one I ran before refactoring. This confirmed I did in fact not introduce any new vulnerabilities and also helped maintain the apps security.


### •	**What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?**


The resources, tools, or coding practices that I used that might be helpful in future assignments or task were the OWASP dependency check tool, Java keytool for SSL certificate generation, and the principles that are outlined in the OWASP secure coding practices. Other techniques I used such as industry best practices like secure communication protocols (HTTPS), encryption standards (AES-256), and regular dependency checks are also helpful for future assignments or tasks.


### •	**Employers sometimes ask for examples of work you have succeessfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?**


What I might show future employers from this assignment is my ability to identify security vulnerabilities, mitigate these security vulnerabilities, implement encryption techniques, and also ensure secure data transmission in a web application.  I would also highlight my ability in the process of generating and implementing SSL certificates, running dependency checks, and the overall improvement of the app’s security. 

