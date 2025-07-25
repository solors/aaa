package com.amazon.p047a.p048a.p066n.p067a.p068a;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.amazon.p047a.p048a.p055d.KiwiException;

/* renamed from: com.amazon.a.a.n.a.a.d */
/* loaded from: classes2.dex */
public class CommandServiceRemoteException extends KiwiException {

    /* renamed from: a */
    private static final long f2543a = 1;

    public CommandServiceRemoteException(RemoteException remoteException) {
        super(m102985a(remoteException));
    }

    /* renamed from: a */
    private static String m102985a(RemoteException remoteException) {
        if (remoteException instanceof DeadObjectException) {
            return "COMMAND_SERVICE_DEAD_OBJECT_EXCEPTION";
        }
        return "COMMAND_SERVICE_REMOTE_EXCEPTION";
    }
}
