package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata
/* loaded from: classes4.dex */
public interface SessionLifecycleServiceBinder {
    void bindToService(@NotNull Messenger messenger, @NotNull ServiceConnection serviceConnection);
}
