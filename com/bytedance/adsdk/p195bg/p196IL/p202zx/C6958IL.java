package com.bytedance.adsdk.p195bg.p196IL.p202zx;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6955eqN;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.AbstractC6922VzQ;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6914Fy;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6915IL;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6916Kg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6919PX;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6920Ta;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6921VB;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6923WR;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6924bX;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6925bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6927eqN;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6929ldr;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6932tuV;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6935yDt;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6936zx;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.bg.IL.zx.IL */
/* loaded from: classes3.dex */
public class C6958IL {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.bg.IL.zx.IL$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C69591 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f14874bg;

        static {
            int[] iArr = new int[EnumC6953bX.values().length];
            f14874bg = iArr;
            try {
                iArr[EnumC6953bX.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14874bg[EnumC6953bX.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14874bg[EnumC6953bX.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14874bg[EnumC6953bX.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14874bg[EnumC6953bX.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14874bg[EnumC6953bX.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14874bg[EnumC6953bX.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14874bg[EnumC6953bX.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14874bg[EnumC6953bX.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14874bg[EnumC6953bX.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14874bg[EnumC6953bX.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14874bg[EnumC6953bX.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14874bg[EnumC6953bX.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: IL */
    private static Deque<InterfaceC6913bg> m90446IL(List<InterfaceC6913bg> list, String str, int i) {
        LinkedList<InterfaceC6913bg> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (InterfaceC6913bg interfaceC6913bg : linkedList) {
                if (!linkedList2.isEmpty() && EnumC6953bX.m90451bg(((InterfaceC6913bg) linkedList2.peekLast()).mo90469bg()) && ((EnumC6953bX) ((InterfaceC6913bg) linkedList2.peekLast()).mo90469bg()).m90453IL() == i2) {
                    InterfaceC6913bg interfaceC6913bg2 = (InterfaceC6913bg) linkedList2.pollLast();
                    InterfaceC6913bg interfaceC6913bg3 = (InterfaceC6913bg) linkedList2.pollLast();
                    if (!EnumC6953bX.m90451bg(interfaceC6913bg3.mo90469bg()) && !EnumC6953bX.m90451bg(interfaceC6913bg.mo90469bg())) {
                        linkedList2.addLast(m90444bg(interfaceC6913bg3, interfaceC6913bg2, interfaceC6913bg));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(interfaceC6913bg);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    /* renamed from: bX */
    private static void m90445bX(List<InterfaceC6913bg> list, String str, int i) {
        for (InterfaceC6913bg interfaceC6913bg : list) {
            if (EnumC6955eqN.m90447bg(interfaceC6913bg.mo90469bg())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* renamed from: bg */
    public static InterfaceC6913bg m90441bg(List<InterfaceC6913bg> list, String str, int i) {
        m90445bX(list, str, i);
        Deque<InterfaceC6913bg> m90442bg = m90442bg(m90446IL(list, str, i));
        if (m90442bg.size() == 1) {
            return m90442bg.getFirst();
        }
        throw new IllegalStateException();
    }

    /* renamed from: bg */
    private static Deque<InterfaceC6913bg> m90442bg(Deque<InterfaceC6913bg> deque) {
        LinkedList linkedList = new LinkedList();
        for (InterfaceC6913bg interfaceC6913bg : deque) {
            if (!linkedList.isEmpty() && ((InterfaceC6913bg) linkedList.peekLast()).mo90469bg() == EnumC6953bX.COLON) {
                linkedList.pollLast();
                InterfaceC6913bg interfaceC6913bg2 = (InterfaceC6913bg) linkedList.pollLast();
                if (((InterfaceC6913bg) linkedList.pollLast()).mo90469bg() == EnumC6953bX.QUESTION) {
                    C6914Fy c6914Fy = new C6914Fy();
                    c6914Fy.mo90477bg((InterfaceC6913bg) linkedList.pollLast());
                    c6914Fy.mo90479IL(interfaceC6913bg2);
                    c6914Fy.mo90478bX(interfaceC6913bg);
                    linkedList.addLast(c6914Fy);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(interfaceC6913bg);
            }
        }
        return linkedList;
    }

    /* renamed from: bg */
    private static InterfaceC6913bg m90444bg(InterfaceC6913bg interfaceC6913bg, InterfaceC6913bg interfaceC6913bg2, InterfaceC6913bg interfaceC6913bg3) {
        AbstractC6922VzQ c6921vb;
        switch (C69591.f14874bg[((EnumC6953bX) interfaceC6913bg2.mo90469bg()).ordinal()]) {
            case 1:
                c6921vb = new C6921VB();
                break;
            case 2:
                c6921vb = new C6932tuV();
                break;
            case 3:
                c6921vb = new C6925bg();
                break;
            case 4:
                c6921vb = new C6920Ta();
                break;
            case 5:
                c6921vb = new C6919PX();
                break;
            case 6:
                c6921vb = new C6927eqN();
                break;
            case 7:
                c6921vb = new C6935yDt();
                break;
            case 8:
                c6921vb = new C6929ldr();
                break;
            case 9:
                c6921vb = new C6923WR();
                break;
            case 10:
                c6921vb = new C6936zx();
                break;
            case 11:
                c6921vb = new C6916Kg();
                break;
            case 12:
                c6921vb = new C6915IL();
                break;
            case 13:
                c6921vb = new C6924bX();
                break;
            default:
                throw new UnsupportedOperationException(interfaceC6913bg2.mo90469bg().toString());
        }
        c6921vb.m90475bg(interfaceC6913bg);
        c6921vb.m90476IL(interfaceC6913bg3);
        return c6921vb;
    }

    /* renamed from: bg */
    public static boolean m90443bg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
