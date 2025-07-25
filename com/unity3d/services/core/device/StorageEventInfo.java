package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Storage.kt */
@Metadata
/* loaded from: classes7.dex */
public final class StorageEventInfo {
    @NotNull
    private final StorageEvent eventType;
    @NotNull
    private final StorageManager.StorageType storageType;
    @Nullable
    private final Object value;

    public StorageEventInfo(@NotNull StorageEvent eventType, @NotNull StorageManager.StorageType storageType, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.eventType = eventType;
        this.storageType = storageType;
        this.value = obj;
    }

    public static /* synthetic */ StorageEventInfo copy$default(StorageEventInfo storageEventInfo, StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            storageEvent = storageEventInfo.eventType;
        }
        if ((i & 2) != 0) {
            storageType = storageEventInfo.storageType;
        }
        if ((i & 4) != 0) {
            obj = storageEventInfo.value;
        }
        return storageEventInfo.copy(storageEvent, storageType, obj);
    }

    @NotNull
    public final StorageEvent component1() {
        return this.eventType;
    }

    @NotNull
    public final StorageManager.StorageType component2() {
        return this.storageType;
    }

    @Nullable
    public final Object component3() {
        return this.value;
    }

    @NotNull
    public final StorageEventInfo copy(@NotNull StorageEvent eventType, @NotNull StorageManager.StorageType storageType, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        return new StorageEventInfo(eventType, storageType, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageEventInfo)) {
            return false;
        }
        StorageEventInfo storageEventInfo = (StorageEventInfo) obj;
        if (this.eventType == storageEventInfo.eventType && this.storageType == storageEventInfo.storageType && Intrinsics.m17075f(this.value, storageEventInfo.value)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final StorageEvent getEventType() {
        return this.eventType;
    }

    @NotNull
    public final StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.eventType.hashCode() * 31) + this.storageType.hashCode()) * 31;
        Object obj = this.value;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "StorageEventInfo(eventType=" + this.eventType + ", storageType=" + this.storageType + ", value=" + this.value + ')';
    }
}
