package com.applovin.impl;

import java.io.EOFException;

/* renamed from: com.applovin.impl.m8 */
/* loaded from: classes2.dex */
public abstract class AbstractC4823m8 {
    /* renamed from: a */
    public static void m97560a(boolean z, String str) {
        if (!z) {
            throw C4187ch.m100188a(str, null);
        }
    }

    /* renamed from: b */
    public static boolean m97559b(InterfaceC4703k8 interfaceC4703k8, byte[] bArr, int i, int i2) {
        try {
            interfaceC4703k8.mo98000d(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m97561a(InterfaceC4703k8 interfaceC4703k8, byte[] bArr, int i, int i2, boolean z) {
        try {
            return interfaceC4703k8.mo98004b(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static int m97562a(InterfaceC4703k8 interfaceC4703k8, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int mo98005b = interfaceC4703k8.mo98005b(bArr, i + i3, i2 - i3);
            if (mo98005b == -1) {
                break;
            }
            i3 += mo98005b;
        }
        return i3;
    }

    /* renamed from: a */
    public static boolean m97563a(InterfaceC4703k8 interfaceC4703k8, int i) {
        try {
            interfaceC4703k8.mo98010a(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
