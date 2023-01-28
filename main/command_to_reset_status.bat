::task scheduler is triggered every 5 minutes
if not DEFINED IS_MINIMIZED set IS_MINIMIZED=1 && start "" /min "%~dpnx0" %* && exit
cd/
cd C:\Users\Pranay\OneDrive\Desktop\Git_Projects\Automation_1Drive\main
javac Index_Reset_nd_status_pics_delete.java
java Index_Reset_nd_status_pics_delete
del /Q *.class
exit
