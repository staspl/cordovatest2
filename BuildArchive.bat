@echo off
set archiveFile=%~dp0%A77plugin.zip
if exist %archiveFile% del %archiveFile%
set winrar="%ProgramFiles%\WinRar\winrar.exe"
if not exist %winrar% (
	echo Please install WinRar before continue
	echo start https://www.rarlab.com/download.htm
	exit
)

set cmd=%winrar% a %archiveFile% %~dp0%**.* -afzip -applugin -r -ep1 -x*.bat -x.git*.* -x*\.git
echo %cmd%
%cmd%

if errorlevel 1 (
	echo Some error happen
	exit
)

echo Binary package ready: %archiveFile%