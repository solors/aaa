package com.smaato.sdk.richmedia.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class OrientationBroadcastReceiver extends BroadcastReceiver {
    @NonNull
    private final Context context;
    @NonNull
    private final AtomicBoolean isRegistered = new AtomicBoolean();
    @NonNull
    private final ChangeSender<Whatever> orientationChangeSender;

    public OrientationBroadcastReceiver(@NonNull Context context, @NonNull ChangeSender<Whatever> changeSender) {
        this.context = (Context) Objects.requireNonNull(context);
        this.orientationChangeSender = (ChangeSender) Objects.requireNonNull(changeSender);
    }

    @NonNull
    public ChangeSender<Whatever> getOrientationChangeSender() {
        return this.orientationChangeSender;
    }

    public boolean isRegistered() {
        return this.isRegistered.get();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent != null && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction())) {
            this.orientationChangeSender.newValue(Whatever.INSTANCE);
        }
    }

    public void register() {
        if (this.isRegistered.compareAndSet(false, true)) {
            if (Build.VERSION.SDK_INT >= 33) {
                this.context.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"), 4);
            } else {
                this.context.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            }
        }
    }

    public void unregister() {
        if (this.isRegistered.compareAndSet(true, false)) {
            this.context.unregisterReceiver(this);
        }
    }
}
