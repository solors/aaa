package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.toolbox.C22921f;
import java.nio.charset.StandardCharsets;

/* renamed from: com.mbridge.msdk.tracker.network.l */
/* loaded from: classes6.dex */
public final class MBridgeStringRequest extends MBridgeBaseRequest<String> implements C22937w.InterfaceC22938a {

    /* renamed from: b */
    private final MBridgeRequestListener<String> f59761b;

    public MBridgeStringRequest(int i, String str, String str2, long j, MBridgeRequestListener<String> mBridgeRequestListener) {
        super(i, str, 0, str2, j);
        this.f59761b = mBridgeRequestListener;
        m49420a((C22937w.InterfaceC22938a) this);
    }

    /* renamed from: b */
    private void m49503b(C22937w<String> c22937w) {
        MBridgeRequestListener<String> mBridgeRequestListener = this.f59761b;
        if (mBridgeRequestListener != null) {
            try {
                mBridgeRequestListener.mo49504b(this, c22937w, c22937w.f59883c.f59723a);
            } catch (Exception e) {
                SameLogTool.m51823b(MBridgeBaseRequest.f59754a, "parseNetworkResponse error: ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49320a(Object obj) {
        String str = (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final C22937w<String> mo49324a(C22913r c22913r) {
        try {
            C22937w<String> m49373a = C22937w.m49373a(new String(c22913r.f59817b, StandardCharsets.UTF_8), C22921f.m49444a(c22913r));
            MBridgeRequestListener<String> mBridgeRequestListener = this.f59761b;
            if (mBridgeRequestListener != null) {
                try {
                    mBridgeRequestListener.mo49505a(this, m49373a, c22913r);
                } catch (Exception e) {
                    SameLogTool.m51823b(MBridgeBaseRequest.f59754a, "parseNetworkResponse error: ", e);
                }
            }
            return m49373a;
        } catch (Throwable th) {
            SameLogTool.m51823b(MBridgeBaseRequest.f59754a, "parseNetworkResponse error: ", th);
            C22937w<String> m49374a = C22937w.m49374a(new UnKnownError(th));
            m49503b(m49374a);
            return m49374a;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.C22937w.InterfaceC22938a
    /* renamed from: a */
    public final void mo49372a(AbstractC22898ad abstractC22898ad) {
        m49503b(C22937w.m49374a(abstractC22898ad));
    }
}
