package com.ironsource;

import java.util.ArrayList;

/* renamed from: com.ironsource.he */
/* loaded from: classes6.dex */
public interface InterfaceC20045he {

    /* renamed from: com.ironsource.he$a */
    /* loaded from: classes6.dex */
    public static class C20046a {

        /* renamed from: a */
        private final ArrayList<C20200kb> f50452a;

        /* renamed from: b */
        private boolean f50453b;

        /* renamed from: c */
        private int f50454c;

        /* renamed from: d */
        private Exception f50455d;

        public C20046a(ArrayList<C20200kb> arrayList) {
            this.f50453b = false;
            this.f50454c = -1;
            this.f50452a = arrayList;
        }

        /* renamed from: a */
        public C20046a m58161a(int i) {
            return new C20046a(this.f50452a, i, this.f50453b, this.f50455d);
        }

        /* renamed from: b */
        public ArrayList<C20200kb> m58158b() {
            return this.f50452a;
        }

        /* renamed from: c */
        public boolean m58157c() {
            return this.f50453b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f50453b + ", responseCode=" + this.f50454c + ", exception=" + this.f50455d + '}';
        }

        C20046a(ArrayList<C20200kb> arrayList, int i, boolean z, Exception exc) {
            this.f50452a = arrayList;
            this.f50453b = z;
            this.f50455d = exc;
            this.f50454c = i;
        }

        /* renamed from: a */
        public C20046a m58160a(Exception exc) {
            return new C20046a(this.f50452a, this.f50454c, this.f50453b, exc);
        }

        /* renamed from: a */
        public C20046a m58159a(boolean z) {
            return new C20046a(this.f50452a, this.f50454c, z, this.f50455d);
        }

        /* renamed from: a */
        public String m58162a() {
            if (this.f50453b) {
                return "";
            }
            return "rc=" + this.f50454c + ", ex=" + this.f50455d;
        }
    }

    /* renamed from: a */
    void mo57219a(C20046a c20046a);
}
