package com.p551my.target.common.models;

import androidx.annotation.NonNull;

/* renamed from: com.my.target.common.models.Disclaimer */
/* loaded from: classes7.dex */
public class Disclaimer {
    public final int disclaimerType;
    @NonNull
    public final String text;

    public Disclaimer(int i, @NonNull String str) {
        this.disclaimerType = i;
        this.text = str;
    }

    public String toString() {
        return "Disclaimer{disclaimerType=" + this.disclaimerType + ", text='" + this.text + "'}";
    }
}
