package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14873i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.io.EOFException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.n */
/* loaded from: classes4.dex */
public final class C15035n {

    /* renamed from: a */
    public final InterfaceC14873i[] f29530a;

    /* renamed from: b */
    public final InterfaceC14874j f29531b;

    /* renamed from: c */
    public InterfaceC14873i f29532c;

    public C15035n(InterfaceC14873i[] interfaceC14873iArr, InterfaceC14874j interfaceC14874j) {
        this.f29530a = interfaceC14873iArr;
        this.f29531b = interfaceC14874j;
    }

    /* renamed from: a */
    public final InterfaceC14873i m77302a(C14833b c14833b) {
        InterfaceC14873i interfaceC14873i = this.f29532c;
        if (interfaceC14873i != null) {
            return interfaceC14873i;
        }
        InterfaceC14873i[] interfaceC14873iArr = this.f29530a;
        int length = interfaceC14873iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC14873i interfaceC14873i2 = interfaceC14873iArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                c14833b.f28287e = 0;
                throw th;
            }
            if (interfaceC14873i2.mo77392a(c14833b)) {
                this.f29532c = interfaceC14873i2;
                c14833b.f28287e = 0;
                break;
            }
            continue;
            c14833b.f28287e = 0;
            i++;
        }
        InterfaceC14873i interfaceC14873i3 = this.f29532c;
        if (interfaceC14873i3 == null) {
            StringBuilder sb2 = new StringBuilder("None of the available extractors (");
            InterfaceC14873i[] interfaceC14873iArr2 = this.f29530a;
            int i2 = AbstractC15133z.f29832a;
            StringBuilder sb3 = new StringBuilder();
            for (int i3 = 0; i3 < interfaceC14873iArr2.length; i3++) {
                sb3.append(interfaceC14873iArr2[i3].getClass().getSimpleName());
                if (i3 < interfaceC14873iArr2.length - 1) {
                    sb3.append(", ");
                }
            }
            sb2.append(sb3.toString());
            sb2.append(") could read the stream.");
            throw new C15019A(sb2.toString());
        }
        interfaceC14873i3.mo77390a(this.f29531b);
        return this.f29532c;
    }
}
