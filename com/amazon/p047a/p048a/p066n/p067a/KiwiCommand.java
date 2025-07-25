package com.amazon.p047a.p048a.p066n.p067a;

import android.os.RemoteException;
import com.amazon.p047a.AppstoreSDK;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p061i.FailurePrompt;
import com.amazon.p047a.p048a.p061i.Prompt;
import com.amazon.p047a.p048a.p061i.PromptContent;
import com.amazon.p047a.p048a.p061i.PromptManager;
import com.amazon.p047a.p048a.p062j.AbstractKiwiRequest;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.Validator;
import com.amazon.p047a.p077b.LicenseFailurePromptContentMapper;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.a.a.n.a.h */
/* loaded from: classes2.dex */
public abstract class KiwiCommand extends AbstractCommandTask {

    /* renamed from: b */
    private static final KiwiLogger f2619b = new KiwiLogger("KiwiCommand");

    /* renamed from: c */
    private final AbstractKiwiRequest f2620c;

    /* renamed from: d */
    private final String f2621d;

    /* renamed from: e */
    private final String f2622e;

    /* renamed from: f */
    private final String f2623f;

    /* renamed from: g */
    private final Map<String, Object> f2624g;

    /* renamed from: i */
    private boolean f2626i;

    /* renamed from: j */
    private KiwiCommand f2627j;

    /* renamed from: k */
    private KiwiCommand f2628k;

    /* renamed from: h */
    private final LicenseFailurePromptContentMapper f2625h = new LicenseFailurePromptContentMapper();

    /* renamed from: l */
    private boolean f2629l = false;

    public KiwiCommand(AbstractKiwiRequest abstractKiwiRequest, String str, String str2, String str3, String str4) {
        this.f2620c = abstractKiwiRequest;
        this.f2621d = str3;
        this.f2622e = str;
        this.f2623f = str2;
        HashMap hashMap = new HashMap();
        this.f2624g = hashMap;
        hashMap.put("requestId", str3);
        hashMap.put("sdkVersion", str4);
        this.f2626i = true;
        this.f2627j = null;
        this.f2628k = null;
    }

    /* renamed from: a */
    public KiwiCommand m102922a(boolean z) {
        this.f2629l = z;
        return this;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a_ */
    protected String mo102768a_() {
        return this.f2622e;
    }

    /* renamed from: b */
    protected void mo102348b(FailureResult failureResult) {
    }

    /* renamed from: b */
    protected abstract boolean mo102338b(SuccessResult successResult) throws Exception;

    /* renamed from: c */
    protected void mo102506c(KiwiException kiwiException) {
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: d */
    protected boolean mo102765d() {
        return true;
    }

    /* renamed from: i */
    public boolean m102919i() {
        return this.f2629l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public AbstractKiwiRequest m102918j() {
        return this.f2620c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public String m102917k() {
        return this.f2621d;
    }

    /* renamed from: l */
    public void mo102445l() {
        AppstoreSDK.m103236a(this);
    }

    /* renamed from: a */
    public void m102924a(KiwiCommand kiwiCommand) {
        this.f2627j = kiwiCommand;
    }

    /* renamed from: b */
    public void m102921b(KiwiCommand kiwiCommand) {
        this.f2628k = kiwiCommand;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: c */
    protected String mo102766c() {
        return this.f2623f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m102923a(String str, Object obj) {
        this.f2624g.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: b */
    public Map<String, Object> mo102767b() {
        return this.f2624g;
    }

    /* renamed from: a */
    private void m102925a(PromptContent promptContent) {
        if (promptContent == null) {
            return;
        }
        FailurePrompt failurePrompt = new FailurePrompt(promptContent);
        PromptManager m103239a = AppstoreSDK.m103239a();
        if (m103239a == null) {
            f2619b.m102826b("Prompt manager is null. Cannot show prompt dropping request");
        } else {
            m103239a.mo103085a((Prompt) failurePrompt);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m102920b(boolean z) {
        this.f2626i = z;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: b */
    protected void mo102796b(KiwiException kiwiException) {
        KiwiCommand kiwiCommand;
        if ("UNHANDLED_EXCEPTION".equals(kiwiException.m103141a()) && "2.0".equals(this.f2623f) && (kiwiCommand = this.f2628k) != null) {
            kiwiCommand.m102922a(this.f2629l);
            this.f2628k.mo102445l();
            return;
        }
        try {
            mo102506c(kiwiException);
        } catch (Exception e) {
            KiwiLogger kiwiLogger = f2619b;
            kiwiLogger.m102829a("Error calling onResult: " + e);
        }
        if (this.f2626i) {
            m102925a(this.f2625h.m102783a(kiwiException));
        }
        if (this.f2629l) {
            return;
        }
        this.f2620c.mo102344c();
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102769a(SuccessResult successResult) throws RemoteException, KiwiException {
        boolean z;
        KiwiCommand kiwiCommand;
        String str = (String) successResult.mo102570b().get("errorMessage");
        KiwiLogger kiwiLogger = f2619b;
        kiwiLogger.m102829a("onSuccess: result = " + successResult + ", errorMessage: " + str);
        if (Validator.m102806a(str)) {
            try {
                z = mo102338b(successResult);
            } catch (Exception e) {
                KiwiLogger kiwiLogger2 = f2619b;
                kiwiLogger2.m102829a("Error calling onResult: " + e);
                z = false;
            }
            if (z && (kiwiCommand = this.f2627j) != null) {
                kiwiCommand.mo102445l();
            } else if (this.f2629l) {
            } else {
                if (z) {
                    this.f2620c.mo102345b();
                } else {
                    this.f2620c.mo102344c();
                }
            }
        } else if (this.f2629l) {
        } else {
            this.f2620c.mo102344c();
        }
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102770a(FailureResult failureResult) throws RemoteException, KiwiException {
        KiwiCommand kiwiCommand;
        String str;
        KiwiLogger kiwiLogger = f2619b;
        kiwiLogger.m102829a("onFailure: result = " + failureResult);
        if (((failureResult == null || (str = (String) failureResult.mo102581f().get(KiwiConstants.f2707al)) == null || !str.equalsIgnoreCase("1.0")) ? false : true) && (kiwiCommand = this.f2628k) != null) {
            kiwiCommand.m102922a(this.f2629l);
            this.f2628k.mo102445l();
            return;
        }
        try {
            mo102348b(failureResult);
        } catch (Exception e) {
            KiwiLogger kiwiLogger2 = f2619b;
            kiwiLogger2.m102829a("Error calling onResult: " + e);
        }
        if (this.f2626i) {
            m102925a(new PromptContent(failureResult.mo102585b(), failureResult.mo102584c(), failureResult.mo102583d(), failureResult.mo102582e()));
        }
        if (this.f2629l) {
            return;
        }
        this.f2620c.mo102344c();
    }
}
