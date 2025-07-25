package com.amazon.p047a.p048a.p066n.p067a.p068a;

import android.os.RemoteException;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p084d.p085a.ExceptionResult;

/* renamed from: com.amazon.a.a.n.a.a.f */
/* loaded from: classes2.dex */
public class ExceptionResultException extends KiwiException {

    /* renamed from: a */
    public static final String f2546a = "EXCEPTION_RESULT_FAILURE";

    /* renamed from: b */
    private static final long f2547b = 1;

    public ExceptionResultException(ExceptionResult exceptionResult) throws RemoteException {
        super(f2546a, exceptionResult.mo102590a());
    }
}
