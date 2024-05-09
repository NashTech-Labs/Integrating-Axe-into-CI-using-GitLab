# Integrating Axe into Continuous Integration Pipelines using GitLab
# Introduction
This template will help you to integrate Axe into GitLab CI/CD pipelines.Axe Selenium, a powerful accessibility testing tool, can be seamlessly integrated into CI pipelines via GitLab to automate accessibility checks.


# Technologies Used
Programming Language - Java/JavaScript

IDE - IntelliJ Idea

Build Tool - Maven

CI/CD - GitLab


# Prerequisites
Maven : https://maven.apache.org/install.html

JAVA : https://www.java.com/en/download/help/linux_x64_install.html

GitLab : Have a GitLab account or access to an existing GitLab instance. If you don’t have one, you can sign up for a free account at https://gitlab.com/users/sign_in


# Steps for execution
1. Clone the repository on your local system by using command : `git clone https://github.com/knoldus/k6-monitoring-using-netdata.git`

2. Open the cloned project in IDE

3. Modify **`AmazonAllyTest.java`** selenium script according to your requirnment

4. Go to the terminal and execute the command to perform accessibility test : `mvn clean test`

5. Modify **`.gitlab-ci.yml`** according to the requirnments that you want to keep in your pipeline execution, This YAML configuration executes before script where all the prerequisites are bundled and actual script where our accessibility test is performed.

6. Commit the **`.gitlab-ci.yml`** file to your project’s repository to trigger the CI/CD pipeline**

As far as you commit, GitLab will automatically run the accessibility test using pipeline configuration.



For a better understanding and changing this project according to you please refer to this blog based on same:-
https://blog.nashtechglobal.com/integrating-axe-into-continuous-integration-pipelines-using-gitlab/
