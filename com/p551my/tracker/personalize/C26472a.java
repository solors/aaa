package com.p551my.tracker.personalize;

import java.util.List;

/* renamed from: com.my.tracker.personalize.a */
/* loaded from: classes7.dex */
final class C26472a {

    /* renamed from: a */
    final String f69120a;

    /* renamed from: b */
    final String f69121b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C26472a(String str, String str2, List<String> list) {
        String str3;
        this.f69120a = str;
        if (list != null && str2 != null && list.contains(str2)) {
            str3 = "https://beta.ml.tracker.my.com";
        } else {
            str3 = "https://mlapi.tracker.my.com";
        }
        this.f69121b = str3;
    }
}
