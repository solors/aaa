package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r92 implements InterfaceC30269et {
    @NotNull

    /* renamed from: a */
    private final Object f84688a;
    @NotNull

    /* renamed from: b */
    private final jq0 f84689b;
    @NotNull

    /* renamed from: c */
    private final LinkedHashSet f84690c;

    public /* synthetic */ r92() {
        this(new Object(), new jq0());
    }

    /* renamed from: c */
    public static final void m30104c(r92 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.m30109a().iterator();
        while (it.hasNext()) {
            ((InterfaceC30269et) it.next()).onVideoPaused();
        }
    }

    /* renamed from: d */
    public static final void m30103d(r92 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.m30109a().iterator();
        while (it.hasNext()) {
            ((InterfaceC30269et) it.next()).onVideoPrepared();
        }
    }

    /* renamed from: e */
    public static final void m30102e(r92 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.m30109a().iterator();
        while (it.hasNext()) {
            ((InterfaceC30269et) it.next()).onVideoResumed();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m30101f(r92 r92Var) {
        m30105b(r92Var);
    }

    /* renamed from: g */
    public static /* synthetic */ void m30100g(r92 r92Var) {
        m30103d(r92Var);
    }

    /* renamed from: h */
    public static /* synthetic */ void m30099h(r92 r92Var) {
        m30104c(r92Var);
    }

    /* renamed from: i */
    public static /* synthetic */ void m30098i(r92 r92Var) {
        m30107a(r92Var);
    }

    /* renamed from: j */
    public static /* synthetic */ void m30097j(r92 r92Var) {
        m30102e(r92Var);
    }

    /* renamed from: a */
    public final void m30108a(@NotNull i92 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f84688a) {
            this.f84690c.add(listener);
        }
    }

    /* renamed from: b */
    public final void m30106b() {
        this.f84690c.clear();
        this.f84689b.m32796a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoCompleted() {
        this.f84689b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.dv2
            @Override // java.lang.Runnable
            public final void run() {
                r92.m30098i(r92.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoError() {
        this.f84689b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.bv2
            @Override // java.lang.Runnable
            public final void run() {
                r92.m30101f(r92.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoPaused() {
        this.f84689b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.av2
            @Override // java.lang.Runnable
            public final void run() {
                r92.m30099h(r92.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoPrepared() {
        this.f84689b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.ev2
            @Override // java.lang.Runnable
            public final void run() {
                r92.m30100g(r92.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoResumed() {
        this.f84689b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.cv2
            @Override // java.lang.Runnable
            public final void run() {
                r92.m30097j(r92.this);
            }
        });
    }

    /* renamed from: a */
    private final HashSet m30109a() {
        HashSet hashSet;
        synchronized (this.f84688a) {
            hashSet = new HashSet(this.f84690c);
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final void m30105b(r92 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.m30109a().iterator();
        while (it.hasNext()) {
            ((InterfaceC30269et) it.next()).onVideoError();
        }
    }

    public r92(@NotNull Object lock, @NotNull jq0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f84688a = lock;
        this.f84689b = mainThreadExecutor;
        this.f84690c = new LinkedHashSet();
    }

    /* renamed from: a */
    public static final void m30107a(r92 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.m30109a().iterator();
        while (it.hasNext()) {
            ((InterfaceC30269et) it.next()).onVideoCompleted();
        }
    }
}
