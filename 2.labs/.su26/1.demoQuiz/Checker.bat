@echo off
setlocal EnableExtensions EnableDelayedExpansion


REM ==============================
REM ===== Expected Hash Values ===
REM ==============================
set "HASH[1]=aa043caaed4834c480a3cc4731b00af0f600e5548e7117b9f0b6fa5ac19939b3"
set "HASH[2]=cd6d59ccf3eeac567a425828271d340b137b0870926031134b02f9f132d7daf7"
set "HASH[3]=1f5e25b8ec65dc02e359c75e6fa583f0965d858e226b6812ddb5bc36626f85f4"
set "HASH[4]=a325a95fb97055d84c726bf9cdc4530087c512781149508fef0e5056f85f6ee2"
set "HASH[5]=acc0103e3be51a3aef63ca59e6e476e28a8aaa9e7f2d8fd836b50e702d53b358"
set "HASH[6]=186a919b8c7cb84aebf4e53c70cd1cc028a93a1d183ee29dd6e10cd18a714577"
set "HASH[7]=ddbdbb82aaec8a3da82731eb0f5d041a495bb0b333becd5db7d58e9e7fc10b8e"


set "NUM_TEST=7"

echo.
javac Solution.java >nul 2>&1

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