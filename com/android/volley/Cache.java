package com.android.volley;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.volley.b */
/* loaded from: classes2.dex */
public interface Cache {

    /* compiled from: Cache.java */
    /* renamed from: com.android.volley.b$a */
    /* loaded from: classes2.dex */
    public static class C3744a {

        /* renamed from: a */
        public byte[] f3445a;

        /* renamed from: b */
        public String f3446b;

        /* renamed from: c */
        public long f3447c;

        /* renamed from: d */
        public long f3448d;

        /* renamed from: e */
        public long f3449e;

        /* renamed from: f */
        public long f3450f;

        /* renamed from: g */
        public Map<String, String> f3451g = Collections.emptyMap();

        /* renamed from: h */
        public List<Header> f3452h;

        /* renamed from: a */
        public boolean m102303a() {
            return m102302b(System.currentTimeMillis());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m102302b(long j) {
            if (this.f3449e < j) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m102301c(long j) {
            if (this.f3450f < j) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    void mo102265a(String str, boolean z);

    /* renamed from: b */
    void mo102264b(String str, C3744a c3744a);

    @Nullable
    C3744a get(String str);

    void initialize();
}
