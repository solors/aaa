package com.fyber.inneractive.sdk.config.global;

/* renamed from: com.fyber.inneractive.sdk.config.global.f */
/* loaded from: classes4.dex */
public final class C14353f implements InterfaceC14351d {

    /* renamed from: a */
    public final String f27194a;

    /* renamed from: b */
    public final boolean f27195b;

    public C14353f(boolean z, String str) {
        this.f27194a = str;
        this.f27195b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14351d
    /* renamed from: a */
    public final boolean mo77943a(C14352e c14352e) {
        String str = this.f27194a;
        if (str != null) {
            if (str.equalsIgnoreCase("android")) {
                return !this.f27195b;
            }
            return this.f27195b;
        }
        return false;
    }

    public final String toString() {
        String str = this.f27194a;
        boolean z = this.f27195b;
        return "os - " + str + " include: " + z;
    }
}
