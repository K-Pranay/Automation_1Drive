::task scheduler is triggered every 5 minutes
if not DEFINED IS_MINIMIZED set IS_MINIMIZED=1 && start "" /min "%~dpnx0" %* && exit
cd/
cd C:\Users\Pranay\OneDrive\Desktop\Git_Projects\Automation_1Drive\main
javac ScreenCapture.java
java ScreenCapture
javac ImageSend.java
java ImageSend
javac Mousemove.java
java Mousemove
exit
