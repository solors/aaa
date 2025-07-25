package com.mbridge.msdk.dycreator.p418b;

/* renamed from: com.mbridge.msdk.dycreator.b.a */
/* loaded from: classes6.dex */
public final class DyError {

    /* renamed from: a */
    private int f55568a;

    /* renamed from: b */
    private String f55569b;

    public DyError(FixedError fixedError) {
        if (fixedError != null) {
            this.f55568a = fixedError.m53040a();
            this.f55569b = fixedError.m53039b();
        }
    }

    public final String toString() {
        return "DyError{errorCode=" + this.f55568a + '}';
    }

    public DyError(int i, String str) {
        this.f55568a = i;
        this.f55569b = str;
    }
}
