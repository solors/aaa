package com.amazon.device.iap.internal.p096a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p061i.PromptContent;
import com.amazon.p047a.p048a.p061i.SimplePrompt;
import com.amazon.p047a.p048a.p063k.Resource;

/* compiled from: FailurePrompt.java */
/* renamed from: com.amazon.device.iap.internal.a.a */
/* loaded from: classes2.dex */
public class C3710a extends SimplePrompt {

    /* renamed from: b */
    private static final String f3153b = "a";

    /* renamed from: e */
    private static final String f3154e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* renamed from: f */
    private static final String f3155f = "Amazon Appstore required";

    /* renamed from: g */
    private static final String f3156g = "Amazon Appstore Update Required";

    /* renamed from: j */
    private static final long f3157j = 31536000;
    @Resource

    /* renamed from: h */
    private ContextManager f3158h;

    /* renamed from: i */
    private final PromptContent f3159i;

    public C3710a(PromptContent promptContent) {
        super(promptContent);
        this.f3159i = promptContent;
    }

    @Override // com.amazon.p047a.p048a.p056e.RelativeExpirable
    /* renamed from: h */
    protected long mo102471h() {
        return 31536000L;
    }

    @Override // com.amazon.p047a.p048a.p061i.SimplePrompt
    /* renamed from: i */
    protected void mo102470i() {
        C3722b.m102376a(f3153b, "doAction");
        if (f3155f.equalsIgnoreCase(this.f3159i.m103094e()) || f3156g.equalsIgnoreCase(this.f3159i.m103094e())) {
            try {
                Activity mo103187b = this.f3158h.mo103187b();
                if (mo103187b == null) {
                    mo103187b = this.f3158h.mo103192a();
                }
                mo103187b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f3154e)));
            } catch (Exception e) {
                String str = f3153b;
                C3722b.m102374b(str, "Exception in PurchaseItemCommandTask.OnSuccess: " + e);
            }
        }
    }

    public String toString() {
        return f3153b;
    }
}
