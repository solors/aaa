package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.zd */
/* loaded from: classes8.dex */
public final class C31975zd extends cu1 {
    @Override // com.yandex.mobile.ads.impl.cu1
    @Nullable
    /* renamed from: a */
    protected final Metadata mo26258a(gx0 gx0Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        bc1 bc1Var = new bc1(byteBuffer.limit(), byteBuffer.array());
        bc1Var.m35497d(12);
        int m35498d = (bc1Var.m35498d() + bc1Var.m35502b(12)) - 4;
        bc1Var.m35497d(44);
        bc1Var.m35495e(bc1Var.m35502b(12));
        bc1Var.m35497d(16);
        ArrayList arrayList = new ArrayList();
        while (bc1Var.m35498d() < m35498d) {
            bc1Var.m35497d(48);
            int m35502b = bc1Var.m35502b(8);
            bc1Var.m35497d(4);
            int m35498d2 = bc1Var.m35498d() + bc1Var.m35502b(12);
            String str = null;
            String str2 = null;
            while (bc1Var.m35498d() < m35498d2) {
                int m35502b2 = bc1Var.m35502b(8);
                int m35502b3 = bc1Var.m35502b(8);
                int m35498d3 = bc1Var.m35498d() + m35502b3;
                if (m35502b2 == 2) {
                    int m35502b4 = bc1Var.m35502b(16);
                    bc1Var.m35497d(8);
                    if (m35502b4 != 3) {
                    }
                    while (bc1Var.m35498d() < m35498d3) {
                        str = bc1Var.m35506a(bc1Var.m35502b(8), C30572in.f80562a);
                        int m35502b5 = bc1Var.m35502b(8);
                        for (int i = 0; i < m35502b5; i++) {
                            bc1Var.m35495e(bc1Var.m35502b(8));
                        }
                    }
                } else if (m35502b2 == 21) {
                    str2 = bc1Var.m35506a(m35502b3, C30572in.f80562a);
                }
                bc1Var.m35499c(m35498d3 * 8);
            }
            bc1Var.m35499c(m35498d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(m35502b, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
