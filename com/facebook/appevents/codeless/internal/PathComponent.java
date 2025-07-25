package com.facebook.appevents.codeless.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: PathComponent.kt */
@Metadata
/* loaded from: classes2.dex */
public final class PathComponent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String PATH_CLASS_NAME_KEY = "class_name";
    @NotNull
    private static final String PATH_DESCRIPTION_KEY = "description";
    @NotNull
    private static final String PATH_HINT_KEY = "hint";
    @NotNull
    private static final String PATH_ID_KEY = "id";
    @NotNull
    private static final String PATH_INDEX_KEY = "index";
    @NotNull
    private static final String PATH_MATCH_BITMASK_KEY = "match_bitmask";
    @NotNull
    private static final String PATH_TAG_KEY = "tag";
    @NotNull
    private static final String PATH_TEXT_KEY = "text";
    @NotNull
    private final String className;
    @NotNull
    private final String description;
    @NotNull
    private final String hint;

    /* renamed from: id */
    private final int f24564id;
    private final int index;
    private final int matchBitmask;
    @NotNull
    private final String tag;
    @NotNull
    private final String text;

    /* compiled from: PathComponent.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PathComponent.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        MatchBitmaskType(int i) {
            this.value = i;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MatchBitmaskType[] valuesCustom() {
            MatchBitmaskType[] valuesCustom = values();
            return (MatchBitmaskType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(@NotNull JSONObject component) {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString(PATH_CLASS_NAME_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.className = string;
        this.index = component.optInt("index", -1);
        this.f24564id = component.optInt("id");
        String optString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.text = optString;
        String optString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.tag = optString2;
        String optString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.description = optString3;
        String optString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.hint = optString4;
        this.matchBitmask = component.optInt(PATH_MATCH_BITMASK_KEY);
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.f24564id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }
}
