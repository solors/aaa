package com.unity3d.ads.core.data.model;

import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OmidOptions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class OmidOptions {
    @Nullable
    private final CreativeType creativeType;
    @Nullable
    private final String customReferenceData;
    @Nullable
    private final Owner impressionOwner;
    @Nullable
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    @Nullable
    private final Owner mediaEventsOwner;
    @Nullable
    private final Owner videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = omidOptions.isolateVerificationScripts;
        }
        if ((i & 2) != 0) {
            owner = omidOptions.impressionOwner;
        }
        Owner owner4 = owner;
        if ((i & 4) != 0) {
            owner2 = omidOptions.videoEventsOwner;
        }
        Owner owner5 = owner2;
        if ((i & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            impressionType = omidOptions.impressionType;
        }
        ImpressionType impressionType2 = impressionType;
        if ((i & 32) != 0) {
            creativeType = omidOptions.creativeType;
        }
        CreativeType creativeType2 = creativeType;
        if ((i & 64) != 0) {
            owner3 = omidOptions.mediaEventsOwner;
        }
        return omidOptions.copy(z, owner4, owner5, str2, impressionType2, creativeType2, owner3);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    @Nullable
    public final Owner component2() {
        return this.impressionOwner;
    }

    @Nullable
    public final Owner component3() {
        return this.videoEventsOwner;
    }

    @Nullable
    public final String component4() {
        return this.customReferenceData;
    }

    @Nullable
    public final ImpressionType component5() {
        return this.impressionType;
    }

    @Nullable
    public final CreativeType component6() {
        return this.creativeType;
    }

    @Nullable
    public final Owner component7() {
        return this.mediaEventsOwner;
    }

    @NotNull
    public final OmidOptions copy(boolean z, @Nullable Owner owner, @Nullable Owner owner2, @Nullable String str, @Nullable ImpressionType impressionType, @Nullable CreativeType creativeType, @Nullable Owner owner3) {
        return new OmidOptions(z, owner, owner2, str, impressionType, creativeType, owner3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        if (this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && Intrinsics.m17075f(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner) {
            return true;
        }
        return false;
    }

    @Nullable
    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    @Nullable
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    @Nullable
    public final Owner getImpressionOwner() {
        return this.impressionOwner;
    }

    @Nullable
    public final ImpressionType getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    @Nullable
    public final Owner getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    @Nullable
    public final Owner getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        boolean z = this.isolateVerificationScripts;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Owner owner = this.impressionOwner;
        int i2 = 0;
        if (owner == null) {
            hashCode = 0;
        } else {
            hashCode = owner.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Owner owner2 = this.videoEventsOwner;
        if (owner2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = owner2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str = this.customReferenceData;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        ImpressionType impressionType = this.impressionType;
        if (impressionType == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = impressionType.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        CreativeType creativeType = this.creativeType;
        if (creativeType == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = creativeType.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        Owner owner3 = this.mediaEventsOwner;
        if (owner3 != null) {
            i2 = owner3.hashCode();
        }
        return i7 + i2;
    }

    @NotNull
    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public OmidOptions(boolean z, @Nullable Owner owner, @Nullable Owner owner2, @Nullable String str, @Nullable ImpressionType impressionType, @Nullable CreativeType creativeType, @Nullable Owner owner3) {
        this.isolateVerificationScripts = z;
        this.impressionOwner = owner;
        this.videoEventsOwner = owner2;
        this.customReferenceData = str;
        this.impressionType = impressionType;
        this.creativeType = creativeType;
        this.mediaEventsOwner = owner3;
    }

    public /* synthetic */ OmidOptions(boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : owner, (i & 4) != 0 ? null : owner2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : impressionType, (i & 32) != 0 ? null : creativeType, (i & 64) == 0 ? owner3 : null);
    }
}
