package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.toolbox.C22921f;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.tracker.network.j */
/* loaded from: classes6.dex */
public final class MBridgeJsonRequest extends MBridgeBaseRequest<JSONObject> implements C22937w.InterfaceC22938a {

    /* renamed from: b */
    private final MBridgeRequestListener<JSONObject> f59760b;

    public MBridgeJsonRequest(int i, String str, String str2, long j, MBridgeRequestListener<JSONObject> mBridgeRequestListener) {
        super(i, str, 0, str2, j);
        this.f59760b = mBridgeRequestListener;
        m49420a((C22937w.InterfaceC22938a) this);
    }

    /* renamed from: b */
    private void m49506b(C22937w<JSONObject> c22937w) {
        MBridgeRequestListener<JSONObject> mBridgeRequestListener = this.f59760b;
        if (mBridgeRequestListener != null) {
            try {
                mBridgeRequestListener.mo49504b(this, c22937w, c22937w.f59883c.f59723a);
            } catch (Exception e) {
                SameLogTool.m51824b(MBridgeBaseRequest.f59754a, e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49320a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final C22937w<JSONObject> mo49324a(C22913r c22913r) {
        try {
            String str = new String(c22913r.f59817b, StandardCharsets.UTF_8);
            if (c22913r.f59816a == 204) {
                C22937w<JSONObject> m49373a = C22937w.m49373a(new JSONObject(), C22921f.m49444a(c22913r));
                m49507a(m49373a, c22913r);
                return m49373a;
            }
            C22937w<JSONObject> m49373a2 = C22937w.m49373a(new JSONObject(str), C22921f.m49444a(c22913r));
            m49507a(m49373a2, c22913r);
            return m49373a2;
        } catch (JSONException e) {
            SameLogTool.m51824b(MBridgeBaseRequest.f59754a, e.getMessage());
            C22937w<JSONObject> m49374a = C22937w.m49374a(new C22915t(e));
            m49506b(m49374a);
            return m49374a;
        } catch (Throwable th) {
            C22937w<JSONObject> m49374a2 = C22937w.m49374a(new UnKnownError(th));
            m49506b(m49374a2);
            return m49374a2;
        }
    }

    /* renamed from: a */
    private void m49507a(C22937w<JSONObject> c22937w, C22913r c22913r) {
        MBridgeRequestListener<JSONObject> mBridgeRequestListener = this.f59760b;
        if (mBridgeRequestListener != null) {
            try {
                mBridgeRequestListener.mo49505a(this, c22937w, c22913r);
            } catch (Exception e) {
                SameLogTool.m51824b(MBridgeBaseRequest.f59754a, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.C22937w.InterfaceC22938a
    /* renamed from: a */
    public final void mo49372a(AbstractC22898ad abstractC22898ad) {
        m49506b(C22937w.m49374a(abstractC22898ad));
    }
}
