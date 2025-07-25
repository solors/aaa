package com.pubmatic.sdk.webrendering.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.pubmatic.sdk.webrendering.mraid.m */
/* loaded from: classes7.dex */
interface InterfaceC26933m {
    void close();

    void createCalendarEvent(@NonNull JSONObject jSONObject, boolean z);

    void expand(@Nullable String str, boolean z, boolean z2);

    boolean isUserInteracted(boolean z);

    void listenerChanged(@Nullable String str, boolean z);

    void open(@Nullable String str, boolean z);

    void playVideo(@NonNull String str, boolean z);

    void resize(int i, int i2, int i3, int i4, boolean z, boolean z2);

    void setOrientation(boolean z, @Nullable String str, boolean z2);

    void storePicture(@Nullable String str, boolean z);

    void unload();

    void useCustomClose(boolean z);
}
