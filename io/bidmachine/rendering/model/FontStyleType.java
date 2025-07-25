package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.utils.KeyHolder;
import io.bidmachine.rendering.utils.Utils;

/* loaded from: classes9.dex */
public enum FontStyleType implements KeyHolder {
    Normal("normal", 0),
    Bold("bold", 1),
    Italic("italic", 2),
    BoldItalic("bold_italic", 3);
    

    /* renamed from: a */
    private final String f97917a;

    /* renamed from: b */
    private final int f97918b;

    FontStyleType(String str, int i) {
        this.f97917a = str;
        this.f97918b = i;
    }

    @Nullable
    public static FontStyleType fromKey(@Nullable String str) {
        return (FontStyleType) Utils.fromKey(str, values());
    }

    @Override // io.bidmachine.rendering.utils.KeyHolder
    @NonNull
    public String getKey() {
        return this.f97917a;
    }

    public int getTypeface() {
        return this.f97918b;
    }
}
