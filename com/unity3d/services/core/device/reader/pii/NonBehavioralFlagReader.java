package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NonBehavioralFlagReader.kt */
@Metadata
/* loaded from: classes7.dex */
public class NonBehavioralFlagReader {
    @NotNull
    private final IJsonStorageReader jsonStorageReader;

    public NonBehavioralFlagReader(@NotNull IJsonStorageReader jsonStorageReader) {
        Intrinsics.checkNotNullParameter(jsonStorageReader, "jsonStorageReader");
        this.jsonStorageReader = jsonStorageReader;
    }

    @NotNull
    public NonBehavioralFlag getUserNonBehavioralFlag() {
        Object obj = this.jsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_KEY);
        if (obj == null) {
            obj = this.jsonStorageReader.get(JsonStorageKeyNames.USER_NON_BEHAVIORAL_VALUE_ALT_KEY);
        }
        return NonBehavioralFlag.Companion.fromString(String.valueOf(obj));
    }
}
