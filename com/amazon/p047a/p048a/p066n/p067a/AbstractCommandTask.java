package com.amazon.p047a.p048a.p066n.p067a;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p059h.Metric;
import com.amazon.p047a.p048a.p059h.MetricsManager;
import com.amazon.p047a.p048a.p061i.Prompt;
import com.amazon.p047a.p048a.p061i.PromptManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p064l.ActivityResult;
import com.amazon.p047a.p048a.p064l.ActivityResultManager;
import com.amazon.p047a.p048a.p066n.p067a.p068a.CommandServiceRemoteException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.DecisionExpiredException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.ExceptionResultException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.UnhandledCommandExecutionException;
import com.amazon.p047a.p048a.p066n.p070c.AbstractTaskWorkflowAwareTask;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p084d.p085a.Choice;
import com.amazon.p084d.p085a.Command;
import com.amazon.p084d.p085a.DecisionResult;
import com.amazon.p084d.p085a.ExceptionResult;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.Map;

/* renamed from: com.amazon.a.a.n.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractCommandTask extends AbstractTaskWorkflowAwareTask {

    /* renamed from: b */
    private static final KiwiLogger f2531b = new KiwiLogger("AbstractCommandTask");
    @Resource

    /* renamed from: a */
    protected ActivityResultManager f2532a;
    @Resource

    /* renamed from: c */
    private Application f2533c;
    @Resource

    /* renamed from: d */
    private CommandServiceClient f2534d;
    @Resource

    /* renamed from: e */
    private PromptManager f2535e;
    @Resource

    /* renamed from: f */
    private MetricsManager f2536f;
    @Resource

    /* renamed from: g */
    private AuthenticationTokenVerifier f2537g;

    /* renamed from: b */
    private void m102991b(SuccessResult successResult) throws RemoteException, KiwiException {
        if (KiwiLogger.f2770a) {
            f2531b.m102829a("Command executed successfully");
        }
        mo102769a(successResult);
    }

    /* renamed from: i */
    private Command m102987i() {
        return new Command.AbstractBinderC3621a() { // from class: com.amazon.a.a.n.a.a.1
            {
                AbstractCommandTask.this = this;
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: a */
            public String mo102614a() throws RemoteException {
                return AbstractCommandTask.this.mo102766c();
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: b */
            public String mo102613b() throws RemoteException {
                return AbstractCommandTask.this.mo102768a_();
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: c */
            public Map mo102612c() throws RemoteException {
                return AbstractCommandTask.this.mo102767b();
            }

            @Override // com.amazon.p084d.p085a.Command
            /* renamed from: d */
            public String mo102611d() throws RemoteException {
                return AbstractCommandTask.this.f2533c.getPackageName();
            }
        };
    }

    /* renamed from: j */
    private void m102986j() {
        if (!m102897m()) {
            this.f2534d.m102958b();
        }
    }

    /* renamed from: a */
    protected abstract void mo102770a(FailureResult failureResult) throws RemoteException, KiwiException;

    /* renamed from: a */
    protected abstract void mo102769a(SuccessResult successResult) throws RemoteException, KiwiException;

    /* renamed from: a_ */
    protected abstract String mo102768a_();

    /* renamed from: b */
    protected abstract Map<String, Object> mo102767b();

    /* renamed from: c */
    protected abstract String mo102766c();

    /* renamed from: d */
    protected abstract boolean mo102765d();

    /* renamed from: f */
    protected boolean mo102505f() {
        return true;
    }

    /* renamed from: g */
    protected String m102989g() {
        return mo102768a_() + "_failure";
    }

    /* renamed from: h */
    protected String m102988h() {
        return mo102768a_() + "_success";
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0076, code lost:
        if (com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x007f, code lost:
        if (com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0081, code lost:
        com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.f2531b.m102829a("Task finished");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0086, code lost:
        m102986j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0089, code lost:
        return;
     */
    @Override // com.amazon.p047a.p048a.p066n.Task
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo102336a() {
        /*
            r5 = this;
            java.lang.String r0 = "----------------------------------------------"
            java.lang.String r1 = "Task finished"
            boolean r2 = com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L28
            com.amazon.a.a.o.c r2 = com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.f2531b     // Catch: java.lang.Throwable -> L79
            r2.m102829a(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "Executing: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r5.mo102768a_()     // Catch: java.lang.Throwable -> L79
            r3.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L79
            r2.m102829a(r3)     // Catch: java.lang.Throwable -> L79
            r2.m102829a(r0)     // Catch: java.lang.Throwable -> L79
        L28:
            r5.mo102451e()     // Catch: java.lang.Throwable -> L79
            boolean r0 = r5.mo102765d()     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L49
            boolean r0 = com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3c
            com.amazon.a.a.o.c r0 = com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.f2531b     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "Execution not needed, quitting"
            r0.m102829a(r2)     // Catch: java.lang.Throwable -> L79
        L3c:
            boolean r0 = com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a
            if (r0 == 0) goto L45
            com.amazon.a.a.o.c r0 = com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.f2531b
            r0.m102829a(r1)
        L45:
            r5.m102986j()
            return
        L49:
            boolean r0 = com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L67
            com.amazon.a.a.o.c r0 = com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.f2531b     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "Executing Command: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r5.mo102768a_()     // Catch: java.lang.Throwable -> L79
            r2.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L79
            r0.m102829a(r2)     // Catch: java.lang.Throwable -> L79
        L67:
            com.amazon.a.a.n.a.d r0 = r5.f2534d     // Catch: java.lang.Throwable -> L79
            com.amazon.d.a.c r2 = r5.m102987i()     // Catch: java.lang.Throwable -> L79
            com.amazon.a.a.n.a.c r0 = r0.m102962a(r2)     // Catch: java.lang.Throwable -> L79
            r5.m102998a(r0)     // Catch: java.lang.Throwable -> L79
            boolean r0 = com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a
            if (r0 == 0) goto L86
            goto L81
        L79:
            r0 = move-exception
            r5.m102993a(r0)     // Catch: java.lang.Throwable -> L8a
            boolean r0 = com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a
            if (r0 == 0) goto L86
        L81:
            com.amazon.a.a.o.c r0 = com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.f2531b
            r0.m102829a(r1)
        L86:
            r5.m102986j()
            return
        L8a:
            r0 = move-exception
            boolean r2 = com.amazon.p047a.p048a.p071o.KiwiLogger.f2770a
            if (r2 == 0) goto L94
            com.amazon.a.a.o.c r2 = com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.f2531b
            r2.m102829a(r1)
        L94:
            r5.m102986j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask.mo102336a():void");
    }

    /* renamed from: b */
    private void m102992b(FailureResult failureResult) throws RemoteException, KiwiException {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2531b;
            kiwiLogger.m102829a("Command failed execution: " + failureResult.mo102585b());
        }
        mo102770a(failureResult);
    }

    /* renamed from: b */
    private KiwiException m102990b(Throwable th) {
        if (th instanceof KiwiException) {
            return (KiwiException) th;
        }
        if (th instanceof RemoteException) {
            return new CommandServiceRemoteException((RemoteException) th);
        }
        return new UnhandledCommandExecutionException(th);
    }

    /* renamed from: b */
    protected void mo102796b(KiwiException kiwiException) {
        KiwiLogger kiwiLogger = f2531b;
        kiwiLogger.m102826b("On Exception!!!!: " + kiwiException);
    }

    /* renamed from: e */
    public void mo102451e() throws KiwiException {
    }

    /* renamed from: a */
    private void m102998a(CommandResult commandResult) throws KiwiException, RemoteException {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2531b;
            kiwiLogger.m102829a("Received result from CommandService: " + commandResult);
        }
        if (commandResult == null) {
            if (KiwiLogger.f2770a) {
                f2531b.m102829a("Received null result from command service, exiting task");
            }
        } else if (commandResult.m102970e() != null) {
            m102994a(commandResult.m102970e());
        } else {
            this.f2537g.m102978a(commandResult.m102974a(), this.f2534d.m102968a());
            if (commandResult.m102973b() != null) {
                m102991b(commandResult.m102973b());
            } else if (commandResult.m102972c() != null) {
                m102992b(commandResult.m102972c());
            } else if (mo102505f()) {
                m102997a(commandResult.m102971d());
            }
        }
    }

    /* renamed from: a */
    private void m102994a(ExceptionResult exceptionResult) throws RemoteException, KiwiException {
        throw new ExceptionResultException(exceptionResult);
    }

    /* renamed from: a */
    private void m102997a(DecisionResult decisionResult) throws RemoteException, KiwiException {
        if (KiwiLogger.f2770a) {
            f2531b.m102829a("Handling Decision");
        }
        try {
            DecisionPrompt decisionPrompt = new DecisionPrompt(decisionResult);
            this.f2535e.mo103085a((Prompt) decisionPrompt);
            Choice m102940i = decisionPrompt.m102940i();
            if (m102940i == null) {
                if (KiwiLogger.f2770a) {
                    f2531b.m102829a("DecisionChooser returned null!!, expiring");
                }
                m102996a(decisionResult, DecisionExpirationReason.EXPIRATION_DURATION_ELAPSED);
                return;
            }
            m102995a(decisionResult, m102940i);
        } catch (DecisionExpiredException e) {
            m102996a(decisionResult, e.m102984a());
        }
    }

    /* renamed from: a */
    private void m102995a(DecisionResult decisionResult, Choice choice) throws RemoteException, KiwiException {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2531b;
            kiwiLogger.m102829a("Handling customer choice: " + choice);
        }
        Intent mo102621b = choice.mo102621b();
        if (mo102621b != null) {
            if (KiwiLogger.f2770a) {
                f2531b.m102829a("Choice has intent, scheduling it to be fired!!");
            }
            ActivityResult mo103024a = this.f2532a.mo103024a(mo102621b);
            if (mo103024a == null) {
                if (KiwiLogger.f2770a) {
                    f2531b.m102829a("No result recived, expiring decision");
                }
                m102996a(decisionResult, DecisionExpirationReason.EXPIRATION_DURATION_ELAPSED);
                return;
            } else if (mo103024a.m103026d() == 0) {
                if (KiwiLogger.f2770a) {
                    f2531b.m102829a("Result canceled, expiring decision");
                }
                m102996a(decisionResult, DecisionExpirationReason.ACTION_CANCELED);
                return;
            } else {
                if (KiwiLogger.f2770a) {
                    f2531b.m102829a("Result received!!!, notifying service");
                }
                m102998a(this.f2534d.m102963a(choice));
                return;
            }
        }
        if (KiwiLogger.f2770a) {
            f2531b.m102829a("No intent given, choosing now");
        }
        m102998a(this.f2534d.m102963a(choice));
    }

    /* renamed from: a */
    private void m102996a(DecisionResult decisionResult, DecisionExpirationReason decisionExpirationReason) throws RemoteException, KiwiException {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2531b;
            kiwiLogger.m102829a("Expiring Decision: " + decisionResult + ", reason: " + decisionExpirationReason);
        }
        m102998a(this.f2534d.m102961a(decisionResult, decisionExpirationReason));
    }

    /* renamed from: a */
    private void m102993a(Throwable th) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2531b;
            kiwiLogger.m102828a("Exception occurred while processing task: " + th, th);
        }
        KiwiException m102990b = m102990b(th);
        mo102796b(m102990b);
        this.f2536f.mo103110a(m103000a(m102990b));
    }

    /* renamed from: a */
    public Metric m103000a(KiwiException kiwiException) {
        Metric metric = new Metric(m102989g());
        metric.m103116a("subType", kiwiException.m103141a()).m103116a("reason", kiwiException.m103139b()).m103116a(POBNativeConstants.NATIVE_CONTEXT, kiwiException.m103137c());
        return metric;
    }
}
