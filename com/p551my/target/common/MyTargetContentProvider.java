package com.p551my.target.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25671c0;
import com.p551my.target.AbstractC25846ja;

/* renamed from: com.my.target.common.MyTargetContentProvider */
/* loaded from: classes7.dex */
public final class MyTargetContentProvider extends ContentProvider {
    private static final String INFO_INCORRECT = "com.my.target.mytargetcontentprovider";
    private static final String META_DATA_INIT_MODE = "com.my.target.autoInitMode";
    private boolean enabled = true;

    /* renamed from: a */
    public static /* synthetic */ void m44056a(MyTargetContentProvider myTargetContentProvider) {
        myTargetContentProvider.lambda$onCreate$0();
    }

    public /* synthetic */ void lambda$onCreate$0() {
        try {
            Context context = getContext();
            Integer num = (Integer) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(META_DATA_INIT_MODE);
            if (num != null && num.intValue() == 0) {
                return;
            }
            AbstractC25846ja.m43676c("Start autoinitialization");
            MyTargetManager.initSdk(context);
        } catch (Throwable th) {
            AbstractC25846ja.m43676c("Autoinitialization failed - " + th.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo == null) {
            return;
        }
        if (INFO_INCORRECT.equals(providerInfo.authority)) {
            AbstractC25846ja.m43676c("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
            this.enabled = false;
        }
        super.attachInfo(context, providerInfo);
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
        if (!this.enabled) {
            return false;
        }
        AbstractC25671c0.m44124b(new Runnable() { // from class: com.my.target.common.a
            @Override // java.lang.Runnable
            public final void run() {
                MyTargetContentProvider.m44056a(MyTargetContentProvider.this);
            }
        });
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
}
