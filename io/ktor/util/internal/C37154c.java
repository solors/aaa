package io.ktor.util.internal;

import androidx.concurrent.futures.C1074a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* compiled from: LockFreeLinkedList.kt */
@Metadata
/* renamed from: io.ktor.util.internal.c */
/* loaded from: classes9.dex */
public class C37154c {

    /* renamed from: b */
    static final /* synthetic */ AtomicReferenceFieldUpdater f98019b = AtomicReferenceFieldUpdater.newUpdater(C37154c.class, Object.class, "_next");

    /* renamed from: c */
    static final /* synthetic */ AtomicReferenceFieldUpdater f98020c = AtomicReferenceFieldUpdater.newUpdater(C37154c.class, Object.class, "_prev");

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f98021d = AtomicReferenceFieldUpdater.newUpdater(C37154c.class, Object.class, "_removedRef");
    @NotNull
    volatile /* synthetic */ Object _next = this;
    @NotNull
    volatile /* synthetic */ Object _prev = this;
    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: a */
    private final C37154c m18967a(C37154c c37154c, AbstractC37155d abstractC37155d) {
        Object obj;
        while (true) {
            C37154c c37154c2 = null;
            while (true) {
                obj = c37154c._next;
                if (obj == abstractC37155d) {
                    return c37154c;
                }
                if (obj instanceof AbstractC37155d) {
                    ((AbstractC37155d) obj).m18958a(c37154c);
                } else if (obj instanceof C37156e) {
                    if (c37154c2 != null) {
                        break;
                    }
                    c37154c = C37153b.m18968a(c37154c._prev);
                } else {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C37156e) {
                        return null;
                    }
                    if (obj != this) {
                        Intrinsics.m17073h(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        c37154c2 = c37154c;
                        c37154c = (C37154c) obj;
                    } else if (obj2 == c37154c) {
                        return null;
                    } else {
                        if (C1074a.m105283a(f98020c, this, obj2, c37154c) && !(c37154c._prev instanceof C37156e)) {
                            return null;
                        }
                    }
                }
            }
            c37154c.m18961h();
            C1074a.m105283a(f98019b, c37154c2, c37154c, ((C37156e) obj).f98022a);
            c37154c = c37154c2;
        }
    }

    /* renamed from: c */
    private final C37154c m18966c() {
        boolean z;
        C37154c c37154c = this;
        while (!(c37154c instanceof C37152a)) {
            c37154c = c37154c.m18963f();
            if (c37154c != this) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                throw new IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return c37154c;
    }

    /* renamed from: d */
    private final void m18965d(C37154c c37154c) {
        m18962g();
        c37154c.m18967a(C37153b.m18968a(this._prev), null);
    }

    /* renamed from: h */
    private final C37154c m18961h() {
        Object obj;
        C37154c c37154c;
        do {
            obj = this._prev;
            if (obj instanceof C37156e) {
                return ((C37156e) obj).f98022a;
            }
            if (obj == this) {
                c37154c = m18966c();
            } else {
                Intrinsics.m17073h(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                c37154c = (C37154c) obj;
            }
        } while (!C1074a.m105283a(f98020c, this, obj, c37154c.m18959j()));
        return (C37154c) obj;
    }

    /* renamed from: j */
    private final C37156e m18959j() {
        C37156e c37156e = (C37156e) this._removedRef;
        if (c37156e == null) {
            C37156e c37156e2 = new C37156e(this);
            f98021d.lazySet(this, c37156e2);
            return c37156e2;
        }
        return c37156e;
    }

    @NotNull
    /* renamed from: e */
    public final Object m18964e() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC37155d)) {
                return obj;
            }
            ((AbstractC37155d) obj).m18958a(this);
        }
    }

    @NotNull
    /* renamed from: f */
    public final C37154c m18963f() {
        return C37153b.m18968a(m18964e());
    }

    /* renamed from: g */
    public final void m18962g() {
        Object m18964e;
        C37154c m18961h = m18961h();
        Object obj = this._next;
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        C37154c c37154c = ((C37156e) obj).f98022a;
        while (true) {
            C37154c c37154c2 = null;
            while (true) {
                Object m18964e2 = c37154c.m18964e();
                if (m18964e2 instanceof C37156e) {
                    c37154c.m18961h();
                    c37154c = ((C37156e) m18964e2).f98022a;
                } else {
                    m18964e = m18961h.m18964e();
                    if (m18964e instanceof C37156e) {
                        if (c37154c2 != null) {
                            break;
                        }
                        m18961h = C37153b.m18968a(m18961h._prev);
                    } else if (m18964e != this) {
                        Intrinsics.m17073h(m18964e, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        C37154c c37154c3 = (C37154c) m18964e;
                        if (c37154c3 == c37154c) {
                            return;
                        }
                        c37154c2 = m18961h;
                        m18961h = c37154c3;
                    } else if (C1074a.m105283a(f98019b, m18961h, this, c37154c)) {
                        return;
                    }
                }
            }
            m18961h.m18961h();
            C1074a.m105283a(f98019b, c37154c2, m18961h, ((C37156e) m18964e).f98022a);
            m18961h = c37154c2;
        }
    }

    /* renamed from: i */
    public boolean m18960i() {
        Object m18964e;
        C37154c c37154c;
        do {
            m18964e = m18964e();
            if ((m18964e instanceof C37156e) || m18964e == this) {
                return false;
            }
            Intrinsics.m17073h(m18964e, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            c37154c = (C37154c) m18964e;
        } while (!C1074a.m105283a(f98019b, this, m18964e, c37154c.m18959j()));
        m18965d(c37154c);
        return true;
    }

    @NotNull
    public String toString() {
        return Reflection.m17042b(getClass()).getSimpleName() + '@' + hashCode();
    }
}
