package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.apm.insight.runtime.c */
/* loaded from: classes2.dex */
public final class CallbackCenter {

    /* renamed from: a */
    private final List<ICrashCallback> f4040a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final List<ICrashCallback> f4041b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final List<ICrashCallback> f4042c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final List<ICrashCallback> f4043d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final List<IOOMCallback> f4044e = new CopyOnWriteArrayList();

    /* compiled from: CallbackCenter.java */
    /* renamed from: com.apm.insight.runtime.c$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C38511 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4045a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f4045a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4045a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4045a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4045a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4045a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m101429a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = C38511.f4045a[crashType.ordinal()];
        if (i == 1) {
            this.f4040a.add(iCrashCallback);
            this.f4041b.add(iCrashCallback);
            this.f4042c.add(iCrashCallback);
            this.f4043d.add(iCrashCallback);
        } else if (i == 2) {
            this.f4043d.add(iCrashCallback);
        } else if (i == 3) {
            this.f4041b.add(iCrashCallback);
        } else if (i == 4) {
            this.f4040a.add(iCrashCallback);
        } else if (i != 5) {
        } else {
            this.f4042c.add(iCrashCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m101426b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = C38511.f4045a[crashType.ordinal()];
        if (i == 1) {
            this.f4040a.remove(iCrashCallback);
            this.f4041b.remove(iCrashCallback);
            this.f4042c.remove(iCrashCallback);
            this.f4043d.remove(iCrashCallback);
        } else if (i == 2) {
            this.f4043d.remove(iCrashCallback);
        } else if (i == 3) {
            this.f4041b.remove(iCrashCallback);
        } else if (i == 4) {
            this.f4040a.remove(iCrashCallback);
        } else if (i != 5) {
        } else {
            this.f4042c.remove(iCrashCallback);
        }
    }

    @NonNull
    /* renamed from: c */
    public final List<ICrashCallback> m101424c() {
        return this.f4041b;
    }

    @NonNull
    /* renamed from: d */
    public final List<ICrashCallback> m101423d() {
        return this.f4042c;
    }

    @NonNull
    /* renamed from: e */
    public final List<ICrashCallback> m101422e() {
        return this.f4043d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m101428a(IOOMCallback iOOMCallback) {
        this.f4044e.add(iOOMCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m101425b(IOOMCallback iOOMCallback) {
        this.f4044e.remove(iOOMCallback);
    }

    @NonNull
    /* renamed from: a */
    public final List<IOOMCallback> m101430a() {
        return this.f4044e;
    }

    @NonNull
    /* renamed from: b */
    public final List<ICrashCallback> m101427b() {
        return this.f4040a;
    }
}
