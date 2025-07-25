package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.text.TextUtils;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.KeyValuePair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import oauth.signpost.OAuth;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.c222o2o2c2o */
/* loaded from: classes8.dex */
public final class C32444c222o2o2c2o {
    private static final String coi222o222 = "POST";
    private static final String coo2iico = "\n";

    private C32444c222o2o2c2o() {
    }

    public static String coo2iico(String str, String str2, List<KeyValuePair> list, String str3) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (list != null) {
            sb2.append("POST");
            sb2.append(coo2iico);
            sb2.append(str);
            sb2.append(coo2iico);
            sb2.append(str2);
            sb2.append(coo2iico);
            HashMap hashMap = new HashMap();
            ArrayList<String> arrayList = new ArrayList();
            for (KeyValuePair keyValuePair : list) {
                if (keyValuePair != null && !TextUtils.isEmpty(keyValuePair.getName())) {
                    String name = keyValuePair.getName();
                    if (!hashMap.containsKey(name)) {
                        arrayList.add(name);
                    }
                    hashMap.put(name, keyValuePair);
                }
            }
            Collections.sort(arrayList);
            for (String str4 : arrayList) {
                if (sb3.length() > 0) {
                    sb3.append(C21114v8.C21123i.f54135c);
                }
                sb3.append(OAuth.percentEncode(str4));
                sb3.append("=");
                sb3.append(OAuth.percentEncode(((KeyValuePair) hashMap.get(str4)).getValue()));
            }
        }
        sb3.append("&appSecret=");
        sb3.append(str3);
        sb2.append(sb3.toString());
        return C32457cicic.coo2iico(sb2.toString());
    }
}
