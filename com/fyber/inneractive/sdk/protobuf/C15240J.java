package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.J */
/* loaded from: classes4.dex */
public final class C15240J {
    /* renamed from: a */
    public static void m76996a(C15219C c15219c, Map.Entry entry) {
        C15276X c15276x = (C15276X) entry.getKey();
        if (c15276x.f30223d) {
            switch (AbstractC15237I.f30163a[c15276x.f30222c.ordinal()]) {
                case 1:
                    AbstractC15273V0.m76912b(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 2:
                    AbstractC15273V0.m76903f(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 3:
                    AbstractC15273V0.m76899h(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 4:
                    AbstractC15273V0.m76893n(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 5:
                    AbstractC15273V0.m76901g(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 6:
                    AbstractC15273V0.m76905e(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 7:
                    AbstractC15273V0.m76907d(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 8:
                    AbstractC15273V0.m76920a(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 9:
                    AbstractC15273V0.m76894m(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 10:
                    AbstractC15273V0.m76898i(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 11:
                    AbstractC15273V0.m76897j(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 12:
                    AbstractC15273V0.m76896k(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 13:
                    AbstractC15273V0.m76895l(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 14:
                    AbstractC15273V0.m76901g(c15276x.f30221b, (List) entry.getValue(), c15219c, c15276x.f30224e);
                    return;
                case 15:
                    AbstractC15273V0.m76922a(c15276x.f30221b, (List) entry.getValue(), c15219c);
                    return;
                case 16:
                    AbstractC15273V0.m76914b(c15276x.f30221b, (List) entry.getValue(), c15219c);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    AbstractC15273V0.m76921a(c15276x.f30221b, (List) entry.getValue(), c15219c, C15262Q0.f30201c.m76946a(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    AbstractC15273V0.m76913b(c15276x.f30221b, (List) entry.getValue(), c15219c, C15262Q0.f30201c.m76946a(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (AbstractC15237I.f30163a[c15276x.f30222c.ordinal()]) {
            case 1:
                c15219c.m77019a(c15276x.f30221b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                c15219c.m77018a(c15276x.f30221b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                c15219c.f30150a.mo76685b(c15276x.f30221b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                c15219c.f30150a.mo76685b(c15276x.f30221b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                c15219c.f30150a.mo76686b(c15276x.f30221b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                c15219c.f30150a.mo76693a(c15276x.f30221b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                c15219c.f30150a.mo76694a(c15276x.f30221b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                c15219c.f30150a.mo76689a(c15276x.f30221b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                c15219c.f30150a.mo76679d(c15276x.f30221b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                c15219c.f30150a.mo76694a(c15276x.f30221b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                c15219c.f30150a.mo76693a(c15276x.f30221b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                c15219c.m77017a(c15276x.f30221b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                c15219c.m77016a(c15276x.f30221b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                c15219c.f30150a.mo76686b(c15276x.f30221b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                c15219c.f30150a.mo76690a(c15276x.f30221b, (AbstractC15336s) entry.getValue());
                return;
            case 16:
                int i = c15276x.f30221b;
                c15219c.f30150a.mo76688a((String) entry.getValue(), i);
                return;
            case 17:
                c15219c.m77015a(c15276x.f30221b, entry.getValue(), C15262Q0.f30201c.m76946a(entry.getValue().getClass()));
                return;
            case 18:
                int i2 = c15276x.f30221b;
                Object value = entry.getValue();
                c15219c.f30150a.mo76691a(i2, (InterfaceC15226E0) value, C15262Q0.f30201c.m76946a(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static Object m76995a(InterfaceC15269T0 interfaceC15269T0, C15278Y c15278y, C15234H c15234h, C15252N c15252n, Object obj, C15329p1 c15329p1) {
        Object valueOf;
        ArrayList arrayList;
        C15276X c15276x = c15278y.f30231d;
        int i = c15276x.f30221b;
        if (c15276x.f30223d && c15276x.f30224e) {
            switch (AbstractC15237I.f30163a[c15276x.f30222c.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76728j(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76740d(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76726k(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76756a(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76718o(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76720n(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76738e(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76724l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76730i(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76736f(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76722m(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76744c(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76734g(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC15269T0.mo76716p(arrayList);
                    obj = AbstractC15273V0.m76924a(i, arrayList, c15278y.f30231d.f30220a, obj, c15329p1);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c15278y.f30231d.f30222c);
            }
            c15252n.m76955c(c15278y.f30231d, arrayList);
        } else {
            EnumC15245K1 enumC15245K1 = c15276x.f30222c;
            if (enumC15245K1 == EnumC15245K1.ENUM) {
                int mo76743d = interfaceC15269T0.mo76743d();
                if (c15278y.f30231d.f30220a.mo76884a(mo76743d) == null) {
                    return AbstractC15273V0.m76925a(i, mo76743d, obj, c15329p1);
                }
                valueOf = Integer.valueOf(mo76743d);
            } else {
                switch (AbstractC15237I.f30163a[enumC15245K1.ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC15269T0.mo76733h());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC15269T0.mo76727k());
                        break;
                    case 3:
                        valueOf = Long.valueOf(interfaceC15269T0.mo76719o());
                        break;
                    case 4:
                        valueOf = Long.valueOf(interfaceC15269T0.mo76737f());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(interfaceC15269T0.mo76743d());
                        break;
                    case 6:
                        valueOf = Long.valueOf(interfaceC15269T0.mo76735g());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(interfaceC15269T0.mo76715q());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC15269T0.mo76713r());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(interfaceC15269T0.mo76747c());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(interfaceC15269T0.mo76723m());
                        break;
                    case 11:
                        valueOf = Long.valueOf(interfaceC15269T0.mo76711t());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(interfaceC15269T0.mo76729j());
                        break;
                    case 13:
                        valueOf = Long.valueOf(interfaceC15269T0.mo76725l());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC15269T0.mo76760a();
                        break;
                    case 16:
                        valueOf = interfaceC15269T0.mo76721n();
                        break;
                    case 17:
                        valueOf = interfaceC15269T0.mo76757a(c15278y.f30230c.getClass(), c15234h);
                        break;
                    case 18:
                        valueOf = interfaceC15269T0.mo76750b(c15278y.f30230c.getClass(), c15234h);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            C15276X c15276x2 = c15278y.f30231d;
            if (c15276x2.f30223d) {
                c15252n.m76961a(c15276x2, valueOf);
            } else {
                int i2 = AbstractC15237I.f30163a[c15276x2.f30222c.ordinal()];
                if (i2 == 17 || i2 == 18) {
                    Object obj2 = c15252n.f30193a.get(c15278y.f30231d);
                    if (obj2 != null) {
                        valueOf = AbstractC15319m0.m76845a(obj2, valueOf);
                    }
                }
                c15252n.m76955c(c15278y.f30231d, valueOf);
            }
        }
        return obj;
    }
}
