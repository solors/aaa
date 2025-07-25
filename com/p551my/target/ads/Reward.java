package com.p551my.target.ads;

import androidx.annotation.NonNull;

/* renamed from: com.my.target.ads.Reward */
/* loaded from: classes7.dex */
public class Reward {
    public static final String DEFAULT = "default";
    @NonNull
    public final String type;

    private Reward(@NonNull String str) {
        this.type = str;
    }

    @NonNull
    public static Reward getDefault() {
        return new Reward("default");
    }
}
