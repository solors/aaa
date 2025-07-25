package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.rendering.utils.KeyHolder;
import io.bidmachine.rendering.utils.Utils;

/* loaded from: classes9.dex */
public enum SideType implements KeyHolder {
    Left("left"),
    Top(ViewHierarchyConstants.DIMENSION_TOP_KEY),
    Right("right"),
    Bottom("bottom");
    

    /* renamed from: a */
    private final String f97928a;

    SideType(String str) {
        this.f97928a = str;
    }

    @Nullable
    public static SideType fromKey(@Nullable String str) {
        return (SideType) Utils.fromKey(str, values());
    }

    @Override // io.bidmachine.rendering.utils.KeyHolder
    @NonNull
    public String getKey() {
        return this.f97928a;
    }
}
