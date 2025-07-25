package com.p551my.target;

import android.content.Context;
import android.graphics.Point;
import com.p551my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.eb */
/* loaded from: classes7.dex */
public class C25736eb extends AbstractC26021q1 {
    /* renamed from: a */
    public Map m43951a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        Point m43597b = C25869ka.m43597b(context);
        int i = m43597b.x;
        int i2 = m43597b.y;
        if (i != 0 && i2 != 0) {
            hashMap.put("vpw", String.valueOf(i));
            hashMap.put("vph", String.valueOf(i2));
        }
        return hashMap;
    }
}
