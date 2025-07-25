package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScarEvent.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class ScarEvent {

    /* compiled from: ScarEvent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Show extends ScarEvent {
        @NotNull
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    private ScarEvent() {
    }

    public /* synthetic */ ScarEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
