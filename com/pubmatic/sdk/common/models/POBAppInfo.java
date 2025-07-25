package com.pubmatic.sdk.common.models;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;

/* loaded from: classes7.dex */
public class POBAppInfo {
    @Nullable

    /* renamed from: a */
    private String f70120a;
    @Nullable

    /* renamed from: b */
    private String f70121b;
    @Nullable

    /* renamed from: c */
    private String f70122c;

    public POBAppInfo(@NonNull Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            this.f70120a = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            this.f70121b = context.getPackageName();
            this.f70122c = packageInfo.versionName;
        } catch (Exception e) {
            POBLog.error("POBAppInfo", "Failed to retrieve app info: %s", e.getLocalizedMessage());
        }
    }

    @Nullable
    public String getAppName() {
        return this.f70120a;
    }

    @Nullable
    public String getAppVersion() {
        return this.f70122c;
    }

    @Nullable
    public String getPackageName() {
        return this.f70121b;
    }
}
