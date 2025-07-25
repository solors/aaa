package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.AbstractC22946v;
import com.mbridge.msdk.tracker.network.C22913r;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.toolbox.C22921f;
import java.io.UnsupportedEncodingException;

/* renamed from: com.mbridge.msdk.foundation.same.report.m */
/* loaded from: classes6.dex */
public final class StringReportResponseHandler extends AbstractC22946v {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.AbstractC22946v
    /* renamed from: a */
    public final C22937w<String> mo49314a(C22913r c22913r) {
        String str;
        try {
            str = new String(c22913r.f59817b, C22921f.m49441a(c22913r.f59818c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(c22913r.f59817b);
        }
        return C22937w.m49373a(str, C22921f.m49444a(c22913r));
    }
}
