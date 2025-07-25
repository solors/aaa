package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.y7 */
/* loaded from: classes2.dex */
public interface InterfaceC5899y7 {

    /* renamed from: com.applovin.impl.y7$a */
    /* loaded from: classes2.dex */
    public static final class C5900a {

        /* renamed from: a */
        private final byte[] f12292a;

        /* renamed from: b */
        private final String f12293b;

        /* renamed from: c */
        private final int f12294c;

        public C5900a(byte[] bArr, String str, int i) {
            this.f12292a = bArr;
            this.f12293b = str;
            this.f12294c = i;
        }

        /* renamed from: a */
        public byte[] m92794a() {
            return this.f12292a;
        }

        /* renamed from: b */
        public String m92793b() {
            return this.f12293b;
        }
    }

    /* renamed from: com.applovin.impl.y7$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5901b {
        /* renamed from: a */
        void mo92792a(InterfaceC5899y7 interfaceC5899y7, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: com.applovin.impl.y7$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5902c {
        /* renamed from: a */
        InterfaceC5899y7 mo92304a(UUID uuid);
    }

    /* renamed from: com.applovin.impl.y7$d */
    /* loaded from: classes2.dex */
    public static final class C5903d {

        /* renamed from: a */
        private final byte[] f12295a;

        /* renamed from: b */
        private final String f12296b;

        public C5903d(byte[] bArr, String str) {
            this.f12295a = bArr;
            this.f12296b = str;
        }

        /* renamed from: a */
        public byte[] m92791a() {
            return this.f12295a;
        }

        /* renamed from: b */
        public String m92790b() {
            return this.f12296b;
        }
    }

    /* renamed from: a */
    C5900a mo92803a(byte[] bArr, List list, int i, HashMap hashMap);

    /* renamed from: a */
    void mo92807a();

    /* renamed from: a */
    void mo92806a(InterfaceC5901b interfaceC5901b);

    /* renamed from: a */
    void mo92805a(byte[] bArr);

    /* renamed from: a */
    void mo92802a(byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    boolean mo92804a(byte[] bArr, String str);

    /* renamed from: b */
    C5903d mo92801b();

    /* renamed from: b */
    Map mo92800b(byte[] bArr);

    /* renamed from: b */
    byte[] mo92799b(byte[] bArr, byte[] bArr2);

    /* renamed from: c */
    int mo92798c();

    /* renamed from: c */
    void mo92797c(byte[] bArr);

    /* renamed from: d */
    InterfaceC5895y4 mo92795d(byte[] bArr);

    /* renamed from: d */
    byte[] mo92796d();
}
