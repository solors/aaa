package com.fyber.inneractive.sdk.mraid;

/* renamed from: com.fyber.inneractive.sdk.mraid.G */
/* loaded from: classes4.dex */
public final class C14640G extends AbstractC14665y {

    /* renamed from: a */
    public final boolean f27777a;

    public C14640G(boolean z) {
        this.f27777a = z;
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC14665y
    /* renamed from: a */
    public final String mo77735a() {
        String str;
        if (this.f27777a) {
            str = "true";
        } else {
            str = "false";
        }
        return "viewable: ".concat(str);
    }
}
