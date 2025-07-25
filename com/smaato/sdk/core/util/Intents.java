package com.smaato.sdk.core.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes7.dex */
public final class Intents {
    private Intents() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m39357a(Context context, Intent intent) {
        lambda$startIntent$0(context, intent);
    }

    public static boolean canHandleIntent(@NonNull Context context, @NonNull Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @NonNull
    public static Intent createViewIntent(@NonNull String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static /* synthetic */ void lambda$startIntent$0(Context context, Intent intent) {
        if (canHandleIntent(context, intent)) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    public static void startIntent(@NonNull final Context context, @NonNull final Intent intent) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.core.util.d
            @Override // java.lang.Runnable
            public final void run() {
                Intents.m39357a(context, intent);
            }
        });
    }

    @RequiresApi(api = 30)
    @SuppressLint({"WrongConstant"})
    public static boolean tryToStartAsAppLink(Context context, String str) {
        return tryToStartIntent(context, createViewIntent(str).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT").addFlags(268436480));
    }

    public static boolean tryToStartIntent(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e(Intents.class.getSimpleName(), "Activity not found exception", e);
            return false;
        }
    }
}
