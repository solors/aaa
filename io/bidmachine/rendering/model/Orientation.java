package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.utils.KeyHolder;
import io.bidmachine.rendering.utils.Utils;

/* loaded from: classes9.dex */
public enum Orientation implements KeyHolder {
    Portrait("portrait", 7),
    Landscape("landscape", 6);
    

    /* renamed from: a */
    private final String f97923a;

    /* renamed from: b */
    private final int f97924b;

    Orientation(String str, int i) {
        this.f97923a = str;
        this.f97924b = i;
    }

    @Nullable
    public static Orientation fromKey(@Nullable String str) {
        return (Orientation) Utils.fromKey(str, values());
    }

    public int getActivityOrientation() {
        return this.f97924b;
    }

    @Override // io.bidmachine.rendering.utils.KeyHolder
    @NonNull
    public String getKey() {
        return this.f97923a;
    }
}
