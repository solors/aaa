package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.utils.KeyHolder;
import io.bidmachine.rendering.utils.Utils;

/* loaded from: classes9.dex */
public enum AdElementType implements KeyHolder {
    Mraid("mraid"),
    Video("video"),
    Image("image"),
    Countdown("countdown"),
    Progress("progress");
    

    /* renamed from: a */
    private final String f97836a;

    AdElementType(String str) {
        this.f97836a = str;
    }

    @Nullable
    public static AdElementType fromKey(@Nullable String str) {
        return (AdElementType) Utils.fromKey(str, values());
    }

    @Override // io.bidmachine.rendering.utils.KeyHolder
    @NonNull
    public String getKey() {
        return this.f97836a;
    }
}
