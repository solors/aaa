package com.yandex.mobile.ads.impl;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ui0 {
    @NotNull

    /* renamed from: a */
    private final ti0 f86287a;

    public /* synthetic */ ui0() {
        this(new ti0());
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m28767a(@NotNull JSONObject jsonObject) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jsonObject.optJSONArray("installedPackages");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonObject2 = optJSONArray.getJSONObject(i);
                ti0 ti0Var = this.f86287a;
                Intrinsics.m17074g(jsonObject2);
                ti0Var.getClass();
                Intrinsics.checkNotNullParameter(jsonObject2, "jsonInstalledPackage");
                if (z51.m26371a(jsonObject2, "name")) {
                    String m27867a = wn0.m27867a(jsonObject2, "jsonAsset", "name", "jsonAttribute", "name");
                    if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
                        Intrinsics.m17074g(m27867a);
                        int i2 = C30079ca.f77562b;
                        Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
                        Intrinsics.checkNotNullParameter("minVersion", "jsonAttribute");
                        int optInt = jsonObject2.optInt("minVersion", 0);
                        if (optInt < 0) {
                            optInt = 0;
                        }
                        Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
                        Intrinsics.checkNotNullParameter(KiwiConstants.f2707al, "jsonAttribute");
                        int i3 = Integer.MAX_VALUE;
                        int optInt2 = jsonObject2.optInt(KiwiConstants.f2707al, Integer.MAX_VALUE);
                        if (optInt2 >= 0) {
                            i3 = optInt2;
                        }
                        arrayList.add(new si0(optInt, i3, m27867a));
                    } else {
                        throw new i31("Native Ad json has not required attributes");
                    }
                } else {
                    throw new i31("Native Ad json has not required attributes");
                }
            }
        }
        return arrayList;
    }

    public ui0(@NotNull ti0 installedPackageJsonParser) {
        Intrinsics.checkNotNullParameter(installedPackageJsonParser, "installedPackageJsonParser");
        this.f86287a = installedPackageJsonParser;
    }
}
