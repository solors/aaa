package com.inmobi.media;

import androidx.annotation.WorkerThread;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.C19379n2;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.n2 */
/* loaded from: classes6.dex */
public final class C19379n2 {

    /* renamed from: a */
    public static final LinkedHashMap f48527a = new LinkedHashMap();

    /* renamed from: b */
    public static final InterfaceC38501j f48528b;

    /* renamed from: c */
    public static final AtomicBoolean f48529c;

    /* renamed from: d */
    public static final AtomicBoolean f48530d;

    /* renamed from: e */
    public static final ConcurrentHashMap f48531e;

    /* renamed from: f */
    public static final InterfaceC38501j f48532f;

    static {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        m14554a = LazyJVM.m14554a(C19337k2.f48429a);
        f48528b = m14554a;
        f48529c = new AtomicBoolean(false);
        f48530d = new AtomicBoolean(true);
        f48531e = new ConcurrentHashMap();
        m14554a2 = LazyJVM.m14554a(C19323j2.f48384a);
        f48532f = m14554a2;
        C18954Ha.m61066f().m61247a(new int[]{2, 1}, C19281g2.f48245a);
        C18954Ha.m61079a(new Runnable() { // from class: o3.g5
            @Override // java.lang.Runnable
            public final void run() {
                C19379n2.m60014a();
            }
        });
    }

    @NotNull
    /* renamed from: a */
    public static final Config m60013a(@NotNull String str, @Nullable String str2, @Nullable InterfaceC19365m2 interfaceC19365m2) {
        return C19351l2.m60081a(str, str2, interfaceC19365m2);
    }

    /* renamed from: b */
    public static final /* synthetic */ String m60012b() {
        return "ConfigBootstrapHandler";
    }

    /* renamed from: f */
    public static final /* synthetic */ String m60008f() {
        return "n2";
    }

    @WorkerThread
    /* renamed from: g */
    public static final void m60007g() {
        C19351l2.m60085a();
    }

    @WorkerThread
    /* renamed from: h */
    public static final void m60006h() {
        if (f48529c.getAndSet(false)) {
            Intrinsics.checkNotNullExpressionValue(m60008f(), "access$getTAG$cp(...)");
            ((HandlerC19295h2) f48528b.getValue()).sendEmptyMessage(5);
        }
    }

    /* renamed from: a */
    public static final void m60014a() {
        C19351l2.m60085a();
    }
}
