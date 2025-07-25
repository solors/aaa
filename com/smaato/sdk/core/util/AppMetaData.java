package com.smaato.sdk.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;

/* loaded from: classes7.dex */
public final class AppMetaData {
    @NonNull
    private final Context context;
    private final Logger logger;

    public AppMetaData(@NonNull Context context, Logger logger) {
        this.context = (Context) Objects.requireNonNull(context, "Parameter context cannot be null for PermissionChecker::new");
        this.logger = logger;
    }

    public boolean isActivityRegistered(@NonNull Class<? extends Activity> cls) {
        return Intents.canHandleIntent(this.context, new Intent(this.context, cls));
    }

    public boolean isPermissionGranted(@NonNull String str) {
        Objects.requireNonNull(str);
        try {
            if (this.context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, "permission not granted", e);
            return false;
        }
    }
}
