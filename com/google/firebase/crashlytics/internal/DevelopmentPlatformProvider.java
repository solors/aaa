package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.mobilefuse.sdk.config.ExternalUsageHelpers;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class DevelopmentPlatformProvider {

    /* renamed from: a */
    private final Context f42263a;
    @Nullable

    /* renamed from: b */
    private DevelopmentPlatform f42264b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class DevelopmentPlatform {
        @Nullable

        /* renamed from: a */
        private final String f42265a;
        @Nullable

        /* renamed from: b */
        private final String f42266b;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.f42263a, "com.google.firebase.crashlytics.unity_version", "string");
            if (resourcesIdentifier == 0) {
                if (DevelopmentPlatformProvider.this.m67221c("flutter_assets/NOTICES.Z")) {
                    this.f42265a = "Flutter";
                    this.f42266b = null;
                    Logger.getLogger().m67210v("Development platform is: Flutter");
                    return;
                }
                this.f42265a = null;
                this.f42266b = null;
                return;
            }
            this.f42265a = ExternalUsageHelpers.SDK_MODULE_UNITY;
            String string = DevelopmentPlatformProvider.this.f42263a.getResources().getString(resourcesIdentifier);
            this.f42266b = string;
            Logger logger = Logger.getLogger();
            logger.m67210v("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f42263a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m67221c(String str) {
        if (this.f42263a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f42263a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    private DevelopmentPlatform m67220d() {
        if (this.f42264b == null) {
            this.f42264b = new DevelopmentPlatform();
        }
        return this.f42264b;
    }

    public static boolean isUnity(Context context) {
        if (CommonUtils.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", "string") != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return m67220d().f42265a;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return m67220d().f42266b;
    }
}
