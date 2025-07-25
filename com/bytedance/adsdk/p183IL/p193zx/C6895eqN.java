package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6752IL;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6753Kg;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6758bX;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6759bg;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6760eo;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6761eqN;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6762iR;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6763ldr;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.zx.eqN */
/* loaded from: classes3.dex */
public class C6895eqN {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public static C6761eqN m90523IL(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        return new C6761eqN(m90518bg(jsonReader, c6832iR, C6902tuV.f14803bg));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bX */
    public static C6763ldr m90522bX(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        return new C6763ldr(C6901tC.m90498bg(jsonReader, c6832iR, C6863ldr.m90621bg(), C6884Uq.f14789bg, true));
    }

    /* renamed from: bg */
    public static C6752IL m90520bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        return m90517bg(jsonReader, c6832iR, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C6762iR eqN(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        return new C6762iR(m90518bg(jsonReader, c6832iR, ayS.f14796bg));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iR */
    public static C6759bg m90516iR(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        return new C6759bg(m90518bg(jsonReader, c6832iR, C6896iR.f14801bg));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C6760eo ldr(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        return new C6760eo(m90521bg(jsonReader, C6863ldr.m90621bg(), c6832iR, C6890WR.f14794bg));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zx */
    public static C6753Kg m90515zx(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        return new C6753Kg(m90521bg(jsonReader, C6863ldr.m90621bg(), c6832iR, ZQc.f14795bg));
    }

    /* renamed from: bg */
    public static C6752IL m90517bg(JsonReader jsonReader, C6832iR c6832iR, boolean z) throws IOException {
        return new C6752IL(m90521bg(jsonReader, z ? C6863ldr.m90621bg() : 1.0f, c6832iR, C6882PX.f14788bg));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C6758bX m90519bg(JsonReader jsonReader, C6832iR c6832iR, int i) throws IOException {
        return new C6758bX(m90518bg(jsonReader, c6832iR, new C6881Lq(i)));
    }

    /* renamed from: bg */
    private static <T> List<C6838bg<T>> m90518bg(JsonReader jsonReader, C6832iR c6832iR, InterfaceC6891bN<T> interfaceC6891bN) throws IOException {
        return C6901tC.m90498bg(jsonReader, c6832iR, 1.0f, interfaceC6891bN, false);
    }

    /* renamed from: bg */
    private static <T> List<C6838bg<T>> m90521bg(JsonReader jsonReader, float f, C6832iR c6832iR, InterfaceC6891bN<T> interfaceC6891bN) throws IOException {
        return C6901tC.m90498bg(jsonReader, c6832iR, f, interfaceC6891bN, false);
    }
}
