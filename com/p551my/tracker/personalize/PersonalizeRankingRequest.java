package com.p551my.tracker.personalize;

import com.p551my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.tracker.personalize.PersonalizeRankingRequest */
/* loaded from: classes7.dex */
public final class PersonalizeRankingRequest extends PersonalizePlacementsRequest {

    /* renamed from: com.my.tracker.personalize.PersonalizeRankingRequest$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> {
        Builder(String str) {
            super(str);
        }

        @Override // com.p551my.tracker.personalize.PersonalizePlacementsRequest.Builder
        public PersonalizeRankingRequest build() {
            return new PersonalizeRankingRequest(this.f69117b, this.f69116a, this.f69119d, this.f69118c);
        }
    }

    PersonalizeRankingRequest(List<String> list, String str, boolean z, Map<String, String> map) {
        super(list, str, z, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> newBuilder(String str) {
        return new Builder(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p551my.tracker.personalize.PersonalizeRequest
    /* renamed from: a */
    public String mo41509a() {
        return "/ranking";
    }
}
