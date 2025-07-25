package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.ib */
/* loaded from: classes3.dex */
public final class C9967ib {

    /* renamed from: a */
    public final String f22368a;

    /* renamed from: b */
    public final String f22369b;

    /* renamed from: c */
    public final File f22370c;

    /* renamed from: d */
    public final File f22371d;

    /* renamed from: e */
    public final long f22372e;

    /* renamed from: f */
    public final String f22373f;

    /* renamed from: g */
    public long f22374g;

    public C9967ib(String url, String filename, File file, File file2, long j, String queueFilePath, long j2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(queueFilePath, "queueFilePath");
        this.f22368a = url;
        this.f22369b = filename;
        this.f22370c = file;
        this.f22371d = file2;
        this.f22372e = j;
        this.f22373f = queueFilePath;
        this.f22374g = j2;
    }

    /* renamed from: a */
    public final long m81369a() {
        return this.f22372e;
    }

    /* renamed from: b */
    public final File m81367b() {
        return this.f22371d;
    }

    /* renamed from: c */
    public final long m81366c() {
        return this.f22374g;
    }

    /* renamed from: d */
    public final String m81365d() {
        return this.f22369b;
    }

    /* renamed from: e */
    public final File m81364e() {
        return this.f22370c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9967ib)) {
            return false;
        }
        C9967ib c9967ib = (C9967ib) obj;
        if (Intrinsics.m17075f(this.f22368a, c9967ib.f22368a) && Intrinsics.m17075f(this.f22369b, c9967ib.f22369b) && Intrinsics.m17075f(this.f22370c, c9967ib.f22370c) && Intrinsics.m17075f(this.f22371d, c9967ib.f22371d) && this.f22372e == c9967ib.f22372e && Intrinsics.m17075f(this.f22373f, c9967ib.f22373f) && this.f22374g == c9967ib.f22374g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m81363f() {
        return this.f22373f;
    }

    /* renamed from: g */
    public final String m81362g() {
        return this.f22368a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f22368a.hashCode() * 31) + this.f22369b.hashCode()) * 31;
        File file = this.f22370c;
        int i = 0;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        File file2 = this.f22371d;
        if (file2 != null) {
            i = file2.hashCode();
        }
        return ((((((i2 + i) * 31) + Long.hashCode(this.f22372e)) * 31) + this.f22373f.hashCode()) * 31) + Long.hashCode(this.f22374g);
    }

    public String toString() {
        String str = this.f22368a;
        String str2 = this.f22369b;
        File file = this.f22370c;
        File file2 = this.f22371d;
        long j = this.f22372e;
        String str3 = this.f22373f;
        long j2 = this.f22374g;
        return "VideoAsset(url=" + str + ", filename=" + str2 + ", localFile=" + file + ", directory=" + file2 + ", creationDate=" + j + ", queueFilePath=" + str3 + ", expectedFileSize=" + j2 + ")";
    }

    /* renamed from: a */
    public final void m81368a(long j) {
        this.f22374g = j;
    }

    public /* synthetic */ C9967ib(String str, String str2, File file, File file2, long j, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, file, file2, (i & 16) != 0 ? AbstractC10385y9.m79864a() : j, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? 0L : j2);
    }
}
