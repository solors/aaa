package com.bytedance.sdk.openadsdk.core.p316PX.p318bX;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.p316PX.p319bg.EnumC8646bg;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bX.bX */
/* loaded from: classes3.dex */
public class C8636bX {
    @NonNull

    /* renamed from: IL */
    private final Map<EnumC8635IL, String> f19052IL;
    @NonNull

    /* renamed from: bg */
    private final List<String> f19053bg;

    public C8636bX(@NonNull List<String> list) {
        this.f19053bg = list;
        HashMap hashMap = new HashMap();
        this.f19052IL = hashMap;
        hashMap.put(EnumC8635IL.CACHEBUSTING, m85485IL());
    }

    @NonNull
    /* renamed from: IL */
    private String m85485IL() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    @NonNull
    /* renamed from: bg */
    public List<String> m85483bg() {
        EnumC8635IL[] values;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f19053bg) {
            if (!TextUtils.isEmpty(str)) {
                for (EnumC8635IL enumC8635IL : EnumC8635IL.values()) {
                    String str2 = this.f19052IL.get(enumC8635IL);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str.replaceAll("\\[" + enumC8635IL.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: IL */
    private String m85484IL(long j) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }

    @NonNull
    /* renamed from: bg */
    public C8636bX m85481bg(@Nullable EnumC8646bg enumC8646bg) {
        if (enumC8646bg != null) {
            this.f19052IL.put(EnumC8635IL.ERRORCODE, enumC8646bg.m85445bg());
        }
        return this;
    }

    @NonNull
    /* renamed from: bg */
    public C8636bX m85482bg(@Nullable long j) {
        if (j >= 0) {
            String m85484IL = m85484IL(j);
            if (!TextUtils.isEmpty(m85484IL)) {
                this.f19052IL.put(EnumC8635IL.CONTENTPLAYHEAD, m85484IL);
            }
        }
        return this;
    }

    @NonNull
    /* renamed from: bg */
    public C8636bX m85480bg(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.f19052IL.put(EnumC8635IL.ASSETURI, str);
        }
        return this;
    }
}
