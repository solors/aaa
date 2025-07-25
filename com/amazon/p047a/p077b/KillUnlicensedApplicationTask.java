package com.amazon.p047a.p077b;

import com.amazon.p047a.p048a.p061i.Prompt;
import com.amazon.p047a.p048a.p061i.PromptContent;
import com.amazon.p047a.p048a.p061i.PromptManager;
import com.amazon.p047a.p048a.p061i.ShutdownPrompt;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p065m.KiwiDataStore;
import com.amazon.p047a.p048a.p066n.p070c.AbstractTaskWorkflowAwareTask;
import com.amazon.p047a.p048a.p071o.KiwiLogger;

/* renamed from: com.amazon.a.b.c */
/* loaded from: classes2.dex */
public class KillUnlicensedApplicationTask extends AbstractTaskWorkflowAwareTask {

    /* renamed from: a */
    private static final KiwiLogger f2805a = new KiwiLogger("LicenseKillTask");
    @Resource

    /* renamed from: b */
    private KiwiDataStore f2806b;
    @Resource

    /* renamed from: c */
    private PromptManager f2807c;

    /* renamed from: b */
    private boolean m102785b() {
        return this.f2806b.m103002b(KiwiDataStore.f2523b);
    }

    /* renamed from: c */
    private PromptContent m102784c() {
        PromptContent promptContent = (PromptContent) this.f2806b.m103005a(KiwiDataStore.f2524c);
        if (promptContent != null) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2805a;
                kiwiLogger.m102829a("Fetched failure content from store: " + promptContent);
            }
            this.f2806b.m103001c(KiwiDataStore.f2524c);
            return promptContent;
        }
        return LicenseFailurePromptContent.f2813e;
    }

    @Override // com.amazon.p047a.p048a.p066n.Task
    /* renamed from: a */
    public void mo102336a() {
        if (KiwiLogger.f2770a) {
            f2805a.m102829a("License Kill Task Executing!!!");
        }
        if (m102785b()) {
            f2805a.m102824c("license verification succeeded");
            return;
        }
        if (KiwiLogger.f2770a) {
            f2805a.m102829a("License Kill Task determined app is not licensed, killing app");
        }
        if (m102897m()) {
            m102896n();
        }
        this.f2807c.mo103085a((Prompt) new ShutdownPrompt(m102784c()));
    }
}
