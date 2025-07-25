package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Builder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMedia.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModel {
    @NotNull
    private final Bundle params;

    /* compiled from: ShareMedia.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static abstract class Builder<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private Bundle params = new Bundle();

        /* compiled from: ShareMedia.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final List<ShareMedia<?, ?>> readListFrom$facebook_common_release(@NotNull Parcel parcel) {
                List<ShareMedia<?, ?>> m17166m;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (readParcelableArray == null) {
                    m17166m = C37563v.m17166m();
                    return m17166m;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            public final void writeListTo$facebook_common_release(@NotNull Parcel out, int i, @NotNull List<? extends ShareMedia<?, ?>> media) {
                Intrinsics.checkNotNullParameter(out, "out");
                Intrinsics.checkNotNullParameter(media, "media");
                Object[] array = media.toArray(new ShareMedia[0]);
                if (array != null) {
                    out.writeParcelableArray((Parcelable[]) array, i);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }

        @NotNull
        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.share.model.ShareModelBuilder
        public /* bridge */ /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return readFrom((Builder<M, B>) ((ShareMedia) shareModel));
        }

        @NotNull
        public final B setParameter(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.params.putString(key, value);
            return this;
        }

        @NotNull
        public final B setParameters(@NotNull Bundle parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.params.putAll(parameters);
            return this;
        }

        public final void setParams$facebook_common_release(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            this.params = bundle;
        }

        @NotNull
        public B readFrom(@Nullable M m) {
            return m == null ? this : setParameters(((ShareMedia) m).params);
        }
    }

    /* compiled from: ShareMedia.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public enum Type {
        PHOTO,
        VIDEO;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareMedia(@NotNull Builder<M, B> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.params = new Bundle(builder.getParams$facebook_common_release());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public abstract Type getMediaType();

    @NotNull
    public final Bundle getParameters() {
        return new Bundle(this.params);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeBundle(this.params);
    }

    public ShareMedia(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.params = readBundle == null ? new Bundle() : readBundle;
    }
}
