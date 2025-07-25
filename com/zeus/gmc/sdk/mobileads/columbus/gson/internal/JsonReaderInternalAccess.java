package com.zeus.gmc.sdk.mobileads.columbus.gson.internal;

import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
