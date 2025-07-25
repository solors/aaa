package com.yandex.mobile.ads.impl;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C37566w;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class bw1 {
    @NotNull

    /* renamed from: a */
    private final zv1 f77419a = new zv1();
    @NotNull

    /* renamed from: b */
    private final C31987zh f77420b = new C31987zh();

    @NotNull
    /* renamed from: a */
    public final aw1 m35426a(@NotNull JSONObject jsonValue) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        sv1 sv1Var;
        C31896yh c31896yh;
        ArrayList arrayList;
        PrimitiveRanges m16900v;
        int m17154x;
        bw1 bw1Var = this;
        String str6 = "jsonValue";
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Object opt = jsonValue.opt("ColorWizButton");
        if (opt instanceof String) {
            str = (String) opt;
        } else {
            str = null;
        }
        Object opt2 = jsonValue.opt("ColorWizButtonText");
        if (opt2 instanceof String) {
            str2 = (String) opt2;
        } else {
            str2 = null;
        }
        Object opt3 = jsonValue.opt("ColorWizBack");
        if (opt3 instanceof String) {
            str3 = (String) opt3;
        } else {
            str3 = null;
        }
        Object opt4 = jsonValue.opt("ColorWizBackRight");
        if (opt4 instanceof String) {
            str4 = (String) opt4;
        } else {
            str4 = null;
        }
        JSONObject optJSONObject = jsonValue.optJSONObject("backgroundColors");
        JSONObject jsonValue2 = jsonValue.optJSONObject("smart-center");
        JSONArray optJSONArray = jsonValue.optJSONArray("smart-centers");
        if (jsonValue2 != null) {
            bw1Var.f77419a.getClass();
            Intrinsics.checkNotNullParameter(jsonValue2, "jsonValue");
            str5 = str4;
            sv1Var = new sv1(jsonValue2.getInt("x"), jsonValue2.getInt("y"), jsonValue2.getInt(POBNativeConstants.NATIVE_IMAGE_WIDTH), jsonValue2.getInt("h"));
        } else {
            str5 = str4;
            sv1Var = null;
        }
        if (optJSONObject != null) {
            bw1Var.f77420b.getClass();
            c31896yh = C31987zh.m26231a(optJSONObject);
        } else {
            c31896yh = null;
        }
        if (optJSONArray != null) {
            m16900v = _Ranges.m16900v(0, optJSONArray.length());
            m17154x = C37566w.m17154x(m16900v, 10);
            ArrayList arrayList2 = new ArrayList(m17154x);
            Iterator<Integer> it = m16900v.iterator();
            while (it.hasNext()) {
                int nextInt = ((PrimitiveIterators) it).nextInt();
                zv1 zv1Var = bw1Var.f77419a;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(nextInt);
                Intrinsics.checkNotNullExpressionValue(optJSONObject2, "optJSONObject(...)");
                zv1Var.getClass();
                Intrinsics.checkNotNullParameter(optJSONObject2, str6);
                arrayList2.add(new sv1(optJSONObject2.getInt("x"), optJSONObject2.getInt("y"), optJSONObject2.getInt(POBNativeConstants.NATIVE_IMAGE_WIDTH), optJSONObject2.getInt("h")));
                bw1Var = this;
                optJSONArray = optJSONArray;
                str6 = str6;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new aw1(str, str2, str3, str5, c31896yh, sv1Var, arrayList);
    }
}
