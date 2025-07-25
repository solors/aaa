package com.smaato.sdk.core.linkhandler;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.smaato.sdk.core.lifecycle.ActivityProvider;
import com.smaato.sdk.core.util.Threads;

/* loaded from: classes7.dex */
public class IntentLauncher {
    private final Application application;
    private boolean wasLaunched = false;

    public IntentLauncher(Application application) {
        this.application = application;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39513a(IntentLauncher intentLauncher, Intent intent) {
        intentLauncher.lambda$launch$0(intent);
    }

    public /* synthetic */ void lambda$launch$0(Intent intent) {
        try {
            Activity currentActivity = ActivityProvider.get().getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            } else {
                this.application.startActivity(intent.addFlags(268435456));
            }
            this.wasLaunched = true;
        } catch (Exception unused) {
            this.wasLaunched = false;
        }
    }

    public boolean launch(final Intent intent) {
        Threads.runOnUiBlocking(new Runnable() { // from class: com.smaato.sdk.core.linkhandler.a
            @Override // java.lang.Runnable
            public final void run() {
                IntentLauncher.m39513a(IntentLauncher.this, intent);
            }
        });
        return this.wasLaunched;
    }
}
