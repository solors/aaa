package com.amazon.device.iap.internal.p096a;

import android.content.Context;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.PurchasingManager;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.device.iap.internal.util.CursorUtil;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.amazon.p047a.p048a.p062j.AbstractKiwiRequest;
import com.amazon.p047a.p048a.p062j.KiwiRequestContext;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;

/* compiled from: KiwiRequest.java */
/* renamed from: com.amazon.device.iap.internal.a.c */
/* loaded from: classes2.dex */
public class C3712c extends AbstractKiwiRequest {

    /* renamed from: c */
    private static final String f3170c = "c";

    /* renamed from: d */
    private RequestId f3171d;

    public C3712c(RequestId requestId) {
        this.f3171d = requestId;
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: a */
    public void mo102461a(KiwiCommand kiwiCommand) {
        this.f2485b = kiwiCommand;
    }

    /* renamed from: d */
    public RequestId m102458d() {
        return this.f3171d;
    }

    /* renamed from: e */
    public void m102457e() {
        KiwiCommand kiwiCommand = this.f2485b;
        if (kiwiCommand != null) {
            kiwiCommand.mo102445l();
        } else {
            mo102345b();
        }
    }

    /* renamed from: a */
    public void m102460a(Object obj) {
        m102459a(obj, null);
    }

    /* renamed from: a */
    public void m102459a(final Object obj, final KiwiCommand kiwiCommand) {
        Validator.m102807a(obj, "response");
        Context m102392b = PurchasingManager.m102387g().m102392b();
        final PurchasingListener m102399a = PurchasingManager.m102387g().m102399a();
        if (m102392b != null && m102399a != null) {
            new Handler(m102392b.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.a.c.1
                {
                    C3712c.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C3712c.this.mo102462a().m103042a(KiwiConstants.f2708am, Boolean.FALSE);
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof ProductDataResponse) {
                            m102399a.onProductDataResponse((ProductDataResponse) obj2);
                        } else if (obj2 instanceof UserDataResponse) {
                            m102399a.onUserDataResponse((UserDataResponse) obj2);
                        } else if (obj2 instanceof PurchaseUpdatesResponse) {
                            PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj2;
                            m102399a.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                            Object m103043a = C3712c.this.mo102462a().m103043a(KiwiConstants.f2709an);
                            if (m103043a != null && (m103043a instanceof String)) {
                                CursorUtil.m102378a(purchaseUpdatesResponse.getUserData().getUserId(), m103043a.toString());
                            }
                        } else if (!(obj2 instanceof PurchaseResponse)) {
                            String str = C3712c.f3170c;
                            C3722b.m102374b(str, "Unknown response type:" + obj.getClass().getName());
                        } else {
                            m102399a.onPurchaseResponse((PurchaseResponse) obj2);
                        }
                        C3712c.this.mo102462a().m103042a(KiwiConstants.f2708am, Boolean.TRUE);
                    } catch (Throwable th) {
                        String str2 = C3712c.f3170c;
                        C3722b.m102374b(str2, "Error in sendResponse: " + th);
                    }
                    KiwiCommand kiwiCommand2 = kiwiCommand;
                    if (kiwiCommand2 != null) {
                        kiwiCommand2.m102922a(true);
                        kiwiCommand.mo102445l();
                    }
                }
            });
            return;
        }
        String str = f3170c;
        C3722b.m102376a(str, "PurchasingListener is not set. Dropping response: " + obj);
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: a */
    public KiwiRequestContext mo102462a() {
        return this.f2484a;
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: b */
    public void mo102345b() {
    }

    @Override // com.amazon.p047a.p048a.p062j.AbstractKiwiRequest
    /* renamed from: c */
    public void mo102344c() {
    }
}
