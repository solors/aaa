package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.C8936ldr;

/* renamed from: com.bytedance.sdk.openadsdk.core.zx */
/* loaded from: classes3.dex */
public class C9099zx extends C8936ldr {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: bg */
    private static volatile C9099zx f20325bg;

    private C9099zx(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.C8936ldr
    /* renamed from: bg */
    public /* bridge */ /* synthetic */ C8936ldr.C8939bX mo83544bg() {
        return super.mo83544bg();
    }

    /* renamed from: bg */
    public static C9099zx m83543bg(Context context) {
        if (f20325bg == null) {
            synchronized (C9099zx.class) {
                if (f20325bg == null) {
                    f20325bg = new C9099zx(context);
                }
            }
        }
        return f20325bg;
    }
}
