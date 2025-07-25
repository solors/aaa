package com.yandex.div.core;

import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Disposable.kt */
@Metadata
/* renamed from: com.yandex.div.core.d */
/* loaded from: classes8.dex */
public interface InterfaceC29586d extends AutoCloseable, Closeable {
    @NotNull

    /* renamed from: V7 */
    public static final C29587a f75158V7 = C29587a.f75160a;
    @NotNull

    /* renamed from: W7 */
    public static final InterfaceC29586d f75159W7 = new InterfaceC29586d() { // from class: com.yandex.div.core.c
        @Override // com.yandex.div.core.InterfaceC29586d, java.lang.AutoCloseable, java.io.Closeable
        public final void close() {
            InterfaceC29586d.m37434D();
        }
    };

    /* compiled from: Disposable.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.d$a */
    /* loaded from: classes8.dex */
    public static final class C29587a {

        /* renamed from: a */
        static final /* synthetic */ C29587a f75160a = new C29587a();

        private C29587a() {
        }
    }

    /* renamed from: D */
    static /* synthetic */ void m37434D() {
        m37433F();
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    void close();

    /* renamed from: F */
    static void m37433F() {
    }
}
