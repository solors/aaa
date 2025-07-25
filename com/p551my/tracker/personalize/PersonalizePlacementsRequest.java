package com.p551my.tracker.personalize;

import android.text.TextUtils;
import com.amazon.device.iap.internal.p106c.C3718b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.tracker.personalize.PersonalizePlacementsRequest */
/* loaded from: classes7.dex */
public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {

    /* renamed from: a */
    private final Map<String, List<String>> f69115a = m41512d();
    public final Map<String, String> customParams;
    public final List<String> placements;
    public final boolean reset;
    public final String userId;

    /* renamed from: com.my.tracker.personalize.PersonalizePlacementsRequest$Builder */
    /* loaded from: classes7.dex */
    public static abstract class Builder<T extends PersonalizePlacementsRequest> {

        /* renamed from: a */
        final String f69116a;

        /* renamed from: b */
        List<String> f69117b;

        /* renamed from: c */
        Map<String, String> f69118c;

        /* renamed from: d */
        boolean f69119d = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(String str) {
            this.f69116a = str;
        }

        public abstract T build();

        public Builder<T> withCustomParams(Map<String, String> map) {
            if (map != null) {
                this.f69118c = new HashMap(map);
            } else {
                this.f69118c = null;
            }
            return this;
        }

        public Builder<T> withPlacements(List<String> list) {
            if (list != null) {
                this.f69117b = new ArrayList(list);
            } else {
                this.f69117b = null;
            }
            return this;
        }

        public Builder<T> withReset(boolean z) {
            this.f69119d = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PersonalizePlacementsRequest(List<String> list, String str, boolean z, Map<String, String> map) {
        this.placements = list;
        this.userId = str;
        this.reset = z;
        this.customParams = map;
    }

    /* renamed from: d */
    private Map<String, List<String>> m41512d() {
        String str;
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.customParams;
        if (map != null && !map.isEmpty()) {
            this.customParams.remove("custom_user_id");
            this.customParams.remove("placement_ids");
            this.customParams.remove(C3718b.f3282au);
            this.customParams.remove("flat");
            for (Map.Entry<String, String> entry : this.customParams.entrySet()) {
                hashMap.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
        List<String> list = this.placements;
        if (list != null && !list.isEmpty()) {
            hashMap.put("placement_ids", this.placements);
        }
        if (!TextUtils.isEmpty(this.userId)) {
            hashMap.put("custom_user_id", Collections.singletonList(this.userId));
        }
        if (this.reset) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(C3718b.f3282au, Collections.singletonList(str));
        hashMap.put("flat", Collections.singletonList("1"));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p551my.tracker.personalize.PersonalizeRequest
    /* renamed from: b */
    public final Map<String, List<String>> mo41511b() {
        return this.f69115a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p551my.tracker.personalize.PersonalizeRequest
    /* renamed from: c */
    public final AbstractC26473b<List<PersonalizePlacement>> mo41510c() {
        return new C26475d();
    }
}
