package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.impl.C4658jk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mj */
/* loaded from: classes2.dex */
final class C4959mj {

    /* renamed from: d */
    private static final Splitter f8435d = Splitter.m101277on(':');

    /* renamed from: e */
    private static final Splitter f8436e = Splitter.m101277on('*');

    /* renamed from: a */
    private final List f8437a = new ArrayList();

    /* renamed from: b */
    private int f8438b = 0;

    /* renamed from: c */
    private int f8439c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.mj$a */
    /* loaded from: classes2.dex */
    public static final class C4960a {

        /* renamed from: a */
        public final int f8440a;

        /* renamed from: b */
        public final long f8441b;

        /* renamed from: c */
        public final int f8442c;

        public C4960a(int i, long j, int i2) {
            this.f8440a = i;
            this.f8441b = j;
            this.f8442c = i2;
        }
    }

    /* renamed from: a */
    private void m97096a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        C4066ah c4066ah = new C4066ah(8);
        interfaceC4703k8.mo98000d(c4066ah.m100787c(), 0, 8);
        this.f8439c = c4066ah.m100772m() + 8;
        if (c4066ah.m100775j() != 1397048916) {
            c5563th.f10897a = 0L;
            return;
        }
        c5563th.f10897a = interfaceC4703k8.mo97999f() - (this.f8439c - 12);
        this.f8438b = 2;
    }

    /* renamed from: b */
    private void m97092b(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        long mo98011a = interfaceC4703k8.mo98011a();
        int i = this.f8439c - 20;
        C4066ah c4066ah = new C4066ah(i);
        interfaceC4703k8.mo98000d(c4066ah.m100787c(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            c4066ah.m100778g(2);
            short m100770o = c4066ah.m100770o();
            if (m100770o != 2192 && m100770o != 2816 && m100770o != 2817 && m100770o != 2819 && m100770o != 2820) {
                c4066ah.m100778g(8);
            } else {
                this.f8437a.add(new C4960a(m100770o, (mo98011a - this.f8439c) - c4066ah.m100772m(), c4066ah.m100772m()));
            }
        }
        if (this.f8437a.isEmpty()) {
            c5563th.f10897a = 0L;
            return;
        }
        this.f8438b = 3;
        c5563th.f10897a = ((C4960a) this.f8437a.get(0)).f8441b;
    }

    /* renamed from: a */
    private static int m97093a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw C4187ch.m100188a("Invalid SEF name", null);
        }
    }

    /* renamed from: a */
    public int m97095a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th, List list) {
        int i = this.f8438b;
        long j = 0;
        if (i == 0) {
            long mo98011a = interfaceC4703k8.mo98011a();
            if (mo98011a != -1 && mo98011a >= 8) {
                j = mo98011a - 8;
            }
            c5563th.f10897a = j;
            this.f8438b = 1;
        } else if (i == 1) {
            m97096a(interfaceC4703k8, c5563th);
        } else if (i == 2) {
            m97092b(interfaceC4703k8, c5563th);
        } else if (i == 3) {
            m97094a(interfaceC4703k8, list);
            c5563th.f10897a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    /* renamed from: a */
    private void m97094a(InterfaceC4703k8 interfaceC4703k8, List list) {
        long mo97999f = interfaceC4703k8.mo97999f();
        int mo98011a = (int) ((interfaceC4703k8.mo98011a() - interfaceC4703k8.mo97999f()) - this.f8439c);
        C4066ah c4066ah = new C4066ah(mo98011a);
        interfaceC4703k8.mo98000d(c4066ah.m100787c(), 0, mo98011a);
        for (int i = 0; i < this.f8437a.size(); i++) {
            C4960a c4960a = (C4960a) this.f8437a.get(i);
            c4066ah.m100780f((int) (c4960a.f8441b - mo97999f));
            c4066ah.m100778g(4);
            int m100772m = c4066ah.m100772m();
            int m97093a = m97093a(c4066ah.m100786c(m100772m));
            int i2 = c4960a.f8442c - (m100772m + 8);
            if (m97093a == 2192) {
                list.add(m97097a(c4066ah, i2));
            } else if (m97093a != 2816 && m97093a != 2817 && m97093a != 2819 && m97093a != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    private static C4658jk m97097a(C4066ah c4066ah, int i) {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = f8436e.splitToList(c4066ah.m100786c(i));
        for (int i2 = 0; i2 < splitToList.size(); i2++) {
            List<String> splitToList2 = f8435d.splitToList(splitToList.get(i2));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new C4658jk.C4660b(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw C4187ch.m100188a(null, e);
                }
            } else {
                throw C4187ch.m100188a(null, null);
            }
        }
        return new C4658jk(arrayList);
    }

    /* renamed from: a */
    public void m97098a() {
        this.f8437a.clear();
        this.f8438b = 0;
    }
}
