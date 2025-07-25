package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StartActivityDelegate.kt */
@Metadata
/* loaded from: classes4.dex */
public interface StartActivityDelegate {
    @Nullable
    Activity getActivityContext();

    void startActivityForResult(@NotNull Intent intent, int i);
}
