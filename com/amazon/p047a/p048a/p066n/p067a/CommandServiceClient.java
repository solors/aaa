package com.amazon.p047a.p048a.p066n.p067a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p065m.KiwiDataStore;
import com.amazon.p047a.p048a.p066n.p067a.p068a.CommandServiceBindException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.CommandServiceNotInstalledException;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p084d.p085a.Choice;
import com.amazon.p084d.p085a.Command;
import com.amazon.p084d.p085a.CommandService;
import com.amazon.p084d.p085a.DecisionExpirationContext;
import com.amazon.p084d.p085a.DecisionResult;
import com.amazon.p084d.p085a.ExceptionResult;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.ResultCallback;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.amazon.a.a.n.a.d */
/* loaded from: classes2.dex */
public class CommandServiceClient {

    /* renamed from: a */
    private static final KiwiLogger f2563a = new KiwiLogger("CommandServiceClient");

    /* renamed from: b */
    private static final String f2564b = "com.amazon.venezia.service.command.CommandServiceImpl";

    /* renamed from: c */
    private static final String f2565c = "com.amazon.venezia.CommandService";

    /* renamed from: d */
    private CommandService f2566d;

    /* renamed from: e */
    private String f2567e;
    @Resource

    /* renamed from: h */
    private Application f2570h;
    @Resource

    /* renamed from: i */
    private AuthenticationTokenVerifier f2571i;
    @Resource

    /* renamed from: j */
    private KiwiDataStore f2572j;

    /* renamed from: f */
    private final BlockingQueue<CommandResult> f2568f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final BlockingQueue<CommandService> f2569g = new LinkedBlockingQueue();

    /* renamed from: k */
    private final ServiceConnection f2573k = new ServiceConnection() { // from class: com.amazon.a.a.n.a.d.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CommandServiceClient.f2563a.m102829a("onServiceConnected");
            CommandServiceClient.this.f2569g.add(CommandService.AbstractBinderC3623a.m102609a(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            CommandServiceClient.f2563a.m102829a("onServiceDisconnected!!!");
        }
    };

    /* renamed from: l */
    private final ResultCallback f2574l = new ResultCallback.AbstractBinderC3633a() { // from class: com.amazon.a.a.n.a.d.2
        @Override // com.amazon.p084d.p085a.ResultCallback
        /* renamed from: a */
        public void mo102573a(SuccessResult successResult) throws RemoteException {
            CommandServiceClient.this.f2568f.add(new CommandResult(successResult));
        }

        @Override // com.amazon.p084d.p085a.ResultCallback
        /* renamed from: a */
        public void mo102574a(FailureResult failureResult) throws RemoteException {
            CommandServiceClient.this.f2568f.add(new CommandResult(failureResult));
        }

        @Override // com.amazon.p084d.p085a.ResultCallback
        /* renamed from: a */
        public void mo102576a(DecisionResult decisionResult) throws RemoteException {
            CommandServiceClient.this.f2568f.add(new CommandResult(decisionResult));
        }

        @Override // com.amazon.p084d.p085a.ResultCallback
        /* renamed from: a */
        public void mo102575a(ExceptionResult exceptionResult) throws RemoteException {
            CommandServiceClient.this.f2568f.add(new CommandResult(exceptionResult));
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommandServiceClient.java */
    /* renamed from: com.amazon.a.a.n.a.d$a */
    /* loaded from: classes2.dex */
    public static class C3551a {

        /* renamed from: a */
        int f2579a;

        /* renamed from: b */
        boolean f2580b;

        /* renamed from: c */
        long f2581c;

        C3551a() {
        }
    }

    /* renamed from: d */
    private boolean m102953d() {
        if (this.f2566d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m102952e() throws CommandServiceBindException, CommandServiceNotInstalledException {
        long currentTimeMillis = System.currentTimeMillis();
        KiwiLogger kiwiLogger = f2563a;
        kiwiLogger.m102829a("Binding Service!!!");
        Intent m102951f = m102951f();
        if (m102967a(this.f2570h, m102951f)) {
            kiwiLogger.m102829a("Found service on one or more packages");
            Intent m102966a = m102966a(m102951f);
            String packageName = m102966a.getComponent().getPackageName();
            kiwiLogger.m102829a("Attempting to bind to service on " + packageName);
            if (this.f2570h.bindService(m102966a, this.f2573k, 1)) {
                try {
                    kiwiLogger.m102829a("Blocking while service is being bound!!");
                    this.f2566d = this.f2569g.take();
                    kiwiLogger.m102829a("service bound, returning!!");
                    if (KiwiLogger.f2770a) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        kiwiLogger.m102829a("Kiwi.BindService Time: " + (currentTimeMillis2 - currentTimeMillis));
                    }
                    this.f2572j.m103003a(KiwiDataStore.f2527f, packageName);
                    this.f2567e = packageName;
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new CommandServiceBindException();
                }
            }
            throw new CommandServiceBindException();
        }
        throw new CommandServiceNotInstalledException();
    }

    /* renamed from: f */
    private Intent m102951f() {
        Intent intent = new Intent();
        intent.setAction(f2565c);
        f2563a.m102829a("Created intent with  action  com.amazon.venezia.CommandService");
        return intent;
    }

    /* renamed from: g */
    private CommandResult m102950g() throws RemoteException {
        try {
            KiwiLogger kiwiLogger = f2563a;
            kiwiLogger.m102829a("Blocking for result from service");
            CommandResult take = this.f2568f.take();
            kiwiLogger.m102829a("Received result from service");
            return take;
        } catch (InterruptedException unused) {
            f2563a.m102829a("TaskThread interrupted, returning null result");
            return null;
        }
    }

    /* renamed from: b */
    private CommandResult m102956b(Command command) throws RemoteException {
        this.f2572j.m103003a(KiwiDataStore.f2528g, command.mo102613b());
        this.f2566d.mo102607a(command, this.f2574l);
        return m102950g();
    }

    /* renamed from: a */
    public CommandResult m102962a(Command command) throws CommandServiceNotInstalledException, CommandServiceBindException, RemoteException {
        C3551a c3551a = new C3551a();
        c3551a.f2579a = 6;
        c3551a.f2581c = 100L;
        while (true) {
            try {
                if (!m102953d()) {
                    m102952e();
                }
                return m102956b(command);
            } catch (CommandServiceBindException e) {
                m102965a(e, c3551a);
                if (!c3551a.f2580b) {
                    throw e;
                }
            } catch (CommandServiceNotInstalledException e2) {
                m102965a(e2, c3551a);
                if (!c3551a.f2580b) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: b */
    public void m102958b() {
        KiwiLogger kiwiLogger = f2563a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Finishing CommandServiceClient, unbinding service: ");
        sb2.append(this.f2566d != null);
        kiwiLogger.m102829a(sb2.toString());
        if (this.f2566d != null) {
            this.f2570h.unbindService(this.f2573k);
            this.f2566d = null;
        }
    }

    /* renamed from: b */
    private boolean m102955b(String str) {
        KiwiLogger kiwiLogger = f2563a;
        kiwiLogger.m102829a("isPackageSignatureTrusted " + str);
        return this.f2571i.m102977a(str, TrustedSignatures.f2630a);
    }

    /* renamed from: a */
    static void m102965a(KiwiException kiwiException, C3551a c3551a) {
        KiwiLogger kiwiLogger = f2563a;
        kiwiLogger.m102825b("CommandServiceException happened, retriesLeft=" + c3551a.f2579a, kiwiException);
        int i = c3551a.f2579a;
        if (i == 0) {
            c3551a.f2580b = false;
            return;
        }
        c3551a.f2579a = i - 1;
        c3551a.f2580b = true;
        try {
            kiwiLogger.m102829a("Sleeping for " + c3551a.f2581c + " ms");
            Thread.sleep(c3551a.f2581c);
        } catch (InterruptedException unused) {
            c3551a.f2580b = false;
        }
        c3551a.f2581c *= 2;
    }

    /* renamed from: a */
    public String m102968a() {
        return this.f2567e;
    }

    /* renamed from: a */
    private boolean m102967a(Context context, Intent intent) {
        return context.getPackageManager().resolveService(intent, 64) != null;
    }

    /* renamed from: a */
    private Intent m102960a(String str) {
        Intent intent = new Intent();
        intent.setAction(f2565c);
        intent.setClassName(str, f2564b);
        return intent;
    }

    /* renamed from: a */
    private Intent m102966a(Intent intent) throws CommandServiceNotInstalledException {
        if (this.f2567e != null) {
            KiwiLogger kiwiLogger = f2563a;
            kiwiLogger.m102829a("Using previously determined package " + this.f2567e);
            return m102960a(this.f2567e);
        }
        KiwiLogger kiwiLogger2 = f2563a;
        kiwiLogger2.m102829a("No previously determined package found, checking for suitable package.");
        Intent m102959a = m102959a(this.f2570h.getPackageManager().queryIntentServices(intent, 64));
        if (m102959a != null) {
            return m102959a;
        }
        kiwiLogger2.m102829a("No app with valid signature was providing our service.");
        throw new CommandServiceNotInstalledException();
    }

    /* renamed from: a */
    private Intent m102959a(List<ResolveInfo> list) {
        ResolveInfo resolveInfo;
        int i = 0;
        String str = null;
        while (true) {
            try {
                if (i >= list.size()) {
                    i = -1;
                    break;
                }
                String str2 = list.get(i).serviceInfo.applicationInfo.packageName;
                KiwiLogger kiwiLogger = f2563a;
                kiwiLogger.m102829a("Examining package " + str2);
                kiwiLogger.m102829a("Priority is " + resolveInfo.filter.getPriority());
                kiwiLogger.m102829a("Checking signature of package " + str2);
                if (m102955b(str2)) {
                    kiwiLogger.m102829a("Signature of package " + str2 + " is okay");
                    str = str2;
                    break;
                }
                kiwiLogger.m102829a("Signature of package " + str2 + " is bad");
                i++;
                str = str2;
            } catch (Exception e) {
                f2563a.m102829a("Caught exception " + e);
            }
        }
        if (i > -1) {
            return m102960a(str);
        }
        return null;
    }

    /* renamed from: a */
    public CommandResult m102963a(Choice choice) throws RemoteException {
        choice.mo102622a(null);
        return m102950g();
    }

    /* renamed from: a */
    public CommandResult m102961a(DecisionResult decisionResult, final DecisionExpirationReason decisionExpirationReason) throws RemoteException {
        decisionResult.mo102600a(new DecisionExpirationContext.AbstractBinderC3625a() { // from class: com.amazon.a.a.n.a.d.3
            @Override // com.amazon.p084d.p085a.DecisionExpirationContext
            /* renamed from: a */
            public String mo102605a() throws RemoteException {
                return decisionExpirationReason.name();
            }

            @Override // com.amazon.p084d.p085a.DecisionExpirationContext
            /* renamed from: b */
            public Map mo102604b() throws RemoteException {
                return null;
            }
        });
        return m102950g();
    }
}
