package com.p551my.target.common;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.p551my.target.AbstractC25671c0;
import com.p551my.target.AbstractC25679c5;
import com.p551my.target.AbstractC25797h6;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.AbstractC25881l1;
import com.p551my.target.C26051r1;
import com.p551my.target.common.MyTargetConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.common.MyTargetManager */
/* loaded from: classes7.dex */
public final class MyTargetManager {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    @NonNull
    private static volatile MyTargetConfig myTargetConfig = new MyTargetConfig.Builder().build();

    private MyTargetManager() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m44055a(Context context) {
        lambda$initSdk$0(context);
    }

    @NonNull
    @WorkerThread
    public static String getBidderToken(@NonNull Context context) {
        return C26051r1.m43090b().m43093a(myTargetConfig, MyTargetPrivacy.currentPrivacy(), context);
    }

    @NonNull
    public static MyTargetConfig getSdkConfig() {
        return myTargetConfig;
    }

    @AnyThread
    public static void initSdk(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            AbstractC25846ja.m43676c("MyTarget cannot be initialized due to a null application context");
        } else if (!INITIALIZED.compareAndSet(false, true)) {
        } else {
            AbstractC25846ja.m43676c("MyTarget initialization");
            AbstractC25671c0.m44124b(new Runnable() { // from class: com.my.target.common.b
                @Override // java.lang.Runnable
                public final void run() {
                    MyTargetManager.m44055a(applicationContext);
                }
            });
        }
    }

    public static boolean isSdkInitialized() {
        return INITIALIZED.get();
    }

    public static /* synthetic */ void lambda$initSdk$0(Context context) {
        AbstractC25881l1.m43565a(context);
        AbstractC25679c5.m44090c(context);
        C26051r1.m43090b().m43094a(myTargetConfig, context);
        AbstractC25797h6.m43792a(context);
        AbstractC25671c0.m44125b();
    }

    public static void setDebugMode(boolean z) {
        AbstractC25846ja.f67064a = z;
        if (z) {
            AbstractC25846ja.m43680a("Debug mode enabled");
        }
    }

    public static void setSdkConfig(@NonNull MyTargetConfig myTargetConfig2) {
        myTargetConfig = myTargetConfig2;
    }
}
