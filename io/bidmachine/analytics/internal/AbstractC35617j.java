package io.bidmachine.analytics.internal;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p804nd.Result;

/* renamed from: io.bidmachine.analytics.internal.j */
/* loaded from: classes9.dex */
public abstract class AbstractC35617j {

    /* renamed from: c */
    public static final C35618a f96485c = new C35618a(null);

    /* renamed from: a */
    private final Object f96486a = new Object();

    /* renamed from: b */
    private EnumC35619b f96487b = EnumC35619b.EMPTY;

    /* renamed from: io.bidmachine.analytics.internal.j$a */
    /* loaded from: classes9.dex */
    public static final class C35618a {
        private C35618a() {
        }

        public /* synthetic */ C35618a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.j$b */
    /* loaded from: classes9.dex */
    public enum EnumC35619b {
        EMPTY,
        CREATED,
        ENABLED,
        DISABLED,
        DESTROYED
    }

    /* renamed from: a */
    public abstract String mo20114a();

    /* renamed from: a */
    public final void m20191a(Object obj) {
        synchronized (this.f96486a) {
            EnumC35619b enumC35619b = this.f96487b;
            if (enumC35619b == EnumC35619b.CREATED || enumC35619b == EnumC35619b.DISABLED) {
                mo20112b(obj);
                this.f96487b = EnumC35619b.DISABLED;
                Unit unit = Unit.f99208a;
            }
        }
    }

    /* renamed from: b */
    public final void m20190b(Context context) {
        synchronized (this.f96486a) {
            if (this.f96487b != EnumC35619b.ENABLED) {
                return;
            }
            Result.C38506a c38506a = Result.f101870c;
            mo20108e(context);
            Result.m14549b(Unit.f99208a);
            this.f96487b = EnumC35619b.DISABLED;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: b */
    public abstract void mo20112b(Object obj);

    /* renamed from: c */
    public final void m20189c(Context context) {
        synchronized (this.f96486a) {
            if (this.f96487b != EnumC35619b.DISABLED) {
                return;
            }
            Result.C38506a c38506a = Result.f101870c;
            mo20107f(context);
            Result.m14549b(Unit.f99208a);
            this.f96487b = EnumC35619b.ENABLED;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: d */
    public abstract void mo20109d(Context context);

    /* renamed from: e */
    public abstract void mo20108e(Context context);

    /* renamed from: f */
    public abstract void mo20107f(Context context);

    /* renamed from: a */
    public final void m20192a(Context context) {
        synchronized (this.f96486a) {
            if (this.f96487b != EnumC35619b.EMPTY) {
                return;
            }
            mo20109d(context);
            this.f96487b = EnumC35619b.CREATED;
            Unit unit = Unit.f99208a;
        }
    }
}
