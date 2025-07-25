package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.N */
/* loaded from: classes4.dex */
public final class C15252N {

    /* renamed from: d */
    public static final C15252N f30192d = new C15252N(0);

    /* renamed from: a */
    public final AbstractC15299f1 f30193a;

    /* renamed from: b */
    public boolean f30194b;

    /* renamed from: c */
    public boolean f30195c;

    public C15252N() {
        int i = AbstractC15299f1.f30255h;
        this.f30193a = new C15275W0(16);
    }

    /* renamed from: b */
    public static boolean m76957b(Map.Entry entry) {
        C15276X c15276x = (C15276X) entry.getKey();
        if (c15276x.f30222c.m76968a() == EnumC15248L1.MESSAGE) {
            if (c15276x.f30223d) {
                for (InterfaceC15226E0 interfaceC15226E0 : (List) entry.getValue()) {
                    if (!interfaceC15226E0.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }
            Object value = entry.getValue();
            if (value instanceof InterfaceC15226E0) {
                return ((InterfaceC15226E0) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    /* renamed from: a */
    public final void m76962a(C15252N c15252n) {
        for (int i = 0; i < c15252n.f30193a.f30257b.size(); i++) {
            m76954c((Map.Entry) c15252n.f30193a.f30257b.get(i));
        }
        for (Map.Entry entry : c15252n.f30193a.m76880b()) {
            m76954c(entry);
        }
    }

    /* renamed from: c */
    public final boolean m76956c() {
        for (int i = 0; i < this.f30193a.f30257b.size(); i++) {
            if (!m76957b((Map.Entry) this.f30193a.f30257b.get(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f30193a.m76880b()) {
            if (!m76957b(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final Iterator m76953d() {
        if (this.f30195c) {
            return new C15328p0(this.f30193a.entrySet().iterator());
        }
        return this.f30193a.entrySet().iterator();
    }

    /* renamed from: e */
    public final void m76951e() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f30194b) {
            return;
        }
        C15275W0 c15275w0 = (C15275W0) this.f30193a;
        if (!c15275w0.f30259d) {
            for (int i = 0; i < c15275w0.f30257b.size(); i++) {
                Map.Entry entry = (Map.Entry) c15275w0.f30257b.get(i);
                if (((C15276X) entry.getKey()).f30223d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c15275w0.m76880b()) {
                if (((C15276X) entry2.getKey()).f30223d) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c15275w0.f30259d) {
            if (c15275w0.f30258c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(c15275w0.f30258c);
            }
            c15275w0.f30258c = unmodifiableMap;
            if (c15275w0.f30261f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(c15275w0.f30261f);
            }
            c15275w0.f30261f = unmodifiableMap2;
            c15275w0.f30259d = true;
        }
        this.f30194b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15252N)) {
            return false;
        }
        return this.f30193a.equals(((C15252N) obj).f30193a);
    }

    public final int hashCode() {
        return this.f30193a.hashCode();
    }

    /* renamed from: clone */
    public final C15252N m110191clone() {
        C15252N c15252n = new C15252N();
        for (int i = 0; i < this.f30193a.f30257b.size(); i++) {
            Map.Entry entry = (Map.Entry) this.f30193a.f30257b.get(i);
            c15252n.m76955c((C15276X) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f30193a.m76880b()) {
            c15252n.m76955c((C15276X) entry2.getKey(), entry2.getValue());
        }
        c15252n.f30195c = this.f30195c;
        return c15252n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if ((r6 instanceof byte[]) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r6 instanceof com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0) == false) goto L24;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m76952d(com.fyber.inneractive.sdk.protobuf.C15276X r5, java.lang.Object r6) {
        /*
            com.fyber.inneractive.sdk.protobuf.K1 r0 = r5.f30222c
            java.nio.charset.Charset r1 = com.fyber.inneractive.sdk.protobuf.AbstractC15319m0.f30280a
            r6.getClass()
            int[] r1 = com.fyber.inneractive.sdk.protobuf.AbstractC15249M.f30188a
            com.fyber.inneractive.sdk.protobuf.L1 r0 = r0.m76968a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L2f;
                case 7: goto L25;
                case 8: goto L1c;
                case 9: goto L19;
                default: goto L18;
            }
        L18:
            goto L41
        L19:
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.protobuf.InterfaceC15226E0
            goto L42
        L1c:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L2d
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.protobuf.InterfaceC15295e0
            if (r0 == 0) goto L41
            goto L2d
        L25:
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.protobuf.AbstractC15336s
            if (r0 != 0) goto L2d
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L41
        L2d:
            r0 = r1
            goto L42
        L2f:
            boolean r0 = r6 instanceof java.lang.String
            goto L42
        L32:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L42
        L35:
            boolean r0 = r6 instanceof java.lang.Double
            goto L42
        L38:
            boolean r0 = r6 instanceof java.lang.Float
            goto L42
        L3b:
            boolean r0 = r6 instanceof java.lang.Long
            goto L42
        L3e:
            boolean r0 = r6 instanceof java.lang.Integer
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.f30221b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.fyber.inneractive.sdk.protobuf.K1 r5 = r5.f30222c
            com.fyber.inneractive.sdk.protobuf.L1 r5 = r5.m76968a()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C15252N.m76952d(com.fyber.inneractive.sdk.protobuf.X, java.lang.Object):void");
    }

    public C15252N(int i) {
        int i2 = AbstractC15299f1.f30255h;
        this.f30193a = new C15275W0(0);
        m76951e();
        m76951e();
    }

    /* renamed from: a */
    public final int m76964a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f30193a.f30257b.size(); i2++) {
            i += m76960a((Map.Entry) this.f30193a.f30257b.get(i2));
        }
        for (Map.Entry entry : this.f30193a.m76880b()) {
            i += m76960a(entry);
        }
        return i;
    }

    /* renamed from: c */
    public final void m76954c(Map.Entry entry) {
        C15276X c15276x = (C15276X) entry.getKey();
        Object value = entry.getValue();
        if (c15276x.f30223d) {
            Object obj = this.f30193a.get(c15276x);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            this.f30193a.m76881a(c15276x, obj);
        } else if (c15276x.f30222c.m76968a() == EnumC15248L1.MESSAGE) {
            Object obj3 = this.f30193a.get(c15276x);
            if (obj3 == null) {
                AbstractC15299f1 abstractC15299f1 = this.f30193a;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                abstractC15299f1.m76881a(c15276x, value);
                return;
            }
            AbstractC15270U abstractC15270U = (AbstractC15270U) ((InterfaceC15226E0) obj3).toBuilder();
            abstractC15270U.m76938c();
            AbstractC15270U.m76942a(abstractC15270U.f30214b, (AbstractC15283a0) ((InterfaceC15226E0) value));
            this.f30193a.m76881a(c15276x, abstractC15270U.m76943a());
        } else {
            AbstractC15299f1 abstractC15299f12 = this.f30193a;
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            abstractC15299f12.m76881a(c15276x, value);
        }
    }

    /* renamed from: b */
    public final int m76959b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f30193a.f30257b.size(); i2++) {
            Map.Entry entry = (Map.Entry) this.f30193a.f30257b.get(i2);
            i += m76958b((C15276X) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f30193a.m76880b()) {
            i += m76958b((C15276X) entry2.getKey(), entry2.getValue());
        }
        return i;
    }

    /* renamed from: a */
    public static int m76960a(Map.Entry entry) {
        C15276X c15276x = (C15276X) entry.getKey();
        Object value = entry.getValue();
        if (c15276x.f30222c.m76968a() == EnumC15248L1.MESSAGE && !c15276x.f30223d && !c15276x.f30224e) {
            int i = ((C15276X) entry.getKey()).f30221b;
            int m77021c = AbstractC15216B.m77021c(i) + AbstractC15216B.m77023b(2) + (AbstractC15216B.m77023b(1) * 2);
            int m77023b = AbstractC15216B.m77023b(3);
            int serializedSize = ((InterfaceC15226E0) value).getSerializedSize();
            return AbstractC15246L.m76965a(serializedSize, serializedSize, m77023b, m77021c);
        }
        return m76958b(c15276x, value);
    }

    /* renamed from: b */
    public static int m76958b(C15276X c15276x, Object obj) {
        int m77023b;
        int m76963a;
        EnumC15245K1 enumC15245K1 = c15276x.f30222c;
        int i = c15276x.f30221b;
        if (c15276x.f30223d) {
            int i2 = 0;
            if (c15276x.f30224e) {
                for (Object obj2 : (List) obj) {
                    i2 += m76963a(enumC15245K1, obj2);
                }
                m77023b = AbstractC15216B.m77023b(i) + i2;
                m76963a = AbstractC15216B.m77021c(i2);
            } else {
                for (Object obj3 : (List) obj) {
                    int m77023b2 = AbstractC15216B.m77023b(i);
                    if (enumC15245K1 == EnumC15245K1.GROUP) {
                        m77023b2 *= 2;
                    }
                    i2 += m76963a(enumC15245K1, obj3) + m77023b2;
                }
                return i2;
            }
        } else {
            m77023b = AbstractC15216B.m77023b(i);
            if (enumC15245K1 == EnumC15245K1.GROUP) {
                m77023b *= 2;
            }
            m76963a = m76963a(enumC15245K1, obj);
        }
        return m76963a + m77023b;
    }

    /* renamed from: a */
    public static int m76963a(EnumC15245K1 enumC15245K1, Object obj) {
        int serializedSize;
        int m77021c;
        switch (AbstractC15249M.f30189b[enumC15245K1.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = AbstractC15216B.f30145b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC15216B.f30145b;
                return 4;
            case 3:
                return AbstractC15216B.m77027a(((Long) obj).longValue());
            case 4:
                return AbstractC15216B.m77027a(((Long) obj).longValue());
            case 5:
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0) {
                    return AbstractC15216B.m77021c(intValue);
                }
                Logger logger3 = AbstractC15216B.f30145b;
                return 10;
            case 6:
                ((Long) obj).getClass();
                Logger logger4 = AbstractC15216B.f30145b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger5 = AbstractC15216B.f30145b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger6 = AbstractC15216B.f30145b;
                return 1;
            case 9:
                Logger logger7 = AbstractC15216B.f30145b;
                return ((InterfaceC15226E0) obj).getSerializedSize();
            case 10:
                Logger logger8 = AbstractC15216B.f30145b;
                serializedSize = ((InterfaceC15226E0) obj).getSerializedSize();
                m77021c = AbstractC15216B.m77021c(serializedSize);
                break;
            case 11:
                if (obj instanceof AbstractC15336s) {
                    return AbstractC15216B.m77026a((AbstractC15336s) obj);
                }
                return AbstractC15216B.m77025a((String) obj);
            case 12:
                if (obj instanceof AbstractC15336s) {
                    return AbstractC15216B.m77026a((AbstractC15336s) obj);
                }
                Logger logger9 = AbstractC15216B.f30145b;
                serializedSize = ((byte[]) obj).length;
                m77021c = AbstractC15216B.m77021c(serializedSize);
                break;
            case 13:
                return AbstractC15216B.m77021c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = AbstractC15216B.f30145b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = AbstractC15216B.f30145b;
                return 8;
            case 16:
                return AbstractC15216B.m77021c(AbstractC15216B.m77020d(((Integer) obj).intValue()));
            case 17:
                return AbstractC15216B.m77027a(AbstractC15216B.m77022b(((Long) obj).longValue()));
            case 18:
                if (obj instanceof InterfaceC15295e0) {
                    return AbstractC15216B.m77028a(((InterfaceC15295e0) obj).mo76885a());
                }
                return AbstractC15216B.m77028a(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return m77021c + serializedSize;
    }

    /* renamed from: c */
    public final void m76955c(C15276X c15276x, Object obj) {
        if (c15276x.f30223d) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m76952d(c15276x, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m76952d(c15276x, obj);
        }
        this.f30193a.m76881a(c15276x, obj);
    }

    /* renamed from: a */
    public final void m76961a(C15276X c15276x, Object obj) {
        List list;
        if (c15276x.f30223d) {
            m76952d(c15276x, obj);
            Object obj2 = this.f30193a.get(c15276x);
            if (obj2 == null) {
                list = new ArrayList();
                this.f30193a.m76881a(c15276x, list);
            } else {
                list = (List) obj2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
}
