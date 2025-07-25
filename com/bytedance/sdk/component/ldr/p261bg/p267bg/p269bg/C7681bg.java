package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7676IL;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.bg */
/* loaded from: classes3.dex */
public class C7681bg extends C7676IL {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: bg */
    private static volatile C7681bg f16815bg;

    private C7681bg(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7676IL
    /* renamed from: bg */
    public /* bridge */ /* synthetic */ C7676IL.C7678IL mo88070bg() {
        return super.mo88070bg();
    }

    /* renamed from: bg */
    public static C7681bg m88069bg(Context context) {
        if (f16815bg == null) {
            synchronized (C7681bg.class) {
                if (f16815bg == null) {
                    f16815bg = new C7681bg(context);
                }
            }
        }
        return f16815bg;
    }
}
