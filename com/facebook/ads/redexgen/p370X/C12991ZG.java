package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ZG */
/* loaded from: assets/audience_network.dex */
public class C12991ZG implements InterfaceC114149B {
    public final List<C114199G> A00 = new ArrayList();
    public final boolean A01;
    public final /* synthetic */ C12990ZF A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114149B
    public final synchronized int A62() {
        int i;
        i = 0;
        for (C114199G c114199g : this.A00) {
            i += c114199g.A01;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public C12991ZG(C12990ZF c12990zf, List<C1141097> list, boolean z) throws IOException {
        this.A02 = c12990zf;
        this.A01 = z;
        for (C1141097 fetch : list) {
            C1140996 A01 = fetch.A01();
            this.A00.add(new C114199G(new C1140794(fetch.A00(), A01.A01()), A01.A00() - A01.A01(), A01.A00()));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C114199G A00() {
        return this.A00.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C114199G A01() {
        return this.A00.get(this.A00.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114149B
    public final void A5O() throws C114249L {
        this.A02.A03(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114149B
    public final boolean AAk() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.A06(this);
    }
}
