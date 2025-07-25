package com.amazon.p047a.p048a.p066n.p067a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.amazon.p047a.p048a.p061i.Prompt;
import com.amazon.p047a.p048a.p061i.PromptExpirationReason;
import com.amazon.p047a.p048a.p066n.p067a.p068a.DecisionExpiredException;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p084d.p085a.Choice;
import com.amazon.p084d.p085a.DecisionResult;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.amazon.a.a.n.a.f */
/* loaded from: classes2.dex */
public class DecisionPrompt extends Prompt {

    /* renamed from: b */
    private static final KiwiLogger f2586b = new KiwiLogger("DecisionDialog");

    /* renamed from: d */
    private final C3554b f2588d;

    /* renamed from: e */
    private final BlockingQueue<C3553a> f2589e = new LinkedBlockingQueue();

    /* renamed from: c */
    private final Thread f2587c = Thread.currentThread();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecisionPrompt.java */
    /* renamed from: com.amazon.a.a.n.a.f$a */
    /* loaded from: classes2.dex */
    public static class C3553a {

        /* renamed from: a */
        private final Choice f2592a;

        /* renamed from: b */
        private final String f2593b;

        /* renamed from: c */
        private final Intent f2594c;

        public C3553a(Choice choice) throws RemoteException {
            this.f2592a = choice;
            this.f2593b = choice.mo102623a();
            this.f2594c = choice.mo102621b();
        }

        /* renamed from: a */
        public Choice m102935a() {
            return this.f2592a;
        }

        /* renamed from: b */
        public String m102934b() {
            return this.f2593b;
        }

        /* renamed from: c */
        public Intent m102933c() {
            return this.f2594c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecisionPrompt.java */
    /* renamed from: com.amazon.a.a.n.a.f$b */
    /* loaded from: classes2.dex */
    public static class C3554b {

        /* renamed from: a */
        private final String f2595a;

        /* renamed from: b */
        private final String f2596b;

        /* renamed from: c */
        private final long f2597c;

        /* renamed from: d */
        private final C3553a f2598d;

        /* renamed from: e */
        private final C3553a f2599e;

        /* renamed from: f */
        private final C3553a f2600f;

        public C3554b(DecisionResult decisionResult) throws RemoteException {
            this.f2595a = decisionResult.mo102599b();
            this.f2596b = decisionResult.mo102598c();
            this.f2597c = decisionResult.mo102597d();
            this.f2598d = m102931a(decisionResult.mo102596e());
            this.f2599e = m102931a(decisionResult.mo102595f());
            this.f2600f = m102931a(decisionResult.mo102594g());
        }

        /* renamed from: a */
        private C3553a m102931a(Choice choice) throws RemoteException {
            if (choice == null) {
                return null;
            }
            return new C3553a(choice);
        }

        /* renamed from: b */
        public String m102930b() {
            return this.f2596b;
        }

        /* renamed from: c */
        public long m102929c() {
            return this.f2597c;
        }

        /* renamed from: d */
        public C3553a m102928d() {
            return this.f2600f;
        }

        /* renamed from: e */
        public C3553a m102927e() {
            return this.f2599e;
        }

        /* renamed from: f */
        public C3553a m102926f() {
            return this.f2598d;
        }

        /* renamed from: a */
        public String m102932a() {
            return this.f2595a;
        }
    }

    public DecisionPrompt(DecisionResult decisionResult) throws RemoteException {
        this.f2588d = new C3554b(decisionResult);
    }

    /* renamed from: e */
    private ActivityInfo m102942e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (KiwiLogger.f2771b) {
                KiwiLogger kiwiLogger = f2586b;
                kiwiLogger.m102826b("Unable to get info for activity: " + activity);
                return null;
            }
            return null;
        }
    }

    /* renamed from: f */
    private Dialog m102941f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f2588d.m102932a()).setMessage(this.f2588d.m102930b()).setCancelable(false);
        AlertDialog create = builder.create();
        m102949a(activity, create, this.f2588d.m102926f(), -1);
        m102949a(activity, create, this.f2588d.m102927e(), -3);
        m102949a(activity, create, this.f2588d.m102928d(), -2);
        return create;
    }

    /* renamed from: n */
    private Choice m102938n() throws DecisionExpiredException {
        try {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2586b;
                kiwiLogger.m102829a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f2589e.take().m102935a();
        } catch (InterruptedException unused) {
            if (KiwiLogger.f2770a) {
                f2586b.m102829a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new DecisionExpiredException(m102937o());
        }
    }

    /* renamed from: o */
    private DecisionExpirationReason m102937o() {
        if (m103100l() == PromptExpirationReason.NOT_COMPATIBLE) {
            return DecisionExpirationReason.APP_NOT_COMPATIBLE;
        }
        return DecisionExpirationReason.EXPIRATION_DURATION_ELAPSED;
    }

    /* renamed from: p */
    private boolean m102936p() {
        if (!m102947a(this.f2588d.m102926f()) && !m102947a(this.f2588d.m102927e()) && !m102947a(this.f2588d.m102928d())) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.p047a.p048a.p061i.Prompt
    /* renamed from: d */
    public Dialog mo102943d(Activity activity) {
        return m102941f(activity);
    }

    @Override // com.amazon.p047a.p048a.p056e.RelativeExpirable
    /* renamed from: h */
    protected long mo102471h() {
        return this.f2588d.m102929c();
    }

    /* renamed from: i */
    public Choice m102940i() throws DecisionExpiredException {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2586b;
            kiwiLogger.m102829a("GetCustomerDecision: " + this.f2587c);
        }
        return m102938n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f2588d.m102932a();
    }

    /* renamed from: a */
    private boolean m102947a(C3553a c3553a) {
        return (c3553a == null || c3553a.m102933c() == null) ? false : true;
    }

    @Override // com.amazon.p047a.p048a.p061i.Prompt
    /* renamed from: b */
    public boolean mo102945b(Activity activity) {
        if (m102936p()) {
            ActivityInfo m102942e = m102942e(activity);
            if (m102942e == null) {
                return false;
            }
            boolean z = m102942e.launchMode == 3;
            KiwiLogger kiwiLogger = f2586b;
            kiwiLogger.m102829a("Single instance: " + z);
            boolean z2 = (m102942e.flags & 2) != 0;
            kiwiLogger.m102829a("Finish on task launch:" + z2);
            boolean z3 = (m102942e.flags & 128) != 0;
            kiwiLogger.m102829a("No History: " + z3);
            return (z || z2 || z3) ? false : true;
        }
        return true;
    }

    @Override // com.amazon.p047a.p048a.p061i.Prompt
    /* renamed from: a */
    protected void mo102948a(PromptExpirationReason promptExpirationReason) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2586b;
            kiwiLogger.m102829a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f2587c.interrupt();
    }

    /* renamed from: a */
    private void m102949a(Activity activity, AlertDialog alertDialog, final C3553a c3553a, int i) {
        if (c3553a == null) {
            return;
        }
        alertDialog.setButton(i, c3553a.m102934b(), new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.n.a.f.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                if (KiwiLogger.f2770a) {
                    DecisionPrompt.f2586b.m102829a("Choice selected!");
                }
                if (DecisionPrompt.this.m103101k()) {
                    DecisionPrompt.this.f2589e.add(c3553a);
                }
            }
        });
    }
}
