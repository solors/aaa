package com.explorestack.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: com.explorestack.iab.mraid.d */
/* loaded from: classes3.dex */
public class C10473d {
    @NonNull

    /* renamed from: a */
    private static final String[] f23911a = {"calendar", "inlineVideo", "sms", "storePicture", "tel"};

    @NonNull
    /* renamed from: a */
    public static String[] m79521a(@NonNull Context context) {
        C10487o c10487o = new C10487o(context, f23911a);
        ArrayList arrayList = new ArrayList();
        if (c10487o.m79476f()) {
            arrayList.add("tel");
        }
        if (c10487o.m79478d()) {
            arrayList.add("sms");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
