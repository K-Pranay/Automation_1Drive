::use tasklist to get the process id
::rem Get the process ID of the Photos app
::rem Kill the Photos app using the process ID

@echo off
for /F "tokens=1,2" %%i in ('tasklist /FI "IMAGENAME eq PhotosApp.exe" /FO table /NH') do taskkill /F /PID %%i