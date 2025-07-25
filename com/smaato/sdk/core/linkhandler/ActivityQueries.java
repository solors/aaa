package com.smaato.sdk.core.linkhandler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class ActivityQueries {
    private final Context context;

    public ActivityQueries(Context context) {
        this.context = context;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public boolean canBeLaunched(Intent intent) {
        List<ResolveInfo> queryIntentActivities = this.context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    @NonNull
    @SuppressLint({"QueryPermissionsNeeded"})
    public Set<String> queryTargetActivityNames(String str) {
        PackageManager packageManager = this.context.getPackageManager();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT"), 0)) {
            hashSet.add(resolveInfo.activityInfo.targetActivity);
        }
        return hashSet;
    }
}
