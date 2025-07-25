package com.applovin.impl;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.applovin.impl.C5820x5;

/* renamed from: com.applovin.impl.c7 */
/* loaded from: classes2.dex */
public abstract class AbstractC4168c7 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.c7$a */
    /* loaded from: classes2.dex */
    public static final class C4169a {
        /* renamed from: a */
        public static boolean m100240a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        /* renamed from: b */
        public static boolean m100239b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.c7$b */
    /* loaded from: classes2.dex */
    public static final class C4170b {
        /* renamed from: a */
        public static boolean m100238a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m100237b(Throwable th) {
            return AbstractC5538t2.m94556a(AbstractC5863xp.m93015a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.c7$c */
    /* loaded from: classes2.dex */
    public static final class C4171c {
        /* renamed from: a */
        public static boolean m100236a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m100241a(Exception exc, int i) {
        int i2 = AbstractC5863xp.f12151a;
        if (i2 >= 21 && C4170b.m100238a(exc)) {
            return C4170b.m100237b(exc);
        }
        if (i2 >= 23 && C4171c.m100236a(exc)) {
            return 6006;
        }
        if (i2 >= 18 && C4169a.m100239b(exc)) {
            return 6002;
        }
        if (i2 >= 18 && C4169a.m100240a(exc)) {
            return 6007;
        }
        if (exc instanceof C5523sp) {
            return 6001;
        }
        if (exc instanceof C5820x5.C5825e) {
            return 6003;
        }
        if (exc instanceof C5907yb) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
