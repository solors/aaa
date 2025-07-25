package com.inmobi.media;

import com.inmobi.media.C19210b1;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces;
import kotlin.reflect.KProperty;

/* renamed from: com.inmobi.media.b1 */
/* loaded from: classes6.dex */
public final class C19210b1 implements Interfaces {

    /* renamed from: a */
    public final Functions f48079a;

    /* renamed from: b */
    public final boolean f48080b;

    /* renamed from: c */
    public volatile Object f48081c;

    /* renamed from: d */
    public final AtomicBoolean f48082d;

    /* renamed from: e */
    public boolean f48083e;

    public /* synthetic */ C19210b1(Integer num, Functions functions, boolean z, int i) {
        this((Object) num, functions, (i & 4) != 0 ? false : z, false);
    }

    /* renamed from: a */
    public final void m60488a() {
        if (this.f48082d.compareAndSet(false, true)) {
            this.f48083e = true;
            ((ScheduledThreadPoolExecutor) AbstractC18933G3.f47259b.getValue()).submit(new Runnable() { // from class: o3.b3
                @Override // java.lang.Runnable
                public final void run() {
                    C19210b1.m60487a(C19210b1.this);
                }
            });
        }
    }

    @Override // kotlin.properties.Interfaces
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.f48080b || !this.f48083e) {
            m60488a();
        }
        return this.f48081c;
    }

    public C19210b1(Object obj, Functions refreshLogic, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(refreshLogic, "refreshLogic");
        this.f48079a = refreshLogic;
        this.f48080b = z;
        this.f48081c = obj;
        this.f48082d = new AtomicBoolean(false);
        if (z2) {
            m60488a();
        }
    }

    /* renamed from: a */
    public static final void m60487a(C19210b1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f48081c = this$0.f48079a.invoke();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this$0.f48082d.set(false);
            throw th;
        }
        this$0.f48082d.set(false);
    }
}
