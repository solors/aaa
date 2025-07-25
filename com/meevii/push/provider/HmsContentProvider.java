package com.meevii.push.provider;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p042c7.RelyTaskManager;
import p1055y6.C45035a;
import p772l6.PushEvent;
import p844q6.DataManager;

/* loaded from: classes5.dex */
public class HmsContentProvider extends ContentProvider {

    /* renamed from: c */
    private static int f61601c;
    public static boolean isAppEnterFront;

    /* renamed from: b */
    private String f61602b;

    public static boolean appIsBackground() {
        if (f61601c == 0) {
            return true;
        }
        return false;
    }

    public static boolean appIsForeground() {
        if (f61601c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static /* synthetic */ int m47851b() {
        int i = f61601c;
        f61601c = i + 1;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m47850c() {
        int i = f61601c;
        f61601c = i - 1;
        return i;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Intent launchIntentForPackage = getContext().getPackageManager().getLaunchIntentForPackage(getContext().getPackageName());
        if (launchIntentForPackage == null) {
            return false;
        }
        this.f61602b = launchIntentForPackage.getComponent().getClassName();
        try {
            DataManager.m12928g().m12922m(getContext());
            ((Application) getContext().getApplicationContext()).registerActivityLifecycleCallbacks(new C23334a());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    /* renamed from: com.meevii.push.provider.HmsContentProvider$a */
    /* loaded from: classes5.dex */
    class C23334a implements Application.ActivityLifecycleCallbacks {
        C23334a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            if (C45035a.m1048b().m1047c(activity.getClass())) {
                return;
            }
            boolean z = true;
            if (!HmsContentProvider.isAppEnterFront) {
                DataManager.m12928g().m12910y();
                RelyTaskManager.m103596b().m103595c("task_name_token_register");
                RelyTaskManager.m103596b().m103595c("task_name_user_behavior");
                HmsContentProvider.isAppEnterFront = true;
            }
            if (activity.getClass().getName().equals(HmsContentProvider.this.f61602b)) {
                Intent intent = activity.getIntent();
                if (intent == null || !intent.getBooleanExtra("hms_push_click_disposable_key", false)) {
                    z = false;
                }
                if (z) {
                    PushEvent.m15666h(intent, activity);
                    intent.removeExtra("hms_push_click_disposable_key");
                }
                PushEvent.m15667g(HmsContentProvider.this.getContext(), intent);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            if (C45035a.m1048b().m1047c(activity.getClass())) {
                return;
            }
            HmsContentProvider.m47851b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            if (C45035a.m1048b().m1047c(activity.getClass())) {
                return;
            }
            HmsContentProvider.m47850c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
