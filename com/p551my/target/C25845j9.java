package com.p551my.target;

import androidx.annotation.NonNull;

/* renamed from: com.my.target.j9 */
/* loaded from: classes7.dex */
public class C25845j9 extends AbstractC25650b {
    private final long interactionTimeoutMillis;
    @NonNull
    private final String source;

    private C25845j9(@NonNull String str, long j) {
        this.interactionTimeoutMillis = j;
        this.type = "shoppable";
        this.source = str;
    }

    @NonNull
    public static C25845j9 newBanner(@NonNull String str, long j) {
        return new C25845j9(str, j);
    }

    public long getInteractionTimeoutMillis() {
        return this.interactionTimeoutMillis;
    }

    @NonNull
    public String getSource() {
        return this.source;
    }
}
