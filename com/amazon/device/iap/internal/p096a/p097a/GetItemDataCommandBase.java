package com.amazon.device.iap.internal.p096a.p097a;

import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.util.Set;

/* renamed from: com.amazon.device.iap.internal.a.a.a */
/* loaded from: classes2.dex */
abstract class GetItemDataCommandBase extends KiwiCommand {

    /* renamed from: b */
    protected static final String f3160b = "getItem_data";

    /* renamed from: c */
    protected final Set<String> f3161c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetItemDataCommandBase(C3712c c3712c, String str, Set<String> set) {
        super(c3712c, f3160b, str, c3712c.m102458d().toString(), PurchasingService.SDK_VERSION);
        this.f3161c = set;
        m102923a(KiwiConstants.f2683O, set);
    }
}
