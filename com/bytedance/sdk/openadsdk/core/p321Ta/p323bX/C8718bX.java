package com.bytedance.sdk.openadsdk.core.p321Ta.p323bX;

import com.bytedance.sdk.component.utils.C7756ldr;
import com.bytedance.sdk.openadsdk.p285IL.C7874IL;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.Ta.bX.bX */
/* loaded from: classes3.dex */
public class C8718bX extends C7874IL {
    public C8718bX(int i, int i2) {
        super(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.p285IL.C7874IL, com.bytedance.sdk.openadsdk.p285IL.AbstractC7875bg
    /* renamed from: bg */
    protected void mo85163bg(List<File> list) {
        int size = list.size();
        if (!mo87498bg(0L, size)) {
            for (File file : list) {
                C7756ldr.m87825bX(file);
                size--;
                if (mo87495bg(file, 0L, size)) {
                    return;
                }
            }
        }
    }

    public C8718bX(int i, int i2, boolean z) {
        super(i, i2);
        this.f17198bg = z;
    }
}
