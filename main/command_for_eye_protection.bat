::task scheduler is triggered every 20 minutes and 5 mins break
if not DEFINED IS_MINIMIZED set IS_MINIMIZED=1 && start "" /min "%~dpnx0" %* && exit
cd/
cd C:\Users\Pranay\OneDrive\Desktop\Git_Projects\Automation_1Drive\resources
eye_image.jpg

TIMEOUT /T 300

::close_photos_app.bat
for /F "tokens=1,2" %%i in ('tasklist /FI "IMAGENAME eq PhotosApp.exe" /FO table /NH') do taskkill /F /PID %%i

TIMEOUT /T 10
exit
::many great things
:: give properties files
:: give 5 mins break. 
:: alert with music and pic if needed.