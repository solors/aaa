package com.p551my.tracker.personalize;

import com.p551my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.tracker.personalize.PersonalizeSetRequest */
/* loaded from: classes7.dex */
public final class PersonalizeSetRequest extends PersonalizePlacementsRequest {

    /* renamed from: com.my.tracker.personalize.PersonalizeSetRequest$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> {
        Builder(String str) {
            super(str);
        }

        @Override // com.p551my.tracker.personalize.PersonalizePlacementsRequest.Builder
        public PersonalizeSetRequest build() {
            return new PersonalizeSetRequest(this.f69117b, this.f69116a, this.f69119d, this.f69118c);
        }
    }

    PersonalizeSetRequest(List<String> list, String str, boolean z, Map<String, String> map) {
        super(list, str, z, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> newBuilder(String str) {
        return new Builder(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p551my.tracker.personalize.PersonalizeRequest
    /* renamed from: a */
    public String mo41509a() {
        return "/set";
    }
}
