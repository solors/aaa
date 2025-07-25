package com.amazon.p047a;

import android.os.RemoteException;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p061i.Prompt;
import com.amazon.p047a.p048a.p061i.PromptContent;
import com.amazon.p047a.p048a.p061i.PromptManager;
import com.amazon.p047a.p048a.p061i.ShutdownPrompt;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.Map;

/* renamed from: com.amazon.a.c */
/* loaded from: classes2.dex */
public class CheckifAppIsBlockedTask extends AbstractCommandTask {

    /* renamed from: b */
    private static final KiwiLogger f2839b = new KiwiLogger("CheckIfAppisBlockedTask");
    @Resource

    /* renamed from: c */
    private PromptManager f2840c;

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102769a(SuccessResult successResult) throws RemoteException, KiwiException {
        if (successResult.mo102570b() == null || !successResult.mo102570b().containsKey("verbose")) {
            return;
        }
        boolean booleanValue = ((Boolean) successResult.mo102570b().get("verbose")).booleanValue();
        KiwiLogger.f2771b = booleanValue;
        KiwiLogger.f2770a = booleanValue;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a_ */
    protected String mo102768a_() {
        return "check_blocked_status";
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: b */
    protected Map<String, Object> mo102767b() {
        return null;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: c */
    protected String mo102766c() {
        return "1.0";
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: d */
    protected boolean mo102765d() {
        return true;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102770a(FailureResult failureResult) throws RemoteException, KiwiException {
        if (m102897m()) {
            m102896n();
        }
        f2839b.m102824c("app is blocked, killing");
        this.f2840c.mo103085a((Prompt) new ShutdownPrompt(new PromptContent(failureResult.mo102585b(), failureResult.mo102584c(), failureResult.mo102583d(), failureResult.mo102582e())));
    }
}
