package com.mbridge.msdk.foundation.same.net.p448f;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.same.net.C21990d;
import com.mbridge.msdk.foundation.same.net.IListener;
import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.tracker.network.AbstractC22898ad;
import com.mbridge.msdk.tracker.network.C22913r;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.MBridgeBaseRequest;
import com.mbridge.msdk.tracker.network.MBridgeRequestListener;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.i */
/* loaded from: classes6.dex */
public final class MBridgeRequestListenerWrapper<T> implements MBridgeRequestListener<T> {

    /* renamed from: a */
    private final IListener<T> f56688a;

    /* renamed from: b */
    private final Handler f56689b = new Handler(Looper.getMainLooper());

    public MBridgeRequestListenerWrapper(IListener<T> iListener) {
        this.f56688a = iListener;
    }

    @Override // com.mbridge.msdk.tracker.network.MBridgeRequestListener
    /* renamed from: b */
    public final void mo49504b(MBridgeBaseRequest<T> mBridgeBaseRequest, final C22937w<T> c22937w, final C22913r c22913r) {
        SameLogTool.m51827a("MBridgeRequestListenerWrapper", "onResponseError: " + c22937w.f59883c.mo49368a() + " " + c22937w.f59883c.getMessage());
        this.f56689b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.f.i.2
            @Override // java.lang.Runnable
            public final void run() {
                C21991a c21991a;
                CommonError commonError;
                try {
                    if (MBridgeRequestListenerWrapper.this.f56688a != null) {
                        IListener iListener = MBridgeRequestListenerWrapper.this.f56688a;
                        AbstractC22898ad abstractC22898ad = c22937w.f59883c;
                        C22913r c22913r2 = c22913r;
                        CommonError commonError2 = null;
                        if (abstractC22898ad != null) {
                            if (c22913r2 != null) {
                                c21991a = new C21991a(c22913r2.f59816a, c22913r2.f59817b, c22913r2.f59819d);
                            } else {
                                c21991a = new C21991a(0, null, null);
                            }
                            if (abstractC22898ad.mo49368a() == 0) {
                                commonError = new CommonError(2, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 1) {
                                commonError = new CommonError(6, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 2) {
                                commonError = new CommonError(8, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 4) {
                                commonError = new CommonError(880041, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 5) {
                                commonError = new CommonError(8, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 6) {
                                commonError = new CommonError(15, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 7) {
                                commonError = new CommonError(7, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 8) {
                                commonError = new CommonError(10, c21991a, abstractC22898ad.getMessage());
                            } else if (abstractC22898ad.mo49368a() == 9) {
                                commonError = new CommonError(4, c21991a, abstractC22898ad.getMessage());
                            } else {
                                commonError = new CommonError(2, c21991a, abstractC22898ad.getMessage());
                            }
                            commonError2 = commonError;
                        }
                        iListener.onError(commonError2);
                    }
                } catch (Exception e) {
                    SameLogTool.m51823b("MBridgeRequestListenerWrapper", "onResponseError error", e);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.tracker.network.MBridgeRequestListener
    /* renamed from: a */
    public final void mo49505a(MBridgeBaseRequest<T> mBridgeBaseRequest, final C22937w<T> c22937w, final C22913r c22913r) {
        SameLogTool.m51827a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + c22937w.f59881a);
        this.f56689b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.f.i.1
            @Override // java.lang.Runnable
            public final void run() {
                C21990d<T> m52210a;
                try {
                    if (MBridgeRequestListenerWrapper.this.f56688a != null) {
                        IListener iListener = MBridgeRequestListenerWrapper.this.f56688a;
                        C22937w c22937w2 = c22937w;
                        C22913r c22913r2 = c22913r;
                        if (c22937w2 == null) {
                            m52210a = null;
                        } else {
                            m52210a = C21990d.m52210a(c22937w2.f59881a, new C21991a(c22913r2.f59816a, c22913r2.f59817b, c22913r2.f59819d));
                        }
                        iListener.onSuccess(m52210a);
                    }
                } catch (Exception e) {
                    SameLogTool.m51823b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e);
                }
            }
        });
    }
}
