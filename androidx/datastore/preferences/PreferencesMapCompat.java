package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesMapCompat.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferencesMapCompat {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: PreferencesMapCompat.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PreferencesProto.PreferenceMap readFrom(@NotNull InputStream input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                PreferencesProto.PreferenceMap parseFrom = PreferencesProto.PreferenceMap.parseFrom(input);
                Intrinsics.checkNotNullExpressionValue(parseFrom, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return parseFrom;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }
    }
}
