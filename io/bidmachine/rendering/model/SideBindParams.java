package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class SideBindParams {

    /* renamed from: a */
    private final SideType f97925a;

    /* renamed from: b */
    private final String f97926b;

    public SideBindParams(@NonNull SideType sideType, @NonNull String str) {
        this.f97925a = sideType;
        this.f97926b = str.toLowerCase();
    }

    @NonNull
    public String getTargetName() {
        return this.f97926b;
    }

    @NonNull
    public SideType getTargetSideType() {
        return this.f97925a;
    }
}
