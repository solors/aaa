package com.amazon.p047a.p048a.p061i;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p063k.Resource;

/* renamed from: com.amazon.a.a.i.a */
/* loaded from: classes2.dex */
public class FailurePrompt extends SimplePrompt {

    /* renamed from: b */
    private static final String f2415b = "a";

    /* renamed from: e */
    private static final String f2416e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* renamed from: f */
    private static final String f2417f = "Amazon Appstore required";

    /* renamed from: g */
    private static final String f2418g = "Amazon Appstore Update Required";

    /* renamed from: j */
    private static final long f2419j = 31536000;
    @Resource

    /* renamed from: h */
    private ContextManager f2420h;

    /* renamed from: i */
    private final PromptContent f2421i;

    public FailurePrompt(PromptContent promptContent) {
        super(promptContent);
        this.f2421i = promptContent;
    }

    @Override // com.amazon.p047a.p048a.p056e.RelativeExpirable
    /* renamed from: h */
    protected long mo102471h() {
        return 31536000L;
    }

    @Override // com.amazon.p047a.p048a.p061i.SimplePrompt
    /* renamed from: i */
    protected void mo102470i() {
        if (f2417f.equalsIgnoreCase(this.f2421i.m103094e()) || f2418g.equalsIgnoreCase(this.f2421i.m103094e())) {
            try {
                Activity mo103187b = this.f2420h.mo103187b();
                if (mo103187b == null) {
                    mo103187b = this.f2420h.mo103192a();
                }
                mo103187b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f2416e)));
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        return f2415b;
    }
}
