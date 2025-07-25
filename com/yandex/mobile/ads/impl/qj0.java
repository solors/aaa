package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qj0 implements InterfaceC30117cs {
    @NotNull

    /* renamed from: a */
    private final Object f84384a;
    @NotNull

    /* renamed from: b */
    private final jq0 f84385b;
    @NotNull

    /* renamed from: c */
    private final LinkedHashMap f84386c;

    public /* synthetic */ qj0() {
        this(new Object(), new jq0());
    }

    /* renamed from: b */
    public static final void m30336b(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29852i(videoAd);
        }
    }

    /* renamed from: c */
    public static final void m30335c(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29855f(videoAd);
        }
    }

    /* renamed from: d */
    public static final void m30334d(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29859b(videoAd);
        }
    }

    /* renamed from: e */
    public static final void m30333e(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29854g(videoAd);
        }
    }

    /* renamed from: a */
    public final void m30341a(@NotNull kl0 videoAd, @NotNull InterfaceC30117cs listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f84384a) {
            Set set = (Set) this.f84386c.get(videoAd);
            if (set == null) {
                set = new HashSet();
                this.f84386c.put(videoAd, set);
            }
            set.add(listener);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: f */
    public final void mo29855f(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.nu2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30335c(m30328j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: g */
    public final void mo29854g(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.su2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30333e(m30328j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: h */
    public final void mo29853h(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.ku2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30340a(m30328j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: i */
    public final void mo29852i(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.mu2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30336b(m30328j, videoAd);
                }
            });
        }
    }

    /* renamed from: j */
    private final HashSet m30328j(kl0 kl0Var) {
        HashSet hashSet;
        synchronized (this.f84384a) {
            Set set = (Set) this.f84386c.get(kl0Var);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }

    public qj0(@NotNull Object lock, @NotNull jq0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f84384a = lock;
        this.f84385b = mainThreadExecutor;
        this.f84386c = new LinkedHashMap();
    }

    /* renamed from: f */
    public static final void m30332f(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29857d(videoAd);
        }
    }

    /* renamed from: g */
    public static final void m30331g(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29863a(videoAd);
        }
    }

    /* renamed from: h */
    public static final void m30330h(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29858c(videoAd);
        }
    }

    /* renamed from: i */
    public static final void m30329i(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29856e(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: b */
    public final void mo29859b(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.ru2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30334d(m30328j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: c */
    public final void mo29858c(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.lu2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30330h(m30328j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: d */
    public final void mo29857d(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.tu2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30332f(m30328j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: e */
    public final void mo29856e(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.qu2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30329i(m30328j, videoAd);
                }
            });
        }
    }

    /* renamed from: b */
    public final void m30337b(@NotNull kl0 videoAd, @NotNull InterfaceC30117cs listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f84384a) {
            Set set = (Set) this.f84386c.get(videoAd);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.m17075f(listener, (InterfaceC30117cs) it.next())) {
                        it.remove();
                    }
                }
            }
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    public static final void m30340a(Set set, kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29853h(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: a */
    public final void mo29863a(@NotNull final kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.pu2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30331g(m30328j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: a */
    public final void mo29861a(@NotNull final kl0 videoAd, @NotNull final g72 error) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(error, "error");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.ou2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30338a(m30328j, videoAd, error);
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m30338a(Set set, kl0 videoAd, g72 error) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Intrinsics.checkNotNullParameter(error, "$error");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29861a(videoAd, error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: a */
    public final void mo29862a(@NotNull final kl0 videoAd, final float f) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet m30328j = m30328j(videoAd);
        if (m30328j != null) {
            this.f84385b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.uu2
                @Override // java.lang.Runnable
                public final void run() {
                    qj0.m30339a(m30328j, videoAd, f);
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m30339a(Set set, kl0 videoAd, float f) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC30117cs) it.next()).mo29862a(videoAd, f);
        }
    }

    /* renamed from: a */
    public final void m30342a() {
        this.f84385b.m32796a();
    }
}
