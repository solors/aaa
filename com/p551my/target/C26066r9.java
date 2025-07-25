package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.r9 */
/* loaded from: classes7.dex */
public class C26066r9 extends AbstractC25650b {
    @Nullable
    private String mraidJs;
    @Nullable
    private String source;
    private int timeout = 60;

    private C26066r9() {
    }

    @NonNull
    public static C26066r9 newBanner() {
        return new C26066r9();
    }

    @Nullable
    public String getMraidJs() {
        return this.mraidJs;
    }

    @Nullable
    public String getSource() {
        return this.source;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setMraidJs(@Nullable String str) {
        this.mraidJs = str;
    }

    public void setSource(@Nullable String str) {
        this.source = str;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }
}
