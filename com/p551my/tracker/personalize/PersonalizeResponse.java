package com.p551my.tracker.personalize;

/* renamed from: com.my.tracker.personalize.PersonalizeResponse */
/* loaded from: classes7.dex */
public final class PersonalizeResponse<T> {
    public final String error;
    public final String rawData;
    public final T result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PersonalizeResponse(T t, String str, String str2) {
        this.result = t;
        this.error = str;
        this.rawData = str2;
    }
}
