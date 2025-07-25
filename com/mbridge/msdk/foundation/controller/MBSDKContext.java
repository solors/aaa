package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;
import com.mbridge.msdk.foundation.controller.BaseMBSDKContext;

/* renamed from: com.mbridge.msdk.foundation.controller.c */
/* loaded from: classes6.dex */
public class MBSDKContext extends BaseMBSDKContext {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    private static volatile MBSDKContext f56125f;

    private MBSDKContext() {
    }

    /* renamed from: m */
    public static MBSDKContext m52746m() {
        if (f56125f == null) {
            synchronized (MBSDKContext.class) {
                if (f56125f == null) {
                    f56125f = new MBSDKContext();
                }
            }
        }
        return f56125f;
    }

    @Override // com.mbridge.msdk.foundation.controller.BaseMBSDKContext
    /* renamed from: a */
    protected final void mo52747a(BaseMBSDKContext.InterfaceC21897a interfaceC21897a) {
    }
}
