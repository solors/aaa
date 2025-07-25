package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.pe */
/* loaded from: classes9.dex */
public abstract class AbstractC34805pe {

    /* renamed from: c */
    public static final String f95178c = "pe";

    /* renamed from: a */
    public final InterfaceC33891Fa f95179a;

    /* renamed from: b */
    public final String f95180b;

    public AbstractC34805pe(InterfaceC33891Fa interfaceC33891Fa, String str) {
        this.f95179a = interfaceC33891Fa;
        this.f95180b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC34805pe> T m21156a(String str, float f) {
        synchronized (this) {
            this.f95179a.mo21211a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC34805pe> T m21145b(String str, String str2) {
        synchronized (this) {
            this.f95179a.mo21209a(str, str2);
        }
        return this;
    }

    /* renamed from: c */
    public final C34832qe m21143c(String str) {
        return new C34832qe(str, this.f95180b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final <T extends AbstractC34805pe> T m21142d(String str) {
        synchronized (this) {
            this.f95179a.remove(str);
        }
        return this;
    }

    @NonNull
    /* renamed from: c */
    public Set<String> mo21018c() {
        return this.f95179a.mo21214a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC34805pe> T m21150a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f95179a.mo21209a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC34805pe> T m21146b(String str, long j) {
        synchronized (this) {
            this.f95179a.mo21210a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: b */
    public final <T extends AbstractC34805pe> T m21147b(String str, int i) {
        synchronized (this) {
            this.f95179a.mo21213a(i, str);
        }
        return this;
    }

    /* renamed from: a */
    public final <T extends AbstractC34805pe> T m21152a(String str, List<String> list) {
        return (T) m21150a(str, (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    public final long m21154a(String str, long j) {
        return this.f95179a.getLong(str, j);
    }

    /* renamed from: a */
    public final int m21155a(@NonNull String str, int i) {
        return this.f95179a.getInt(str, i);
    }

    @Nullable
    /* renamed from: a */
    public final String m21153a(@NonNull String str, @Nullable String str2) {
        return this.f95179a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC34805pe> T m21144b(String str, boolean z) {
        synchronized (this) {
            this.f95179a.mo21208a(str, z);
        }
        return this;
    }

    /* renamed from: a */
    public final boolean m21151a(String str, boolean z) {
        return this.f95179a.getBoolean(str, z);
    }

    /* renamed from: b */
    public final void m21149b() {
        synchronized (this) {
            this.f95179a.mo21207b();
        }
    }

    /* renamed from: b */
    public final boolean m21148b(@NonNull String str) {
        return this.f95179a.mo21212a(str);
    }
}
