package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.U */
/* loaded from: classes6.dex */
public final class C19116U implements InterfaceC19442r9 {

    /* renamed from: a */
    public final /* synthetic */ C19142W f47816a;

    /* renamed from: b */
    public final /* synthetic */ boolean f47817b;

    /* renamed from: c */
    public final /* synthetic */ C19101Sa f47818c;

    /* renamed from: d */
    public final /* synthetic */ String f47819d;

    public C19116U(C19142W c19142w, boolean z, C19101Sa c19101Sa, String str) {
        this.f47816a = c19142w;
        this.f47817b = z;
        this.f47818c = c19101Sa;
        this.f47819d = str;
    }

    @Override // com.inmobi.media.InterfaceC19442r9
    /* renamed from: a */
    public final void mo59916a(Object obj) {
        String result = (String) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        C19142W c19142w = this.f47816a;
        c19142w.m60616a("file saved - " + result + " , isReporting - " + this.f47817b);
        C19142W c19142w2 = this.f47816a;
        C19101Sa process = this.f47818c;
        String beacon = this.f47819d;
        boolean z = this.f47817b;
        c19142w2.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(beacon, "beacon");
        Unit unit = null;
        if (z) {
            c19142w2.m60620a(new AdQualityResult(result, null, beacon, c19142w2.f47881j.toString()), false);
            return;
        }
        c19142w2.f47877f.remove(process);
        AdQualityResult adQualityResult = c19142w2.f47879h;
        if (adQualityResult != null) {
            adQualityResult.setImageLocation(result);
            unit = Unit.f99208a;
        }
        if (unit == null) {
            c19142w2.f47879h = new AdQualityResult(result, null, beacon, null, 8, null);
        }
        c19142w2.m60616a("file is saved. result - " + c19142w2.f47879h);
        c19142w2.m60614a(true);
    }

    @Override // com.inmobi.media.InterfaceC19442r9
    public final void onError(Exception exc) {
        C19142W c19142w = this.f47816a;
        C19101Sa process = this.f47818c;
        c19142w.getClass();
        Intrinsics.checkNotNullParameter(process, "process");
        c19142w.m60617a(exc, "error in running process - ".concat(process.getClass().getSimpleName()));
        c19142w.f47877f.remove(process);
        c19142w.m60614a(true);
    }
}
