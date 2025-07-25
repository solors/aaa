package com.mobilefuse.sdk.omid;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes7.dex */
public interface VastOmidBridge extends OmidBridge {
    void adUserInteractionClick() throws Throwable;

    void complete() throws Throwable;

    void firstQuartile() throws Throwable;

    Set<String> getRegisteredVerificationVendors() throws Throwable;

    @Nullable
    View getVideoView() throws Throwable;

    void initAdSession(Context context, View view) throws Throwable;

    void midpoint() throws Throwable;

    void mute() throws Throwable;

    void pause() throws Throwable;

    void registerVerificationScript(@Nullable String str, @NonNull String str2, @Nullable String str3) throws Throwable;

    void resume() throws Throwable;

    void setAdSessionInitCompleteListener(@NonNull Runnable runnable) throws Throwable;

    void setCompleteListener(@NonNull Runnable runnable) throws Throwable;

    void signalAdLoadedEvent(boolean z, float f, boolean z2) throws Throwable;

    void skipped() throws Throwable;

    void start(float f, float f2) throws Throwable;

    void thirdQuartile() throws Throwable;

    void unmute() throws Throwable;
}
