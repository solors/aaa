package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.utils.KeyHolder;
import io.bidmachine.rendering.utils.Utils;

/* loaded from: classes9.dex */
public enum CacheType implements KeyHolder {
    FullLoad("full_load"),
    PartialLoad("partial_load"),
    StreamLoad("stream_load");
    

    /* renamed from: a */
    private final String f97876a;

    CacheType(String str) {
        this.f97876a = str;
    }

    @Nullable
    public static CacheType fromKey(@Nullable String str) {
        return (CacheType) Utils.fromKey(str, values());
    }

    @Override // io.bidmachine.rendering.utils.KeyHolder
    @NonNull
    public String getKey() {
        return this.f97876a;
    }
}
