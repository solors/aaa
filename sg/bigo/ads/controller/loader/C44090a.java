package sg.bigo.ads.controller.loader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.InterfaceC43501Ad;
import sg.bigo.ads.api.core.C43562g;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.p904b.AbstractC43543g;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.p883ad.AbstractC42869c;

/* renamed from: sg.bigo.ads.controller.loader.a */
/* loaded from: classes10.dex */
public final class C44090a {
    /* renamed from: a */
    public static int m3982a(InterfaceC43550c[] interfaceC43550cArr) {
        InterfaceC43550c interfaceC43550c = (InterfaceC43550c) C43828k.m4870b(interfaceC43550cArr);
        if (interfaceC43550c != null) {
            return interfaceC43550c.mo4327w();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m3983a(@NonNull InterfaceC43501Ad interfaceC43501Ad, String str) {
        InterfaceC43550c[] m3984a = m3984a(interfaceC43501Ad);
        if (C43828k.m4872a(m3984a)) {
            return;
        }
        for (InterfaceC43550c interfaceC43550c : m3984a) {
            interfaceC43550c.mo4374a(str);
        }
    }

    /* renamed from: a */
    public static void m3981a(InterfaceC43550c[] interfaceC43550cArr, int i) {
        if (C43828k.m4872a(interfaceC43550cArr)) {
            return;
        }
        for (InterfaceC43550c interfaceC43550c : interfaceC43550cArr) {
            if (interfaceC43550c != null) {
                interfaceC43550c.mo4350b(i);
            }
        }
    }

    /* renamed from: a */
    public static void m3980a(InterfaceC43550c[] interfaceC43550cArr, int i, int i2, boolean z) {
        if (C43828k.m4872a(interfaceC43550cArr)) {
            return;
        }
        for (InterfaceC43550c interfaceC43550c : interfaceC43550cArr) {
            if (interfaceC43550c != null) {
                interfaceC43550c.mo4378a(i, i2, z);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static InterfaceC43550c[] m3984a(@NonNull InterfaceC43501Ad interfaceC43501Ad) {
        if (interfaceC43501Ad instanceof AbstractC43543g) {
            return ((AbstractC43543g) interfaceC43501Ad).mo5427a();
        }
        if (interfaceC43501Ad instanceof AbstractC42869c) {
            return new InterfaceC43550c[]{((AbstractC42869c) interfaceC43501Ad).mo5439f()};
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static InterfaceC43550c[] m3979a(@NonNull C43562g... c43562gArr) {
        if (C43828k.m4872a(c43562gArr)) {
            return null;
        }
        InterfaceC43550c[] interfaceC43550cArr = new InterfaceC43550c[c43562gArr.length];
        for (int i = 0; i < c43562gArr.length; i++) {
            interfaceC43550cArr[i] = c43562gArr[i].f114090a;
        }
        return interfaceC43550cArr;
    }
}
