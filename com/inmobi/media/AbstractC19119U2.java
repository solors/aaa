package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.U2 */
/* loaded from: classes6.dex */
public abstract class AbstractC19119U2 {

    /* renamed from: a */
    public static final HashMap f47826a = new HashMap();

    /* renamed from: a */
    public static Config m60664a(String str, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "type");
        String str2 = str + '-' + type;
        HashMap hashMap = f47826a;
        Object obj = hashMap.get(str2);
        if (obj == null) {
            Config.Companion.getClass();
            obj = C19267f2.m60363a(type, str);
            hashMap.put(str2, obj);
        }
        return (Config) obj;
    }
}
