package com.amazon.p047a.p048a.p066n.p067a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.p084d.p085a.DecisionResult;
import com.amazon.p084d.p085a.ExceptionResult;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;
import com.ironsource.C21114v8;

/* renamed from: com.amazon.a.a.n.a.c */
/* loaded from: classes2.dex */
public final class CommandResult {

    /* renamed from: a */
    private String f2556a;

    /* renamed from: b */
    private RemoteException f2557b;

    /* renamed from: c */
    private SuccessResult f2558c;

    /* renamed from: d */
    private FailureResult f2559d;

    /* renamed from: e */
    private DecisionResult f2560e;

    /* renamed from: f */
    private ExceptionResult f2561f;

    /* renamed from: g */
    private int f2562g = Binder.getCallingUid();

    public CommandResult(SuccessResult successResult) {
        this.f2558c = successResult;
        try {
            this.f2556a = successResult.mo102571a();
        } catch (RemoteException e) {
            this.f2557b = e;
        }
    }

    /* renamed from: a */
    public String m102974a() throws RemoteException {
        RemoteException remoteException = this.f2557b;
        if (remoteException == null) {
            return this.f2556a;
        }
        throw remoteException;
    }

    /* renamed from: b */
    public SuccessResult m102973b() {
        return this.f2558c;
    }

    /* renamed from: c */
    public FailureResult m102972c() {
        return this.f2559d;
    }

    /* renamed from: d */
    public DecisionResult m102971d() {
        return this.f2560e;
    }

    /* renamed from: e */
    public ExceptionResult m102970e() {
        return this.f2561f;
    }

    /* renamed from: f */
    public int m102969f() {
        return this.f2562g;
    }

    public String toString() {
        return "CommandResult: [CallingUid: " + this.f2562g + ", SuccessResult: " + this.f2558c + ", FailureResult: " + this.f2559d + ", DecisionResult: " + this.f2560e + ", ExceptionResult: " + this.f2561f + C21114v8.C21123i.f54139e;
    }

    public CommandResult(FailureResult failureResult) {
        this.f2559d = failureResult;
        try {
            this.f2556a = failureResult.mo102586a();
        } catch (RemoteException e) {
            this.f2557b = e;
        }
    }

    public CommandResult(DecisionResult decisionResult) {
        this.f2560e = decisionResult;
        try {
            this.f2556a = decisionResult.mo102601a();
        } catch (RemoteException e) {
            this.f2557b = e;
        }
    }

    public CommandResult(ExceptionResult exceptionResult) {
        this.f2561f = exceptionResult;
    }
}
