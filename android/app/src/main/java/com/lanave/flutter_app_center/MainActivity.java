package com.lanave.flutter.medisys;
import io.flutter.embedding.android.FlutterActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import android.os.Bundle;

public class MainActivity extends FlutterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCenter.start(getApplication(), "{your-project-key-from-appcenter}", Distribute.class, Analytics.class, Crashes.class);
        AppCenter.setEnabled(true);
        Analytics.trackEvent("Application started");
        super.onCreate(savedInstanceState);
    }
}