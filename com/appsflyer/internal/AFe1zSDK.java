package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class AFe1zSDK {
    @NotNull
    public static final JSONArray AFInAppEventParameterName(@NotNull List<AFd1jSDK> list) {
        int m17154x;
        Intrinsics.checkNotNullParameter(list, "");
        List<AFd1jSDK> list2 = list;
        m17154x = C37566w.m17154x(list2, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (AFd1jSDK aFd1jSDK : list2) {
            arrayList.add(aFd1jSDK.values());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean AFInAppEventType(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        if (httpURLConnection.getResponseCode() / 100 == 2) {
            return true;
        }
        return false;
    }
}
