package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GameServerIdReader.kt */
@Metadata
/* loaded from: classes7.dex */
public final class GameServerIdReader extends MetadataReader<String> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    /* compiled from: GameServerIdReader.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(@NotNull JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
    }
}
