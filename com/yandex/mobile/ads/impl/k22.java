package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public interface k22 {

    /* renamed from: com.yandex.mobile.ads.impl.k22$a */
    /* loaded from: classes8.dex */
    public static final class C30691a {

        /* renamed from: a */
        public final String f81240a;

        /* renamed from: b */
        public final byte[] f81241b;

        public C30691a(String str, byte[] bArr) {
            this.f81240a = str;
            this.f81241b = bArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k22$b */
    /* loaded from: classes8.dex */
    public static final class C30692b {
        @Nullable

        /* renamed from: a */
        public final String f81242a;

        /* renamed from: b */
        public final List<C30691a> f81243b;

        /* renamed from: c */
        public final byte[] f81244c;

        public C30692b(int i, @Nullable String str, @Nullable ArrayList arrayList, byte[] bArr) {
            List<C30691a> unmodifiableList;
            this.f81242a = str;
            if (arrayList == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            this.f81243b = unmodifiableList;
            this.f81244c = bArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k22$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC30693c {
        /* renamed from: a */
        SparseArray<k22> mo32684a();

        @Nullable
        /* renamed from: a */
        k22 mo32683a(int i, C30692b c30692b);
    }

    /* renamed from: com.yandex.mobile.ads.impl.k22$d */
    /* loaded from: classes8.dex */
    public static final class C30694d {

        /* renamed from: a */
        private final String f81245a;

        /* renamed from: b */
        private final int f81246b;

        /* renamed from: c */
        private final int f81247c;

        /* renamed from: d */
        private int f81248d;

        /* renamed from: e */
        private String f81249e;

        public C30694d(int i, int i2, int i3) {
            String str;
            if (i == Integer.MIN_VALUE) {
                str = "";
            } else {
                str = i + RemoteSettings.FORWARD_SLASH_STRING;
            }
            this.f81245a = str;
            this.f81246b = i2;
            this.f81247c = i3;
            this.f81248d = Integer.MIN_VALUE;
            this.f81249e = "";
        }

        /* renamed from: a */
        public final void m32682a() {
            int i;
            int i2 = this.f81248d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f81246b;
            } else {
                i = i2 + this.f81247c;
            }
            this.f81248d = i;
            this.f81249e = this.f81245a + this.f81248d;
        }

        /* renamed from: b */
        public final String m32681b() {
            if (this.f81248d != Integer.MIN_VALUE) {
                return this.f81249e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: c */
        public final int m32680c() {
            int i = this.f81248d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    void mo27577a();

    /* renamed from: a */
    void mo27576a(int i, cc1 cc1Var) throws gc1;

    /* renamed from: a */
    void mo27574a(n02 n02Var, p50 p50Var, C30694d c30694d);
}
