package com.p551my.tracker.personalize;

import com.p551my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.tracker.personalize.PersonalizeItemRequest */
/* loaded from: classes7.dex */
public final class PersonalizeItemRequest extends PersonalizePlacementsRequest {

    /* renamed from: com.my.tracker.personalize.PersonalizeItemRequest$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> {
        Builder(String str) {
            super(str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.p551my.tracker.personalize.PersonalizePlacementsRequest.Builder
        public PersonalizeItemRequest build() {
            return new PersonalizeItemRequest(this.f69117b, this.f69116a, this.f69119d, this.f69118c);
        }
    }

    PersonalizeItemRequest(List<String> list, String str, boolean z, Map<String, String> map) {
        super(list, str, z, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> newBuilder(String str) {
        return new Builder(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p551my.tracker.personalize.PersonalizeRequest
    /* renamed from: a */
    public String mo41509a() {
        return "/item";
    }
}
