package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonLexer.kt */
@Metadata
/* renamed from: se.h */
/* loaded from: classes8.dex */
public final class C42703h implements CharSequence {
    @NotNull

    /* renamed from: b */
    private final char[] f111838b;

    /* renamed from: c */
    private int f111839c;

    public C42703h(@NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f111838b = buffer;
        this.f111839c = buffer.length;
    }

    /* renamed from: b */
    public char m6791b(int i) {
        return this.f111838b[i];
    }

    /* renamed from: c */
    public int m6790c() {
        return this.f111839c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return m6791b(i);
    }

    /* renamed from: d */
    public void m6789d(int i) {
        this.f111839c = i;
    }

    @NotNull
    /* renamed from: e */
    public final String m6788e(int i, int i2) {
        String m16620t;
        m16620t = StringsJVM.m16620t(this.f111838b, i, Math.min(i2, length()));
        return m16620t;
    }

    /* renamed from: f */
    public final void m6787f(int i) {
        m6789d(Math.min(this.f111838b.length, i));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return m6790c();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i, int i2) {
        String m16620t;
        m16620t = StringsJVM.m16620t(this.f111838b, i, Math.min(i2, length()));
        return m16620t;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return m6788e(0, length());
    }
}
