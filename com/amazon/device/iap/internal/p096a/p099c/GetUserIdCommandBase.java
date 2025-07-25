package com.amazon.device.iap.internal.p096a.p099c;

import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;

/* renamed from: com.amazon.device.iap.internal.a.c.b */
/* loaded from: classes2.dex */
abstract class GetUserIdCommandBase extends KiwiCommand {

    /* renamed from: b */
    protected static final String f3176b = "get_userId";

    /* renamed from: c */
    protected static final String f3177c = null;

    public GetUserIdCommandBase(C3712c c3712c, String str) {
        super(c3712c, f3176b, str, c3712c.m102458d().toString(), PurchasingService.SDK_VERSION);
    }
}
