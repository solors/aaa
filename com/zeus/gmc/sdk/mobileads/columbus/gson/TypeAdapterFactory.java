package com.zeus.gmc.sdk.mobileads.columbus.gson;

import com.zeus.gmc.sdk.mobileads.columbus.gson.reflect.TypeToken;

/* loaded from: classes8.dex */
public interface TypeAdapterFactory {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
