package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38497f;

/* renamed from: com.inmobi.media.B4 */
/* loaded from: classes6.dex */
public final class C18864B4 implements InterfaceC18850A4 {

    /* renamed from: a */
    public C18883C9 f47110a;

    /* renamed from: b */
    public final C19192Za f47111b;

    public C18864B4(Context context, double d, EnumC19096S5 logLevel, boolean z, boolean z2, int i, long j, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        if (!z2) {
            this.f47111b = new C19192Za();
        }
        if (!z) {
            C18883C9 logger = new C18883C9(context, d, logLevel, j, i, z3);
            this.f47110a = logger;
            CopyOnWriteArrayList copyOnWriteArrayList = AbstractC19215b6.f48101a;
            Intrinsics.m17074g(logger);
            Intrinsics.checkNotNullParameter(logger, "logger");
            Objects.toString(logger);
            AbstractC19215b6.f48101a.add(new WeakReference(logger));
        }
    }

    /* renamed from: a */
    public final void m61259a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            c18883c9.m61230a(EnumC19096S5.f47689b, tag, message);
        }
        if (this.f47111b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* renamed from: b */
    public final void m61255b(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            c18883c9.m61230a(EnumC19096S5.f47690c, tag, message);
        }
        if (this.f47111b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* renamed from: c */
    public final void m61254c(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            c18883c9.m61230a(EnumC19096S5.f47688a, tag, message);
        }
        if (this.f47111b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* renamed from: d */
    public final void m61253d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            c18883c9.m61230a(EnumC19096S5.f47691d, tag, message);
        }
        if (this.f47111b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter("STATE_CHANGE: " + message, "message");
        }
    }

    /* renamed from: e */
    public final void m61252e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Objects.toString(c18883c9.f47143i);
            if (!c18883c9.f47143i.get()) {
                c18883c9.f47142h.put(key, value);
            }
        }
    }

    /* renamed from: a */
    public final void m61258a(String tag, String message, Exception error) {
        String m14565b;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            EnumC19096S5 enumC19096S5 = EnumC19096S5.f47690c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(message);
            sb2.append("\nError: ");
            m14565b = C38497f.m14565b(error);
            sb2.append(m14565b);
            c18883c9.m61230a(enumC19096S5, tag, sb2.toString());
        }
        if (this.f47111b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    /* renamed from: b */
    public final void m61256b() {
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            c18883c9.m61233a();
        }
    }

    /* renamed from: a */
    public final void m61257a(boolean z) {
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            Objects.toString(c18883c9.f47143i);
            if (!c18883c9.f47143i.get()) {
                c18883c9.f47138d = z;
            }
        }
        if (z) {
            return;
        }
        C18883C9 c18883c92 = this.f47110a;
        if (c18883c92 == null || !c18883c92.f47140f.m61225a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = AbstractC19215b6.f48101a;
            AbstractC19201a6.m60494a(this.f47110a);
            this.f47110a = null;
        }
    }

    /* renamed from: a */
    public final void m61260a() {
        C18883C9 c18883c9 = this.f47110a;
        if (c18883c9 != null) {
            c18883c9.m61229b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC19215b6.f48101a;
        AbstractC19201a6.m60494a(this.f47110a);
    }
}
