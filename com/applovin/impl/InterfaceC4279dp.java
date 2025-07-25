package com.applovin.impl;

import android.util.SparseArray;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.dp */
/* loaded from: classes2.dex */
public interface InterfaceC4279dp {

    /* renamed from: com.applovin.impl.dp$a */
    /* loaded from: classes2.dex */
    public static final class C4280a {

        /* renamed from: a */
        public final String f5687a;

        /* renamed from: b */
        public final int f5688b;

        /* renamed from: c */
        public final byte[] f5689c;

        public C4280a(String str, int i, byte[] bArr) {
            this.f5687a = str;
            this.f5688b = i;
            this.f5689c = bArr;
        }
    }

    /* renamed from: com.applovin.impl.dp$b */
    /* loaded from: classes2.dex */
    public static final class C4281b {

        /* renamed from: a */
        public final int f5690a;

        /* renamed from: b */
        public final String f5691b;

        /* renamed from: c */
        public final List f5692c;

        /* renamed from: d */
        public final byte[] f5693d;

        public C4281b(int i, String str, List list, byte[] bArr) {
            List unmodifiableList;
            this.f5690a = i;
            this.f5691b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f5692c = unmodifiableList;
            this.f5693d = bArr;
        }
    }

    /* renamed from: com.applovin.impl.dp$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4282c {
        /* renamed from: a */
        SparseArray mo97578a();

        /* renamed from: a */
        InterfaceC4279dp mo97576a(int i, C4281b c4281b);
    }

    /* renamed from: com.applovin.impl.dp$d */
    /* loaded from: classes2.dex */
    public static final class C4283d {

        /* renamed from: a */
        private final String f5694a;

        /* renamed from: b */
        private final int f5695b;

        /* renamed from: c */
        private final int f5696c;

        /* renamed from: d */
        private int f5697d;

        /* renamed from: e */
        private String f5698e;

        public C4283d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: d */
        private void m99721d() {
            if (this.f5697d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: a */
        public void m99724a() {
            int i;
            int i2 = this.f5697d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f5695b;
            } else {
                i = i2 + this.f5696c;
            }
            this.f5697d = i;
            this.f5698e = this.f5694a + this.f5697d;
        }

        /* renamed from: b */
        public String m99723b() {
            m99721d();
            return this.f5698e;
        }

        /* renamed from: c */
        public int m99722c() {
            m99721d();
            return this.f5697d;
        }

        public C4283d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + RemoteSettings.FORWARD_SLASH_STRING;
            } else {
                str = "";
            }
            this.f5694a = str;
            this.f5695b = i2;
            this.f5696c = i3;
            this.f5697d = Integer.MIN_VALUE;
            this.f5698e = "";
        }
    }

    /* renamed from: a */
    void mo98426a();

    /* renamed from: a */
    void mo98424a(C4066ah c4066ah, int i);

    /* renamed from: a */
    void mo98422a(C4537ho c4537ho, InterfaceC4760l8 interfaceC4760l8, C4283d c4283d);
}
