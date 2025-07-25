package com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32584coiic;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.coo2iico */
/* loaded from: classes8.dex */
public abstract class AbstractC32442coo2iico extends BroadcastReceiver {
    private static final String c2oc2i = "BaseBroadcastReceiver";
    @Nullable
    private Context coi222o222;
    private final long coo2iico;

    public AbstractC32442coo2iico(long j) {
        this.coo2iico = j;
    }

    public static void coo2iico(@NonNull Context context, long j, @NonNull String str) {
        coo2iico(context, j, str, null);
    }

    @NonNull
    public abstract IntentFilter coo2iico();

    public static void coo2iico(@NonNull Context context, long j, @NonNull String str, String str2) {
        C32584coiic.coo2iico(context, "context cannot be null");
        C32584coiic.coo2iico(str, "action cannot be null");
        Intent intent = new Intent(str);
        intent.putExtra(C32433cicc2iiccc.c2oc2o, j);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("click_url", str2);
        }
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public void coo2iico(@NonNull BroadcastReceiver broadcastReceiver, Context context) {
        this.coi222o222 = context;
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, coo2iico());
    }

    public void coo2iico(@Nullable BroadcastReceiver broadcastReceiver) {
        Context context = this.coi222o222;
        if (context == null || broadcastReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        this.coi222o222 = null;
    }

    public boolean coo2iico(@NonNull Intent intent) {
        C32584coiic.coo2iico(intent, "intent cannot be null");
        long longExtra = intent.getLongExtra(C32433cicc2iiccc.c2oc2o, -1L);
        MLog.m25892d(c2oc2i, "mBroadcastIdentifier=" + this.coo2iico + ", receiverIdentifier=" + longExtra);
        return this.coo2iico == longExtra;
    }
}
