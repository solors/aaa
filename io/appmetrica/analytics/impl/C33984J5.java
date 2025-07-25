package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.IReporter;

/* renamed from: io.appmetrica.analytics.impl.J5 */
/* loaded from: classes9.dex */
public final class C33984J5 {

    /* renamed from: a */
    public final C34790p f93054a;

    /* renamed from: b */
    public final IReporter f93055b;

    /* renamed from: c */
    public Context f93056c;

    /* renamed from: d */
    public final InterfaceC34736n f93057d;

    public C33984J5(C34790p c34790p) {
        this(c34790p, 0);
    }

    /* renamed from: a */
    public static final void m22522a(C33984J5 c33984j5, Activity activity, EnumC34709m enumC34709m) {
        int ordinal = enumC34709m.ordinal();
        if (ordinal == 1) {
            c33984j5.f93055b.resumeSession();
        } else if (ordinal != 2) {
        } else {
            c33984j5.f93055b.pauseSession();
        }
    }

    public C33984J5(C34790p c34790p, IReporter iReporter) {
        this.f93054a = c34790p;
        this.f93055b = iReporter;
        this.f93057d = new InterfaceC34736n() { // from class: io.appmetrica.analytics.impl.ho
            {
                C33984J5.this = this;
            }

            @Override // io.appmetrica.analytics.impl.InterfaceC34736n
            /* renamed from: a */
            public final void mo20849a(Activity activity, EnumC34709m enumC34709m) {
                C33984J5.m22522a(C33984J5.this, activity, enumC34709m);
            }
        };
    }

    /* renamed from: a */
    public final synchronized void m22523a(Context context) {
        if (this.f93056c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f93054a.m21182a(applicationContext);
            this.f93054a.m21181a(this.f93057d, EnumC34709m.RESUMED, EnumC34709m.PAUSED);
            this.f93056c = applicationContext;
        }
    }

    public /* synthetic */ C33984J5(C34790p c34790p, int i) {
        this(c34790p, AbstractC34765o1.m21243a());
    }
}
