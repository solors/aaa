package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.C7741PX;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.zx */
/* loaded from: classes3.dex */
public interface InterfaceC9036zx {

    /* renamed from: bg */
    public static final InterfaceC9039IL<JSONObject> f20153bg = new InterfaceC9039IL<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.zx.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9039IL
        /* renamed from: bg */
        public JSONObject mo83723IL(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                C7741PX.m87871bg("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };

    /* renamed from: IL */
    public static final InterfaceC9039IL<Set<String>> f20152IL = new InterfaceC9039IL<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.zx.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9039IL
        /* renamed from: bg */
        public Set<String> mo83723IL(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (Exception e) {
                C7741PX.m87871bg("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.zx$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC9039IL<T> {
        /* renamed from: IL */
        T mo83723IL(String str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.zx$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9040bg {
        /* renamed from: bg */
        InterfaceC9040bg mo83721bg(String str);

        /* renamed from: bg */
        InterfaceC9040bg mo83720bg(String str, float f);

        /* renamed from: bg */
        InterfaceC9040bg mo83719bg(String str, int i);

        /* renamed from: bg */
        InterfaceC9040bg mo83718bg(String str, long j);

        /* renamed from: bg */
        InterfaceC9040bg mo83717bg(String str, String str2);

        /* renamed from: bg */
        InterfaceC9040bg mo83716bg(String str, boolean z);

        /* renamed from: bg */
        void mo83722bg();
    }

    /* renamed from: bg */
    void mo83726bg(JSONObject jSONObject);
}
