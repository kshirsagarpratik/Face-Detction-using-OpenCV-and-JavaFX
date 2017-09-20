## Face Detection with OpenCV and JavaFX

This is a javaFX application for Face Detection that is built on top of openCV. 
The root directory contains the following:-

-Source code in /src

-Test code in /test

-build.sbt

-build.gradle

-opencv resources in /resources


The /test directory contains 2 test classes with 2 tests each = 4 tests total. They are JUnit4 tests.

I have used jps, jcmd, jstack, jstat, jmap, JConsole, visualgc, Java Mission Control and VisualVM monitoring tools to capture some attributes of my application.
The GUI Screenshots of Java Monitoring Tools are present in the folder "GUI Screenshots of Monitoring Tools + Flight Recording". This folder also contains a Flight Recording .jfr file from Java Mission Control.

Also I have attached GUI screenshots of successful gradle run and SBT run in the folder "GUI Screenshots of Gradle and SBT output".

To run this application, open the project in IntelliJ and run the 'FaceDetetction.java' file.

To run the gradle file, in the terminal inside of IntelliJ, type 'gradle build' to build and 'gradle run' to run the file.

To run the sbt file, go to the Edit Configurations menu at the top right of the screen, left of the green 'Run' button, select the 'facedetection-sbt' from the dropdown list. Now, run this file with the green 'Run' button.

If you experience errors with respect to opencv, please ensure that it has been added as a external dependency.(Gradle and SBT should take care of this, nevertheless.)
As I used a windows system, to successfully build scripts, I had to manually insert the opencv_java320.dll [located in the the opencv package as: opencv\build\java\x64] into my jdk/bin path as well as jre/bin path.
Being on Mac OS, you might have to tackle this issue differently. Follow this link- "https://stackoverflow.com/questions/27088934/unsatisfiedlinkerror-no-opencv-java249-in-java-library-path" to possibly handle any Mac Specific error.

## Please refer this private discussion on Piazza for more details regarding this possibility:
https://drive.google.com/open?id=0B-S8rqKUiOvPVEVjYUlOOEUwU2M


