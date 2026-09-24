@echo off
setlocal EnableExtensions EnableDelayedExpansion


REM ==============================
REM ===== Expected Hash Values ===
REM ==============================

set "HASH[1]=5ebfdc50f712e43e3feb5de79bb8512ffc4399467275defe1d47a3b7920c5af8"
set "HASH[2]=a90dc849fcbc1a3881f03bf838a2e79902bbcb8f0655e008749176517c656e65"
set "HASH[3]=91ee4f45c896460efb45c897ab88ba49a7c9a888c28a6375ed351cd88178c343"
set "HASH[4]=141ee338d69dfee8da973b7c87d8575c12f1782de9ed64d3a056df9b3485e928"
set "HASH[5]=65041dc2e00aaa82080252a8c76fbc951e558551bc07b2bee90698a8a6c95968"
set "HASH[6]=6e6b25887e8843cc30b0e482428db5fe4034a2a274b166c02eaf123af6e1786c"
set "HASH[7]=9658f9ce0dfc787543fb8c47d10839644d120a2689756c81824583da464a40ec"




set "NUM_TEST=7"

echo.
javac Solution.java  2>&1

if errorlevel 1 (
    echo Compilation Failed.
    pause
    exit /b 1
)

for /l %%i in (1,1,%NUM_TEST%) do (
    echo Running on Test Case - %%i

    java Solution < inp%%i.txt > out%%i.txt 2>nul

    set "hash="

    for /f "skip=1 tokens=* delims=" %%H in ('certutil -hashfile out%%i.txt SHA256') do (
        if not defined hash set "hash=%%H"
    )

    set "hash=!hash: =!"

    if /i "!hash!"=="!HASH[%%i]!" (
        echo Verdict: Accepted
    ) else (
        echo Verdict: Wrong Answer
    )

    echo.
)

pause
exit /b 0