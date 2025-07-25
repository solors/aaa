package com.fyber.inneractive.sdk.mraid;

/* renamed from: com.fyber.inneractive.sdk.mraid.y */
/* loaded from: classes4.dex */
public abstract class AbstractC14665y {
    /* renamed from: a */
    public abstract String mo77735a();

    public final String toString() {
        String mo77735a = mo77735a();
        if (mo77735a == null) {
            return "";
        }
        return mo77735a.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "");
    }
}
