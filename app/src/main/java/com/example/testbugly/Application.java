package com.example.testbugly;

import com.tencent.bugly.crashreport.CrashReport;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "a0e6903f2c", false);
    }
}
