package com.inmobi.unifiedId;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiUserDataModel {

    /* renamed from: a */
    public final InMobiUserDataTypes f48974a;

    /* renamed from: b */
    public final InMobiUserDataTypes f48975b;

    /* renamed from: c */
    public final HashMap f48976c;

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public InMobiUserDataTypes f48977a;

        /* renamed from: b */
        public InMobiUserDataTypes f48978b;

        /* renamed from: c */
        public HashMap f48979c;

        @NotNull
        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f48977a, this.f48978b, this.f48979c);
        }

        @NotNull
        public final Builder emailId(@Nullable InMobiUserDataTypes inMobiUserDataTypes) {
            this.f48978b = inMobiUserDataTypes;
            return this;
        }

        @NotNull
        public final Builder extras(@Nullable HashMap<String, String> hashMap) {
            this.f48979c = hashMap;
            return this;
        }

        @NotNull
        public final Builder phoneNumber(@Nullable InMobiUserDataTypes inMobiUserDataTypes) {
            this.f48977a = inMobiUserDataTypes;
            return this;
        }
    }

    public InMobiUserDataModel(@Nullable InMobiUserDataTypes inMobiUserDataTypes, @Nullable InMobiUserDataTypes inMobiUserDataTypes2, @Nullable HashMap<String, String> hashMap) {
        this.f48974a = inMobiUserDataTypes;
        this.f48975b = inMobiUserDataTypes2;
        this.f48976c = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.f48974a;
        }
        if ((i & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.f48975b;
        }
        if ((i & 4) != 0) {
            hashMap = inMobiUserDataModel.f48976c;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, hashMap);
    }

    @Nullable
    public final InMobiUserDataTypes component1() {
        return this.f48974a;
    }

    @Nullable
    public final InMobiUserDataTypes component2() {
        return this.f48975b;
    }

    @Nullable
    public final HashMap<String, String> component3() {
        return this.f48976c;
    }

    @NotNull
    public final InMobiUserDataModel copy(@Nullable InMobiUserDataTypes inMobiUserDataTypes, @Nullable InMobiUserDataTypes inMobiUserDataTypes2, @Nullable HashMap<String, String> hashMap) {
        return new InMobiUserDataModel(inMobiUserDataTypes, inMobiUserDataTypes2, hashMap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
        if (Intrinsics.m17075f(this.f48974a, inMobiUserDataModel.f48974a) && Intrinsics.m17075f(this.f48975b, inMobiUserDataModel.f48975b) && Intrinsics.m17075f(this.f48976c, inMobiUserDataModel.f48976c)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final InMobiUserDataTypes getEmailId() {
        return this.f48975b;
    }

    @Nullable
    public final HashMap<String, String> getExtras() {
        return this.f48976c;
    }

    @Nullable
    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f48974a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        InMobiUserDataTypes inMobiUserDataTypes = this.f48974a;
        int i = 0;
        if (inMobiUserDataTypes == null) {
            hashCode = 0;
        } else {
            hashCode = inMobiUserDataTypes.hashCode();
        }
        int i2 = hashCode * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.f48975b;
        if (inMobiUserDataTypes2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = inMobiUserDataTypes2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        HashMap hashMap = this.f48976c;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.f48974a + ", emailId=" + this.f48975b + ", extras=" + this.f48976c + ')';
    }
}
