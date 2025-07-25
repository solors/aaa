package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composers.kt */
@Metadata
/* renamed from: se.r */
/* loaded from: classes8.dex */
public class C42725r {
    @NotNull

    /* renamed from: a */
    public final InterfaceC42743z0 f111885a;

    /* renamed from: b */
    private boolean f111886b;

    public C42725r(@NotNull InterfaceC42743z0 writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f111885a = writer;
        this.f111886b = true;
    }

    /* renamed from: a */
    public final boolean m6695a() {
        return this.f111886b;
    }

    /* renamed from: b */
    public void mo6694b() {
        this.f111886b = true;
    }

    /* renamed from: c */
    public void mo6693c() {
        this.f111886b = false;
    }

    /* renamed from: d */
    public void mo6646d(byte b) {
        this.f111885a.writeLong(b);
    }

    /* renamed from: e */
    public final void m6692e(char c) {
        this.f111885a.mo6642a(c);
    }

    /* renamed from: f */
    public void m6691f(double d) {
        this.f111885a.mo6640c(String.valueOf(d));
    }

    /* renamed from: g */
    public void m6690g(float f) {
        this.f111885a.mo6640c(String.valueOf(f));
    }

    /* renamed from: h */
    public void mo6645h(int i) {
        this.f111885a.writeLong(i);
    }

    /* renamed from: i */
    public void mo6644i(long j) {
        this.f111885a.writeLong(j);
    }

    /* renamed from: j */
    public final void m6689j(@NotNull String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f111885a.mo6640c(v);
    }

    /* renamed from: k */
    public void mo6643k(short s) {
        this.f111885a.writeLong(s);
    }

    /* renamed from: l */
    public void m6688l(boolean z) {
        this.f111885a.mo6640c(String.valueOf(z));
    }

    /* renamed from: m */
    public void mo6680m(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f111885a.mo6641b(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m6687n(boolean z) {
        this.f111886b = z;
    }

    /* renamed from: o */
    public void mo6686o() {
    }

    /* renamed from: p */
    public void mo6685p() {
    }
}
