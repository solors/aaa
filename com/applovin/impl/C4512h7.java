package com.applovin.impl;

import com.applovin.impl.InterfaceC5209qo;
import java.io.EOFException;

/* renamed from: com.applovin.impl.h7 */
/* loaded from: classes2.dex */
public final class C4512h7 implements InterfaceC5209qo {

    /* renamed from: a */
    private final byte[] f6573a = new byte[4096];

    @Override // com.applovin.impl.InterfaceC5209qo
    /* renamed from: a */
    public void mo96254a(long j, int i, int i2, int i3, InterfaceC5209qo.C5210a c5210a) {
    }

    @Override // com.applovin.impl.InterfaceC5209qo
    /* renamed from: a */
    public void mo96251a(C4310e9 c4310e9) {
    }

    @Override // com.applovin.impl.InterfaceC5209qo
    /* renamed from: a */
    public int mo96249a(InterfaceC4379f5 interfaceC4379f5, int i, boolean z, int i2) {
        int mo94271a = interfaceC4379f5.mo94271a(this.f6573a, 0, Math.min(this.f6573a.length, i));
        if (mo94271a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return mo94271a;
    }

    @Override // com.applovin.impl.InterfaceC5209qo
    /* renamed from: a */
    public void mo96252a(C4066ah c4066ah, int i, int i2) {
        c4066ah.m100778g(i);
    }
}
