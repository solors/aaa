package com.facebook;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: HttpMethod.kt */
@Metadata
/* loaded from: classes3.dex */
public enum HttpMethod {
    GET,
    POST,
    DELETE;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static HttpMethod[] valuesCustom() {
        HttpMethod[] valuesCustom = values();
        return (HttpMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
